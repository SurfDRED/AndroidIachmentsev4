package com.example.androidiachmentsev4;
import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Генерация случайных чисел с помощью класса Random
        final Random random = new Random();
// найдем элементы
        final TextView exampleText = findViewById(R.id.textView2);
        Button BtnForward = findViewById(R.id.butForward);
        Button BtnBack = findViewById(R.id.butBack);
// создаем обработчик нажатия Forward и выводим информацию
        exampleText.setText("http://myfile.org/"+ random.nextInt(100));
        BtnForward.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
// создаем обработчик нажатия Back
        BtnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}