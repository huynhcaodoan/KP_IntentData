package com.cdh.nguyetbong.kp_intentdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    Button button01, button02,button03;
    static final String chuoi = "chuoi";
    static final String so = "so";
    static final String obj = "obj";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button01 = findViewById(R.id.btn01);
        button02 = findViewById(R.id.btn02);
        button03 = findViewById(R.id.btn03);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pushData(chuoi,"Chao main");
            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pushData(so,30);
            }
        });
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Nhanvien nhanvien = new Nhanvien("Cao Doan Huynh", 25);
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra(obj, (Serializable) nhanvien);
                startActivity(intent);
            }
        });


    }
    public <G> void pushData(String key, G value){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        if(value instanceof String){
            intent.putExtra(key,(String) value);
        }
        if(value instanceof Integer){
            intent.putExtra(key,(Integer) value);
        }
        if(value instanceof Nhanvien){
            intent.putExtra(key,(Nhanvien) value);
        }

        startActivity(intent);
    }
}
