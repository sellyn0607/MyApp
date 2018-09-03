package app.rstone.com.myapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final Context ctx = MainActivity.this;
       //더하기
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText num1 = (EditText)findViewById(R.id.num1);
                int snum1 = Integer.parseInt(num1.getText().toString());

                EditText num2 = (EditText)findViewById(R.id.num2);
                int snum2 = Integer.parseInt(num2.getText().toString());

                String result2= String.valueOf(snum1+snum2);


                TextView result= (TextView)findViewById(R.id.result);
                result.setText(result2.toString());

                Toast.makeText(ctx,"결과는 :"+result2,Toast.LENGTH_LONG).show();

            }
        });
        //빼기
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
