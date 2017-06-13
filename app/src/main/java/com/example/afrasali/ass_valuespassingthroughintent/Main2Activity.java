package com.example.afrasali.ass_valuespassingthroughintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b=getIntent().getExtras();
        String disp=b.getString("name");
        t=(TextView)findViewById(R.id.textView);
        t.setText(disp);
    }
}
