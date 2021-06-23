package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9;
    TextView tv_brandname,tv_colour;
    Button button1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_brandname=(TextView)findViewById(R.id.tv_brandname);
        checkBox2=(CheckBox) findViewById(R.id.checkBox2);
        checkBox3=(CheckBox) findViewById(R.id.checkBox3);
        checkBox4=(CheckBox) findViewById(R.id.checkBox4);
        checkBox5=(CheckBox) findViewById(R.id.checkBox5);
        tv_colour=(TextView)findViewById(R.id.tv_colour);
        checkBox6=(CheckBox) findViewById(R.id.checkBox6);
        checkBox7=(CheckBox) findViewById(R.id.checkBox7);
        checkBox8=(CheckBox) findViewById(R.id.checkBox8);
        checkBox9=(CheckBox) findViewById(R.id.checkBox9);
        button1=(Button) findViewById(R.id.button1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer name= new StringBuffer();
                //int amount=0;
                // Toyota
                if(checkBox2.isChecked() & checkBox6.isChecked())
                {
                    name.append("Brand Name: Toyota\n");
                    name.append("Model Name : Innova\n");
                    name.append("Colour : White\n ");
                    name.append("Price:5,00,000\n");

                }
                if(checkBox2.isChecked() & checkBox7.isChecked())
                {
                    name.append("Brand Name: Toyota\n");
                    name.append("Model Name : Fortuner\n");
                    name.append("Colour : Black\n ");
                    name.append("Price:8,00,000\n");

                }
                if(checkBox2.isChecked() & checkBox8.isChecked())
                {
                    name.append("Brand Name: Toyota\n");
                    name.append("Model Name : Yaris\n");
                    name.append("Colour : Red\n ");
                    name.append("Price:5,00,000\n");

                }
                if(checkBox2.isChecked() & checkBox9.isChecked())
                {
                    name.append("Brand Name: Toyota\n");
                    name.append("Model Name : Camry\n");
                    name.append("Colour : Silver\n ");
                    name.append("Price:7,00,000\n");

                }
                // Nissan
                if(checkBox3.isChecked() & checkBox6.isChecked())
                {
                    name.append("\nBrand Name: Nissan\n");
                    name.append("Model Name: Sunny\n");
                    name.append("Colour : White\n ");
                    name.append("Price:2,50,000\n");

                }
                if(checkBox3.isChecked() & checkBox7.isChecked())
                {
                    name.append("Brand Name: Nissan\n");
                    name.append("Model Name : Kicks\n");
                    name.append("Colour : Black\n ");
                    name.append("Price:8,00,000\n");

                }
                if(checkBox3.isChecked() & checkBox8.isChecked())
                {
                    name.append("Brand Name: Nissan\n");
                    name.append("Model Name : Magnite\n");
                    name.append("Colour : Red\n ");
                    name.append("Price:5,00,000\n");

                }
                if(checkBox3.isChecked() & checkBox9.isChecked())
                {
                    name.append("Brand Name: Nissan\n");
                    name.append("Model Name : GT-R\n");
                    name.append("Colour : Silver\n ");
                    name.append("Price:7,00,000\n");

                }
                // BMW
                if(checkBox4.isChecked() & checkBox6.isChecked())
                {
                    name.append("\nBrand Name: BMW\n");
                    name.append("Model Name: 3 Series\n");
                    name.append("Colour : White\n ");
                    name.append("Price:2,50,000\n");

                }
                if(checkBox4.isChecked() & checkBox7.isChecked())
                {
                    name.append("Brand Name: BMW\n");
                    name.append("Model Name : X5\n");
                    name.append("Colour : Black\n ");
                    name.append("Price:8,00,000\n");

                }
                if(checkBox4.isChecked() & checkBox8.isChecked())
                {
                    name.append("Brand Name: BMW\n");
                    name.append("Model Name : 5 Series\n");
                    name.append("Colour : Red\n ");
                    name.append("Price:5,00,000\n");

                }
                if(checkBox4.isChecked() & checkBox9.isChecked())
                {
                    name.append("Brand Name: BMW\n");
                    name.append("Model Name : X3\n");
                    name.append("Colour : Silver\n ");
                    name.append("Price:7,00,000\n");

                }
                // Honda
                if(checkBox5.isChecked() & checkBox6.isChecked())
                {
                    name.append("Company Name: Honda\n");
                    name.append("Model Name: City\n");
                    name.append("Colour : White\n ");
                    name.append("Price:2,50,000\n");

                }
                if(checkBox5.isChecked() & checkBox7.isChecked())
                {
                    name.append("Brand Name: Honda\n");
                    name.append("Model Name : WR-V\n");
                    name.append("Colour : Black\n ");
                    name.append("Price:8,00,000\n");

                }
                if(checkBox5.isChecked() & checkBox8.isChecked())
                {
                    name.append("Brand Name: Honda\n");
                    name.append("Model Name : Amaze\n");
                    name.append("Colour : Red\n ");
                    name.append("Price:5,00,000\n");

                }
                if(checkBox5.isChecked() & checkBox9.isChecked())
                {
                    name.append("Brand Name: Honda\n");
                    name.append("Model Name : Jazz\n");
                    name.append("Colour : Silver\n ");
                    name.append("Price:2,00,000\n");

                }


                /*if(checkBox6.isChecked())
                {
                    colour_name.append("\nWhite\n");

                }
                if(checkBox7.isChecked())
                {
                    colour_name.append("\nBlack\n");

                }
                if(checkBox8.isChecked())
                {
                    colour_name.append("\nRed\n");

                }
               if(checkBox9.isChecked())
                {
                    colour_name.append("\nSilver\n");

                }*/
               // cost.append("\n\nTotal cost = Rs"+amount);
                String brand =name.toString();


                Intent i=new Intent(MainActivity.this,second.class);
                i.putExtra("Brand Name",brand);
                startActivity(i);

//                Toast.makeText(getApplicationContext(),"Total Amount = "+amount+"/-",Toast.LENGTH_LONG).show();
            }
        });
    }
}