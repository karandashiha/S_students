package com.chnulabs.s_students;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class StudentsListActivity extends AppCompatActivity {
    public static final String Group_Number="groupnumber";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list);
        Intent intent=getIntent();
        String grpNumber= intent.getStringExtra(Group_Number);
        String txtStudent="";
        for(Student s: Student.getStudents(grpNumber)){
            txtStudent += s.getName()+"/n";
        }
        TextView textView=(TextView) findViewById(R.id.text);
        textView.setText(txtStudent);
    }
    public void onBtnClick(View view){
        Spinner spinner= (Spinner) findViewById(R.id.spinner);
        String grpNumb=(String) spinner.getSelectedItem();
        Intent intent=new Intent(this,StudentsListActivity.class);
        intent.putExtra(StudentsListActivity.Group_Number,grpNumb);
        startActivity(intent);

    }
}