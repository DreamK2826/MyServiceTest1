package com.dreamk.myservicetest1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        setListener();
    }

    private void setListener(){
        btn1.setOnClickListener(v -> {
            ToastUtil.show(this,"btn1");
            startService(new Intent(getBaseContext(),MyService.class));
        });
        btn2.setOnClickListener(v -> {
            ToastUtil.show(this,"btn2");
            stopService(new Intent(getBaseContext(),MyService.class));
        });
        btn3.setOnClickListener(v -> {
            ToastUtil.show(this,"btn3");

        });
        btn4.setOnClickListener(v -> {
            ToastUtil.show(this,"btn4");
        });
    }
}