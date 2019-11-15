package com.example.formbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button ent;
    CheckBox c1,c2,c3,c4,c5,c6;
    RadioButton r1,r2;
    String car;
    String oder="";
    final Bundle bag=new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup gp=findViewById(R.id.group);
        ent=findViewById(R.id.button2);
        c1=findViewById(R.id.checkBox2);
        c2=findViewById(R.id.checkBox3);
        c3=findViewById(R.id.checkBox4);
        c4=findViewById(R.id.checkBox5);
        c5=findViewById(R.id.checkBox6);
        c6=findViewById(R.id.checkBox7);
        r1=findViewById(R.id.radioButton);
        r2=findViewById(R.id.radioButton2);

        gp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton button=findViewById(checkedId);
                car="您的餐點要:"+ button.getText() +"\n";

            }
        });

        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    oder = oder + c1.getText() +"\n";
                else
                    oder = oder.replace(c1.getText(),"");
            }
        });
        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    oder = oder + c2.getText() +"\n";
                else
                    oder = oder.replace(c2.getText(),"");
            }
        });
        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    oder = oder + c3.getText() +"\n";
                else
                    oder = oder.replace(c3.getText(),"");
            }
        });
        c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    oder = oder + c4.getText() +"\n";
                else
                    oder = oder.replace(c4.getText(),"");
            }
        });
        c5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    oder = oder + c5.getText() +"\n";
                else
                    oder = oder.replace(c5.getText(),"");
            }
        });
        c6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    oder = oder + c6.getText() +"\n";
                else
                    oder = oder.replace(c6.getText(),"");
            }
        });



        ent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,OrderListMainActivity.class);

                bag.putString("CAR",car);
                bag.putString("ODR",oder);

                intent.putExtras(bag);
                startActivity(intent);
                finish();
            }
        });
    }
}
