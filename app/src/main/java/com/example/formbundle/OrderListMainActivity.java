package com.example.formbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class OrderListMainActivity extends AppCompatActivity {


    TextView msg;
    Bundle getbag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list_main);

        msg=findViewById(R.id.show);

        getbag=getIntent().getExtras();
        String name=getbag.getString("CAR");
        String odr=getbag.getString("ODR");
        msg.setText(name+"您的餐點有:"+"\n"+odr);
    }
}
