package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import java.text.DecimalFormat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button num_0;
    private Button num_1;
    private Button num_2;
    private Button num_3;
    private Button num_4;
    private Button num_5;
    private Button num_6;
    private Button num_7;
    private Button num_8;
    private Button num_9;
    private Button num_10;
    private Button plus;
    private Button minus;
    private Button multi;
    private Button division;
    private TextView screen;
    private  Button clear_screen;
    private boolean check_operator = false;
    private TextView operator;
    private Button result;
    private boolean check_equal = false;
    private boolean check_dot_exist = false;

    private Button dot;

    public String value_before = "";

    public String value_after = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num_0 = (Button) findViewById(R.id.button_0);
        num_1 = (Button) findViewById(R.id.button_1);
        num_2 = (Button) findViewById(R.id.button_2);
        num_3 = (Button) findViewById(R.id.button_3);
        num_4 = (Button) findViewById(R.id.button_4);
        num_5 = (Button) findViewById(R.id.button_5);
        num_6 = (Button) findViewById(R.id.button_6);
        num_7 = (Button) findViewById(R.id.button_7);
        num_8 = (Button) findViewById(R.id.button_8);
        num_9 = (Button) findViewById(R.id.button_9);
        plus = (Button) findViewById(R.id.button_plus);
        minus = (Button) findViewById(R.id.button_minus);
        multi = (Button) findViewById(R.id.button_multi);
        division = (Button) findViewById(R.id.button_division);
        screen = (TextView) findViewById(R.id.textView_screen);
        clear_screen = (Button) findViewById((R.id.button_clear_screen));
        operator = (TextView) findViewById(R.id.operator);
        result = (Button) findViewById(R.id.button_equal);
        dot = (Button) findViewById(R.id.button_dot);

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check_dot_exist == false)
                {
                    String screen_text = screen.getText().toString();
                    String but_text = dot.getText().toString();
                    String result = screen_text = get_text_for_screen(but_text,screen_text);
                    screen.setText(result);
                    check_dot_exist = true;
                }



            }
        });


        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (check_equal == false)
                {
                    check_equal = true;
                    handle_equal();
                    check_equal = false;
                    check_operator = false;
                }
                else
                {
                    String temp = screen.getText().toString();
                    screen.setText(temp);
                }



            }
        });

        clear_screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText("0");
                value_before = "";
                value_after = "";
                check_operator = false;
                operator.setVisibility(View.INVISIBLE);
            }
        });
        num_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String screen_text = screen.getText().toString();
                String but_text = num_0.getText().toString();
                String result = screen_text = get_text_for_screen(but_text,screen_text);
                screen.setText(result);
            }
        });

        num_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String screen_text = screen.getText().toString();
                String but_text = num_1.getText().toString();
                String result = screen_text = get_text_for_screen(but_text,screen_text);
                screen.setText(result);
            }
        });

        num_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String screen_text = screen.getText().toString();
                String but_text = num_2.getText().toString();
                String result = screen_text = get_text_for_screen(but_text,screen_text);
                screen.setText(result);
            }
        });

        num_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String screen_text = screen.getText().toString();
                String but_text = num_3.getText().toString();
                String result = screen_text = get_text_for_screen(but_text,screen_text);
                screen.setText(result);
            }
        });

        num_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String screen_text = screen.getText().toString();
                String but_text = num_4.getText().toString();
                String result = screen_text = get_text_for_screen(but_text,screen_text);
                screen.setText(result);
            }
        });

        num_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String screen_text = screen.getText().toString();
                String but_text = num_5.getText().toString();
                String result = screen_text = get_text_for_screen(but_text,screen_text);
                screen.setText(result);
            }
        });

        num_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String screen_text = screen.getText().toString();
                String but_text = num_6.getText().toString();
                String result = screen_text = get_text_for_screen(but_text,screen_text);
                screen.setText(result);
            }
        });

        num_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String screen_text = screen.getText().toString();
                String but_text = num_7.getText().toString();
                String result = screen_text = get_text_for_screen(but_text,screen_text);
                screen.setText(result);
            }
        });
        num_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String screen_text = screen.getText().toString();
                String but_text = num_8.getText().toString();
                String result = screen_text = get_text_for_screen(but_text,screen_text);
                screen.setText(result);
            }
        });

        num_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String screen_text = screen.getText().toString();
                String but_text = num_9.getText().toString();
                String result = screen_text = get_text_for_screen(but_text,screen_text);
                screen.setText(result);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check_operator == false)
                {
                    check_operator = true;
                    operator.setText("+");
                    operator.setVisibility(View.VISIBLE);
                    value_before = screen.getText().toString();
                    check_dot_exist = false;
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check_operator == false)
                {
                    check_operator = true;
                    operator.setText("-");
                    operator.setVisibility(View.VISIBLE);
                    value_before = screen.getText().toString();
                    check_dot_exist = false;
                }
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check_operator == false)
                {
                    check_operator = true;
                    operator.setText("x");
                    operator.setVisibility(View.VISIBLE);
                    value_before = screen.getText().toString();
                    check_dot_exist = false;
                }
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (check_operator == false)
                {
                    check_operator = true;
                    operator.setText("/");
                    operator.setVisibility(View.VISIBLE);
                    value_before = screen.getText().toString();
                    check_dot_exist = false;
                }
            }
        });


    }

    public void handle_equal()
    {
        if (check_operator == true)
        {
            String get_oper = operator.getText().toString();
            if (get_oper.equals("+"))
            {
                double num2 = Double.valueOf(screen.getText().toString());
                double num1 = Double.valueOf(value_before);
                double sum = num1 + num2;
                boolean check = check_decimal(sum);
                if (check == false)
                {
                    screen.setText(Double.toString(sum));
                }
                else
                {
                    int temp = (int)sum;
                    screen.setText(String.valueOf(temp));
                }

                value_before = "";
                value_after = "";
                operator.setVisibility(View.INVISIBLE);

            }

            if (get_oper.equals("-"))
            {
                double num2 = Double.valueOf(screen.getText().toString());
                double num1 = Double.valueOf(value_before);
                double minus = num1 - num2;
                screen.setText(Double.toString(minus));
                value_before = "";
                value_after = "";
                operator.setVisibility(View.INVISIBLE);

                boolean check = check_decimal(minus);
                if (check == false)
                {
                    screen.setText(Double.toString(minus));
                }
                else
                {
                    int temp = (int)minus;
                    screen.setText(String.valueOf(temp));
                }
            }

            if (get_oper.equals("x"))
            {
                double num2 = Double.valueOf(screen.getText().toString());
                double num1 = Double.valueOf(value_before);
                double multi = num1 * num2;
                screen.setText(Double.toString(multi));
                value_before = "";
                value_after = "";
                operator.setVisibility(View.INVISIBLE);

                boolean check = check_decimal(multi);
                if (check == false)
                {
                    screen.setText(Double.toString(multi));
                }
                else
                {
                    int temp = (int)multi;
                    screen.setText(String.valueOf(temp));
                }
            }

            if (get_oper.equals("/"))
            {
                double num2 = Double.valueOf(screen.getText().toString());
                double num1 = Double.valueOf(value_before);
                double division = Double.parseDouble(new DecimalFormat("##.####").format(num1 / num2));
                screen.setText(Double.toString(division));
                value_before = "";
                value_after = "";
                operator.setVisibility(View.INVISIBLE);

                boolean check = check_decimal(division);
                if (check == false)
                {
                    screen.setText(Double.toString(division));
                }
                else
                {
                    int temp = (int)division;
                    screen.setText(String.valueOf(temp));
                }
            }

            operator.setVisibility(View.INVISIBLE);
        }
//        else
//        {
//            String temp = screen.getText().toString();
//            screen.setText(temp);
//        }

    }

    public String get_text_for_screen(String but_text,String screen_text) {
        String result = "";
        if (check_operator == false) {

            if (screen_text.equals("0")) {
                result = but_text;
                return result;
            } else {
                result = screen_text + but_text;
                return result;
            }
        } else {

            if (check_equal == false) {
                if (value_after.equals("")) {
                    value_after = but_text;
                    result = but_text;

                } else {

                    result = value_after.toString() + but_text;
                    value_after = result;
                    Log.d("test", result.toString());

                }


            }
            else
            {
                result = but_text;
//                check_equal = false;
//                check_operator = false;
            }
            return result;


        }

    }

    public boolean check_decimal(double x)
    {
        boolean check = false;
        if (x % 1 != 0)
        {
            check = false;
        }
        else
        {
            check = true;
        }
        return check;
    }


}