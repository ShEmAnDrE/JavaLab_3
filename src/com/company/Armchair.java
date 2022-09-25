package com.company;

public class Armchair extends Furniture {
    boolean possibilityOfUnfolding;

    public Armchair(String material, boolean possibilityOfUnfolding) {
        super(material);
        this.possibilityOfUnfolding = possibilityOfUnfolding;
    }

    public Armchair(String material, int price, boolean possibilityOfUnfolding) {
        super(material, price);
        this.possibilityOfUnfolding = possibilityOfUnfolding;
    }

    public Armchair(String material, int price, boolean integrityOfFurniture, String color, boolean possibilityOfUnfolding) {
        super(material, price, integrityOfFurniture, color);
        this.possibilityOfUnfolding = possibilityOfUnfolding;
    }

    @Override
    public void setIntegrityOfFurniture(boolean integrityOfFurniture) {
        if (this.integrityOfFurniture) {
            if (integrityOfFurniture) {
                System.out.println("Кресло и так было целое");
            } else {
                System.out.println("Вы сломали кресло");
                this.integrityOfFurniture = false;
            }
        } else {
            if (integrityOfFurniture) {
                System.out.println("Вы починили кресло");
                this.integrityOfFurniture = true;
            } else {
                System.out.println("Кресло и так было сломано");
            }
        }
    }

    public boolean isPossibilityOfUnfolding() {
        return possibilityOfUnfolding;
    }

    public String getPossibilityOfUnfolding() {
        if (possibilityOfUnfolding) {
            return "Кресло имеет механизм раскладывания";
        } else {
            return "Кресло не имеет механизма раскладывания";
        }
    }

    public void setPossibilityOfUnfolding(boolean possibilityOfUnfolding) {
        if (isPossibilityOfUnfolding()) {
            if (possibilityOfUnfolding) {
                System.out.println("Кресло уже имеет механизм раскладывания");
            } else {
                System.out.println("Вы удалили механизм раскладвания из кресла");
                this.possibilityOfUnfolding = false;
            }
        } else {
            if (integrityOfFurniture) {
                System.out.println("Вы установили механизм раскладывания");
                this.possibilityOfUnfolding = true;
            } else {
                System.out.println("Кресло уже было без механизма раскладывания");
            }
        }
    }

    @Override
    public String getIntegrityOfFurniture() {
        if (integrityOfFurniture) {
            return "Кресло целое";
        } else {
            return "Кресло сломано";
        }
    }

    @Override
    public String toString() {
        return "Кресло сделано из материала \"" + material + "\", стоит " + price + "руб. Цвет: " + getColor() + ". " + getIntegrityOfFurniture()
                + ". " + getPossibilityOfUnfolding();
    }
}
