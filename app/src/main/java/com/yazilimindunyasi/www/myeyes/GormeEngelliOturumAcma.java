package com.yazilimindunyasi.www.myeyes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GormeEngelliOturumAcma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorme_engelli_oturum_acma);

        Button btn_GirisYap = (Button)findViewById(R.id.btn_GirisYap);
        Button btn_KayitOl = (Button)findViewById(R.id.btn_KayitOl);

        btn_GirisYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),GormeEngelliGirisYap.class);
                startActivity(i);
            }
        });
        btn_KayitOl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),GormeEngelliKayitOl.class);
                startActivity(i);
            }
        });
    }
}
