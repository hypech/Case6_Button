package com.hypech.case6_button;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewTop;
    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6,
            button_7, button_8, button_9, button_Add, button_Sub,    button_Mul,
            button_Div, button_Ans, button_Del, button_Dot, button_Remainder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_0 = findViewById(R.id.b0);
        button_1 = findViewById(R.id.b1);
        button_2 = findViewById(R.id.b2);
        button_3 = findViewById(R.id.b3);
        button_4 = findViewById(R.id.b4);
        button_5 = findViewById(R.id.b5);
        button_6 = findViewById(R.id.b6);
        button_7 = findViewById(R.id.b7);
        button_8 = findViewById(R.id.b8);
        button_9 = findViewById(R.id.b9);
        button_Dot = findViewById(R.id.bDot);
        button_Add = findViewById(R.id.badd);
        button_Sub = findViewById(R.id.bsub);
        button_Mul = findViewById(R.id.bmul);
        button_Div = findViewById(R.id.biv);
        button_Remainder = findViewById(R.id.BRemain);
        button_Del = findViewById(R.id.button_del);
        button_Ans = findViewById(R.id.button_ans);
        textViewTop = findViewById(R.id.text_view_result);

        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_0.setOnClickListener(this);
        button_Dot.setOnClickListener(this);

        button_Add.setOnClickListener(new OperatorClick());
        button_Mul.setOnClickListener(new OperatorClick());
        button_Div.setOnClickListener(new OperatorClick());
        button_Sub.setOnClickListener(new OperatorClick());

        button_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewTop.setText(" Anonymous onClick Dot :)");
            }
        });
    }

    class OperatorClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            textViewTop.setText(" non-activity implements :)");
        }
    }

    @Override
    public void onClick(View v) {
        if  (v.getId() == R.id.b1) {
            textViewTop.setText(" onClick 1 :)");
        }else if (v.getId() == R.id.b2) {
            textViewTop.setText(" onClick 2 :)");
        }else {
            textViewTop.setText(" onClick 3-9 or 0 :)");
        }
    }

    public void xmlClick(View v){
        if  (v.getId() == R.id.button_ans) {
            textViewTop.setText(" xmlClick ANSWER :)");
        }else if (v.getId() == R.id.button_del) {
            textViewTop.setText(" xmlClick DEL :)");
        }
    }
}
