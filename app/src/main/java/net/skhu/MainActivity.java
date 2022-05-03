package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnExam1(View view) {
        Intent intent = new Intent(this, Exam1Activity.class);
        startActivity(intent);
    }

    public void btnExam2(View view) {
        Intent intent = new Intent(this, Exam2Activity.class);
        startActivity(intent);
    }

    public void btnExam3(View view) {
        Intent intent = new Intent(this, ListViewActivity.class);
        startActivity(intent);
    }

    public void btnExam4(View view) {
        Intent intent = new Intent(this, Exam4Activity.class);
        startActivity(intent);
    }

    public void btnExam5(View view) {
        Intent intent = new Intent(this, Exam5Activity.class);
        startActivity(intent);
    }

    public void btnExam6(View view) {
        Intent intent = new Intent(this, Exam6Activity.class);
        startActivity(intent);
    }

    public void btnExam7(View view) {
        Intent intent = new Intent(this, Exam7Activity.class);
        startActivity(intent);
    }

    public void btnExam8(View view) {
        Intent intent = new Intent(this, Exam8Activity.class);
        startActivity(intent);
    }

    public void btnAlert_clicked(View button) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.kor_confirm);
        builder.setMessage(R.string.doYouWantToDelete);
        builder.setPositiveButton(R.string.delete, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int index) {
                EditText e = findViewById(R.id.editText);
                e.setText(R.string.delete);
            }
        });
        builder.setNegativeButton(R.string.cancel, null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}