package com.example.arrayadpterlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    android.widget.ListView ListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView = (ListView)findViewById(R.id.lstv1);

        String[] names = new String[]{"ABCD","EFGH","IJKL","MNOP","QRST","UVWX","XYZ","dfsg","fgj",
                "ghfgh","ghf","dsaf","asdf","asdf","sdaf","asdf","asdf","fasd","asd","sda","fas"};

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,names);

        ListView.setAdapter(itemsAdapter);

        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("name",names[i]);
                startActivity(intent);
            }
        });
    }
}

