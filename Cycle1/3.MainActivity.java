package com.example.sjcet.program13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt1;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeLabelContent(View view){
        txt1=(TextView)findViewById(R.id.txt1);
        ed1=(EditText)findViewById(R.id.ed1);
        txt1.setText(ed1.getText());

    }

}
