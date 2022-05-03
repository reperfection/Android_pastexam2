package net.skhu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exam4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam4);

        Button button1 = findViewById(R.id.btnUp);
        Button button2 = findViewById(R.id.btnDown);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText e = findViewById(R.id.editText_number);
                int n = Integer.parseInt(getString(R.string.number));
                //String.format("%d", R.string.number);
                int buttonId = view.getId();
                if(buttonId == R.id.btnUp) n++;
                else if(buttonId == R.id.btnDown) n--;
                e.setText(n);
            }
        };
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
    }
}

