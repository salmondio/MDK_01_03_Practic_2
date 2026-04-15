package com.example.practic_2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private String _name;

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
    }

    public void onStepAge(View vew){
        EditText name = findViewById(R.id.editTextText);
        _name = name.getText().toString();

        setContentView(R.layout.step_2);

        TextView tv = findViewById(R.id.textView);
        tv.setText("Привет, очень приятно познакомиться!\nДрузья меня называют шлюхой, и ты можешь!\n Сколько тебе лет, "+_name+"?");
    }

    public void onStepSex(View view){
        setContentView(R.layout.step_3);

        TextView tv = findViewById(R.id.textView);
        tv.setText(_name+", подскажи, пожалуйста,\nУ тебя есть пипися?");
    }

    public void onStepCard(View view){
        setContentView(R.layout.step_4);

        TextView tv = findViewById(R.id.textView);
        tv.setText("Отлично! остался один моментик.\n"+_name+", напиши ниже номер своей банковсткой карты\nи 3 цифры на её обороте<3");
    }
}