package com.Pascaline.tweets

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetAdapter(var TweetsList:List<Tweet>):RecyclerView.Adapter<TweetViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.tweets_list_item,parent,false)
        return  TweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currentTweet = TweetsList.get(position)
//        var clicked=false
//        holder.imgAvatar.text=currentTweet.avatar
        holder.tvName.text = currentTweet.name
        holder.tvHandle.text = "@${currentTweet.handle}"
        holder.tvTweet.text = currentTweet.tweet
//        holder.imgReply.text=currentTweet.replyButton
//        holder.imgRetweet.text=currentTweet.retweetButton
//        holder.imgLike.text=currentTweet.likeButton
        holder.tvReply.text = currentTweet.replies.toString()
        holder.tvRetweet.text = currentTweet.retweets.toString()
        holder.tvLike.text = currentTweet.likes.toString()
        holder.imgReply.setOnClickListener {
            currentTweet.reply()
            holder.tvReply.text = currentTweet.replies.toString()
        }
        holder.imgRetweet.setOnClickListener {
            currentTweet.retweet()
            holder.tvRetweet.text = currentTweet.retweets.toString()
        }
        holder.imgLike.setOnClickListener {
            currentTweet.like()
            holder.tvLike.text = currentTweet.likes.toString()


        }
    }

    override fun getItemCount(): Int {
        return TweetsList.size
    }
}
class TweetViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle=itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTweet=itemView.findViewById<TextView>(R.id.tvTweet)
    var tvReply=itemView.findViewById<TextView>(R.id.tvReply)
    var tvLike=itemView.findViewById<TextView>(R.id.tvLike)
    var tvRetweet=itemView.findViewById<TextView>(R.id.tvRetweet)
    var imgAvatar=itemView.findViewById<ImageView>(R.id.imgAvatar)
    var imgReply=itemView.findViewById<ImageView>(R.id.imgReply)
    var imgRetweet=itemView.findViewById<ImageView>(R.id.imgRetweet)
    var imgLike=itemView.findViewById<ImageView>(R.id.imgLike)

}