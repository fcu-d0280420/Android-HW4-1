package com.example.notification_sender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.btn_send);
        btn.setOnClickListener(rec_notification);

        et_msg = (EditText)findViewById(R.id.et_msg);
    }
    private View.OnClickListener rec_notification = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setAction("com.example.NOTIFICATION");
            String msg = et_msg.getEditableText().toString();
            intent.putExtra("KEY_MSG", msg);
            sendBroadcast(intent);
        }
    };
}
