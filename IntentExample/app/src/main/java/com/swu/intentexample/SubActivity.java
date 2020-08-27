package com.swu.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub = findViewById(R.id.tv_sub);

        Intent intent = getIntent(); //intent로 어디선가 날라오는 데이터를 받겠다는 뜻
        String str = intent.getStringExtra("str"); //string의 형태로 날라오는 데이터를 받겠다. 다 받는게 아니라 설정해놓은 별명과 일치하는 값을 받겠다는 의미이다.

        tv_sub.setText(str);


    }
}
