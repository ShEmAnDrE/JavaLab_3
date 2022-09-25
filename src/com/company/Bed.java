package com.company;

public class Bed extends Furniture{
    int quantityOfPlaces;
    boolean bedStiffness; // жесткость кровати

    public Bed(String material, int quantityOfPlaces, boolean bedStiffness) {
        super(material);
        this.quantityOfPlaces = quantityOfPlaces;
        this.bedStiffness = bedStiffness;
    }

    public Bed(String material, int price, int quantityOfPlaces, boolean bedStiffness) {
        super(material, price);
        this.quantityOfPlaces = quantityOfPlaces;
        this.bedStiffness = bedStiffness;
    }

    public Bed(String material, int price, boolean integrityOfFurniture, String color, int quantityOfPlaces, boolean bedStiffness) {
        super(material, price, integrityOfFurniture, color);
        this.quantityOfPlaces = quantityOfPlaces;
        this.bedStiffness = bedStiffness;
    }

    public int getQuantityOfPlaces() {
        return quantityOfPlaces;
    }

    public boolean isBedStiffness() {
        return bedStiffness;
    }

    public void setBedStiffness(boolean bedStiffness) {
        if (isBedStiffness()) {
            if (bedStiffness) {
                System.out.println("Кровать и так жесткая");
            } else {
                System.out.println("Кровать теперь мягкая");
                this.bedStiffness = false;
            }
        } else {
            if (bedStiffness) {
                System.out.println("Кровать теперь жесткая");
                this.bedStiffness = true;
            } else {
                System.out.println("Кровать и так мягкая");
            }
        }
    }

    public String getBedStiffness() {
        if (bedStiffness) {
            return "Кровать жесткая";
        } else {
            return "Кровать мягкая";
        }
    }

    @Override
    public String getIntegrityOfFurniture() {
        if (integrityOfFurniture) {
            return "Кровать цела";
        } else {
            return "Кровать сломана";
        }
    }

    @Override
    public void setIntegrityOfFurniture(boolean integrityOfFurniture) {
        if (this.integrityOfFurniture) {
            if (integrityOfFurniture) {
                System.out.println("Кровать уже была цела");
            } else {
                System.out.println("Вы сломали кровать");
                this.integrityOfFurniture = false;
            }
        } else {
            if (integrityOfFurniture) {
                System.out.println("Вы починили кровать");
                this.integrityOfFurniture = true;
            } else {
                System.out.println("Кровать уже была сломана");
            }
        }
    }

    @Override
    public String toString() {
        return "Кровать сделана из материала \"" + material + "\", стоит " + price + "руб. Цвет: " + getColor() + ". " + getIntegrityOfFurniture()
                + ", имеет " + getQuantityOfPlaces() + " спальных мест. Жесткость: " + getBedStiffness();
    }
}
