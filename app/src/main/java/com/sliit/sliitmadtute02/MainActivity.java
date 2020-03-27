package com.sliit.sliitmadtute02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText txt1;
    private EditText txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        txt1 = (EditText) findViewById(R.id.editText4);
        txt2 = (EditText) findViewById(R.id.editText5);


    }

    public void onClick(View view) {
        Intent i = new Intent(this, Main2Activity.class);
        String data1 = txt1.getText().toString();
        String data2 = txt2.getText().toString();

        i.putExtra("A", data1);
        i.putExtra("B", data2);
        startActivity(i);
        finish();

        Context context = getApplicationContext();
        CharSequence text = "You just Clicked the OK button...";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(getApplicationContext(), "Sending Message....Wait!", Toast.LENGTH_LONG);
        toast.show();

        toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);

    }
        public void Add () {
            EditText txt1 = findViewById(R.id.editText);
            EditText txt2 = findViewById(R.id.editText2);
            EditText txt3 = findViewById(R.id.editText3);

            int num1 = Integer.parseInt(txt1.getText().toString());
            int num2 = Integer.parseInt(txt2.getText().toString());
            int result = num1 + num2;
            txt3.setText("Answer =" + String.valueOf(result));

        }

        public void Substract () {
            EditText txt1 = findViewById(R.id.editText);
            EditText txt2 = findViewById(R.id.editText2);
            EditText txt3 = findViewById(R.id.editText3);

            int num1 = Integer.parseInt(txt1.getText().toString());
            int num2 = Integer.parseInt(txt2.getText().toString());
            int result = num1 - num2;
            txt3.setText("Answer =" + String.valueOf(result));

        }
        public void Multiple () {
            EditText txt1 = findViewById(R.id.editText);
            EditText txt2 = findViewById(R.id.editText2);
            EditText txt3 = findViewById(R.id.editText3);

            int num1 = Integer.parseInt(txt1.getText().toString());
            int num2 = Integer.parseInt(txt2.getText().toString());
            int result = num1 * num2;
            txt3.setText("Answer =" + String.valueOf(result));

        }

        public void Divition () {
            EditText txt1 = findViewById(R.id.editText);
            EditText txt2 = findViewById(R.id.editText2);
            EditText txt3 = findViewById(R.id.editText3);

            int num1 = Integer.parseInt(txt1.getText().toString());
            int num2 = Integer.parseInt(txt2.getText().toString());
            int result = num1 / num2;
            txt3.setText("Answer =" + String.valueOf(result));

        }

    }