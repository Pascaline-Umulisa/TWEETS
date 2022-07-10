package com.Pascaline.tweets

class Tweet(var avatar:String,var name:String,var handle:String,var tweet:String,var replyButton:String,
           var retweetButton:String, var likeButton:String, var replies:Int,var retweets:Int,var likes:Int) {
    fun reply(){
        replies++
    }
    fun retweet(){
        retweets++
    }
    fun like(){
        var isTrue=0
        if (isTrue!=1){
            isTrue+=1
            likes++
        }
        else{
            likes-=1
            isTrue-=1
        }
    }
//    fun share(){
//        shares++
//    }
//    fun analytic(){
//        analytics++
//    }
}