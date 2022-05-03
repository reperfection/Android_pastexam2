package net.skhu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exam6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam6);

        Button b = findViewById(R.id.btnChange);
        View.OnClickListener listenerObj = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e = findViewById(R.id.editText1);
                TextView t = findViewById(R.id.textView3);
                CharSequence s1 = e.getText();
                CharSequence s2 = t.getText();
                t.setText(s1);
                e.setText(s2);
            }
        };
        b.setOnClickListener(listenerObj);
    }
}

