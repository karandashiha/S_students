package com.chnulabs.s_students;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onBtnClick(View view){
        // CharSequence text="Ви натиснули на кнопку!";
        //       int duration= Toast.LENGTH_LONG;
        //       Toast toast=Toast.makeText(this,text,duration);
        //       toast.show();

        Spinner spinner= (Spinner) findViewById(R.id.spinner);
        String grpNumb=(String) spinner.getSelectedItem();
        String txtStudents="";
        for(Student s: Student.getStudents(grpNumb)){
            txtStudents += s.getName()+"/n";
        }
        TextView textView=(TextView) findViewById(R.id.text);
        textView.setText(txtStudents);
    }
}