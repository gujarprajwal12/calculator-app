package gujarprawjal12gmail.com.example.calculator001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText calculation, result;
    private  String curr,res;
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btndot,btnadd,btnsub,btnmul,btndiv,btnAC,btnback,btnequal;
    private  boolean dot_inserted , operator_inserted;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculation = findViewById(R.id.calculation);
        result = findViewById(R.id.result);

        curr = "";
        res = "";

        dot_inserted = false;
        operator_inserted  = false ;


        btn0 =  (Button) findViewById(R.id.btnzero);
        btn1 =  (Button) findViewById(R.id.btn1);
        btn2 =  (Button) findViewById(R.id.btn2);
        btn3 =  (Button) findViewById(R.id.btn3);
        btn4 =  (Button) findViewById(R.id.btn4);
        btn5 =  (Button) findViewById(R.id.btn5);
        btn6 =  (Button) findViewById(R.id.btn6);
        btn7 =  (Button) findViewById(R.id.btn7);
        btn8 =  (Button) findViewById(R.id.btn8);
        btn9 =  (Button) findViewById(R.id.btn9);
        btndot =  (Button) findViewById(R.id.btndot);
        btnadd =  (Button) findViewById(R.id.btnadd);
        btnsub =  (Button) findViewById(R.id.btnsub);
        btnmul =  (Button) findViewById(R.id.btnmul);
        btndiv =  (Button) findViewById(R.id.btndiv);
        btnback =  (Button) findViewById(R.id.btnback);
        btnAC =  (Button) findViewById(R.id.btnAC);
        btnequal =  (Button) findViewById(R.id.btnequal);

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //validation
                if(curr.isEmpty()){
                    curr = "0.";
                    dot_inserted = true;
                }
            if(dot_inserted ==false){
                curr = curr + ".";
                dot_inserted = true;
            }
                displayOne();
            }
        });


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "0";
                displayOne();
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "1";
                displayOne();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "2";
                displayOne();
            }
        });



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "3";
                displayOne();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "4";
                displayOne();
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "5";
                displayOne();
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "6";
                displayOne();
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "7";
                displayOne();
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "8";
                displayOne();
            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "9";
                displayOne();
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                displayOne();
                displayTwo();
            }
        });


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backspace();
                displayOne();
            }
        });



        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // validation
                dot_inserted =false;
                // string is not empty
                if(!curr.isEmpty()){
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                  backspace();
                    }

                    if(operator_inserted == false){
                        curr = curr + "/";
                        operator_inserted = true;
                    }
                }
                displayOne();
            }
        });


        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // validation
                dot_inserted =false;
                // string is not empty
                if(!curr.isEmpty()){
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        backspace();
                    }

                    if(operator_inserted == false){
                        curr = curr + "*";
                        operator_inserted = true;
                    }
                }
                displayOne();
            }
        });


        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // validation
                dot_inserted =false;
                // string is not empty
                if(!curr.isEmpty()){
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        backspace();
                    }

                    if(operator_inserted == false){
                        curr = curr + "-";
                        operator_inserted = true;
                    }
                }
                displayOne();
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // validation
                dot_inserted =false;
                // string is not empty
                if(!curr.isEmpty()){
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        backspace();
                    }

                    if(operator_inserted == false){
                        curr = curr + "+";
                        operator_inserted = true;
                    }
                }
                displayOne();
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operator_inserted ==true && !curr.substring(curr.length()-1,curr.length()).equals("")){
                    String [] tokens = curr.split( "");

                    switch ( tokens [1] . charAt(0)){

                        case '+':
                            res = Double.toString(Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                            break;

                        case '-':

                            res = Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;


                        case '*':

                            res = Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                            break;


                        case '/':


                            res = Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                            break;
                    }
                    displayTwo();
                }
            }
        });


    }


    public  void displayOne(){

        calculation.setText(curr);
    }


    public  void displayTwo(){

        result.setText(res);

    }

     public  void  clear(){
        curr = "";
        res = "";
        dot_inserted = false ;
        operator_inserted = false ;
     }

     public  void backspace(){

        if(!curr.isEmpty()){

            // for delete the operand
            if(curr.substring(curr.length()-1,curr.length()).equals(".")){
                dot_inserted = false;
            }

            //

            if(curr.substring(curr.length()-1,curr.length()).equals("")){
                curr= curr.substring(0, curr.length()-3);
                operator_inserted =false;
            }else {

                curr = curr.substring(0, curr.length()-1);                                }
        }


     }


}