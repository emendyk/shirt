package edu.guilford;

import java.util.Random;

/**
 * Program to create a shirt object
 *
 */
public class clothes {
    
    private String color;
    private char size;
    private String material;
    private String brand;
    
    
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public char getSize() {
        return size;
    }
    
    public void setSize(char size) {
        this.size = size;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public static void putOn() {
        System.out.println("Shirt is on");
    }
    public static void takeOff() {
        System.out.println("Shirt is off");
    }
    
    public String toString() {
        return "Shirt [color=" + color + ", size=" + size + ", material=" + material + ", brand=" + brand + "]";
    }
    
    public static void main(String[] args) {
        Shirt s = new Shirt("Red", 'L', "Cotton", "Nike");
        

        System.out.print(s.color);
        System.out.print(s.size);
        System.out.print(s.material);
        System.out.print(s.brand);

        Random rand = new Random();

    }




    



 

    

}

