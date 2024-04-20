package hw2.part2;


import java.util.ArrayList;

public class Main {

    public static void main(String[] arg){

        Laptop laptop1 = new Laptop("intel celderey", "integrated", "8GB", 1000, 5000);
        Ultrabook ultrabook1 = new Ultrabook("amd kukuryzen", "integrated", "8GB", 500, 5000, 20);
        Workstation workstation1 = new Workstation("ukrali", "ukrali", "ukrali", 200, 5000, true);

        System.out.println(laptop1);
        System.out.println(ultrabook1);
        System.out.println(workstation1);
    }
}