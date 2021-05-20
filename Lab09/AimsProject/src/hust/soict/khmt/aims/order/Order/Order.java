package hust.soict.khmt.aims.order.Order;

import hust.soict.khmt.aims.media.Book;
import hust.soict.khmt.aims.media.Media;
import hust.soict.khmt.Date.MyDate;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public ArrayList<Media> itemsOrdered = new ArrayList<Media>(MAX_NUMBERS_ORDERED);
    public int qtyOrdered = 0;
    public void addMedia(Media dvd) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED){
            this.itemsOrdered.add(dvd);
            System.out.println("Media "+dvd.getTitle() +" was added");
        }
        else {
            Label label = new Label("Full items of the order !!");
            AnchorPane root = new AnchorPane();
            root.getChildren().add(label);
            Scene scene = new Scene(root, 200, 200);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
    }
    public void removeMedia(Media dvd) {
        itemsOrdered.remove(dvd);
    }

    public void removeMedia(int id) {
        int a = itemsOrdered.size();
        for (int i = 0; i < itemsOrdered.size(); i ++){
            if (itemsOrdered.get(i).getId() == id) {
                System.out.println("The item \"" + itemsOrdered.get(i).getTitle()
                                    + "\" was removed");
                itemsOrdered.remove(i);
                break;
            }
        }
        if (a == itemsOrdered.size()) {
            System.out.println("There no items has this Id !");
        }
    }

    public float totalCost() {
        float cost = 0;
        for(int i = 0; i < itemsOrdered.size(); i++) {
            cost += itemsOrdered.get(i).getCost();
        }
        return cost;
    }

    public void addMedia(Media [] dvdList) {
        for (int i = 0; i < dvdList.length; i ++){
            if (itemsOrdered.size() < MAX_NUMBERS_ORDERED & dvdList[i] != null){
                this.itemsOrdered.add(dvdList[i]);
            }
            if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED){
                System.out.println("Full of orders");
                break;
            }
        }
    }
    public void addMedia(Media dvd1, Media dvd2){
        if (qtyOrdered < MAX_NUMBERS_ORDERED - 1){
            this.itemsOrdered.add(dvd1);
            this.itemsOrdered.add(dvd2);
            qtyOrdered += 2;
        }

        else if (qtyOrdered < MAX_NUMBERS_ORDERED){
            this.itemsOrdered.add(dvd1);
            qtyOrdered += 1;
            System.out.println("Full DVDs");
        }
        else{
            System.out.println("Full DVDs");
        }
    }

    private MyDate dateOrdered = new MyDate();

    public static final int MAX_LIMITED_ORDERS = 5;
    int nbOrders = 0;
    private ArrayList <Order> listOrder = new ArrayList <Order> (MAX_LIMITED_ORDERS);
    public void addOrder(Order order){
        if (nbOrders < MAX_LIMITED_ORDERS){
            nbOrders ++;
            listOrder.add(order);
        }
        else {
            ////////////////////////////////////////////////////////////
        }
    }
    public void showOrder(String order) {
        if (nbOrders < MAX_LIMITED_ORDERS){

            nbOrders ++;
            System.out.println("**********************" + order + "**********************");
            System.out.println("Date: " + dateOrdered.getDate() + " - " + order);
            System.out.println("Ordered Items:");
            for (int i = 0; i < qtyOrdered; i++) {
                System.out.println(i + 1 + ". " + itemsOrdered.get(i).getTitle() + " - " + itemsOrdered.get(i).getCategory() + " - "
                        + itemsOrdered.get(i).getDirector() + " - " + ": " + itemsOrdered.get(i).getCost() + "$");
            }
            System.out.println("Total cost: " + totalCost() + '\n' + "***************************************************");
            getALuckyItem();
            System.out.println("\n");
        }
        else {
            System.out.println("Full Orders");
        }
    }
    double random = Math.random();
    public int index = (int)( random * itemsOrdered.size() );
    public void getALuckyItem(){
        System.out.println("The lucky item is: "+ itemsOrdered.get(index).getTitle());
        System.out.println( "Total cost is: " + (totalCost() - itemsOrdered.get(index).getCost()));
    }

    public static void displayitems(Order order) {
            for (int k = 0; k < order.qtyOrdered; k++) {
                System.out.println("Item " + (k + 1) + ": " + order.itemsOrdered.get(k).getTitle());
        }
    }
}
