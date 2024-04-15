package hw1.javacore;

import hw1.javacore.part1.book.Book;
import hw1.javacore.part1.book.BooksArray;
import hw1.javacore.part1.car.Car;
import hw1.javacore.part1.car.CarsArray;
import hw1.javacore.part1.dog.Dog;
import hw1.javacore.part1.dog.DogsArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] arg){

        System.out.println("Part 1");

        Car car1 = new Car("BMW", 100, 100, true);
        Car car2 = new Car("Skoda", 95, 120, false);
        Car car3 = new Car("Peugot", 83, 100, false);
        Car car4 = new Car("Renault", 100, 105, true);
        Car car5 = new Car("Mercedes", 120, 130, true);

        Car[] carsmany = new Car[]{car1, car2, car3, car4, car5};
        CarsArray carsArray = new CarsArray();
        carsArray.setCars(carsmany);

        for (Car carmany : carsmany){
            System.out.println(carmany);
        }


        Dog dog1 = new Dog("Toha", 2, "yakas");
        Dog dog2 = new Dog("Lyolya", 1, "chihuahua");

        Dog[] dogsmany = new Dog[]{dog1, dog2};
        DogsArray dogsArray = new DogsArray();
        dogsArray.setDogs(dogsmany);

        for (Dog dogmany : dogsmany){
            System.out.println(dogmany);
        }


        Book book1 = new Book("Harry Potter and the Philosopher's Stone", 223, "J. K. Rowling", "Fantasy");
        Book book2 = new Book("1984", 328, "George Orwell", "Dystopian, political fiction, social science fiction");

        Book[] booksmany = new Book[]{book1, book2};
        BooksArray booksArray = new BooksArray();
        booksArray.setBooks(booksmany);

        for (Book bookmany : booksmany){
            System.out.println(bookmany);
        }

        System.out.println("Part 2");

    }
}
