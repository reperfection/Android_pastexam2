package net.skhu;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.os.Bundle;

public class Exam2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam2);


        Switch switch1 = findViewById(R.id.switch1);

        CompoundButton.OnCheckedChangeListener listener1 = new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView textView1 = findViewById(R.id.textView1);
                if (switch1.isChecked()) textView1.setText(R.string.power_on);
                else textView1.setText(R.string.power_off);
            }
        };
        switch1.setOnCheckedChangeListener(listener1);

        RadioGroup.OnCheckedChangeListener listener2 = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                String s = radioButton.getText().toString();
                TextView textView2 = findViewById(R.id.textView2);
                textView2.setText(s);
            }
        };
        final RadioGroup radioGroup1 = findViewById(R.id.radioGroup);
        radioGroup1.setOnCheckedChangeListener(listener2);
    }
}