package com.beetle.dragon.oberon;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class OberonActivity extends Activity {

    private EditText et1, et2;
    private Button button;
    private TextView tv1;
    private RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oberon);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        button=findViewById(R.id.button);
        tv1=findViewById(R.id.tv1);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
    }
}
