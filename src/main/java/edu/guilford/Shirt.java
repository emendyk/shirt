package edu.guilford;

public class Shirt {
    
    public static String color;
    public static char size;
    public static String material;
    public static String brand;

    Shirt() {}
    Shirt(String newColor, char newSize, String newMaterial, String newBrand) {
        color = newColor;
        size = newSize;
        material = newMaterial;
        brand = newBrand;
    }

    //methods 
    public void putOn() {
        System.out.println("Shirt is on");
    }
    public static void takeOff() {
        System.out.println("Shirt is off");
    }
    public static void setColor(String newColor) {
        color = newColor;
    }
    public static void setSize(char newSize) {
        size = newSize;
    }
    public static void setMaterial(String newMaterial) {
        material = newMaterial;
    }
    public static void setBrand(String newBrand) {
        brand = newBrand;
    }





    
}
