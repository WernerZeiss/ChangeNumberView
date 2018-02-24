package com.cwq.changenumberview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cwq.library.ChangeNumberView;
import com.cwq.library.EditNumberView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ChangeNumberView changeNumberView;
    private EditText et;
    private Button button;
    private EditNumberView editNumberView;
    private EditText et_flag2;
    private EditText et_pointLength;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeNumberView = findViewById(R.id.changeNumberView);
        et = findViewById(R.id.et);
        button = findViewById(R.id.button);
        editNumberView = findViewById(R.id.editNumberView);
        et_flag2 = findViewById(R.id.et_flag2);
        et_pointLength = findViewById(R.id.et_pointLength);
        button2 = findViewById(R.id.button2);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);

        changeNumberView.setOnClickViewListener(new ChangeNumberView.OnClickViewListener() {
            @Override
            public void onClickContent(View view) {
                Toast.makeText(MainActivity.this, "点击了数值", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDataChange(String value) {

            }
        });


        editNumberView.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                Log.i("MainActivity测试", "onTextChange:" + charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                String value = et.getText().toString().trim();
                if (!TextUtils.isEmpty(value))
                    changeNumberView.setUpdateStepValue(Double.valueOf(value));
                break;
            case R.id.button2:
                String flag2 = et_flag2.getText().toString().trim();
                if (!TextUtils.isEmpty(flag2))
                    editNumberView.setUpdateStepValue(Double.valueOf(flag2));

                String value2 = et_pointLength.getText().toString().trim();
                if (!TextUtils.isEmpty(value2))
                    editNumberView.setPointLength(Integer.valueOf(value2));
                break;
        }
    }
}
