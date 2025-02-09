package com.example.gym_trainer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class BMICalculator extends AppCompatActivity {

    android.widget.Button mcalculatebtn;
    TextView mcurrentheight;
    TextView mcurrentweight, mcurrentage;
    ImageView mminusweight, mplusweight, mminusage, mplusage;
    RelativeLayout mmale, mfemale;
    SeekBar mheightseekbar;

    int intweight = 55;
    int intage= 22;
    int currentprogress = 0;
    String mintprogress = "0";
    String typeofuser = "0";
    String weight2 = "55";
    String age2 = "22";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);

//        getSupportActionBar().hide();

        mcalculatebtn = findViewById(R.id.calculatebtn);
        mcurrentheight = findViewById(R.id.currentheight);
        mcurrentweight = findViewById(R.id.currentweight);
        mcurrentage = findViewById(R.id.currentage);
        mmale = findViewById(R.id.male);
        mfemale = findViewById(R.id.female);
        mminusweight = findViewById(R.id.minusweight);
        mminusage = findViewById(R.id.minusage);
        mplusweight = findViewById(R.id.plusweight);
        mplusage = findViewById(R.id.plusage);
        mheightseekbar = findViewById(R.id.heightseekbar);


        mmale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mmale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalefocus));
                mfemale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalenotfocus));
                typeofuser="Male";
            }
        });

        mfemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mfemale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalefocus));
                mmale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.malefemalenotfocus));
                typeofuser="Female";
            }
        });

        mheightseekbar.setMax(300);
        mheightseekbar.setProgress(0);

        mheightseekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                currentprogress=progress;
                mintprogress=String.valueOf(currentprogress);
                mcurrentheight.setText(mintprogress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mplusage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intage = intage+1;
                age2 = String.valueOf(intage);
                mcurrentage.setText(age2);
            }
        });

        mplusweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intweight = intweight+1;
                weight2 = String.valueOf(intweight);
                mcurrentweight.setText(weight2);
            }
        });

        mminusage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intage = intage-1;
                age2 = String.valueOf(intage);
                mcurrentage.setText(age2);
            }
        });

        mminusweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intweight = intweight-1;
                weight2 = String.valueOf(intweight);
                mcurrentweight.setText(weight2);
            }
        });


        mcalculatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(typeofuser.equals("0"))
                {
                    Toast.makeText(getApplicationContext(),"Select Your Gender First", Toast.LENGTH_SHORT).show();
                }
                else if(mintprogress.equals("0"))
                {
                    Toast.makeText(getApplicationContext(),"Select Your Height First", Toast.LENGTH_SHORT).show();
                }
                else if(intage==0 || intage<0)
                {
                    Toast.makeText(getApplicationContext(),"Age Is Incorrect", Toast.LENGTH_SHORT).show();
                }
                else if(intweight==0 || intweight<0)
                {
                    Toast.makeText(getApplicationContext(),"Weight Is Incorrect", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(BMICalculator.this, BMIresult.class);
                    intent.putExtra("gender", typeofuser);
                    intent.putExtra("height", mintprogress);
                    intent.putExtra("weight", weight2);
                    intent.putExtra("age", age2);
                    startActivity(intent);




                }








            }
        });
    }
}