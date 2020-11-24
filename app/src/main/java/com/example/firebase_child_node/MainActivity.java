package com.example.firebase_child_node;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText t1, t2 ,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View view)
    {
        t1=(EditText)findViewById(R.id.roll_id);
        t2=(EditText)findViewById(R.id.name_id);
        t3=(EditText)findViewById(R.id.course_id);
        t4=(EditText)findViewById(R.id.duration_id);

        String roll = t1.getText().toString().trim();
        String name = t2.getText().toString().trim();
        String course = t3.getText().toString().trim();
        String duration = t4.getText().toString().trim();

        dataholder obj = new dataholder(name,course,duration);

        FirebaseDatabase db= FirebaseDatabase.getInstance();
        DatabaseReference node = db.getReference("student");

        node.child(roll).setValue(obj);

        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");

        Toast.makeText(getApplicationContext(),"value inserted",Toast.LENGTH_LONG).show();




    }


    //-----end---------
}