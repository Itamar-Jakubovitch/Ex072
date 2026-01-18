package com.example.ex072;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView iV;
    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        iV = findViewById(R.id.iV);
    }

    public void clicked(View view)
    {
        num = (int) (Math.random() * 3 + 1);
        btn.setText("" + num);
        if (num == 1) {
            iV.setImageResource(R.drawable.dog);
        } else if (num == 2) {
            iV.setImageResource(R.drawable.cat);
        } else {
            iV.setImageResource(R.drawable.sqr);
        }
    }
}