package net.skhu;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class Exam1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam1);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        View.OnClickListener listener= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg ="";
                int buttonId = view.getId();
                switch(buttonId) {
                    case R.id.button1: msg = "하나"; break;
                    case R.id.button2: msg = "둘"; break;
                    case R.id.button3: msg = "셋"; break;
                }
                TextView t = findViewById(R.id.editText);
                t.setText(msg);
                }
            };
            button1.setOnClickListener(listener);
            button2.setOnClickListener(listener);
            button3.setOnClickListener(listener);
    }


}