package com.company;

public abstract class Furniture {
    protected String material;
    protected int price;
    protected boolean integrityOfFurniture;
    protected String color;

    public Furniture(String material) {
        this.material = material;
        price = 5000;
        integrityOfFurniture = true;
        color = "Черный";
    }

    public Furniture(String material, int price) {
        this.material = material;
        this.price = price;
        integrityOfFurniture = true;
        color = "Черный";
    }

    public Furniture(String material, int price, boolean integrityOfFurniture, String color) {
        this.material = material;
        this.price = price;
        this.integrityOfFurniture = integrityOfFurniture;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isIntegrityOfFurniture() {
        return integrityOfFurniture;
    };

    public abstract String getIntegrityOfFurniture();

    public abstract void setIntegrityOfFurniture(boolean integrityOfFurniture);

    public abstract String toString();
}
