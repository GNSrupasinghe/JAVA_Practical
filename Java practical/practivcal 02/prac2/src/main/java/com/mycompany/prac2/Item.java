/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prac2;

/**
 *
 * @author NADISHA
 */
class Item {
    // Protected instance variables (private variables)
    protected int location;
    protected String description;

    // Constructor method for the Item class
    public Item(int location, String description) {
        this.location = location;
        this.description = description;
    }

    // Getter and Setter methods for the location variable
    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    // Getter and Setter methods for the description variable
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
/*public class Item {
     private int location;
     private String description;
     
     public void setdata(int a,String b)
     {
     a=location;
     b=description;
     }
        
        public Item()
        {
        
        location =5;
        description="description";
        }
        public void display()
        {
            System.out.println("location:"+location);
            System.out.println("description:"+description);
        }
    
}
