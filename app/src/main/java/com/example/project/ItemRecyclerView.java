package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemRecyclerView extends RecyclerView.Adapter<ItemRecyclerView.ItemViewholder> {

   private  ArrayList<Item> itemList;
    public  static   class ItemViewholder  extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView   textView;
        public ItemViewholder(View itemView){
            super(itemView);
            this.imageView=itemView.findViewById(R.id.imageView);
            this.textView=itemView.findViewById(R.id.textView);
        }

    }

public ItemRecyclerView(ArrayList<Item> itemList){
this.itemList=itemList;
}
    @Override
    public ItemViewholder  onCreateViewHolder(ViewGroup parent,int viewType){
          View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerlayout,parent,false);
          ItemViewholder ivh=new ItemViewholder(v);
          return ivh;
    }
 @Override
    public void onBindViewHolder(ItemViewholder  holder,int  position){
      Item currentitem=this.itemList.get(position);
      holder.imageView.setImageResource(currentitem.getImageResource());
      holder.textView.setText(currentitem.getTitle());
 }
 @Override
    public  int  getItemCount(){
        return  this.itemList.size();
 }


}
