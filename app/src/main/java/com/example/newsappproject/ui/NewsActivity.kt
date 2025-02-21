package com.example.newsappproject.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.setupWithNavController
import com.example.newsappproject.R
import com.example.newsappproject.database.ArticleDatabase
import com.example.newsappproject.databinding.ActivityMainBinding
import com.example.newsappproject.repository.NewsRepository

class NewsActivity : AppCompatActivity() {
    lateinit var newsViewModel: NewsViewModel
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(application, newsRepository)
        newsViewModel = ViewModelProvider(this, viewModelProviderFactory)[NewsViewModel::class.java]
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.newsNavHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bottomNavigationView.setupWithNavController(navController)

    }
}


//binding.bottomNavigationView.setOnItemSelectedListener { item ->
//    when (item.itemId) {
//        R.id.favouriteFragment -> navController.navigate(R.id.action_headlineFragment_to_favouriteFragment)
//        //R.id.searchFragment -> navController.navigate(R.id.action_headlineFragment_to_searchFragment)
//        else -> false
//    }
//    true
//}

//R.id.headlineFragment->{
//    navController.navigate(R.id.action_searchFragment_to_headlineFragment)
//    true
//}

//binding.bottomNavigationView.setOnItemSelectedListener { item ->
//    when (item.itemId) {
//        R.id.headlinesFragment->{
//            navController.navigate(R.id.action_favouriteFragment_to_headlineFragment)
//            true
//        }
//        R.id.favouritesFragment -> {
//            navController.navigate(R.id.action_headlineFragment_to_favouriteFragment)
//            true
//        }
//        R.id.search2Fragment -> {
//            navController.navigate(R.id.action_headlineFragment_to_searchFragment)
//            true
//        }
//
//        else -> false
//    }
//}

//data class Article(
//    val author: String,
//    val content: String,
//    val description: String,
//    val publishedAt: String,
//    val source: Source,
//    val title: String,
//    val url: String,
//    val urlToImage: String
//)
//
//data class NewsResponse(
//    val articles: List<Article>,
//    val status: String,
//    val totalResults: Int
//)
//data class Source(
//    val id: String,
//    val name: String
//)