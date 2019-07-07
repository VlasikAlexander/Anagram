package com.example.anagram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Anagramer anagramer = new Anagramer();
        final TextView texView = findViewById(R.id.textView);
        ((EditText) findViewById(R.id.editText)).addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                texView.setText(anagramer.anagramIt(s));
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }


}

