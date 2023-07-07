package kr.ac.kpu.termproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CheckResultActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkresult);

        Intent intent = getIntent();
        final String MBTI = intent.getStringExtra("MBTI");

        TextView checktext = (TextView)findViewById(R.id.checktext);
        TextView exname = (TextView)findViewById(R.id.exname);
        TextView extext = (TextView)findViewById(R.id.extext);

        Button divbtn = (Button)findViewById(R.id.divbtn);
        Button celbtn = (Button)findViewById(R.id.celbtn);
        Button matbtn = (Button)findViewById(R.id.matbtn);
        Button savebtn = (Button)findViewById(R.id.savebtn);
        Button homebtn = (Button)findViewById(R.id.homebtn);
        Button exitbtn = (Button)findViewById(R.id.exitbtn);


        checktext.setText("\""+ MBTI+"\"");
        if(MBTI.equals("INTJ")){
            exname.setText("용의주도한 전략가");
            exname.setTextColor(Color.parseColor("#6A1B9A"));
            extext.setText("상상력이 풍부하며 철두철미한 계획을 세우는 전락가형");
            checktext.setTextColor(Color.parseColor("#6A1B9A"));
        }

        if(MBTI.equals("INTP")){
            exname.setText("논리적인 사색가");
            exname.setTextColor(Color.parseColor("#6A1B9A"));
            extext.setText("끊임없이 새로운 지식에 목말라 하는 혁신가형");
            checktext.setTextColor(Color.parseColor("#6A1B9A"));
        }

        if(MBTI.equals("ENTJ")){
            exname.setText("대담한 통솔자");
            exname.setTextColor(Color.parseColor("#6A1B9A"));
            extext.setText("대담하면서도 상상력이 풍부한 소유자로, \n다양한 방법을 모색하거나 여의치 않을 경우\n 새로운 방안을 창출하는 리더");
            checktext.setTextColor(Color.parseColor("#6A1B9A"));
        }

        if(MBTI.equals("ENTP")){
            exname.setText("뜨거운 논쟁을 즐기는 변론가");
            exname.setTextColor(Color.parseColor("#6A1B9A"));
            extext.setText("지적인 도전을 두려워하지 않는 똑똑한 호기심형");
            checktext.setTextColor(Color.parseColor("#6A1B9A"));
        }

        if(MBTI.equals("INFJ")){
            exname.setText("선의의 옹호자");
            exname.setTextColor(Color.parseColor("#3CB371"));
            extext.setText("조용하고 신비로우며 샘솟는 영감으로 \n지칠 줄 모르는 이상주의자");
            checktext.setTextColor(Color.parseColor("#3CB371"));
        }

        if(MBTI.equals("INFP")){
            exname.setText("열정적인 중재자");
            exname.setTextColor(Color.parseColor("#3CB371"));
            extext.setText("상냥한 성격의 이타주의자로 건강하고 \n밝은 사회 건설에 앞장서는 낭만형");
            checktext.setTextColor(Color.parseColor("#3CB371"));
        }

        if(MBTI.equals("ENFJ")){
            exname.setText("정의로운 사회운동가");
            exname.setTextColor(Color.parseColor("#3CB371"));
            extext.setText("넘치는 카리스마와 영향력으로 청중을 압도하는 리더형");
            checktext.setTextColor(Color.parseColor("#3CB371"));
        }

        if(MBTI.equals("ENFP")){
            exname.setText("재기발랄한 활동가");
            exname.setTextColor(Color.parseColor("#3CB371"));
            extext.setText("항상 웃을 거리를 찾아 다니는 활발한 성격으로\n 사람들과 자유롭게 어울리기를 좋아하는 \n넘치는 열정을 가진 소유자");
            checktext.setTextColor(Color.parseColor("#3CB371"));
        }

        if(MBTI.equals("ISTP")){
            exname.setText("만능 재주꾼");
            exname.setTextColor(Color.parseColor("#FFCC33"));
            extext.setText("대담하고 현식적인 성향으로\n 다양한 도구 사용에 능숙한 탐험형");
            checktext.setTextColor(Color.parseColor("#FFCC33"));
        }

        if(MBTI.equals("ISFP")){
            exname.setText("호기심 많은 예술가");
            exname.setTextColor(Color.parseColor("#FFCC33"));
            extext.setText("항시 새로운 것을 찾아 시도하거나 \n도전할 준비가 되어 있는 융통성 있는 성격의\n 매력 넘치는 예술가형");
            checktext.setTextColor(Color.parseColor("#FFCC33"));
        }

        if(MBTI.equals("ESTP")){
            exname.setText("모험을 즐기는 사업가");
            exname.setTextColor(Color.parseColor("#FFCC33"));
            extext.setText("벼랑 끝의 아슬아슬한 삶을 즐길 줄 알고\n 명석한 두뇌와 에너지, \n그리고 뛰어난 직관력을 가지고 있는 유형");
            checktext.setTextColor(Color.parseColor("#FFCC33"));
        }

        if(MBTI.equals("ESFP")){
            exname.setText("자유로운 영혼의 연예인");
            exname.setTextColor(Color.parseColor("#FFCC33"));
            extext.setText("주위에 있으면 인생이 지루하지 않을 정도로\n 즉흥적이며 열정과 에너지가 넘치는 연예인형");
            checktext.setTextColor(Color.parseColor("#FFCC33"));
        }

        if(MBTI.equals("ISTJ")){
            exname.setText("청렴결백한 논리주의자");
            exname.setTextColor(Color.parseColor("#3399CC"));
            extext.setText("사실에 근거하여 사고하며 이들의 행동이나 결정에\n 한 치의 의심을 사지 않는 현실주의자");
            checktext.setTextColor(Color.parseColor("#3399CC"));
        }

        if(MBTI.equals("ISFJ")){
            exname.setText("용감한 수호자");
            exname.setTextColor(Color.parseColor("#3399CC"));
            extext.setText("소중한 이들을 수호하는데 심혈을 기울이는 \n헌식적이며 성실한 방어자형");
            checktext.setTextColor(Color.parseColor("#3399CC"));
        }

        if(MBTI.equals("ESTJ")){
            exname.setText("엄격한 관리자");
            exname.setTextColor(Color.parseColor("#3399CC"));
            extext.setText("사물이나 사람을 관리하는데 독보적인\n 뛰어난 실력을 갖춘 관리자형" );
            checktext.setTextColor(Color.parseColor("#3399CC"));
        }

        if(MBTI.equals("ESFJ")){
            exname.setText("사교적인 외교관");
            exname.setTextColor(Color.parseColor("#3399CC"));
            extext.setText("타인을 향한 세심한 관심과 사교적인 성향으로\n 사람들 내에서 인기가 많으며, \n타인을 돕는데 열정적인 세심형");
            checktext.setTextColor(Color.parseColor("#3399CC"));
        }


        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DivisionActivity.class);
                startActivity(intent);
            }
        });

        celbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CelebrityActivity.class);
                intent.putExtra("MBTI",MBTI);
                startActivity(intent);
            }
        });

        matbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MatchedActivity.class);
                intent.putExtra("MBTI",MBTI);
                startActivity(intent);
            }
        });

        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DBActivity.class);
                intent.putExtra("MBTI",MBTI);
                startActivity(intent);
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