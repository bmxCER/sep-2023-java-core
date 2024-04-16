package hw1.javacore;

import hw1.javacore.part1.book.Book;
import hw1.javacore.part1.book.BooksArray;
import hw1.javacore.part1.car.Car;
import hw1.javacore.part1.car.CarsArray;
import hw1.javacore.part1.dog.Dog;
import hw1.javacore.part1.dog.DogsArray;
import hw1.javacore.part2.Post;
import hw1.javacore.part2.PostsArray;
import hw1.javacore.part3.Comment;
import hw1.javacore.part3.CommentsArray;

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

        Post post1 = new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit nsuscipit recusandae consequuntur expedita et cum nreprehenderit molestiae ut ut quas totam nnostrum rerum est autem sunt rem eveniet architecto");
        Post post2 = new Post(1, 2, "qui est esse", "est rerum tempore vitae nsequi sint nihil reprehenderit dolor beatae ea dolores neque nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis nqui aperiam non debitis possimus qui neque nisi nulla");
        Post post3 = new Post(1, 3, "ea molestias quasi exercitationem repellat qui ipsa sit aut", "et iusto sed quo iure nvoluptatem occaecati omnis eligendi aut ad nvoluptatem doloribus vel accusantium quis pariatur nmolestiae porro eius odio et labore et velit aut");
        Post post4 = new Post(1, 4, "eum et est occaecati", "ullam et saepe reiciendis voluptatem adipisci nsit amet autem assumenda provident rerum culpa nquis hic commodi nesciunt rem tenetur doloremque ipsam iure nquis sunt voluptatem rerum illo velit");
        Post post5 = new Post(1, 5, "nesciunt quas odio", "repudiandae veniam quaerat sunt sed nalias aut fugiat sit autem sed est nvoluptatem omnis possimus esse voluptatibus quis nest aut tenetur dolor neque");

        Post[] postsmany = new Post[]{post1, post2, post3, post4, post5};
        PostsArray postsArray = new PostsArray();
        postsArray.setPosts(postsmany);

        for (Post postmany: postsmany){
            System.out.println(postmany);
        }

        System.out.println("Part3");

        Comment comment1 = new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos ntempora quo necessitatibus ndolor quam autem quasi nreiciendis et nam sapiente accusantium");
        Comment comment2 = new Comment(1, 2, "quo vero reiciendis velit similique earum", "Jayne_Kuhic@sydney.com", "est natus enim nihil est dolore omnis voluptatem numquam net omnis occaecati quod ullam at nvoluptatem error expedita pariatur nnihil sint nostrum voluptatem reiciendis et");
        Comment comment3 = new Comment(1, 3, "odio adipisci rerum aut animi", "Nikita@garfield.biz", "quia molestiae reprehenderit quasi aspernatur naut expedita occaecati aliquam eveniet laudantium nomnis quibusdam delectus saepe quia accusamus maiores nam est ncum et ducimus et vero voluptates excepturi deleniti ratione");
        Comment comment4 = new Comment(1, 4, "alias odio sit", "Lew@alysha.tv", "non et atque noccaecati deserunt quas accusantium unde odit nobis qui voluptatem nquia voluptas consequuntur itaque dolor net qui rerum deleniti ut occaecati");
        Comment comment5 = new Comment(1, 5, "vero eaque aliquid doloribus et culpa", "Hayden@althea.biz", "harum non quasi et ratione ntempore iure ex voluptates in ratione nharum architecto fugit inventore cupiditate nvoluptates magni quo et");

        Comment[] commentsmany = new Comment[]{comment1, comment2, comment3, comment4, comment5};
        CommentsArray commentsArray = new CommentsArray();
        commentsArray.setComments(commentsmany);

        for (Comment commentmany : commentsmany){
            System.out.println(commentmany);
        }

    }
}
