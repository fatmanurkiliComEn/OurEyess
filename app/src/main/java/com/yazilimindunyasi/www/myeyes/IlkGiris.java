package com.yazilimindunyasi.www.myeyes;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IlkGiris extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilk_giris);
    }
    public void onBrowserSozlesme(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.tr"));
        startActivity(browserIntent);
    }
    public void KullaniciTercihineGec(View view)
    {
        Intent intocan = new Intent(IlkGiris.this, KullaniciTercihi.class);
        startActivity(intocan);
    }
    public void Anasayfa(View view)
    {
        Intent i = new Intent(getApplicationContext(),GonulluAnasayfa.class);
        startActivity(i);
    }
}
