package com.example.afrasali.ass_valuespassingthroughintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e;
    String disp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=(EditText)findViewById(R.id.txt);
    }

    public void sClick(View view){
       disp= e.getText().toString();
        Intent i=new Intent(MainActivity.this,Main2Activity.class);
        i.putExtra("name",disp);
        startActivity(i);

    }
}
