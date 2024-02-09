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

                double result=0;
                opt=findViewById(R.id.optOperadores);
                switch (opt.getCheckedRadioButtonId()) {
                    case R.id.opSuma:
                        result=num1+num2;
                        break;
                    case R.id.opResta:
                        result=num1-num2;
                        break;
                    case R.id.opMulplicacion:
                        result = num1 * num2;
                        break;
                    case R.id.opDivision:
                        result = num1 / num2;
                        break;
                    case R.id.opPorcentaje:
                        result = num1 * (num2 / 100);
                        break;
                    case R.id.opExponente:
                        result = Math.pow(num1, num2);
                        break;
                    case R.id.opFactorial:
                        long factorial = 1;
                        for (int i=1; i <=num1;i++) {
                            factorial *= i;
                            result = factorial;
                        }
                        break;
                    case R.id.opRaiz:
                        result= Math.pow(num1,1/num2);
                        break;
                }
                tempVal=findViewById(R.id.lblresultado);
                tempVal.setText("Resultado: "+result);
            }
        });
    }
}