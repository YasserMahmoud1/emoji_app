package com.example.assignment_1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class EmojiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_emoji);
        ImageButton coldFace = findViewById(R.id.coldFace);
        ImageButton hotFace = findViewById(R.id.hotFace);
        ImageButton angryFace = findViewById(R.id.angryFace);
        ImageButton huggingFace = findViewById(R.id.huggingFace);
        ImageButton crying = findViewById(R.id.crying);
        ImageButton rollingLaughing = findViewById(R.id.rollLaughing);
        ImageButton sleepingFace = findViewById(R.id.sleepingFace);
        ImageButton smileWithHearts = findViewById(R.id.smileWithHearts);
        ImageButton smileWithTear = findViewById(R.id.smileWithTear);
        ImageButton smileWithSunglasses = findViewById(R.id.smileWithSunglasses);

        coldFace.setOnClickListener(this::onButtonClick);
        hotFace.setOnClickListener(this::onButtonClick);
        angryFace.setOnClickListener(this::onButtonClick);
        huggingFace.setOnClickListener(this::onButtonClick);
        crying.setOnClickListener(this::onButtonClick);
        rollingLaughing.setOnClickListener(this::onButtonClick);
        sleepingFace.setOnClickListener(this::onButtonClick);
        smileWithHearts.setOnClickListener(this::onButtonClick);
        smileWithSunglasses.setOnClickListener(this::onButtonClick);
        smileWithTear.setOnClickListener(this::onButtonClick);
    }
    @SuppressLint("NonConstantResourceId")
    public void onButtonClick(View view){
        Intent intent = new Intent(this, ItemActivity.class);
        int id = view.getId();

        if(id == R.id.coldFace){
            intent.putExtra("image", R.drawable.cold_face_svgrepo_com);
            intent.putExtra("description","Cold Face");
        }else if(id == R.id.hotFace){
            intent.putExtra("image", R.drawable.hot_face_svgrepo_com);
            intent.putExtra("description","Hot Face");
        }else if(id == R.id.angryFace){
            intent.putExtra("image", R.drawable.pouting_face_svgrepo_com);
            intent.putExtra("description","Angry Face");
        }else if(id == R.id.sleepingFace){
            intent.putExtra("image", R.drawable.sleeping_face_svgrepo_com);
            intent.putExtra("description","Sleeping Face");
        }else if(id == R.id.crying){
            intent.putExtra("image", R.drawable.crying_face_svgrepo_com);
            intent.putExtra("description","Crying Face");
        }else if(id == R.id.smileWithSunglasses){
            intent.putExtra("image", R.drawable.smiling_face_with_sunglasses_svgrepo_com);
            intent.putExtra("description","Smiling With Sunglasses Face");
        }else if(id == R.id.rollLaughing){
            intent.putExtra("image", R.drawable.rolling_on_the_floor_laughing_svgrepo_com);
            intent.putExtra("description","Rolling Laughing Face");
        }else if(id == R.id.smileWithTear){
            intent.putExtra("image", R.drawable.smiling_face_with_tear_svgrepo_com);
            intent.putExtra("description","Smile With Tears Face");
        }else if(id == R.id.smileWithHearts){
            intent.putExtra("image", R.drawable.smiling_face_with_hearts_svgrepo_com);
            intent.putExtra("description","Smile With Hearts Face");
        }else if(id == R.id.huggingFace){
            intent.putExtra("image", R.drawable.hugging_face_svgrepo_com);
            intent.putExtra("description","Hugging Face");
        }
        startActivity(intent);
    }
}
