package kr.ac.kpu.termproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startbtn = (Button)findViewById(R.id.startbtn);
        final Button exbtn = (Button)findViewById(R.id.exbtn);

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CheckActivity.class);
                startActivity(intent);
            }
        });

        exbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setIcon(R.drawable.icon_explain);
                dlg.setTitle("MBTI 검사란?");
                setTitleColor(Color.parseColor("#1976D2"));
                dlg.setMessage("개인이 쉽게 응답할 수 있는 자기보고식 문항을 통해 각자 선호하는 경향을 찾고," +
                        "\n이러한 선호 경향들이 인간의 행동에 어떠한 영향을 미치는가를 파악하여" +
                        "\n실생활에 응용하도록 제작된 심리 검사이다.");
                dlg.setPositiveButton("확인",null);
                dlg.show();
            }
        });

    }
}