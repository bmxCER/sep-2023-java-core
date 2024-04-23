import hw3.part1.Book;
import hw3.part1.Magazine;
import hw3.part1.Printable;
import hw3.part2.Drums;
import hw3.part2.Guitar;
import hw3.part2.Instrument;
import hw3.part2.Trumpet;

public class Main {
        public static void main(String[] arg){
                Printable[] printableItems = new Printable[2];

                printableItems[0] = new Book("book1");
                printableItems[1] = new Magazine("magazine1");

                for (Printable item : printableItems){
                        item.print();
                }

                Instrument[] instrumentItems = new Instrument[3];

                instrumentItems[0] = new Guitar(3);
                instrumentItems[1] = new Drums(100);
                instrumentItems[2] = new Trumpet(30);

                for (Instrument item : instrumentItems){
                        item.play();
                }
        }

}
