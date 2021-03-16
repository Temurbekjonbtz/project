package com.example.project;

public class Item {

    private String title;
    private  int imageResourcel;

    public Item(int  imageResource,String title){
        this.title=title;
        this.imageResourcel=imageResource;
    }
    public  int getImageResource(){
        return this.imageResourcel;
    }
     public String getTitle(){
        return this.title;
     }


}
