package com.example.project;

import androidx.annotation.Dimension;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.List;

public class Ozlashtirish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ozlashtirish);


          String [] fanlar={"FANLAR","NAZARIYA","DAN XODIMI  BELGILARI","YOL  BELGILARI","SHABLON  YECHISH","AMALIYOT"};


        double  density=getResources().getDisplayMetrics().density;
        HorizontalScrollView  scrol=(HorizontalScrollView)findViewById(R.id.scrol);
        LinearLayout  layout=new LinearLayout(this);
        LinearLayout.LayoutParams  param=new  LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout.LayoutParams  param1=new  LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,0);
        param1.weight=1;


        layout.setLayoutParams(param);
   layout.setOrientation(LinearLayout.VERTICAL);

        GradientDrawable gd = new GradientDrawable(
                GradientDrawable.Orientation.TR_BL,
                new int[] {0xFF306754,0xFF4E8975});

        GradientDrawable gd1 = new GradientDrawable(
                GradientDrawable.Orientation.TR_BL,
                new int[] {0xFFF0F8FF,0xFFCFECEC});
  for(int  i=0;i<6;i++){
      LinearLayout  layout1=new LinearLayout(this);
      layout1.setLayoutParams(param1);

      layout1.setOrientation(LinearLayout.HORIZONTAL);
      for(int j=0;j<13;j++){
          TextView textView=  new TextView(this);
          textView.setLayoutParams(new ViewGroup.LayoutParams(150*(int)density, ViewGroup.LayoutParams.MATCH_PARENT));
          textView.setWidth(50*(int)density);
         textView.setHeight(LinearLayout.LayoutParams.FILL_PARENT);
         textView.setTextColor(Color.WHITE);
         textView.setGravity(Gravity.CENTER);
         textView.setTextSize(12*(int)density);

         if(i==0 || j==0){
             if(j==0){
                 textView.setText(fanlar[i]);
             }
             else{
                 textView.setText(j+"  HAFTA");
             }
             textView.setBackgroundDrawable(gd);
             textView.setTextColor(Color.WHITE);
         }
  else{
             textView.setBackgroundDrawable(gd1);
             textView.setTextColor(0xFF306754);
             int min = 50;
             int max = 100;
             int random_int = (int)(Math.random() * (max - min + 1) + min);
             textView.setText(random_int+" ");
         }

          layout1.addView(textView);

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
