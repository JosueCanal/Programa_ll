package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tempVal;
    Button btn;
    RadioGroup opt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btnCalcular);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempVal=findViewById(R.id.txtnum1);
                double num1=Double.parseDouble(tempVal.getText().toString());

                tempVal=findViewById(R.id.txtnum2);
                double num2=Double.parseDouble(tempVal.getText().toString());

                double resultado= 0;
                opt=findViewById(R.id.optOperadores);
                switch (opt.getCheckedRadioButtonId()){
                    case R.id.opSuma:
                            resultado = num1+num2;
                            break;
                    case R.id.opResta:
                        resultado = num1-num2;
                        break;
                    case R.id.opMulplicacion:
                        resultado = num1*num2;
                        break;
                    case R.id.opDivision:
                        resultado = num1/num2;
                        break;
                }
                tempVal=findViewById(R.id.lblresultado);
                tempVal.setText("Resultado = "+resultado);
            }
        });



    }
}