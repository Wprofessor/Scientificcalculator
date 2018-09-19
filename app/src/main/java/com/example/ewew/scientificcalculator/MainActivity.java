package com.example.ewew.scientificcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button num0;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;

    private Button change_val;
    private Button haha_val;
    private Button sin_val;
    private Button cos_val;
    private Button tan_val;
    private Button finger_val;
    private Button lg_val;
    private Button ln_val;
    private Button left_val;
    private Button right_val;
    private Button root_val;
    private Button AC_val;
    private Button del_val;
    private Button divide_val;
    private Button mul_val;
    private Button conmul_val;
    private Button subtract_val;
    private Button mark_val;
    private Button add_val;
    private Button T_val;
    private Button emm_val;
    private Button e_val;
    private Button percent_val;
    private Button pot_val;
    private Button equel_val;

    private EditText result_text;

    private String edittext = "";

    //结果
    private boolean Count = false;
    //以负号开头且后面不是减号
    private boolean startWithOperator = false;
    //以负号开头后面是减号
    private boolean startWithSubstract = false;
    //不以负号开头
    private boolean nostartWithSubstract = false;
    //特殊符号
    private boolean Others = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();
    }

    private void initView() {
        num0 = (Button) findViewById(R.id.num_zero);
        num1 = (Button) findViewById(R.id.num_one);
        num2 = (Button) findViewById(R.id.num_two);
        num3 = (Button) findViewById(R.id.num_three);
        num4 = (Button) findViewById(R.id.num_four);
        num5 = (Button) findViewById(R.id.num_five);
        num6 = (Button) findViewById(R.id.num_six);
        num7 = (Button) findViewById(R.id.num_seven);
        num8 = (Button) findViewById(R.id.num_eight);
        num9 = (Button) findViewById(R.id.num_nine);

        change_val = (Button) findViewById(R.id.change_val);
        haha_val = (Button) findViewById(R.id.haha_val);
        sin_val = (Button) findViewById(R.id.sin_val);
        cos_val = (Button) findViewById(R.id.cos_val);
        tan_val = (Button) findViewById(R.id.tan_val);
        finger_val = (Button) findViewById(R.id.finger_val);
        lg_val = (Button) findViewById(R.id.lg_val);
        ln_val = (Button) findViewById(R.id.ln_val);
        left_val = (Button) findViewById(R.id.left_val);
        right_val = (Button) findViewById(R.id.right_val);
        root_val = (Button) findViewById(R.id.root_val);
        AC_val = (Button) findViewById(R.id.AC_val);
        del_val = (Button) findViewById(R.id.del_val);
        divide_val = (Button) findViewById(R.id.divide_val);
        mul_val = (Button) findViewById(R.id.mul_val);
        conmul_val = (Button) findViewById(R.id.conmul_val);
        subtract_val = (Button) findViewById(R.id.subtract_val);
        mark_val = (Button) findViewById(R.id.mark_val);
        add_val = (Button) findViewById(R.id.add_val);
        T_val = (Button) findViewById(R.id.T_val);
        emm_val = (Button) findViewById(R.id.emm_val);
        e_val = (Button) findViewById(R.id.e_val);
        percent_val = (Button) findViewById(R.id.percent_val);
        pot_val = (Button) findViewById(R.id.pot_val);
        equel_val = (Button) findViewById(R.id.equel_val);

        result_text = (EditText) findViewById(R.id.result_text);
//        edittext = result_text.getText().toString();
    }

    private void initEvent() {

        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);

        change_val.setOnClickListener(this);
        haha_val.setOnClickListener(this);
        sin_val.setOnClickListener(this);
        cos_val.setOnClickListener(this);
        tan_val.setOnClickListener(this);
        finger_val.setOnClickListener(this);
        lg_val.setOnClickListener(this);
        ln_val.setOnClickListener(this);
        left_val.setOnClickListener(this);
        right_val.setOnClickListener(this);
        root_val.setOnClickListener(this);
        AC_val.setOnClickListener(this);
        del_val.setOnClickListener(this);
        divide_val.setOnClickListener(this);
        mul_val.setOnClickListener(this);
        conmul_val.setOnClickListener(this);
        subtract_val.setOnClickListener(this);
        mark_val.setOnClickListener(this);
        add_val.setOnClickListener(this);
        T_val.setOnClickListener(this);
        emm_val.setOnClickListener(this);
        e_val.setOnClickListener(this);
        percent_val.setOnClickListener(this);
        pot_val.setOnClickListener(this);
        equel_val.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        edittext = result_text.getText().toString();
        switch (v.getId()) {
            case R.id.num_zero:
                if (edittext.equals("0"))
                    edittext = "0";
                else
                    edittext = edittext.concat("0");
                break;
            case R.id.num_one:
                if (edittext.equals("0"))
                    edittext = "1";
                else
                    edittext = edittext.concat("1");
                break;
            case R.id.num_two:
                if (edittext.equals("0"))
                    edittext = "2";
                else
                    edittext = edittext.concat("2");
                break;
            case R.id.num_three:
                if (edittext.equals("0"))
                    edittext = "3";
                else
                    edittext = edittext.concat("3");
                break;
            case R.id.num_four:
                if (edittext.equals("0"))
                    edittext = "4";
                else
                    edittext = edittext.concat("4");
                break;
            case R.id.num_five:
                if (edittext.equals("0"))
                    edittext = "5";
                else
                    edittext = edittext.concat("5");
                break;
            case R.id.num_six:
                if (edittext.equals("0"))
                    edittext = "6";
                else
                    edittext = edittext.concat("6");
                break;
            case R.id.num_seven:
                if (edittext.equals("0"))
                    edittext = "7";
                else
                    edittext = edittext.concat("7");
                break;
            case R.id.num_eight:
                if (edittext.equals("0"))
                    edittext = "8";
                else
                    edittext = edittext.concat("8");
                break;
            case R.id.num_nine:
                if (edittext.equals("0"))
                    edittext = "9";
                else
                    edittext = edittext.concat("9");
                break;
            case R.id.add_val:
                if (jungeExpression()) {
                    edittext = getResult();
                    if (edittext.equals("error")) {
                    } else
                        edittext = edittext.concat("+");
                } else {
                    if (Count)
                        Count = false;
                    if ((edittext.substring(edittext.length() - 1)).equals("-"))
                        edittext.replace("-", "+");
                    else if ((edittext.substring(edittext.length() - 1)).equals("×"))
                        edittext.replace("×", "+");
                    else if ((edittext.substring(edittext.length() - 1)).equals("÷"))
                        edittext.replace("÷", "+");
                    else if (edittext.substring(edittext.length() - 1).equals("^"))
                        edittext.replace("^", "+");
                    else if (!(edittext.substring(edittext.length() - 1).equals("+")))
                        edittext = edittext.concat("+");
                }
                break;
            case R.id.subtract_val:
                if (jungeExpression()) {
                    edittext = getResult();
                    if (edittext.equals("error")) {
                    } else
                        edittext = edittext.concat("-");
                } else {
                    if (Count)
                        Count = false;
                    if ((edittext.substring(edittext.length() - 1)).equals("+"))
                        edittext.replace("+", "-");
                    else if ((edittext.substring(edittext.length() - 1)).equals("×"))
                        edittext.replace("×", "-");
                    else if ((edittext.substring(edittext.length() - 1)).equals("÷"))
                        edittext.replace("÷", "-");
                    else if (edittext.substring(edittext.length() - 1).equals("^"))
                        edittext.replace("^", "-");
                    else if (!(edittext.substring(edittext.length() - 1).equals("-")))
                        edittext = edittext.concat("-");
                }
                break;
            case R.id.mul_val:
                if (jungeExpression()) {
                    edittext = getResult();
                    if (edittext.equals("error")) {
                    } else
                        edittext = edittext.concat("×");
                } else {
                    if (Count)
                        Count = false;
                    if ((edittext.substring(edittext.length() - 1)).equals("-"))
                        edittext.replace("-", "×");
                    else if ((edittext.substring(edittext.length() - 1)).equals("+"))
                        edittext.replace("+", "×");
                    else if ((edittext.substring(edittext.length() - 1)).equals("÷"))
                        edittext.replace("÷", "×");
                    else if (edittext.substring(edittext.length() - 1).equals("^"))
                        edittext.replace("^", "×");
                    else if (!(edittext.substring(edittext.length() - 1).equals("×")))
                        edittext = edittext.concat("×");
                }
                break;
            case R.id.divide_val:
                if (jungeExpression()) {
                    edittext = getResult();
                    if (edittext.equals("error")) {
                    } else
                        edittext = edittext.concat("÷");
                } else {
                    if (Count)
                        Count = false;
                    if ((edittext.substring(edittext.length() - 1)).equals("-"))
                        edittext.replace("-", "÷");
                    else if ((edittext.substring(edittext.length() - 1)).equals("+"))
                        edittext.replace("+", "÷");
                    else if ((edittext.substring(edittext.length() - 1)).equals("×"))
                        edittext.replace("×", "÷");
                    else if (edittext.substring(edittext.length() - 1).equals("^"))
                        edittext.replace("^", "÷");
                    else if (!((edittext.substring(edittext.length() - 1)).equals("÷")))
                        edittext = edittext.concat("÷");
                }
                break;
            case R.id.percent_val:
                double temble;
                String Change;
                if (edittext.equals("error")) {
                } else {
                    if (jungeExpression()) {
                        if (edittext.contains("+")) {
                            temble = Double.parseDouble(edittext.substring(edittext.indexOf("+") + 1));
                            temble = temble / 100;
                            Change = String.valueOf(temble);
                            edittext = edittext.replace(edittext.substring(edittext.indexOf("+") + 1), Change);
                        } else if (edittext.contains("-") && !edittext.startsWith("-")) {
                            temble = Double.parseDouble(edittext.substring(edittext.indexOf("-") + 1));
                            temble = temble / 100;
                            Change = String.valueOf(temble);
                            edittext = edittext.replace(edittext.substring(edittext.indexOf("-") + 1), Change);
                        } else if (edittext.startsWith("-") && edittext.substring(1).contains("-")) {
                            temble = Double.parseDouble(edittext.substring(edittext.substring(1).indexOf("-") + 1));
                            temble = temble / 100;
                            Change = String.valueOf(temble);
                            edittext = edittext.replace(edittext.substring(edittext.substring(1).indexOf("-") + 1), Change);
                        } else if (edittext.contains("×")) {
                            temble = Double.parseDouble(edittext.substring(edittext.indexOf("×") + 1));
                            temble = temble / 100;
                            Change = String.valueOf(temble);
                            edittext = edittext.replace(edittext.substring(edittext.indexOf("×") + 1), Change);
                        } else if (edittext.contains("÷")) {
                            temble = Double.parseDouble(edittext.substring(edittext.indexOf("÷") + 1));
                            temble = temble / 100;
                            Change = String.valueOf(temble);
                            edittext = edittext.replace(edittext.substring(edittext.indexOf("÷") + 1), Change);
                        } else if (edittext.contains("^")) {
                            temble = Double.parseDouble(edittext.substring(edittext.indexOf("^") + 1));
                            temble = temble / 100;
                            Change = String.valueOf(temble);
                            edittext = edittext.replace(edittext.substring(edittext.indexOf("^") + 1), Change);
                        }
                    } else {
                        if ((edittext.substring(edittext.length() - 1)).equals("-") ||
                                (edittext.substring(edittext.length() - 1)).equals("+") ||
                                (edittext.substring(edittext.length() - 1)).equals("×") ||
                                (edittext.substring(edittext.length() - 1)).equals("÷") ||
                                (edittext.substring(edittext.length() - 1)).equals("^")) {
                        } else {
                            temble = Double.parseDouble(edittext);
                            temble = temble / 100;
                            edittext = String.valueOf(temble);
                        }
                    }
                }
                break;
            case R.id.AC_val:
                edittext = "0";
                break;
            case R.id.equel_val:
                edittext = getResult();
                Count = true;
                break;
            case R.id.del_val:
                if (edittext.equals("error") || edittext.equals(""))
                    edittext = "0";
                else if (edittext.length()==1)
                    edittext="0";
                else
                    edittext = edittext.substring(0, edittext.length() - 1);
                break;
            case R.id.pot_val:
                if (!Count) {
                    if (edittext.equals("error")) {
                        edittext = "0";
                    } else if (jungeExpression()) {
                        if (edittext.contains("+") && !edittext.substring(edittext.indexOf("+") + 1).contains(".")) {
                            edittext += ".";
                        } else if (edittext.contains("×") && !edittext.substring(edittext.indexOf("×") + 1).contains(".")) {
                            edittext += ".";
                        } else if (edittext.contains("÷") && !edittext.substring(edittext.indexOf("÷") + 1).contains(".")) {
                            edittext += ".";
                        } else if (edittext.contains("-") && !edittext.startsWith("-") && !edittext.substring(edittext.indexOf("-") + 1).contains(".")) {
                            edittext += ".";
                        } else if (edittext.contains("^") && !edittext.substring(edittext.indexOf("^") + 1).contains(".")) {
                            edittext += ".";
                        } else if (edittext.startsWith("-") && edittext.substring(1).contains("-") &&
                                !edittext.substring(edittext.substring(1).indexOf("-") + 1).contains(".")) {
                            edittext += ".";
                        } else {
                        }
                    } else if (edittext.substring(edittext.length() - 1).equals("+") || edittext.substring(edittext.length() - 1).equals("-") ||
                            edittext.substring(edittext.length() - 1).equals("×") || edittext.substring(edittext.length() - 1).equals("÷") ||
                            edittext.substring(edittext.length() - 1).equals("^")) {
                    } else if (!edittext.contains("."))
                        edittext += ".";
                    else {
                    }
                } else {
                    Count = false;
                    edittext = "0.";
                }
                break;
            case R.id.T_val:
                if (!Count) {
                    if (jungeExpression()) {
                        String x1=edittext.substring(edittext.length()-3);
                        String x2=edittext.substring(edittext.length()-2);
                        String x3=edittext.substring(edittext.length()-1);
                        if (x1.equals("sin")||x1.equals("cos")||x1.equals("tan")||x2.equals("lg")||x2.equals("ln")||x3.equals("√")){
                            edittext+="Π";
                        }
                        else {}
                    } else if (edittext.contains("+") || edittext.contains("×") || edittext.contains("÷") ||
                            startWithSubstract) {
                        edittext += "Π";
                    } else if (edittext.equals("0")) {
                        edittext = "Π";
                    } else {
                    }

                } else {
                    Count = false;
                }
                break;
            case R.id.e_val:
                if (!Count) {
                    if (jungeExpression()) {
                        String x1=edittext.substring(edittext.length()-3);
                        String x2=edittext.substring(edittext.length()-2);
                        String x3=edittext.substring(edittext.length()-1);
                        if (x1.equals("sin")||x1.equals("cos")||x1.equals("tan")||x2.equals("lg")||x2.equals("ln")||x3.equals("√")){
                            edittext+="e";
                        }
                        else {}
                    } else if (edittext.contains("+") || edittext.contains("×") || edittext.contains("÷") ||
                            startWithSubstract) {
                        edittext += "e";
                    } else if (edittext.equals("0")) {
                        edittext = "e";

                    } else {
                    }

                } else {
                    Count = false;
                }
                break;
            case R.id.finger_val:
                if (jungeExpression()) {
                    edittext = getResult();
                    if (edittext.equals("error")) {
                    } else
                        edittext = edittext.concat("^");
                } else {
                    if (Count)
                        Count = false;
                    if ((edittext.substring(edittext.length() - 1)).equals("-"))
                        edittext.replace("-", "^");
                    else if ((edittext.substring(edittext.length() - 1)).equals("+"))
                        edittext.replace("+", "^");
                    else if ((edittext.substring(edittext.length() - 1)).equals("÷"))
                        edittext.replace("÷", "^");
                    else if (edittext.substring(edittext.length() - 1).equals("×"))
                        edittext.replace("×", "^");
                    else if (!(edittext.substring(edittext.length() - 1).equals("^")))
                        edittext = edittext.concat("^");
                }
                break;
            case R.id.mark_val:
                double temble1;
                String Change1;
                if (edittext.equals("error")) {
                } else {
                    if (jungeExpression()) {
                        if (edittext.contains("+")) {
                            temble1 = Double.parseDouble(edittext.substring(edittext.indexOf("+") + 1));
                            temble1 = Math.pow(temble1, -1);
                            Change1 = String.valueOf(temble1);
                            edittext = edittext.replace(edittext.substring(edittext.indexOf("+") + 1), Change1);
                        } else if (edittext.contains("-") && !edittext.startsWith("-")) {
                            temble1 = Double.parseDouble(edittext.substring(edittext.indexOf("-") + 1));
                            temble1 = Math.pow(temble1, -1);
                            Change1 = String.valueOf(temble1);
                            edittext = edittext.replace(edittext.substring(edittext.indexOf("-") + 1), Change1);
                        } else if (edittext.startsWith("-") && edittext.substring(1).contains("-")) {
                            temble1 = Double.parseDouble(edittext.substring(edittext.substring(1).indexOf("-") + 1));
                            temble1 = Math.pow(temble1, -1);
                            Change1 = String.valueOf(temble1);
                            edittext = edittext.replace(edittext.substring(edittext.substring(1).indexOf("-") + 1), Change1);
                        } else if (edittext.contains("×")) {
                            temble1 = Double.parseDouble(edittext.substring(edittext.indexOf("×") + 1));
                            temble1 = Math.pow(temble1, -1);
                            Change1 = String.valueOf(temble1);
                            edittext = edittext.replace(edittext.substring(edittext.indexOf("×") + 1), Change1);
                        } else if (edittext.contains("÷")) {
                            temble1 = Double.parseDouble(edittext.substring(edittext.indexOf("÷") + 1));
                            temble1 = Math.pow(temble1, -1);
                            Change1 = String.valueOf(temble1);
                            edittext = edittext.replace(edittext.substring(edittext.indexOf("÷") + 1), Change1);
                        } else if (edittext.contains("^")) {
                            temble1 = Double.parseDouble(edittext.substring(edittext.indexOf("^") + 1));
                            temble1 = Math.pow(temble1, -1);
                            Change1 = String.valueOf(temble1);
                            edittext = edittext.replace(edittext.substring(edittext.indexOf("^") + 1), Change1);
                        }
                    } else {
                        if ((edittext.substring(edittext.length() - 1)).equals("-") ||
                                (edittext.substring(edittext.length() - 1)).equals("+") ||
                                (edittext.substring(edittext.length() - 1)).equals("×") ||
                                (edittext.substring(edittext.length() - 1)).equals("÷") ||
                                (edittext.substring(edittext.length() - 1)).equals("^")) {
                        } else {
                            temble1 = Double.parseDouble(edittext);
                            temble1 = Math.pow(temble1, -1);
                            edittext = String.valueOf(temble1);
                        }
                    }
                }
                break;
            case R.id.conmul_val:
                int temble2;
                String Change2;
                edittext = result_text.getText().toString();
                if (edittext.equals("error")) {

                } else {
                    if (jungeExpression()) {
                        if (edittext.contains("+") && !(edittext.substring(edittext.indexOf("+") + 1)).contains(".")) {
                            temble2 = Integer.parseInt(edittext.substring(edittext.indexOf("+") + 1));
                            int s = 1;
                            for (int i = temble2; i > 0; i--) {
                                s *= i;
                            }
                            Change2 = String.valueOf(s);
                            edittext = edittext.replace(edittext.substring(edittext.indexOf("+") + 1), Change2);

                        } else if (edittext.contains("-") && !edittext.startsWith("-") && !(edittext.substring(edittext.indexOf("-") + 1)).contains(".")) {
                            temble2 = Integer.parseInt(edittext.substring(edittext.indexOf("-") + 1));
                            int s = 1;
                            for (int i = temble2; i > 0; i--) {
                                s *= i;
                            }
                            Change2 = String.valueOf(s);
                            edittext = edittext.replace(edittext.substring(edittext.indexOf("-") + 1), Change2);

                        } else if (edittext.startsWith("-") && edittext.substring(1).contains("-") && !(edittext.substring(edittext.substring(1).indexOf("-") + 1)).contains(".")) {
                            temble2 = Integer.parseInt(edittext.substring(edittext.substring(1).indexOf("-") + 1));
                            int s = 1;
                            for (int i = temble2; i > 0; i--) {
                                s *= i;
                            }
                            Change2 = String.valueOf(s);
                            edittext = edittext.replace(edittext.substring(edittext.substring(1).indexOf("-") + 1), Change2);

                        } else if (edittext.contains("×") && !(edittext.substring(edittext.indexOf("×") + 1)).contains(".")) {
                            temble2 = Integer.parseInt(edittext.substring(edittext.indexOf("×") + 1));
                            int s = 1;
                            for (int i = temble2; i > 0; i--) {
                                s *= i;
                            }
                            Change2 = String.valueOf(s);
                            edittext = edittext.replace(edittext.substring(edittext.indexOf("×") + 1), Change2);

                        } else if (edittext.contains("÷") && !(edittext.substring(edittext.indexOf("÷") + 1)).contains(".")) {
                            temble2 = Integer.parseInt(edittext.substring(edittext.indexOf("÷") + 1));
                            int s = 1;
                            for (int i = temble2; i > 0; i--) {
                                s *= i;
                            }
                            Change2 = String.valueOf(s);
                            edittext = edittext.replace(edittext.substring(edittext.indexOf("÷") + 1), Change2);

                        } else if (edittext.contains("^") && !(edittext.substring(edittext.indexOf("^") + 1)).contains(".")) {

                            temble2 = Integer.parseInt(edittext.substring(edittext.indexOf("^") + 1));
                            int s = 1;
                            for (int i = temble2; i > 0; i--) {
                                s *= i;
                            }
                            Change2 = String.valueOf(s);
                            edittext = edittext.replace(edittext.substring(edittext.indexOf("^") + 1), Change2);

                        }
                    } else {
                        if ((edittext.substring(edittext.length() - 1)).equals("-") ||
                                (edittext.substring(edittext.length() - 1)).equals("+") ||
                                (edittext.substring(edittext.length() - 1)).equals("×") ||
                                (edittext.substring(edittext.length() - 1)).equals("÷") ||
                                (edittext.substring(edittext.length() - 1)).equals("^") ||
                                edittext.contains(".")) {
                        } else {
                            temble2 = Integer.parseInt(edittext);
                            int s = 1;
                            for (int i = temble2; i > 0; i--) {
                                s *= i;
                            }
                            edittext = String.valueOf(s);
                        }
                    }
                }
                break;
            case R.id.sin_val:
                if (jungeExpression()){
                    edittext=getResult();
                    if (edittext.equals("error")){}
                    else
                        edittext+="sin";
                }
                else {
                if (Count)
                    Count=false;
                if (edittext.substring(edittext.length()-1).equals("+")||edittext.substring(edittext.length()-1).equals("-")
                        ||edittext.substring(edittext.length()-1).equals("^")||edittext.substring(edittext.length()-1).equals("×")
                        ||edittext.substring(edittext.length()-1).equals("÷")){
                    edittext+="sin";
                }
                else
                    edittext+="sin";
                }
                break;
            case R.id.cos_val:
                if (jungeExpression()){
                    edittext=getResult();
                    if (edittext.equals("error")){}
                    else
                        edittext+="cos";
                }
                else {
                    if (Count)
                        Count=false;
                    if (edittext.substring(edittext.length()-1).equals("+")||edittext.substring(edittext.length()-1).equals("-")
                            ||edittext.substring(edittext.length()-1).equals("^")||edittext.substring(edittext.length()-1).equals("×")
                            ||edittext.substring(edittext.length()-1).equals("÷")){
                        edittext+="cos";
                    }
                    else
                        edittext+="cos";
                }
                break;
            case R.id.tan_val:
                if (jungeExpression()){
                    edittext=getResult();
                    if (edittext.equals("error")){}
                    else
                        edittext+="tan";
                }
                else {
                    if (Count)
                        Count=false;
                    if (edittext.substring(edittext.length()-1).equals("+")||edittext.substring(edittext.length()-1).equals("-")
                            ||edittext.substring(edittext.length()-1).equals("^")||edittext.substring(edittext.length()-1).equals("×")
                            ||edittext.substring(edittext.length()-1).equals("÷")){
                        edittext+="tan";
                    }
                    else
                        edittext+="tan";
                }
                break;
            case R.id.lg_val:
                if (jungeExpression()){
                    edittext=getResult();
                    if (edittext.equals("error")){}
                    else
                        edittext+="lg";
                }
                else {
                    if (Count)
                        Count=false;
                    if (edittext.substring(edittext.length()-1).equals("+")||edittext.substring(edittext.length()-1).equals("-")
                            ||edittext.substring(edittext.length()-1).equals("^")||edittext.substring(edittext.length()-1).equals("×")
                            ||edittext.substring(edittext.length()-1).equals("÷")){
                        edittext+="lg";
                    }
                    else
                        edittext+="lg";
                }
                break;
            case R.id.ln_val:
                if (jungeExpression()){
                    edittext=getResult();
                    if (edittext.equals("error")){}
                    else
                        edittext+="ln";
                }
                else {
                    if (Count)
                        Count=false;
                    if (edittext.substring(edittext.length()-1).equals("+")||edittext.substring(edittext.length()-1).equals("-")
                            ||edittext.substring(edittext.length()-1).equals("^")||edittext.substring(edittext.length()-1).equals("×")
                            ||edittext.substring(edittext.length()-1).equals("÷")){
                        edittext+="ln";
                    }
                    else
                        edittext+="ln";
                }
                break;
            case R.id.root_val:
                if (jungeExpression()){
                    edittext=getResult();
                    if (edittext.equals("error")){}
                    else
                        edittext+="√";
                }
                else {
                    if (Count)
                        Count=false;
                    if (edittext.substring(edittext.length()-1).equals("+")||edittext.substring(edittext.length()-1).equals("-")
                            ||edittext.substring(edittext.length()-1).equals("^")||edittext.substring(edittext.length()-1).equals("×")
                            ||edittext.substring(edittext.length()-1).equals("÷")){
                        edittext+="√";
                    }
                    else
                        edittext+="√";
                }
                break;
        }
        result_text.setText(edittext);
    }

    private String getResult() {
        String tempResult = null;

        String para1 = null;

        String para2 = null;

        double ag1=0;

        double ag2=0;

        double result=0;

        String[] math={"sin","cos","tan","lg","ln","√"};

        Condition();

        if(startWithOperator||startWithSubstract||nostartWithSubstract){
            if (edittext.contains("+")){
                para1=edittext.substring(0,edittext.indexOf("+"));
                para2=edittext.substring(edittext.indexOf("+")+1);
                if (para2.equals("")){
                    if (!(para1.contains("sin")||para1.contains("cos")||para1.contains("tan")||para1.contains("lg")
                    ||para1.contains("ln")||para1.contains("√"))){
                        if (para1.contains("e")){
                            tempResult="2.71828182846";
                        }
                        else if (para1.contains("Π")){
                            tempResult="3.14159265";
                        }
                        else
                            tempResult=edittext;
                    }
                    else if (para1.contains("sin")){
                        try{
                            String val1=null;
                            String val2=null;
                            val1=para1.substring(0,para1.indexOf("sin"));
                            val2=edittext.substring(edittext.indexOf("sin")+3,edittext.length()-1);
                            if (val1.equals(""))
                                ag1=1;
                            else
                            ag1=Double.parseDouble(val1);
                            ag2=Math.sin(Double.parseDouble(val2));
                            result=ag1*ag2;
                            tempResult=String.valueOf(result);
                        }
                        catch (NumberFormatException e){
                            tempResult="error";
                        }
                    }
                    else if (para1.contains("cos")){
                        try{
                            String val1=null;
                            String val2=null;
                            val1=para1.substring(0,para1.indexOf("cos"));
                            val2=edittext.substring(edittext.indexOf("cos")+3,edittext.length()-1);
                            if (val1.equals(""))
                                ag1=1;
                            else
                                ag1=Double.parseDouble(val1);
                            ag2=Math.cos(Double.parseDouble(val2));
                            result=ag1*ag2;
                            tempResult=String.valueOf(result);
                        }
                        catch (NumberFormatException e){
                            tempResult="error";
                        }
                    }
                    else if (para1.contains("tan")){
                        try{
                            String val1=null;
                            String val2=null;
                            val1=para1.substring(0,para1.indexOf("tan"));
                            val2=edittext.substring(edittext.indexOf("tan")+3,edittext.length()-1);
                            if (val1.equals(""))
                                ag1=1;
                            else
                                ag1=Double.parseDouble(val1);
                            ag2=Math.tan(Double.parseDouble(val2));
                            result=ag1*ag2;
                            tempResult=String.valueOf(result);
                        }
                        catch (NumberFormatException e){
                            tempResult="error";
                        }
                    }
                    else if (para1.contains("lg")){
                        try{
                            String val1=null;
                            String val2=null;
                            val1=para1.substring(0,para1.indexOf("lg"));
                            val2=edittext.substring(edittext.indexOf("lg")+2,edittext.length()-1);
                            if (val1.equals(""))
                                ag1=1;
                            else
                                ag1=Double.parseDouble(val1);
                            ag2=Math.log10(Double.parseDouble(val2));
                            result=ag1*ag2;
                            tempResult=String.valueOf(result);
                        }
                        catch (NumberFormatException e){
                            tempResult="error";
                        }
                    }
                    else if (para1.contains("√")){
                        try{
                            String val1=null;
                            String val2=null;
                            val1=para1.substring(0,para1.indexOf("√"));
                            val2=edittext.substring(edittext.indexOf("√")+1,edittext.length()-1);
                            if (val1.equals(""))
                                ag1=1;
                            else
                                ag1=Double.parseDouble(val1);
                            ag2=Math.sqrt(Double.parseDouble(val2));
                            result=ag1*ag2;
                            tempResult=String.valueOf(result);
                        }
                        catch (NumberFormatException e){
                            tempResult="error";
                        }
                    }
                    else if (para1.contains("ln")){
                        try{
                            String val1=null;
                            String val2=null;
                            val1=para1.substring(0,para1.indexOf("ln"));
                            val2=edittext.substring(edittext.indexOf("ln")+2,edittext.length()-1);
                            if (val1.equals(""))
                                ag1=1;
                            else
                                ag1=Double.parseDouble(val1);
                            ag2=Math.log(Double.parseDouble(val2));
                            result=ag1*ag2;
                            tempResult=String.valueOf(result);
                        }
                        catch (NumberFormatException e){
                            tempResult="error";
                        }
                    }
                }
            }
        }

        return tempResult;
    }

    private boolean jungeExpression() {
        Condition();
        String tempResult2 = null;
        if (startWithSubstract || startWithOperator || nostartWithSubstract) {
            if (edittext.contains("+")) {
                tempResult2 = edittext.substring(edittext.indexOf("+") + 1);
                if (tempResult2.equals(""))
                    return false;
                else
                    return true;
            } else if (edittext.contains("-")) {
                tempResult2 = edittext.substring(edittext.lastIndexOf("-") + 1);
                if (tempResult2.equals(""))
                    return false;
                else
                    return true;
            } else if (edittext.contains("×")) {
                tempResult2 = edittext.substring(edittext.indexOf("×") + 1);
                if (tempResult2.equals(""))
                    return false;
                else
                    return true;
            } else if (edittext.contains("÷")) {
                tempResult2 = edittext.substring(edittext.indexOf("÷") + 1);
                if (tempResult2.equals(""))
                    return false;
                else
                    return true;
            } else if (edittext.contains("^")) {
                tempResult2 = edittext.substring(edittext.indexOf("^") + 1);
                if (tempResult2.equals(""))
                    return false;
                else
                    return true;
            }
        }
        return false;
    }

    private void Condition() {
        startWithOperator = edittext.startsWith("-") && ((edittext.contains("+") || edittext.contains("×")
                || edittext.contains("÷") || edittext.contains("^")));

        startWithSubstract = edittext.startsWith("-") && edittext.lastIndexOf("-") != 0;

        nostartWithSubstract =!edittext.startsWith("-")&& (edittext.contains("+") || edittext.contains("-") || edittext.contains("×")
                || edittext.contains("÷") || edittext.contains("^"));

        Others = edittext.contains("sin") || edittext.contains("cos") || edittext.contains("tan")
                || edittext.contains("lg") || edittext.contains("ln") ||
                edittext.contains("√");
    }
}
