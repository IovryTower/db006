package com.example.test006;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText e_name,e_email,e_num;
        TextView show;
        e_name=findViewById(R.id.edit_name);
        e_email=findViewById(R.id.edit_email);
        e_num=findViewById(R.id.edit_num);
        show=findViewById(R.id.text_show);

        Button btn_write,btn_read,btn_update,btn_remove;
        btn_write=findViewById(R.id.btn_write);
        btn_read=findViewById(R.id.btn_read);
        btn_update=findViewById(R.id.btn_update);
        btn_remove=findViewById(R.id.btn_remove);

        btn_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                
            }
        });














    }
}
