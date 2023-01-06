package com.zx.application_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ReceiveMsg extends AppCompatActivity {
    public static final  String EXTRA_MESSAGE = "message";
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_msg);
        Intent intent = getIntent();
        text = intent.getStringExtra(EXTRA_MESSAGE);
        TextView view = (TextView) findViewById(R.id.message);
        view.setText(text);
    }
    public void SendMail(View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,text);
        startActivity(intent);
    }
}