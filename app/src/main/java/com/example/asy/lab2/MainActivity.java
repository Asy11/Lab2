package com.example.asy.lab2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button bt;
    Intent intent;
    EditText tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button) findViewById(R.id.bt_1);
        tx = (EditText) findViewById(R.id.editText);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pn = tx.getText().toString();
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + pn));
                startActivity(intent);
            }
        });



    }
}
