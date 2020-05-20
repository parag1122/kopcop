package com.example.afinal;

import android.Manifest;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class QRScanner extends AppCompatActivity implements ZXingScannerView.ResultHandler {
    ZXingScannerView ScannerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScannerView=new ZXingScannerView(this);
        setContentView(ScannerView);
        getSupportActionBar().setTitle("QR Scanner");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        /*final String[] permissions=new String[]{Manifest.permission.CAMERA};
        if(!ActivityCompat.shouldShowRequestPermissionRationale(QRScanner.this,Manifest.permission.CAMERA))
        {
            ActivityCompat.requestPermissions(QRScanner.this,permissions,RC_HANDLE_CAMERA_PERM);
        }*/
    }


    @Override
    public void handleResult(Result result) {
        Toast.makeText(getApplicationContext(),result.getText(),Toast.LENGTH_SHORT).show();
      /*  if(Patterns.WEB_URL.matcher(result.getText()).matches())
        {
            Intent browser=new Intent(Intent.ACTION_VIEW, Uri.parse(result.getText()));
            startActivity(browser);
        }*/
        onBackPressed();

    }

    @Override
    protected void onPause() {

        super.onPause();

    }

    @Override
    protected void onResume() {
        super.onResume();
        ScannerView.setResultHandler(this);
        ScannerView.startCamera();
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK))
        {
            super.finish();
        }
        return super.onKeyDown(keyCode, event);
    }
}
