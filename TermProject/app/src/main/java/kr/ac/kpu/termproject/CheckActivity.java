package kr.ac.kpu.termproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CheckActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check);

        int[] e = new int[3];
        int[] i = new int[3];
        int[] s = new int[3];
        int[] n = new int[3];
        int[] t = new int[3];
        int[] f = new int[3];
        int[] j = new int[3];
        int[] p = new int[3];

        Button resultbtn = (Button)findViewById(R.id.resultbtn);
        Button E1 = (Button)findViewById(R.id.E1);
        Button I1 = (Button)findViewById(R.id.I1);
        Button S1 = (Button)findViewById(R.id.S1);
        Button N1 = (Button)findViewById(R.id.N1);
        Button T1 = (Button)findViewById(R.id.T1);
        Button F1 = (Button)findViewById(R.id.F1);
        Button P1 = (Button)findViewById(R.id.P1);
        Button J1 = (Button)findViewById(R.id.J1);
        Button E2 = (Button)findViewById(R.id.E2);
        Button I2 = (Button)findViewById(R.id.I2);
        Button S2 = (Button)findViewById(R.id.S2);
        Button N2 = (Button)findViewById(R.id.N2);
        Button T2 = (Button)findViewById(R.id.T2);
        Button F2 = (Button)findViewById(R.id.F2);
        Button P2 = (Button)findViewById(R.id.P2);
        Button J2 = (Button)findViewById(R.id.J2);
        Button E3 = (Button)findViewById(R.id.E3);
        Button I3 = (Button)findViewById(R.id.I3);
        Button S3 = (Button)findViewById(R.id.S3);
        Button N3 = (Button)findViewById(R.id.N3);
        Button T3 = (Button)findViewById(R.id.T3);
        Button F3 = (Button)findViewById(R.id.F3);
        Button P3 = (Button)findViewById(R.id.P3);
        Button J3 = (Button)findViewById(R.id.J3);

        E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e[0] = 1;
                i[0] = 0;
                E1.setBackgroundColor(Color.parseColor("#77ccff"));
                I1.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        I1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e[0] = 0;
                i[0] = 1;
                I1.setBackgroundColor(Color.parseColor("#77ccff"));
                E1.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });

        S1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s[0] = 1;
                n[0] = 0;
                S1.setBackgroundColor(Color.parseColor("#77ccff"));
                N1.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        N1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s[0] = 0;
                n[0] = 1;
                N1.setBackgroundColor(Color.parseColor("#77ccff"));
                S1.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        T1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t[0] = 1;
                f[0] = 0;
                T1.setBackgroundColor(Color.parseColor("#77ccff"));
                F1.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        F1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t[0] = 0;
                f[0] = 1;
                F1.setBackgroundColor(Color.parseColor("#77ccff"));
                T1.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        P1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p[0] = 1;
                j[0] = 0;
                P1.setBackgroundColor(Color.parseColor("#77ccff"));
                J1.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        J1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p[0] = 0;
                j[0] = 1;
                J1.setBackgroundColor(Color.parseColor("#77ccff"));
                P1.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });

        E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e[1] = 1;
                i[1] = 0;
                E2.setBackgroundColor(Color.parseColor("#77ccff"));
                I2.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        I2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e[1] = 0;
                i[1] = 1;
                I2.setBackgroundColor(Color.parseColor("#77ccff"));
                E2.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });

        S2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s[1] = 1;
                n[1] = 0;
                S2.setBackgroundColor(Color.parseColor("#77ccff"));
                N2.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        N2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s[1] = 0;
                n[1] = 1;
                N2.setBackgroundColor(Color.parseColor("#77ccff"));
                S2.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        T2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t[1] = 1;
                f[1] = 0;
                T2.setBackgroundColor(Color.parseColor("#77ccff"));
                F2.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        F2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t[1] = 0;
                f[1] = 1;
                F2.setBackgroundColor(Color.parseColor("#77ccff"));
                T2.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        P2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p[1] = 1;
                j[1] = 0;
                P2.setBackgroundColor(Color.parseColor("#77ccff"));
                J2.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        J2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p[1] = 0;
                j[1] = 1;
                J2.setBackgroundColor(Color.parseColor("#77ccff"));
                P2.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });

        E3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e[2] = 1;
                i[2] = 0;
                E3.setBackgroundColor(Color.parseColor("#77ccff"));
                I3.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        I3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e[2] = 0;
                i[2] = 1;
                I3.setBackgroundColor(Color.parseColor("#77ccff"));
                E3.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });

        S3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s[2] = 1;
                n[2] = 0;
                S3.setBackgroundColor(Color.parseColor("#77ccff"));
                N3.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        N3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s[2] = 0;
                n[2] = 1;
                N3.setBackgroundColor(Color.parseColor("#77ccff"));
                S3.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        T3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t[2] = 1;
                f[2] = 0;
                T3.setBackgroundColor(Color.parseColor("#77ccff"));
                F3.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        F3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t[2] = 0;
                f[2] = 1;
                F3.setBackgroundColor(Color.parseColor("#77ccff"));
                T3.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        P3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p[2] = 1;
                j[2] = 0;
                P3.setBackgroundColor(Color.parseColor("#77ccff"));
                J3.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });
        J3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p[2] = 0;
                j[2] = 1;
                J3.setBackgroundColor(Color.parseColor("#77ccff"));
                P3.setBackgroundColor(Color.parseColor("#cccccc"));
            }
        });



        resultbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int sume = 0, sumi = 0, sums = 0, sumn = 0, sumt = 0, sumf = 0, sumj = 0, sump = 0;
                String EI, SN, TF, JP, MBTI;

                for (int a = 0; a < i.length; a++) {
                    sume += e[a];
                    sumi += i[a];
                    sums += s[a];
                    sumn += n[a];
                    sumt += t[a];
                    sumf += f[a];
                    sumj += j[a];
                    sump += p[a];
                }
                int sumall = sume + sumi + sums + sumn + sumt + sumf + sumj + sump;
                if (sumall != 12) {
                    Toast.makeText(getApplicationContext(), "모든 질문에 답해주세요.", Toast.LENGTH_SHORT).show();
                } else {
                    if (sume > sumi) {
                        EI = "E";
                    } else {
                        EI = "I";
                    }
                    if (sums > sumn) {
                        SN = "S";
                    } else {
                        SN = "N";
                    }
                    if (sumt > sumf) {
                        TF = "T";
                    } else {
                        TF = "F";
                    }
                    if (sumj > sump) {
                        JP = "J";
                    } else {
                        JP = "P";
                    }

                    MBTI = EI + SN + TF + JP;

                    Intent intent = new Intent(getApplicationContext(), CheckResultActivity.class);
                    intent.putExtra("MBTI", MBTI);
                    startActivity(intent);
                }
            }
        });

    }
}
