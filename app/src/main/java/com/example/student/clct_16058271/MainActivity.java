package com.example.student.clct_16058271;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText textid,textmk;
    Button btdn;
    CheckBox checkBox;
    AlertDialog.Builder b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=new AlertDialog.Builder(this);
        b1.setTitle("Thông báo");
        btdn=(Button) findViewById(R.id.button);
        checkBox=(CheckBox) findViewById(R.id.checkBox);
        btdn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox.isChecked()){
                  b1.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                }else{
                    b1.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");
                }
                b1.show();
            }
        });
    }

}
