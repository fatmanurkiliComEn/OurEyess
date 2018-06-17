package com.yazilimindunyasi.www.myeyes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GormeEngelliGirisYap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorme_engelli_giris_yap);
    }

    public void SifremiUnuttum(View view)
    {
        Intent i = new Intent(GormeEngelliGirisYap.this,GormeEngelliKayitOl.class);
        startActivity(i);
    }
}
