package com.first75494.heeloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onBtnClick(View view){
        TextView txtHello=findViewById(R.id.txtHello);
        EditText editText=findViewById(R.id.edtText);
        txtHello.setText("Hello "+editText.getText().toString());
    }
}
