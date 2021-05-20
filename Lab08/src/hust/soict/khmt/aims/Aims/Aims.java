package hust.soict.khmt.aims.Aims;
import hust.soict.khmt.aims.media.Book;
import hust.soict.khmt.aims.media.CompactDisc;
import hust.soict.khmt.aims.media.DigitalVideoDisc;
import hust.soict.khmt.aims.order.Order.*;

import java.util.Scanner;
import java.util.ArrayList;

public class Aims {

    static ArrayList <DigitalVideoDisc> dvd = new ArrayList <DigitalVideoDisc>();
    static ArrayList <Book> book = new ArrayList <Book>();
    static ArrayList <CompactDisc> cd = new ArrayList <CompactDisc>();
    static ArrayList <String> author = new ArrayList <String>();
    static Order anOrder = new Order();

    public static void showMenu() {
        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void showChoosen() {
        System.out.println("Choose type of item you want to add:");
        System.out.println("1. Book");
        System.out.println("2. Digital Video Disc");
        System.out.println("3. Compact Disc");
        System.out.println("0. Back");
    }

    public static void showItem(int choose) {
        System.out.println("List of items:");
        switch (choose){
            case 1:
                for(int i = 0; i < book.size(); ++i) {
                    System.out.println(i+1 + "." + book.get(i).getTitle() + "\nCategory: " + book.get(i).getCategory()
                            + "\nAuthor: " + book.get(i).getAuthor() +"\nCost: " + book.get(i).getCost()
                            + "$\nLenght: " + " pages\nId: " + book.get(i).getId());
                }
                System.out.println(0 + ". Back");
                break;
            case 2:
                for(int i = 0; i < dvd.size(); ++i) {
                    System.out.println(i+1 + "." + dvd.get(i).getTitle() + "\nCategory: " + dvd.get(i).getCategory() + "\nDirector: "
                            + dvd.get(i).getDirector() +"\nCost: " + dvd.get(i).getCost() + "$\nLenght: " + dvd.get(i).getLength() + " minutes\nId: " + dvd.get(i).getId());
                }
                System.out.println(0 + ". Back");
                break;
            case 3:
                for(int i = 0; i < cd.size(); ++i) {
                    System.out.println(i+1 + "." + cd.get(i).getTitle() + "\nCategory: " + cd.get(i).getCategory() + "\nArtist: "
                            + cd.get(i).getArtist() +"\nCost: " + cd.get(i).getCost() + "$\nLenght: " + cd.get(i).getLength() + " minutes\nId: " + cd.get(i).getId() );
                }
                System.out.println(0 + ". Back");
                break;

        }
    }
    public static void addItem(int choose, int item) {
        if (item == 0) {

        }
        else {
            if (choose == 1) {
                anOrder.addMedia(book.get(item - 1));
            }
            if (choose == 2) {
                anOrder.addMedia(dvd.get(item - 1));
            }
            if (choose == 3) {
                anOrder.addMedia(cd.get(item - 1));
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MemoryDaemon());
        thread.setDaemon(true);
        thread.start();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        dvd1.setId(1);
        dvd.add(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        dvd2.setId(2);
        dvd.add(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        dvd3.setId(2);
        dvd.add(dvd3);

        Book book1 = new Book("Conan");
        author.add("Aoyama Gosho");
            for (int i = 0; i < author.toArray().length; i ++){
                book1.addAuthor(author.get(i));
            }
        book1.setCategory("Detective");
        book1.setCost(1.2f);
        book1.setId(4);
        book.add(book1);

        Book book2 = new Book("Sherlock Holmes");
        author.clear();
        author.add("Conan Doyle");
        for (int i = 0; i < author.toArray().length; i ++){
            book2.addAuthor(author.get(i));
        }
        book2.setCategory("Detective");
        book2.setCost(10.2f);
        book2.setId(5);
        book.add(book2);

        DigitalVideoDisc dvdList[] = new DigitalVideoDisc[Order.MAX_NUMBERS_ORDERED];
        dvdList[0] = dvd2;
        dvdList[1] = dvd3;
        anOrder.addMedia(dvdList);
        anOrder.removeMedia(dvd2);
        anOrder.addMedia(dvd1, book1);


        showMenu();
        while(true){
            int a;
            Scanner input = new Scanner(System.in);
            a = input.nextInt();
            switch (a) {
                case 0:
                    System.out.println("You will log out !");
                    break;
                case 1:
                    showMenu();
                    break;
                case 2:
                    while (true) {
                        showChoosen();
                        int choose;
                        choose = input.nextInt();
                        if (choose == 0) {
                            break;
                        }
                        showItem(choose);
                        int item;
                        item = input.nextInt();
                        addItem(choose, item);
                        if (item != 0) {
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the id of item you want to remove:");
                    int id = input.nextInt();
                    anOrder.removeMedia(id);
                    break;
                case 4:
                    anOrder.displayitems(anOrder);
                    break;
                default:
                    System.out.println("Error");
            }
            Thread.sleep(2000);
            System.out.println("Continue ? (yes or no)");
            String choose = input.next();
            if (choose.equals("yes")){
                showMenu();
            }
            else {
                System.out.println("See you again !");
                break;
            }
        }
        anOrder.showOrder("Your Order");
        dvd1.play();
        System.exit(0);
    }
}


