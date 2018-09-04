package com.cy.emailsender;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cy.mylibrary.SendMailUtil;
import com.cy.mylibrary.SenderEmailInfo;

public class MainActivity extends Activity {


    SenderEmailInfo senderEmailInfo = new SenderEmailInfo(
        "smtp.sohu.com",
            "25",
            "caiyongok123@sohu.com",
            "a24172417"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.bt1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SendMailUtil.send(senderEmailInfo,"798714550@qq.com","今天天气好晴朗","处处好风光",null);
            }
        });
    }
}
