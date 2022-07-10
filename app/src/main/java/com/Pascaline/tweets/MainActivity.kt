package com.Pascaline.tweets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.Pascaline.tweets.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        displayTweets()
    }
    fun displayTweets(){
        var tweet1=Tweet("","Umulisa Pascaline","kayitete","added validation to a sign-up page with JavaScript.",
        "","","",9,2,3)
        var tweet2=Tweet("","Sangwa Nadine","sangwa","added validation to a sign-up page with JavaScript.",
            "","","",1,2,3)
        var tweet3=Tweet("","Verite Natete","super","added validation to a sign-up page with JavaScript.",
            "","","",1,2,3)
        var tweet4=Tweet("","Liliane Gikuku","gikundiro","added validation to a sign-up page with JavaScript.",
            "","","",1,2,3)
        var tweet5=Tweet("","Sangwa Nadine","sangwa","added validation to a sign-up page with JavaScript.",
            "","","",1,2,3)
        var tweet6=Tweet("","Sangwa Nadine","sangwa","added validation to a sign-up page with JavaScript.",
            "","","",1,2,3)
        var tweet7=Tweet("","Sangwa Nadine","sangwa","added validation to a sign-up page with JavaScript.",
            "","","",1,2,3)
        var tweet8=Tweet("","Sangwa Nadine","sangwa","added validation to a sign-up page with JavaScript.",
            "","","",1,2,3)
        var tweetLists= listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8)

        var tweetAdapter=TweetAdapter(tweetLists)
        binding.rvTweets.layoutManager= LinearLayoutManager(this)
        binding.rvTweets.adapter=tweetAdapter
    }

}