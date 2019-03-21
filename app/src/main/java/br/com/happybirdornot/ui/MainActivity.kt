package br.com.happybirdornot.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import br.com.happybirdornot.R
import br.com.happybirdornot.UserModel
import br.com.happybirdornot.ui.custom.DividerItemDecorator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tweetList = listOf(
            TweetModel(
                UserModel("", "Apolo Rossi", "@apolorossi"),
                "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system."
            ),TweetModel(
                UserModel("", "Deise Santos", "@mariadeisiane"),
                "Eiiiita dia bunito que tá hoje heim, e laiaaa"
            ),TweetModel(
                UserModel("", "Apolo Rossi", "apolorossi"),
                "Eiiiita dia bunito que tá hoje heim, e laiaaa"
            ),TweetModel(
                UserModel("", "Apolo Rossi", "apolorossi"),
                "Eiiiita dia bunito que tá hoje heim, e laiaaa"
            )
        )

        tweets_list.addItemDecoration(DividerItemDecorator(16))
        tweets_list.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)
        tweets_list.adapter =  TweetAdapter(this, tweetList)


    }


}
