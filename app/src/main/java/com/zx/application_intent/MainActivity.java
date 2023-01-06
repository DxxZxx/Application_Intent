package com.zx.application_intent;

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
    }
    public void SendMessage(View view) {
        EditText text = (EditText) findViewById(R.id.message);
        String msg = text.getText().toString();
        Intent intent = new Intent(this,ReceiveMsg.class);
        intent.putExtra(ReceiveMsg.EXTRA_MESSAGE,msg);
        startActivity(intent);
    }
}