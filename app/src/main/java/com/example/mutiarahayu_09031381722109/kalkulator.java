package com.example.mutiarahayu_09031381722109;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class kalkulator extends AppCompatActivity implements View.OnClickListener {
    public String str ="";
    Character op = 'q';
    float i,num,numtemp;
    EditText showResult;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        showResult = (EditText)findViewById(R.id.result_id);

        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(this);

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    //untuk pindah moveintent ke welcome
    @Override
    public void onClick (View v) {
        Intent i = new Intent(kalkulator.this, MainActivity.class);
        startActivity(i);



    }

    //method untuk btn1
    public void btn1Clicked(View v){
        insert(1);

    }


    public void btn2Clicked(View v){
        insert(2);

    }
    public void btn3Clicked(View v){
        insert(3);

    }
    public void btn4Clicked(View v){
        insert(4);

    }
    public void btn5Clicked(View v){
        insert(5);

    }
    public void btn6Clicked(View v){
        insert(6);
    }
    public void btn7Clicked(View v){
        insert(7);

    }
    public void btn8Clicked(View v){
        insert(8);

    }
    public void btn9Clicked(View v){
        insert(9);

    }
    // method untuk btntambah
    public void btnplusClicked(View v){
        perform();
        op = '+';

    }

    public void btnminusClicked(View v){
        perform();
        op = '-';

    }
    public void btndivideClicked(View v){
        perform();
        op = '/';

    }
    public void btnmultiClicked(View v){
        perform();
        op = '*';

    }
    public void btnequalClicked(View v){
        calculate();

    }

    // method untuk menghapus
    public void btnclearClicked(View v){
        reset();
    }
    private void reset() {
        // TODO Auto-generated method stub
        str ="";
        op ='q';
        num = 0;
        numtemp = 0;
        showResult.setText("");
    }

    private void insert(int j) {
        // TODO Auto-generated method stub
        str = str+Integer.toString(j);
        num = Integer.valueOf(str).intValue();
        showResult.setText(str);

    }
    // method untuk tampil
    private void perform() {
        // TODO Auto-generated method stub
        str = "";
        calculateNoShow();
        numtemp = num;

    }
    // method rumus kalkulator
    private void calculate() {
        // TODO Auto-generated method stub
        if(op == '+')
            num = numtemp+num;
        else if(op == '-')
            num = numtemp-num;
        else if(op == '/')
            num = numtemp/num;
        else if(op == '*')
            num = numtemp*num;
        showResult.setText(""+num);
    }
    //method rumus
    private void calculateNoShow() {
        // TODO Auto-generated method stub
        if(op == '+')
            num = numtemp+num;
        else if(op == '-')
            num = numtemp-num;
        else if(op == '/')
            num = numtemp/num;
        else if(op == '*')
            num = numtemp*num;
    }
}