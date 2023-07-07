package kr.ac.kpu.termproject;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DBActivity extends AppCompatActivity {
    myDB myHelper;
    EditText edtname;
    TextView nameresult, mbtiresult, time;
    Button resetbtn, inputbtn, checkbtn, backBtn, homeBtn;
    SQLiteDatabase sqlDB;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.database);
        Intent intent = getIntent();
        final String MBTI = intent.getStringExtra("MBTI");

        long now = System.currentTimeMillis();
        Date mDate = new Date(now);
        SimpleDateFormat simpleDate = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String gettime = simpleDate.format(mDate);

        edtname = (EditText) findViewById(R.id.edtname);
        nameresult = (TextView) findViewById(R.id.nameresult);
        mbtiresult = (TextView) findViewById(R.id.mbtiresult);
        time = (TextView) findViewById(R.id.time);
        resetbtn = (Button) findViewById(R.id.resetbtn);
        inputbtn = (Button) findViewById(R.id.inputbtn);
        checkbtn = (Button) findViewById(R.id.checkbtn);
        myHelper = new myDB(this);
        backBtn = (Button) findViewById(R.id.backbtn);
        homeBtn = (Button) findViewById(R.id.homebtn);

        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sqlDB = myHelper.getWritableDatabase();
                myHelper.onUpgrade(sqlDB, 1, 2);
                sqlDB.close();
            }
        });

        inputbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtname.getText().toString().length() <= 0) {
                    Toast.makeText(getApplicationContext(), "이름을 입력해 주세요.", Toast.LENGTH_SHORT).show();
                } else {
                    sqlDB = myHelper.getWritableDatabase();
                    sqlDB.execSQL("INSERT INTO groupTBL(gName,gNumber,gTime) VALUES('" + edtname.getText().toString() + "','" + MBTI + "','" + gettime + "');");
                    sqlDB.close();
                    Toast.makeText(getApplicationContext(), "성공적으로 저장되었습니다!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        checkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sqlDB = myHelper.getReadableDatabase();
                Cursor cursor;
                cursor = sqlDB.rawQuery("SELECT * FROM groupTBL;", null);

                String strname = "NAME" + "\r\n" + "----------------------------------" + "\r\n";
                String strmbti = "MBTI" + "\r\n" + "----------------------------------" + "\r\n";
                String strtime = "TIME" + "\r\n" + "----------------------------------" + "\r\n";

                while (cursor.moveToNext()) {
                    strname += cursor.getString(0) + "\r\n";
                    strmbti += cursor.getString(1) + "\r\n";
                    strtime += cursor.getString(2) + "\r\n";
                }

                nameresult.setText(strname);
                mbtiresult.setText(strmbti);
                time.setText(strtime);

                cursor.close();
                sqlDB.close();
            }
        });

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
    }

    public class myDB extends SQLiteOpenHelper {
        public myDB(Context context) {
            super(context, "groupDB", null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE groupTBL(gName TEXT,gNumber TEXT,gTime TEXT);");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) {
            db.execSQL("DROP TABLE IF EXISTS groupTBL");
            onCreate(db);
        }
    }
}