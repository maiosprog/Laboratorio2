package com.minor.laboratorio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //este cambio va para git
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, MessageActivity.class);
        EditText editText=findViewById(R.id.text_message);

        intent.putExtra("MESSAGE",editText.getText().toString());

        startActivity(intent);
    }
}
