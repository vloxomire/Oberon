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
    private TextView tW1;
    private RadioButton rB1, rB2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oberon);
    }
}
