package net.skhu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Exam8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam8);

        Spinner spinner = findViewById(R.id.spinner_userType);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner spinner1 = findViewById(R.id.spinner_userType);
                int index1 = spinner1.getSelectedItemPosition();
                String text1 = spinner1.getSelectedItem().toString();
                EditText e = findViewById(R.id.editText1);
                e.setText(text1);
            }
        };
        Button button = findViewById(R.id.btnOk);
        button.setOnClickListener(listener);

        RadioGroup.OnCheckedChangeListener listener1 = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                String s = radioButton.getText().toString();
                EditText e = findViewById(R.id.editText1);
                e.setText(s);
            }
        };
        final RadioGroup radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup1.setOnCheckedChangeListener(listener1);
    }

}

