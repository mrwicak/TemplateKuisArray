package com.example.template2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class PertanyaanActivity extends AppCompatActivity {

    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;


    String pertanyaan[] = {"Q1\n Pertanyaan A",
            "Q2\n Pertanyaan B",
            "Q3\n Pertanyaan C",
            "Q4\n Pertanyaan D",
    };
    String jawaban[] = {
            "A,B,C",
            "A,B,C",
            "A,B,C",
            "A,B,C",

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertanyaan);



    }
}
