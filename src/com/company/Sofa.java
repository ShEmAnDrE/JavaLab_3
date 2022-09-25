package com.company;

public class Sofa extends Furniture {
    boolean possibilityOfMassage;

    public Sofa(String material, boolean possibilityOfMassage) {
        super(material);
        this.possibilityOfMassage = possibilityOfMassage;
    }

    public Sofa(String material, int price, boolean possibilityOfMassage) {
        super(material, price);
        this.possibilityOfMassage = possibilityOfMassage;
    }

    public Sofa(String material, int price, boolean integrityOfFurniture, String color, boolean possibilityOfMassage) {
        super(material, price, integrityOfFurniture, color);
        this.possibilityOfMassage = possibilityOfMassage;
    }

    public boolean isPossibilityOfMassage() {
        return possibilityOfMassage;
    }

    @Override
    public void setIntegrityOfFurniture(boolean integrityOfFurniture) {
        if (this.integrityOfFurniture) {
            if (integrityOfFurniture) {
                System.out.println("Диван уже был цел");
            } else {
                System.out.println("Вы сломали диван");
                this.integrityOfFurniture = false;
            }
        } else {
            if (integrityOfFurniture) {
                System.out.println("Вы починили диван");
                this.integrityOfFurniture = true;
            } else {
                System.out.println("Диван уже был сломан");
            }
        }
    }

    @Override
    public String getIntegrityOfFurniture() {
        if (integrityOfFurniture) {
            return "Диван цел";
        } else {
            return "Диван сломан";
        }
    }

    public void setPossibilityOfMassage(boolean possibilityOfMassage) {
        if (isPossibilityOfMassage()) {
            if (possibilityOfMassage) {
                System.out.println("Диван уже имеет механизм массажа");
            } else {
                System.out.println("Вы удалили механизм массажа из дивана");
                this.possibilityOfMassage = false;
            }
        } else {
            if (possibilityOfMassage) {
                System.out.println("Вы установили механизм массажа");
                this.possibilityOfMassage = true;
            } else {
                System.out.println("Диван уже был без механизма массажа");
            }
        }
    }

    public String getPossibilityOfMassage() {
        if (possibilityOfMassage) {
            return "Диван имеет механизм массажа";
        } else {
            return "Диван не имеет механизма массажа";
        }
    }

    @Override
    public String toString() {
        return "Диван сделан из материала \"" + material + "\", стоит " + price + "руб. Цвет: " + getColor() + ". " + getIntegrityOfFurniture()
                + ". " + getPossibilityOfMassage();
    }
}
