package com.swu.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_move;
    private EditText et_test;
    private String str;
    ImageView test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_test = findViewById(R.id.et_test);


        btn_move = findViewById(R.id.btn_move); //xml 파일에서 Id 값을 이용해서 btn_move 찾기!
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = et_test.getText().toString();
                Intent intent = new Intent(MainActivity.this, SubActivity.class); //mainActivity에서 SubActiviy로 이동하라는 뜻
                intent.putExtra("str", str); //SubActity 로 정보를 쐈다!
                startActivity(intent); //액티비티 이동시켜주는 코드
            }
        });

        test = (ImageView)findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"하영 최고", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
