package com.example.stevengo.myapplication.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.stevengo.myapplication.R;
import com.example.stevengo.myapplication.entitys.MusicInfo;
import com.example.stevengo.myapplication.utils.InternetUtil;

import java.util.List;

public class TestActivity extends AppCompatActivity {
    private String url="http://v5.pc.duomi.com/search-ajaxsearch-searchall";
    private String kw="二胡";
    private int pi=1;
    private int pz=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
//        List<MusicInfo> readXMLUtil= com.example.stevengo.myapplication.utils.ReadXMLUtil.getMusic(this,"qh");
//        for(int i=0;i<readXMLUtil.size();i++){
//            Log.d("StevenGo",readXMLUtil.get(i).getName());
//        }
        new Thread(){
            @Override
            public void run(){
                InternetUtil.doGet(url,kw,pi,pz);

            }
        }.start();

    }

}
