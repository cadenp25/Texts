package com.phillipscaden.texts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView viewText1, viewText2;
    EditText textEdit;
    Button button1, button2;
    int it=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();
        final String[] strings = res.getStringArray(R.array.string_arr);
        viewText1=findViewById(R.id.viewText);
        viewText2=findViewById(R.id.viewText2);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        textEdit=findViewById(R.id.textEdit);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                viewText1.setText(strings[it%4]);
                it++;}
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                viewText2.setText(textEdit.getText().toString());
            }
        });
    }
}
