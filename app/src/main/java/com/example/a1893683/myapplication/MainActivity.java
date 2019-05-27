package com.example.a1893683.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etxtn,txte,txtp;
    Button btn;
    String TAG = "click register";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etxtn=findViewById(R.id.etxtn);
        txte=findViewById(R.id.txte);
        txtp=findViewById( R.id.txtp);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String Name=etxtn.getText().toString();
            String Email=txte.getText().toString();
            Log.v(TAG,Name);
            Log.v(TAG,Email);
            Log.v(TAG,txte.getText().toString());


            }
        });





            }

}
