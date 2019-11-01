package com.example.phoneinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtMoney;
    Button btnShow,btnClear;
    RadioButton rdSamSung,rdMi,rdLG,rdHTC,rdHuawei;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getUIView();

    }

    public void getUIView(){
        txtMoney = (EditText) findViewById(R.id.txt_money);
        btnShow = (Button) findViewById(R.id.btn_show);
        btnClear = (Button) findViewById(R.id.btn_clear);
        rdSamSung = (RadioButton) findViewById(R.id.rd_samsung);
        rdMi = (RadioButton) findViewById(R.id.rd_mi);
        rdLG = (RadioButton) findViewById(R.id.rd_lg);
        rdHTC = (RadioButton) findViewById(R.id.rd_htc);
        rdHuawei = (RadioButton) findViewById(R.id.rd_huawei);
    }

    public void showInformation(View view){
        String money = txtMoney.getText().toString();
        String result = "Selected phone : ";
        result += (rdSamSung.isChecked()) ? "SamSung" : (rdMi.isChecked()) ? "Mi" : (rdLG.isChecked()) ? "LG" : (rdHTC.isChecked()) ? "HTC" : (rdHuawei.isChecked()) ? "Huawei" : "";
        Toast.makeText(MainActivity.this, "Amount : " + money + "\n " + result , Toast.LENGTH_LONG).show();
    }

    public void clearData(View view){
        txtMoney.setText("");
        rdSamSung.setChecked(true);
        rdLG.setChecked(false);
        rdHTC.setChecked(false);
        rdMi.setChecked(false);
        rdHuawei.setChecked(false);
    }

    public void checkRadioItem(View view){
        boolean ischecked = ((RadioButton) view).isChecked();
        String result = "";

        switch (view.getId()){
            case R.id.rd_samsung :
                result = "Samsung is selected";
                break;

            case R.id.rd_lg :
                result = "LG is selected";
                break;

            case R.id.rd_htc :
                result = "HTC is selected";
                break;

            case R.id.rd_mi :
                result = "Mi is selected";
                break;

            case R.id.rd_huawei :
                result = "Huawei is selected";
                break;

        }

        Toast.makeText(MainActivity.this,result,Toast.LENGTH_LONG).show();
    }
}
