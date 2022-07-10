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
        "","","",3,2,3)
        var tweet2=Tweet("","Sangwa Nadine","sangwa","I practiced more about looping through elements and performing the same action on each. .",
            "","","",1,3,13)
        var tweet3=Tweet("","Verite Natete","super","Day 34/100, practiced CSS and created a login form.",
            "","","",2,4,33)
        var tweet4=Tweet("","Liliane Gikuku","gikundiro"," created a popup login form with a close button using javascript. ",
            "","","",15,6,4)
        var tweet5=Tweet("","Elizabeth Ampurira","liz"," I created a piano and played music notes with javascript.",
            "","","",9,4,123)
        var tweet6=Tweet("","Lucy Kalimi","kalimi"," I learnt how to used focus on classes. And also learnt to use styles such as transition and transform while hovering over an element.",
            "","","",7,1,1)
        var tweet7=Tweet("","Belyse Intwaza","belyse","I have been able to complete a rating component from frontend mentor challenges",
            "","","",5,8,2)
        var tweet8=Tweet("","Phelisia Jeruto","jeruto","How event listeners work is still a challenge for me but I'm enjoying doing more practice to master it.",
            "","","",8,7,17)
        var tweetLists= listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7,tweet8)

        var tweetAdapter=TweetAdapter(tweetLists)
        binding.rvTweets.layoutManager= LinearLayoutManager(this)
        binding.rvTweets.adapter=tweetAdapter
    }

}