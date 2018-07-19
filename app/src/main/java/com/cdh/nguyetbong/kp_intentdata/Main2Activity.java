package com.cdh.nguyetbong.kp_intentdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.io.Serializable;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
//        if(intent != null){
//            String chuoi = intent.getStringExtra("chuoi");
//            Toast.makeText(this, chuoi, Toast.LENGTH_SHORT).show();
//        }else {
//            Toast.makeText(this, "ko co gia tri intent", Toast.LENGTH_SHORT).show();
//        }
//        String chuoi = (intent != null? intent.getStringExtra(MainActivity.chuoi) : "k co gia tri");
//        Toast.makeText(this, chuoi, Toast.LENGTH_SHORT).show();

//        int ketqua = (intent != null? intent.getIntExtra(MainActivity.so,-1) : 0);
//        Toast.makeText(this, ketqua+"", Toast.LENGTH_SHORT).show();

        Nhanvien nhanvien = intent != null ? (Nhanvien) intent.getSerializableExtra(MainActivity.obj) : null;
        Toast.makeText(this, nhanvien.getTen(), Toast.LENGTH_SHORT).show();


    }
}
