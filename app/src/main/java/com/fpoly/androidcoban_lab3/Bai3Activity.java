package com.fpoly.androidcoban_lab3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Bai3Activity extends AppCompatActivity {
    private ListView lvNganhHoc;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        setTitle("Bài 3");
        initView();
        arrayList.add("Lập trình Mobile");
        arrayList.add("Thiết kế đồ họa");
        arrayList.add("Ứng dụng phần mềm");
        arrayList.add("Marketing Digital");

        ArrayAdapter adapter = new ArrayAdapter(Bai3Activity.this, android.R.layout.simple_list_item_1, arrayList);
        lvNganhHoc.setAdapter(adapter);

        lvNganhHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // position : vị trí người dùng click trên listView
                Toast.makeText(Bai3Activity.this, arrayList.get(position) , Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void initView() {
        lvNganhHoc = findViewById(R.id.lvList);
        arrayList = new ArrayList<>();
    }
}
