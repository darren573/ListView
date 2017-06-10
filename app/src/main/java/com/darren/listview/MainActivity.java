package com.darren.listview;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.darren.listview.view.adapter.TestAdapter;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity {
    private ListView lv_text;
    private List<String> list=new ArrayList<>();//用一个ArrayList来存放数据

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_text = (ListView) findViewById(R.id.lv_text);
        lv_text = new ListView(this);
        list = getData();
        ArrayAdapter<String> adapter=new ArrayAdapter<>(
                this,
                android.R.layout.simple_expandable_list_item_1,
                list
        );
        lv_text.setAdapter(adapter);
        setContentView(lv_text);
        lv_text.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "这是"+String.valueOf(list.get(position)), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<String> getData() {
        list.add("第一条标题");
        list.add("第二条标题");
        list.add("第三条标题");
        list.add("第四条标题");
        list.add("what");
        list.add("the");
        list.add("fuck");
        list.add("哈哈哈");
        list.add("吼吼吼");
        return list;
    }

}
