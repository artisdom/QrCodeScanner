package com.example.qrcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.kaola.qrcodescanner.qrcode.QrCodeActivity;

/**
 * 描述
 * <p>
 * Created by liyujiang on 2017/6/8 18:05.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onScanQrcode(View view) {
        startActivity(new Intent(this, QrCodeActivity.class));
    }

}
