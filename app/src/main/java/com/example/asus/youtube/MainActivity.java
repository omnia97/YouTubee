package com.example.asus.youtube;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create an ArrayList of AndroidFlavor objects
        ArrayList<youtube> youtubeproject = new ArrayList<youtube>();
        youtubeproject.add(new youtube("جافا سكريبت فى 48 دقيقة-مدخل شامل إلى مفاهيم اللغة", "Nour Hosni قبل سنة واحدة...", R.drawable.javax));
        youtubeproject.add(new youtube("مقدمة:ماهى لغة جافا سكريبت", "TheNewBaghdad قبل سنة واحدة... ", R.drawable.javay));
        youtubeproject.add(new youtube("JavaScript for beginners  اساسيات الجافا...", "TheNewBaghdad  مقطع فيديو 24", R.drawable.javaz));
        youtubeproject.add(new youtube("دورة JavaScript", "Hamed Oumoumeen  مقطع فيديو 26 ", R.drawable.javao));
        youtubeproject.add(new youtube("JavaScript Tutorial for Beginner Complete...", "Awais Mirza قبل 11 شهراً", R.drawable.javap));
        youtubeproject.add(new youtube("Anjana Vakil:Learning Functional...", "JSConf قبل سنة واحدة...", R.drawable.javascriptx));
        youtubeproject.add(new youtube("JavaScript تعلم جافا سكريبت", "Hassouna Academy مقطع فيديو 32", R.drawable.javascripty));
        youtubeproject.add(new youtube("Programowanie w JavaScript od podstaw...", "Samuraj ... مقطع فيديو 18", R.drawable.javascriptz));
        youtubeproject.add(new youtube("JavaScript Tutorial", "KudvenKat  مقطع فيديو 27", R.drawable.javascripto));
        youtubeproject.add(new youtube("JavaScript in Half an Hour(Without jQuery!) ", "LearnWebCode قبل سنة واحدة...", R.drawable.javascriptp));

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        Youtubeadapter youtubeAdapter = new Youtubeadapter(this, youtubeproject);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_youtube);
        listView.setAdapter(youtubeAdapter);
    }
}
