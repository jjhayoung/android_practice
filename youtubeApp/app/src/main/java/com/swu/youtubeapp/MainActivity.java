package com.swu.youtubeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_id;
    Button btn_test; //변수 설정하는 부, 대소문자 반드시 구분해야한다. et_id 와 btn_test는 다른 이름을 써도 되지만, 헷갈리지 않기 위해 동일한 이름을 쓰기로 했다.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_id = findViewById(R.id.et_id); //이 코드를 함으로써, activity_main.xml의 et_id와 연결될 수 있게 되었다. 이제 동적으로 뭔가 할 수 있게 되었다.
        btn_test = findViewById(R.id.btn_test);

        btn_test.setOnClickListener(new View.OnClickListener() {   //btn을 클릭했을때, 어떤 액션을 취해줄 지 정하는 곳
            @Override
            public void onClick(View v) {

                et_id.setText("버튼 클릭하면 나오는 문자열입니다!");     //btn을 클릭했을때, EditText에다가 미리 설정한 문자열이 나타나도록 하는 기능

            }
        });

    }
}
