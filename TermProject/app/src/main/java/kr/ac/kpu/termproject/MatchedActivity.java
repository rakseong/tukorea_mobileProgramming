package kr.ac.kpu.termproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MatchedActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matched);

        Intent intent = getIntent();
        final String MBTI = intent.getStringExtra("MBTI");

        TextView result = (TextView)findViewById(R.id.result);

        LinearLayout good = (LinearLayout)findViewById(R.id.good);
        LinearLayout normal = (LinearLayout)findViewById(R.id.normal);
        LinearLayout notbad = (LinearLayout)findViewById(R.id.notbad);
        LinearLayout bad = (LinearLayout)findViewById(R.id.bad);

        TextView bestmatched = (TextView)findViewById(R.id.bestMatched);
        TextView goodmatched = (TextView)findViewById(R.id.goodMatched);
        TextView normalmatched = (TextView)findViewById(R.id.normalMatched);
        TextView notbadmatched = (TextView)findViewById(R.id.notbadMatched);
        TextView badmatched = (TextView)findViewById(R.id.badMatched);

        Button backbtn = (Button)findViewById(R.id.backbtn);
        Button homebtn = (Button)findViewById(R.id.homebtn);
        Button exitbtn = (Button)findViewById(R.id.exitbtn);

        result.setText("\""+MBTI+"\"");

        if(MBTI.equals("INFP")) {
            result.setTextColor(Color.parseColor("#3CB371"));

            bestmatched.setText("ENFJ, ENTJ");
            goodmatched.setText("INFP, INFJ, ENTP");
            badmatched.setText("ISFP, ESTP, ISTJ");

            normal.setVisibility(View.GONE);
            notbad.setVisibility(View.GONE);
        }

        else if(MBTI.equals("ENFP")) {
            result.setTextColor(Color.parseColor("#3CB371"));

            bestmatched.setText("INFJ, INTJ");
            goodmatched.setText("INFP, ENFJ, ENTP");
            badmatched.setText("ISFP, ESTP, ISTJ");

            normal.setVisibility(View.GONE);
            notbad.setVisibility(View.GONE);
        }

        else if(MBTI.equals("INFJ")) {
            result.setTextColor(Color.parseColor("#3CB371"));

            bestmatched.setText("ENFP, ENTP");
            goodmatched.setText("INFP, ENFJ, INTP");
            badmatched.setText("ISFP, ESTP, ISTJ");

            normal.setVisibility(View.GONE);
            notbad.setVisibility(View.GONE);
        }

        else if(MBTI.equals("ENFJ")) {
            result.setTextColor(Color.parseColor("#3CB371"));

            bestmatched.setText("INFP, ISFP");
            goodmatched.setText("ENFP, INFJ, ENTP");
            badmatched.setText("ESFP, ISTP, ESTP");

            normal.setVisibility(View.GONE);
            notbad.setVisibility(View.GONE);
        }

        else if(MBTI.equals("INTJ")) {
            result.setTextColor(Color.parseColor("#6A1B9A"));

            bestmatched.setText("ENFP, ENTP");
            goodmatched.setText("INFP, ENFJ, INTP");
            normalmatched.setText("ISFP, ISTP, ESTP");
            notbadmatched.setText("ISFJ, ESFJ, ISTJ");

            bad.setVisibility(View.GONE);
        }

        else if(MBTI.equals("ENTJ")) {
            result.setTextColor(Color.parseColor("#6A1B9A"));

            bestmatched.setText("INFP, INTP");
            goodmatched.setText("ENFP, INFJ, INTJ");
            normalmatched.setText("ISFP, ESTP, ESFJ");
            notbadmatched.setText("ISFP, ESTP, ISTJ");

            bad.setVisibility(View.GONE);
        }

        else if(MBTI.equals("INTP")) {
            result.setTextColor(Color.parseColor("#6A1B9A"));

            bestmatched.setText("ENTJ, ESTJ");
            goodmatched.setText("INFP, INFJ, ENTP");
            normalmatched.setText("ISFP, ISTP, ESTP");
            notbadmatched.setText("ISFJ, ESFJ, ISTJ");

            bad.setVisibility(View.GONE);
        }

        else if(MBTI.equals("ENTP")) {
            result.setTextColor(Color.parseColor("#6A1B9A"));

            bestmatched.setText("INFJ, INTJ");
            goodmatched.setText("INFP, ENFJ, INTP");
            normalmatched.setText("ISFP, ISTP, ESTP");
            notbadmatched.setText("ISFJ, ESFJ, ISTJ");

            bad.setVisibility(View.GONE);
        }

        else if(MBTI.equals("ISFP")) {
            result.setTextColor(Color.parseColor("#FFCC33"));

            bestmatched.setText("ENFJ, ESFJ, ESTJ");
            normalmatched.setText("INTJ, INTP, ENTP");
            notbadmatched.setText("ISFP, ISTP, ESTP");
            badmatched.setText("INFP, ENFP, INFJ");

            good.setVisibility(View.GONE);
        }

        else if(MBTI.equals("ESFP")) {
            result.setTextColor(Color.parseColor("#FFCC33"));

            bestmatched.setText("ISFJ, ISTJ");
            normalmatched.setText("INTJ, INTP, ENTP");
            notbadmatched.setText("ISFP, ISTP, ESTP");
            badmatched.setText("INFP, ENFP, ENFJ");

            good.setVisibility(View.GONE);
        }

        else if(MBTI.equals("ISTP")) {
            result.setTextColor(Color.parseColor("#FFCC33"));

            bestmatched.setText("ESFJ, ESTJ");
            normalmatched.setText("INTJ, INTP, ENTP");
            notbadmatched.setText("ISFP, ISTP, ESTP");
            badmatched.setText("INFP, ENFP, ENFJ");

            good.setVisibility(View.GONE);
        }

        else if(MBTI.equals("ESTP")) {
            result.setTextColor(Color.parseColor("#FFCC33"));

            bestmatched.setText("ISFJ, ISTJ");
            normalmatched.setText("INTJ, INTP, ENTP");
            notbadmatched.setText("ISFP, ISTP, ESTP");
            badmatched.setText("INFP, ENFP, ENFJ");

            good.setVisibility(View.GONE);
        }

        else if(MBTI.equals("ISFJ")) {
            result.setTextColor(Color.parseColor("#3399CC"));

            bestmatched.setText("ESFP, ESTP");
            goodmatched.setText("ISFJ, ISTJ, ESTJ");
            normalmatched.setText("ENTJ, ISFP, ISTP");
            notbadmatched.setText("INTJ, INTP, ENTP");
            badmatched.setText("INFP, ENFP, ENFJ");
        }

        else if(MBTI.equals("ESFJ")) {
            result.setTextColor(Color.parseColor("#3399CC"));

            bestmatched.setText("ISFP, ISTP");
            goodmatched.setText("ISFJ, ISTJ, ESTJ");
            normalmatched.setText("ENTJ, ESFP, ESTP");
            notbadmatched.setText("INTJ, INTP, ENTP");
            badmatched.setText("INFP, ENFP, ENFJ");
        }

        else if(MBTI.equals("ISTJ")) {
            result.setTextColor(Color.parseColor("#3399CC"));

            bestmatched.setText("ESFP, ESTP");
            goodmatched.setText("ISFJ, ISTJ, ESTJ");
            normalmatched.setText("ENTJ, ISFP, ISTP");
            notbadmatched.setText("INTJ, INTP, ENTP");
            badmatched.setText("INFP, ENFP, ENFJ");
        }

        else if(MBTI.equals("ESTJ")) {
            result.setTextColor(Color.parseColor("#3399CC"));

            bestmatched.setText("INTP, ISFP, ISTP");
            goodmatched.setText("ISFJ, ISTJ, ESTJ");
            normalmatched.setText("ENTJ, ESFP, ESTP");
            notbadmatched.setText("INTJ, ENTP");
            badmatched.setText("INFP, ENFP, ENFJ");
        }

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                finish();
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
