package hust.soict.khmt.aims.Aims;
import hust.soict.khmt.aims.media.DigitalVideoDisc;
import hust.soict.khmt.aims.order.Order.*;

import java.util.Scanner;


public class Aims {

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

    public static void main(String[] args) {
    Order anOrder = new Order();
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
    dvd1.setCategory("Animation");
    dvd1.setCost(19.95f);
    dvd1.setDirector("Roger Allers");
    dvd1.setLength(87);
    anOrder.addMedia(dvd1);

    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
    dvd2.setCategory("Science Fiction");
    dvd2.setCost(24.95f);
    dvd2.setDirector("George Lucas");
    dvd2.setLength(124);

    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
    dvd3.setCategory("Animation");
    dvd3.setCost(18.99f);
    dvd3.setDirector("John Musker");
    dvd3.setLength(90);

    DigitalVideoDisc dvd4 = new DigitalVideoDisc("Aladin");
    dvd4.setCategory("Animation");
    dvd4.setCost(18.99f);
    dvd4.setDirector("John Musker");
    dvd4.setLength(90);

    DigitalVideoDisc dvdList[] = new DigitalVideoDisc[Order.MAX_NUMBERS_ORDERED];
    dvdList[0] = dvd2;
    dvdList[1] = dvd3;
    anOrder.addMedia(dvdList);
    anOrder.removeMedia(dvd2);

    anOrder.showOrder("Order 1");

    Order Order2 = new Order();
    Order2.addMedia(dvd1, dvd4);
    Order2.addMedia(dvdList);

    Order2.showOrder("Order 2");


    boolean buy = true;
    showMenu();
    while(buy){
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        switch (a) {
            case 0:
                System.out.print("See you again !");
                buy = false;
                break;
            case 1:
                System.out.print("Name: ");
                String b = input.next();
                System.out.print("Category: ");
                String c = input.next();
                System.out.print("Cost: ");
                float d = input.nextFloat();
                System.out.print("Director: ");
                String e = input.next();
                System.out.print("Length: ");
                int f = input.nextInt();

                break;
            case 2:
                break;
            case 3:

                break;
            case 4:
                Order2.displayitems(Order2);
                break;
            default:
                System.out.println("Error");
        }
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
    Order2.showOrder("Your Order");
    dvd1.play();
    System.exit(0);
    }
}


