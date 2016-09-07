package com.work.siddharththakur.basiccalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class mycalculator extends ActionBarActivity implements View.OnClickListener{
    private Button btnAdd;
    private Button btnSub;
    private Button btnmul;
    private Button btndivide;
    private TextView tvresult;
    private EditText etfirstnumber,etseccondnumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycalculator);
        initailize();
    }
    private void initailize()
    {
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnmul = (Button)findViewById(R.id.btnmul);
        btndivide = (Button)findViewById(R.id.btndivide);
        tvresult=(TextView)findViewById(R.id.tvresult);
        etfirstnumber=(EditText)findViewById(R.id.etfirstnumber);
        etseccondnumber=(EditText)findViewById(R.id.etsecondnumber);
        btnAdd.setOnClickListener( this);
        btnSub.setOnClickListener(this);
        btnmul.setOnClickListener( this);
        btndivide.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)throws NumberFormatException {
        long num1=0,num2=0;
        try {

             num1 =Long.parseLong(etfirstnumber.getText().toString());
             num2 = Long.parseLong(etseccondnumber.getText().toString());
        }catch (Exception e)
        {
            tvresult.setText("enter numeric value");
        }
        switch(v.getId())
        {
            case R.id.btnAdd:
                long add;
                add = num1+num2;
                tvresult.setText(String.valueOf(add));
                break;
            case R.id.btnSub:
                long sub=num1-num2;
                tvresult.setText(String.valueOf(sub));
                break;
            case R.id.btnmul:
               long mul=num1*num2;
                tvresult.setText(String.valueOf(mul));
                break;
            case R.id.btndivide:
                try {
                 double div;
                    div = num1/num2;
                    tvresult.setText(String.valueOf(div));
                }catch(Exception e)
                {
                    tvresult.setText("Cannot Divide!!");
                }
                break;

        }
    }
}
