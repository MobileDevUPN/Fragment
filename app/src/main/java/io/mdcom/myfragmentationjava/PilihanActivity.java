package io.mdcom.myfragmentationjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PilihanActivity extends AppCompatActivity {

    static String menu = "Pilihan menu";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan);
        menu=getIntent().getStringExtra(menu);
        TextView text = findViewById(R.id.pilihan_menu);
        text.setText("Pilihan Menu Anda adalah "+menu);
    }
}
