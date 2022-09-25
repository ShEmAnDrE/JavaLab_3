package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;


public class FurnitureShop {
    static final String[] materials = new String[] {"Ткань", "Искусственная кожа", "Натуральная кожа"};
    static final String[] colors = new String[] {"Черный", "Красный", "Коричневый", "Бежевый", "Серый", "Белый", "Зеленый"};

    public static void showArmchairs(ArrayList<Armchair> armchairs) {
        for (int i = 0; i < armchairs.size(); i++) {
            System.out.println(i + 1 + " - " + armchairs.get(i));
        }
    }

    public static void showMaterials() {
        for (int i = 0; i < materials.length; i++) {
            System.out.println(i + 1 + " - " + materials[i]);
        }
    }

    public static void showColors() {
        for (int i = 0; i < colors.length; i++) {
            System.out.println(i + 1 + " - " + colors[i]);
        }
    }
    // доделать вывод материалов, вывод цветов и доделать логику диванов и кроватей под заказ, сделать цену исходя из материала и типа мебели
    public static Armchair createArmchair() {
        System.out.println("Из какого материала хотите кресло?");
        showMaterials();
        Scanner sc = new Scanner(System.in);
        int mat = sc.nextInt() - 1;
        System.out.println("Какого цвета хотите кресло?");
        showColors();
        int col = sc.nextInt() - 1;
        System.out.println("Установить механизм раскладывания?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int unfolding = sc.nextInt();
        boolean unfol = false;
        if (unfolding == 1) {
            unfol = true;
        }
        int price = 10000 * (mat + 1);
        if (unfol) {
            price += 30000;
        }
        return new Armchair(materials[mat], price,true, colors[col], unfol);
    }

    public static void showSofas(ArrayList<Sofa> sofas) {
        for (int i = 0; i < sofas.size(); i++) {
            System.out.println(i + 1 + " - " + sofas.get(i));
        }
    }
    // доделать вывод материалов, вывод цветов и доделать логику диванов и кроватей под заказ, сделать цену исходя из материала и типа мебели
    public static Sofa createSofa() {
        System.out.println("Из какого материала хотите диван?");
        showMaterials();
        Scanner sc = new Scanner(System.in);
        int mat = sc.nextInt() - 1;
        System.out.println("Какого цвета хотите диван?");
        showColors();
        int col = sc.nextInt() - 1;
        System.out.println("Установить механизм массажа?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int massage = sc.nextInt();
        boolean mass = false;
        if (massage == 1) {
            mass = true;
        }
        int price = 20000 * (mat + 1);
        if (mass) {
            price += 50000;
        }
        return new Sofa(materials[mat], price,true, colors[col], mass);
    }

    public static void showBeds(ArrayList<Bed> beds) {
        for (int i = 0; i < beds.size(); i++) {
            System.out.println(i + 1 + " - " + beds.get(i));
        }
    }
    // доделать вывод материалов, вывод цветов и доделать логику диванов и кроватей под заказ, сделать цену исходя из материала и типа мебели
    public static Bed createBed() {
        System.out.println("Из какого материала хотите обивку кровати?");
        showMaterials();
        Scanner sc = new Scanner(System.in);
        int mat = sc.nextInt() - 1;
        System.out.println("Какого цвета хотите кровать?");
        showColors();
        int col = sc.nextInt() - 1;
        System.out.println("Матрас должен быть жесткий?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int bedStiffness = sc.nextInt();
        boolean stiff = false;
        if (bedStiffness == 1) {
            stiff = true;
        }
        System.out.println("Сколько спальных мест должно быть?");
        int quantity = sc.nextInt();
        int price = 20000 * (mat + 1) * quantity;
        return new Bed(materials[mat], price,true, colors[col], quantity, stiff);
    }

    public static void main(String[] args) {
        ArrayList<Armchair> armchairs = new ArrayList<Armchair>();
        ArrayList<Bed> beds = new ArrayList<Bed>();
        ArrayList<Sofa> sofas = new ArrayList<Sofa>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            armchairs.add(new Armchair(materials[(int)(Math.random() * 3)],1000 + (int)(Math.random() * 50000),
                    true, colors[(int)(Math.random() * 7)],false));
        }

        for (int i = 0; i < 10; i++) {
            beds.add(new Bed(materials[(int)(Math.random() * 3)],1000 + (int)(Math.random() * 50000),
                    true, colors[(int)(Math.random() * 7)],1 + i % 2, i % 2 == 0));
        }

        for (int i = 0; i < 10; i++) {
            sofas.add(new Sofa(materials[(int)(Math.random() * 3)],1000 + (int)(Math.random() * 50000),
                    true,colors[(int)(Math.random() * 7)],i % 2 == 0));
        }

        System.out.println("Вас приетствует мебельный магазин.\nЧто желаете приобрести?");
        System.out.println("1 - Кресло");
        System.out.println("2 - Диван");
        System.out.println("3 - Кровать");
        int n = sc.nextInt();
        switch (n) {
            case 1 -> {
                System.out.println("Желаете приобрести из наличия(1) или под заказ(2)? Выход (0)");
                int n1 = sc.nextInt();
                if (n1 == 1) {
                    showArmchairs(armchairs);
                    System.out.println("0 - Если ничего не понравилось");
                    int choice = sc.nextInt();
                    if (choice != 0) {
                        Armchair armchair = armchairs.get(choice - 1);
                        armchairs.remove(armchair);
                        System.out.println("Поздравляем! Ваше новое кресло:\n");
                        System.out.println(armchair);
                    } else {
                        System.out.println("Может быть вам изготовить кресло на заказ?");
                        System.out.println("1 - Да");
                        System.out.println("2 - Нет");
                        choice = sc.nextInt();
                        if (choice == 1) {
                            Armchair armchair = createArmchair();
                            System.out.println("Поздравляем! Ваше новое кресло:\n");
                            System.out.println(armchair);
                        }
                    }
                } else if (n1 == 2) {
                    Armchair armchair = createArmchair();
                    System.out.println("Поздравляем! Ваше новое кресло:\n");
                    System.out.println(armchair);
                }
            }
            case 2 -> {
                System.out.println("Желаете приобрести из наличия(1) или под заказ(2)? Выход (0)");
                int n2 = sc.nextInt();
                if (n2 == 1) {
                    showSofas(sofas);
                    System.out.println("0 - Если ничего не понравилось");
                    int choice = sc.nextInt();
                    if (choice != 0) {
                        Sofa sofa = sofas.get(choice - 1);
                        sofas.remove(sofa);
                        System.out.println("Поздравляем! Ваш новый диван:\n");
                        System.out.println(sofa);
                    } else {
                        System.out.println("Может быть вам изготовить диван на заказ?");
                        System.out.println("1 - Да");
                        System.out.println("2 - Нет");
                        choice = sc.nextInt();
                        if (choice == 1) {
                            Sofa sofa = createSofa();
                            System.out.println("Поздравляем! Ваш новый диван:\n");
                            System.out.println(sofa);
                        }
                    }
                } else if (n2 == 2) {
                    Sofa sofa = createSofa();
                    System.out.println("Поздравляем! Ваш новый диван:\n");
                    System.out.println(sofa);
                }
            }
            case 3 -> {
                System.out.println("Желаете приобрести из наличия(1) или под заказ(2)? Выход (0)");
                int n3 = sc.nextInt();
                if (n3 == 1) {
                    showBeds(beds);
                    System.out.println("0 - Если ничего не понравилось");
                    int choice = sc.nextInt();
                    if (choice != 0) {
                        Bed bed = beds.get(choice - 1);
                        beds.remove(bed);
                        System.out.println("Поздравляем! Ваша новая кровать:\n");
                        System.out.println(bed);
                    } else {
                        System.out.println("Может быть вам изготовить кровать на заказ?");
                        System.out.println("1 - Да");
                        System.out.println("2 - Нет");
                        choice = sc.nextInt();
                        if (choice == 1) {
                            Bed bed = createBed();
                            System.out.println("Поздравляем! Ваша новая кровать:\n");
                            System.out.println(bed);
                        }
                    }
                } else if (n3 == 2) {
                    Bed bed = createBed();
                    System.out.println("Поздравляем! Ваша новая кровать:\n");
                    System.out.println(bed);
                }
            }
        }
        System.out.println("\nДо свидания! Рады были видеть в нашем магазине!");
    }

}
