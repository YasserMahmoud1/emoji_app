package com.example.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ItemActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_item);
        Intent intent = getIntent();
        String description = intent.getStringExtra("description");
        int image = intent.getIntExtra("image",0);
        TextView itemText = findViewById(R.id.itemText);
        ImageView itemImage = findViewById(R.id.itemImage);

        itemImage.setImageResource(image);
        itemText.setText(description);

    }
}
