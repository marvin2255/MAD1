package com.example.arrayadapter4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String  STR []={"MAR","ARU","AAB"};
        l1=findViewById(R.id.l1);
        try {
            ArrayAdapter<String> ar=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,STR);
            l1.setAdapter(ar);

        } catch (Exception e) {
            Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
}