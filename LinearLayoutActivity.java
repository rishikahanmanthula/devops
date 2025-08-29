package com.example.layouts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LinearLayoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        TextView tv1 = new TextView(this);
        tv1.setText("LinearLayout - Item 1");
        TextView tv2 = new TextView(this);
        tv2.setText("LinearLayout - Item 2");

        layout.addView(tv1);
        layout.addView(tv2);

        setContentView(layout);
    }
}