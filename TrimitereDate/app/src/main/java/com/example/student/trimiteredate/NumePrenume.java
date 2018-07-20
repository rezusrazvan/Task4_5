package com.example.student.trimiteredate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NumePrenume extends AppCompatActivity {

        TextView IDtv1, IDtv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nume_prenume);

        IDtv1 = (TextView) findViewById(R.id.IDtv1);
        IDtv2 = (TextView) findViewById(R.id.IDtv2);

        String nume = getIntent().getStringExtra("nume");
        IDtv1.setText(nume);

        String prenume = getIntent().getStringExtra("prenume");
        IDtv2.setText(prenume);
    }
}
