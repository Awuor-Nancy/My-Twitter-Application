package pic_book.com.mytweeterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import pic_book.com.mytweeterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()

    }

    fun displayTweets() {
        var tweet1 =
            TwitterListItem("Nancy Awuor", "Nancy Awuor", "nancvida@254", "12h", "I love tweeting","23","12k","1k","","","","")

        var tweet2 =
            TwitterListItem("Nancy Awuor", "Nancy Awuor", "nancvida@254", "12h", "I love tweeting","23","12k","1k","","","","")

        var tweet3 =
        TwitterListItem("Nancy Awuor", "Nancy Awuor", "nancvida@254", "12h", "I love tweeting","23","12k","1k","","","","")

        var tweet4 =
        TwitterListItem("Nancy Awuor", "Nancy Awuor", "nancvida@254", "12h", "I love tweeting","23","12k","1k","","","","")

        var tweet5 =
        TwitterListItem("Nancy Awuor", "Nancy Awuor", "nancvida@254", "12h", "I love tweeting","23","12k","1k","","","","")


    var tweetList =
        listOf(tweet1, tweet2, tweet3, tweet4, tweet5)
    var contactAdapter = TwitterAdapter(tweetList)
    binding.rvTweet.layoutManager = LinearLayoutManager(this)
    binding.rvTweet.adapter = contactAdapter
   }
}