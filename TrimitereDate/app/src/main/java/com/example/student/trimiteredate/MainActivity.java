package com.example.student.trimiteredate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        EditText IDtext1,IDtext2;
        Button IDbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IDtext1 = (EditText) findViewById(R.id.IDtext1);
        IDtext2 = (EditText) findViewById(R.id.IDtext2);

        IDbt = (Button) findViewById(R.id.IDbt);

        IDbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nume = IDtext1.getText().toString().trim();

                Intent intent = new Intent(MainActivity.this,NumePrenume.class);
                intent.putExtra("nume",nume);

                String prenume = IDtext2.getText().toString().trim();
                Intent intent1 = new Intent(MainActivity.this, NumePrenume.class);
                intent.putExtra("prenume",prenume);
                startActivity(intent);

            }
        });
    }


}
