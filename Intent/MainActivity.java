package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnMain, btnMain2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMain = findViewById(R.id.btnMain);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Second.class);
                startActivity(intent);
            }
        });
        btnMain2 = findViewById(R.id.btnMain2);
        btnMain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), third.class);
                startActivity(intent);
            }
        });
    }
}

//third.java 를 만들어서 메인액티비티에서 third 페이지로 이동하는 이벤트를 구현하시오

//thirdActivity 추가
//라디오버튼을 사용해서 옮겨가게