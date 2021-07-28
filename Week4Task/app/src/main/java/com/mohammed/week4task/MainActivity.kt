 package com.mohammed.week4task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {
     private lateinit var newRecyclerView: RecyclerView
     private lateinit var newArrayList: ArrayList<BirthdayDate>
     lateinit var imageId: Array<Int>
     lateinit var celebrantNames: Array<String>
     lateinit var day: Array<String>
     lateinit var date: Array<String>

     lateinit var adapter: AdapterRecycler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.boy,
            R.drawable.boy1,
            R.drawable.boy,
            R.drawable.boy1,
            R.drawable.boy
        )

        celebrantNames = arrayOf(
            "Sisse Ngeri",
            "come and go",
            "i hate programming",
            "i have you",
            "dhjdhh"
        )


        day= arrayOf(
            "30 days left",
            "20 days left",
            "60 days left",
            "10 days left",
            "nsb"
        )
        date = arrayOf(
            "20.07.2021",
            "16.8.2021",
            "12.8.2020",
            "13.4.2020",
            "djhdh"
        )

        val images = listOf(
            R.drawable.boy,
            R.drawable.boy1
        )
        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter


        newRecyclerView = findViewById(R.id.recyclerview)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<BirthdayDate>()
           userBirthdate()
    }

     private fun userBirthdate() {
//         for (i in 1..50) {
             for (i in imageId.indices) {
                 var newBirthday = BirthdayDate(imageId[i],celebrantNames[i], date[i], day[i])
                 newArrayList.add(newBirthday)

             }
             newRecyclerView.adapter = AdapterRecycler(newArrayList)
         }




}