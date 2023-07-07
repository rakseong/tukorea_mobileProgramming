package kr.ac.kpu.termproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class DivisionActivity extends TabActivity {

    Button homeBtn, exitBtn, backBtn;
    String tagName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.division);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecEI = tabHost.newTabSpec("EI").setIndicator("E / I");
        tabSpecEI.setContent(R.id.divEI);
        tabHost.addTab(tabSpecEI);

        TabHost.TabSpec tabSpecSN = tabHost.newTabSpec("SN").setIndicator("S / N");
        tabSpecSN.setContent(R.id.divSN);
        tabHost.addTab(tabSpecSN);

        TabHost.TabSpec tabSpecTF = tabHost.newTabSpec("TF").setIndicator("T / F");
        tabSpecTF.setContent(R.id.divTF);
        tabHost.addTab(tabSpecTF);

        TabHost.TabSpec tabSpecPJ = tabHost.newTabSpec("PJ").setIndicator("P / J");
        tabSpecPJ.setContent(R.id.divPJ);
        tabHost.addTab(tabSpecPJ);


        tabHost.getTabWidget().setBackgroundColor(Color.parseColor("#cccccc"));
        tabHost.getTabWidget().setCurrentTab(0);
        tabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#88ccff"));

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String s) {
                for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
                    tabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#cccccc"));
                }
                tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundColor(Color.parseColor("#88ccff"));
            }
        });

        homeBtn = (Button) findViewById(R.id.homebtn);
        exitBtn = (Button) findViewById(R.id.exitbtn);
        backBtn = (Button) findViewById(R.id.backbtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                finish();
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });

    }
}
