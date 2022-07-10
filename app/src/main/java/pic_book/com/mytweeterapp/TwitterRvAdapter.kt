package pic_book.com.mytweeterapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterAdapter(var tweetList: List<TwitterListItem>):
    RecyclerView.Adapter<TweetsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        var itemView = LayoutInflater.from(parent.context)   //displays the list of items
            .inflate(R.layout.tweeter_listcard,parent,false)
        return TweetsViewHolder(itemView)
    }

        override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {    //holds lists of names and binds the data to the view
            var currentTweet = tweetList.get(position)    //obtain views  by position using index
            holder.tvName.text=currentTweet.name
            holder.tvHandle.text=currentTweet.handle
            holder.tvComments.text=currentTweet.comments
            holder.tvTime.text=currentTweet.time
            holder.tvView1.text=currentTweet.view1
            holder.tvView2.text=currentTweet.view2
            holder.tvView3.text=currentTweet.view3
//
//            holder.tvName2.text=currentTweet.name2
//            holder.tvHandle2.text=currentTweet.handle2
//            holder.tvComments2.text=currentTweet.comments2
//            holder.tvTime2.text=currentTweet.time2
//
//            holder.tvName3.text=currentTweet.name3
//            holder.tvHandle3.text=currentTweet.handle3
//            holder.tvComments3.text=currentTweet.comments3
//            holder.tvTime3.text=currentTweet.time3
//
//            holder.tvName4.text=currentTweet.name4
//            holder.tvHandle4.text=currentTweet.handle4
//            holder.tvComments4.text=currentTweet.comments4
//            holder.tvTime4.text=currentTweet.time4

        }

        override fun getItemCount(): Int {
            return tweetList.size
        }
    }

class TweetsViewHolder (itemView: View):
        RecyclerView.ViewHolder(itemView){
    var user1: ImageView? = itemView.findViewById<ImageView>(R.id.ivUser1)
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle = itemView.findViewById<TextView>(R.id.tvHandle)
    var tvComments = itemView.findViewById<TextView>(R.id.tvComments)
    var tvTime = itemView.findViewById<TextView>(R.id.tvTime)

    var ivIcon1 = itemView.findViewById<ImageView>(R.id.ivIcon1)
    var ivIcon2 = itemView.findViewById<ImageView>(R.id.ivIcon2)
    var ivIcon3 = itemView.findViewById<ImageView>(R.id.ivIcon3)
    var ivIcon4 = itemView.findViewById<ImageView>(R.id.ivIcon4)
    var tvView1 = itemView.findViewById<TextView>(R.id.tvView1)
    var tvView2 = itemView.findViewById<TextView>(R.id.tvView2)
    var tvView3 = itemView.findViewById<TextView>(R.id.tvView3)

    var user2 = itemView.findViewById<ImageView>(R.id.ivUser2)
    var tvName2 = itemView.findViewById<TextView>(R.id.tvName2)
    var tvHandle2 = itemView.findViewById<TextView>(R.id.tvHandle2)
    var tvComments2 = itemView.findViewById<TextView>(R.id.tvComments2)
    var tvTime2 = itemView.findViewById<TextView>(R.id.tvTime2)

    var ivIcon5 = itemView.findViewById<ImageView>(R.id.ivIcon5)
    var ivIcon6 = itemView.findViewById<ImageView>(R.id.ivIcon6)
    var ivIcon7 = itemView.findViewById<ImageView>(R.id.ivIcon7)
    var ivIcon8 = itemView.findViewById<ImageView>(R.id.ivIcon8)


    var user3 =  itemView.findViewById<ImageView>(R.id.ivUser3)
    var tvName3 = itemView.findViewById<TextView>(R.id.tvName3)
    var tvHandle3 = itemView.findViewById<TextView>(R.id.tvHandle3)
    var tvComments3 = itemView.findViewById<TextView>(R.id.tvComments3)
    var tvTime3 = itemView.findViewById<TextView>(R.id.tvTime3)

    var ivIcon9 = itemView.findViewById<ImageView>(R.id.ivIcon9)
    var ivIcon10 = itemView.findViewById<ImageView>(R.id.ivIcon10)
    var ivIcon11 = itemView.findViewById<ImageView>(R.id.ivIcon11)
    var ivIcon12 = itemView.findViewById<ImageView>(R.id.ivIcon12)


    var user4 = itemView.findViewById<ImageView>(R.id.ivUser4)
    var tvName4 = itemView.findViewById<TextView>(R.id.tvName4)
    var tvHandle4 = itemView.findViewById<TextView>(R.id.tvHandle4)
    var tvComments4 = itemView.findViewById<TextView>(R.id.tvComments4)
    var tvTime4 = itemView.findViewById<TextView>(R.id.tvTime4)

    var ivIcon13 = itemView.findViewById<ImageView>(R.id.ivIcon13)
    var ivIcon14 = itemView.findViewById<ImageView>(R.id.ivIcon14)
    var ivIcon15 = itemView.findViewById<ImageView>(R.id.ivIcon15)
    var ivIcon16 = itemView.findViewById<ImageView>(R.id.ivIcon16)

        }

