package davegilbier.barrina.com.easycalc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import Controller.Operators;

public class MainActivity extends AppCompatActivity  {

    EditText textFirst, textSecond;
    TextView textAnswer;
    Button btAdd, btSubtract, btMultiply, btDivide, btClear, btExit;
    String firstNumber, secNumber;
    Operators mOperation = new Operators();
    double num1 , num2 , result ;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
    }

    private void findView() {
        textFirst = (EditText) findViewById(R.id.firstNum);
        textSecond = (EditText) findViewById(R.id.secNum);
        textAnswer = (TextView) findViewById(R.id.textResult);
        btAdd = (Button) findViewById(R.id.btnAdd);
        btSubtract = (Button) findViewById(R.id.btnSubtract);
        btMultiply = (Button) findViewById(R.id.btnMultiply);
        btDivide = (Button) findViewById(R.id.btnDivide);
        btClear = (Button) findViewById(R.id.btnClear);
        btExit = (Button) findViewById(R.id.btnExit);

    }

    public void Add(View view) {

            firstNumber = textFirst.getText().toString();
            secNumber = textSecond.getText().toString();
            num1 = Double.parseDouble(firstNumber);
            num2 = Double.parseDouble(secNumber);
            result = mOperation.add(num1, num2);
            //  textAnswer.setText(String.valueOf( result));
            String finalResult = String.format("%,.2f", result);
            textAnswer.setText(finalResult);

      // textAnswer.setText(String.valueOf(result));
    }
    public void Subtract (View view){
        firstNumber = textFirst.getText().toString();
        secNumber = textSecond.getText().toString();
        num1 = Double.parseDouble(firstNumber);
        num2 = Double.parseDouble(secNumber);
        result = mOperation.sub(num1, num2);
        String finalResult = String.format("%,.2f", result);
        textAnswer.setText(finalResult);
    }
    public void Multiply (View view){
        firstNumber = textFirst.getText().toString();
        secNumber = textSecond.getText().toString();
        num1 = Double.parseDouble(firstNumber);
        num2 = Double.parseDouble(secNumber);
        result = mOperation.multiply(num1, num2);
        String finalResult = String.format("%,.2f", result);
        textAnswer.setText(finalResult);

    }
    public void Divide (View view){
        firstNumber = textFirst.getText().toString();
        secNumber = textSecond.getText().toString();
        num1 = Double.parseDouble(firstNumber);
        num2 = Double.parseDouble(secNumber);
        result = mOperation.divide(num1, num2);
        String finalResult = String.format("%,.2f", result);
        textAnswer.setText(finalResult);

    }
    public void Clear (View view){
        textAnswer.setText("0");
        textFirst.setText(" ");
        textSecond.setText(" ");

    }
    public void Exit (View view){
        finish();
        System.exit(0);
    }
}


