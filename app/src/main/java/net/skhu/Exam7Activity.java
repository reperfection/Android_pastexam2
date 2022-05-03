package net.skhu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Exam7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam7);
    }

    public void btnAlert_clicked(View button) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.exam);
        builder.setMessage(R.string.data_insert);
        builder.setPositiveButton(R.string.button_one, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int index) {
                EditText e = findViewById(R.id.editText);
                e.setText(R.string.button_one);
            }
        });
        builder.setNegativeButton(R.string.button_two, new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int index) {
                EditText e = findViewById(R.id.editText);
                e.setText(R.string.button_two);
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}