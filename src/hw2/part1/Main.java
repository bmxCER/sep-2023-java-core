package hw2.part1;

import hw2.part1.Address;
import hw2.part1.Company;
import hw2.part1.User;
import hw2.part2.Laptop;
import hw2.part2.PC;
import hw2.part2.Ultrabook;
import hw2.part2.Workstation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg){
        User user1 = new User(1, "Name1", "Username1", "email1@gmail.com",
                new Address("street1", "suite1", "city1", 144-31), +12345678, "website1.com",
                new Company("company1", "catchPhrase1", "bs1"));

        ArrayList<User> users = new ArrayList<User>();
        users.add(user1);
        for (User user : users){
            System.out.println(user);
        }

    }
}
