package com.example.viewstutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.viewstutorial.views.CustomViews;

public class MainActivity extends AppCompatActivity {
    private CustomViews mycustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mycustomView = (CustomViews) findViewById(R.id.customView);

        findViewById(R.id.btn_swapcolor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mycustomView.swapcolor();

            }
        });
    }
}
