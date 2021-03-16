package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class Darsjadvali extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_darsjadvali);

        String [] fanlar={"AM","NZ","DB","SY","YB"};
        String [] voqt={"9:00-10:30","10:30-12:00","12:00-13:30","13:30-15:00","15:00-16:30","16:30-18:00"};
        int  []imageresource={12,R.drawable.dushanba,R.drawable.seshanba,R.drawable.chorshanba,R.drawable.payshanba,R.drawable.juma};
        double  density=getResources().getDisplayMetrics().density;
        HorizontalScrollView scrol=(HorizontalScrollView)findViewById(R.id.scrol);
        LinearLayout layout=new LinearLayout(this);
        LinearLayout.LayoutParams  param=new  LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout.LayoutParams  param1=new  LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,0);
        param1.weight=1;


        layout.setLayoutParams(param);
        layout.setOrientation(LinearLayout.VERTICAL);

        GradientDrawable gd = new GradientDrawable(
                GradientDrawable.Orientation.TR_BL,
                new int[] {0xFF726E6D,0xFF3B3131});

        GradientDrawable gd1 = new GradientDrawable(
                GradientDrawable.Orientation.TR_BL,
                new int[] {0xFFD1D0CE,0xFFFFFFFF});
        for(int  i=0;i<6;i++){
            LinearLayout  layout1=new LinearLayout(this);
            layout1.setLayoutParams(param1);

            layout1.setOrientation(LinearLayout.HORIZONTAL);
            for(int j=0;j<6;j++){
                TextView textView=  new TextView(this);
                textView.setLayoutParams(new ViewGroup.LayoutParams(150*(int)density, ViewGroup.LayoutParams.MATCH_PARENT));
                ImageView   imageview=new  ImageView(this);
                imageview.setLayoutParams(new ViewGroup.LayoutParams(150*(int)density, ViewGroup.LayoutParams.MATCH_PARENT));


                textView.setGravity(Gravity.CENTER);
                textView.setTextSize(12*(int)density);
                 if(j==0  && i!=0){
                     LinearLayout  layout2=new LinearLayout(this);
                     layout2.setLayoutParams(new LinearLayout.LayoutParams(150*(int)density,LinearLayout.LayoutParams.MATCH_PARENT));
                  layout2.setBackgroundColor(0xFFD1D0CE);
                     imageview.setBackgroundResource(imageresource[i]);
                     imageview.setPadding(10*(int)density,5*(int)density,10*(int)density,5*(int)density);
layout2.addView(imageview);

                     layout1.addView(layout2);
                 }
                 else  if(i==0){
                     textView.setBackgroundDrawable(gd);
                     if(j!=0){
                         textView.setText(voqt[j]);
                     }
                     textView.setTextColor(Color.WHITE);
                     layout1.addView(textView);

                 }
               else{
                   textView.setBackground(gd1);
                   if((i+j)%4==0){
                         int min = 0;
                         int max = 3;
                         int random_int = (int)(Math.random() * (max - min + 1) + min);
                         textView.setText(fanlar[random_int]);
                     }


                   layout1.addView(textView);
                 }

            }

            layout.addView(layout1);
        }


        scrol.addView(layout);


    }

    public void orqaga(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

