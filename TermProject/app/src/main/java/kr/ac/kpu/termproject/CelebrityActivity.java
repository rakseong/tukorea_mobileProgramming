package kr.ac.kpu.termproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CelebrityActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.celebrity);

        Intent intent = getIntent();
        final String MBTI = intent.getStringExtra("MBTI");

        TextView checktext = (TextView)findViewById(R.id.checktext);
        Button backbtn = (Button)findViewById(R.id.backbtn);
        Button homebtn = (Button)findViewById(R.id.homebtn);
        Button exitbtn = (Button)findViewById(R.id.exitbtn);
        ImageView img1 = (ImageView)findViewById(R.id.im1);
        TextView t1 = (TextView)findViewById(R.id.name1);
        ImageView img2 = (ImageView)findViewById(R.id.im2);
        TextView t2 = (TextView)findViewById(R.id.name2);

        checktext.setText("\""+ MBTI+"\"");

        if(MBTI.equals("INTJ")){
            checktext.setTextColor(Color.parseColor("#6A1B9A"));
            img1.setImageResource(R.drawable.intjf);
            img2.setImageResource(R.drawable.intjm);
            t1.setText("김유정");
            t2.setText("강동원");
        }
        if(MBTI.equals("INTP")){
            checktext.setTextColor(Color.parseColor("#6A1B9A"));
            img1.setImageResource(R.drawable.intpf);
            img2.setImageResource(R.drawable.intpm);
            t1.setText("에이핑크 정은지");
            t2.setText("BTS 진");
        }
        if(MBTI.equals("ENTJ")){
            checktext.setTextColor(Color.parseColor("#6A1B9A"));
            img1.setImageResource(R.drawable.entjf);
            img2.setImageResource(R.drawable.entjm);
            t1.setText("소녀시대 티파니");
            t2.setText("이승기");
        }
        if(MBTI.equals("ENTP")){
            checktext.setTextColor(Color.parseColor("#6A1B9A"));
            img1.setImageResource(R.drawable.entpf);
            img2.setImageResource(R.drawable.entpm);
            t1.setText("한예슬");
            t2.setText("비투비 육성재");
        }
        if(MBTI.equals("INFJ")){
            checktext.setTextColor(Color.parseColor("#3CB371"));
            img1.setImageResource(R.drawable.infjf);
            img2.setImageResource(R.drawable.infjm);
            t1.setText("소녀시대 태연");
            t2.setText("아스트로 차은우");
        }
        if(MBTI.equals("INFP")){
            checktext.setTextColor(Color.parseColor("#3CB371"));
            img1.setImageResource(R.drawable.infpf);
            img2.setImageResource(R.drawable.infpm);
            t1.setText("아이유");
            t2.setText("BTS 정국");
        }
        if(MBTI.equals("ENFJ")){
            checktext.setTextColor(Color.parseColor("#3CB371"));
            img1.setImageResource(R.drawable.enfjf);
            img2.setImageResource(R.drawable.enfjm);
            t1.setText("김연경");
            t2.setText("BTS 지민");
        }
        if(MBTI.equals("ENFP")){
            checktext.setTextColor(Color.parseColor("#3CB371"));
            img1.setImageResource(R.drawable.enfpf);
            img2.setImageResource(R.drawable.enfpm);
            t1.setText("이효리");
            t2.setText("BTS 뷔");
        }
        if(MBTI.equals("ISTP")){
            checktext.setTextColor(Color.parseColor("#FFCC33"));
            img1.setImageResource(R.drawable.istpf);
            img2.setImageResource(R.drawable.istpm);
            t1.setText("김연아");
            t2.setText("장성규");
        }
        if(MBTI.equals("ISFP")){
            checktext.setTextColor(Color.parseColor("#FFCC33"));
            img1.setImageResource(R.drawable.isfpf);
            img2.setImageResource(R.drawable.isfpm);
            t1.setText("김다미");
            t2.setText("유재석");
        }
        if(MBTI.equals("ESTP")){
            checktext.setTextColor(Color.parseColor("#FFCC33"));
            img1.setImageResource(R.drawable.estpf);
            img2.setImageResource(R.drawable.estpm);
            t1.setText("효린");
            t2.setText("강호동");
        }
        if(MBTI.equals("ESFP")){
            checktext.setTextColor(Color.parseColor("#FFCC33"));
            img1.setImageResource(R.drawable.esfpf);
            img2.setImageResource(R.drawable.esfpm);
            t1.setText("소녀시대 수영");
            t2.setText("비");
        }
        if(MBTI.equals("ISTJ")){
            checktext.setTextColor(Color.parseColor("#3399CC"));
            img1.setImageResource(R.drawable.istjf);
            img2.setImageResource(R.drawable.istjm);
            t1.setText("안소희");
            t2.setText("차태현");
        }
        if(MBTI.equals("ISFJ")){
            checktext.setTextColor(Color.parseColor("#3399CC"));
            img1.setImageResource(R.drawable.infjf);
            img2.setImageResource(R.drawable.infjm);
            t1.setText("장도연");
            t2.setText("최강창민");
        }
        if(MBTI.equals("ESTJ")){
            checktext.setTextColor(Color.parseColor("#3399CC"));
            img1.setImageResource(R.drawable.estjf);
            img2.setImageResource(R.drawable.estjm);
            t1.setText("한채영");
            t2.setText("김준수");
        }
        if(MBTI.equals("ESFJ")){
            checktext.setTextColor(Color.parseColor("#3399CC"));
            img1.setImageResource(R.drawable.esfjf);
            img2.setImageResource(R.drawable.esfjm);
            t1.setText("혜리");
            t2.setText("슈퍼주니어 규현");
        }

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        exitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });

    }
}
