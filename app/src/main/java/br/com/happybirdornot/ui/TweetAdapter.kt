package br.com.happybirdornot.ui

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.happybirdornot.R
import kotlinx.android.synthetic.main.card_tweet.view.*

class TweetAdapter(private val context: Context,
                   private val tweetList : List<TweetModel>) : RecyclerView.Adapter<TweetAdapter.TweetHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): TweetHolder {
       var view = LayoutInflater.from(context).inflate(R.layout.card_tweet, viewGroup, false)

        return TweetHolder(view)
    }

    override fun getItemCount(): Int {
        return tweetList.size
    }

    override fun onBindViewHolder(holder: TweetHolder, position: Int) {
        holder.bind(tweetList[position])
    }


    class TweetHolder(private val view : View) : RecyclerView.ViewHolder(view) {

        fun bind(tweetModel: TweetModel){

            tweetModel.let { tweet ->
                tweetModel.userPicture()
                view.user_name.text = tweet.name()
                view.account_name.text = tweet.accountName()
                view.tweet_text.text = tweet.text()
            }

            view.analyze_button.setOnClickListener {
                Log.d("","")
            }

        }

    }
}