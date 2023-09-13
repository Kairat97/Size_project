package com.example.size_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button increase;
    private Button decrease;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        increase = findViewById(R.id.increase);
        decrease = findViewById(R.id.decrease);

        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width += 25;
                layoutParams.height += 25;
                imageView.setLayoutParams(layoutParams);
            }
        });
        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width -= 25;
                layoutParams.height -= 25;
                imageView.setLayoutParams(layoutParams);
            }
        });
    }
}