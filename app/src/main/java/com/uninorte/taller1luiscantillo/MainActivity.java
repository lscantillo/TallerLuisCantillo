package com.uninorte.taller1luiscantillo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.uninorte.taller1luiscantillo.R.id.et1;

public class MainActivity extends AppCompatActivity {

    EditText nota1;
    EditText nota2;
    EditText nota3;
    EditText nota4;
    TextView nfinal;
    Double calfinal;
    Double a =0.25;
    ArrayList<EditText> notas= new ArrayList<EditText>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nota1=(EditText) findViewById(et1);
        nota2=(EditText) findViewById(R.id.et2);
        nota3=(EditText) findViewById(R.id.et3);
        nota4=(EditText) findViewById(R.id.et4);
        nfinal=(TextView) findViewById(R.id.tvnotafinal);

    }

    public void Onclick(View view) {
        String getnota1=nota1.getText().toString();
        String getnota2=nota2.getText().toString();
        String getnota3=nota3.getText().toString();
        String getnota4=nota4.getText().toString();
        double n1 = Double.parseDouble(getnota1);
        double n2 = Double.parseDouble(getnota2);
        double n3 = Double.parseDouble(getnota3);
        double n4 = Double.parseDouble(getnota4);


       calfinal= a*n1 + a*n2 +a*n3 + a*n4 ;


        String finalcal = Double.toString(calfinal);
        //Toast.makeText(this,finalcal, Toast.LENGTH_LONG).show();
        nfinal.setText(finalcal);









    }
}
