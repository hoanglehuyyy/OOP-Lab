package hust.soict.khmt.aims.Aims;
import com.sun.javafx.geom.Rectangle;
import com.sun.javafx.scene.EnteredExitedHandler;
import hust.soict.khmt.aims.media.Book;
import hust.soict.khmt.aims.media.CompactDisc;
import hust.soict.khmt.aims.media.DigitalVideoDisc;
import hust.soict.khmt.aims.order.Order.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.css.Size;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Aims extends Application {

    static ArrayList <DigitalVideoDisc> dvd = new ArrayList<>();
    static ArrayList <Book> book = new ArrayList<>();
    static ArrayList <CompactDisc> cd = new ArrayList<>();
    static ArrayList <String> author = new ArrayList<>();
    static Order anOrder = new Order();
    static Order myOrder = new Order();
    static ArrayList <ImageView> listBookImage = new ArrayList<>();
    static ArrayList <ImageView> listDvdImage = new ArrayList<>();
    static ArrayList <ImageView> listCdImage = new ArrayList<>();
    static ArrayList <ImageView> listMediaImage = new ArrayList<>();
    static ArrayList <MediaView> dvdTrailer = new ArrayList<>();
    static ArrayList <MediaView> cdTrailer = new ArrayList<>();
    static ArrayList <MediaPlayer> dvdPlayer = new ArrayList<>();
    static ArrayList <MediaPlayer> cdPlayer = new ArrayList<>();
    static int pay = 0;

    public static void main(String[] args) throws FileNotFoundException {

    //    Thread thread = new Thread(new MemoryDaemon());
    //    thread.setDaemon(true);
    //    thread.start();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        dvd1.setId(1);
        Image dI1 = new Image(new FileInputStream("src\\hust\\soict\\khmt\\picture\\DVD\\the_lion_king.png"));
        dvd1.setImage(dI1);
        dvd.add(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        dvd2.setId(2);
        Image dI2 = new Image(new FileInputStream("src\\hust\\soict\\khmt\\picture\\DVD\\star_wars.jpeg"));
        dvd2.setImage(dI2);
        dvd.add(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        dvd3.setId(2);
        Image dI3 = new Image(new FileInputStream("src\\hust\\soict\\khmt\\picture\\DVD\\aladdin.jpg"));
        dvd3.setImage(dI3);
        dvd.add(dvd3);

        Book book1 = new Book("Analysis");
        author.add("Nguyen Dinh Tri");
        author.add("Tran viet Dung");
        author.add("Tran Xuan Hien");
        author.add("Nguyen Xuan Thao");
            for (int i = 0; i < author.toArray().length; i ++){
                book1.addAuthor(author.get(i));
            }
        book1.setCategory("Lecture");
        book1.setCost(1.2f);
        book1.setId(4);
        Image bI1 = new Image(new FileInputStream("src\\hust\\soict\\khmt\\picture\\Book\\Analysis.jpg"));
        book1.setImage(bI1);
        book.add(book1);

        Book book2 = new Book("Algebra");
        author.clear();
        author.add("Nguyen Dinh Tri");
        author.add("Tran viet Dung");
        author.add("Tran Xuan Hien");
        author.add("Nguyen Xuan Thao");
        for (int i = 0; i < author.toArray().length; i ++){
            book2.addAuthor(author.get(i));
        }
        book2.setCategory("Lecture");
        book2.setCost(1.2f);
        book2.setId(5);
        Image bI2 = new Image(new FileInputStream("src\\hust\\soict\\khmt\\picture\\Book\\Algebra.jpg"));
        book2.setImage(bI2);
        book.add(book2);

        Book book3 = new Book("Sherlock Holmes chapter 1");
        author.clear();
        author.add("Conan Doyle");
        for (int i = 0; i < author.toArray().length; i ++){
            book3.addAuthor(author.get(i));
        }
        book3.setCategory("Detective");
        book3.setCost(10.2f);
        book3.setId(6);
        Image bI3 = new Image(new FileInputStream("src\\hust\\soict\\khmt\\picture\\Book\\sherlock_holmes_1.jpg"));
        book3.setImage(bI3);
        book.add(book3);

        Book book4 = new Book("Sherlock Holmes chapter 2");
        author.clear();
        author.add("Conan Doyle");
        for (int i = 0; i < author.toArray().length; i ++){
            book4.addAuthor(author.get(i));
        }
        book4.setCategory("Detective");
        book4.setCost(10.2f);
        book4.setId(7);
        Image bI4 = new Image(new FileInputStream("src\\hust\\soict\\khmt\\picture\\Book\\sherlock_holmes_2.jpg"));
        book4.setImage(bI4);
        book.add(book4);

        Book book5 = new Book("The old man and the sea");
        author.clear();
        author.add("Earnest Hemingway");
        for (int i = 0; i < author.toArray().length; i ++){
            book5.addAuthor(author.get(i));
        }
        book5.setCategory("Novel");
        book5.setCost(10.2f);
        book5.setId(8);
        Image bI5 = new Image(new FileInputStream("src\\hust\\soict\\khmt\\picture\\Book\\the_old_man_and_the_sea.jpg"));
        book5.setImage(bI5);
        book.add(book5);

        CompactDisc cd1 = new CompactDisc("Conan");
        cd1.setArtist("Aoyama Gosho");
        cd1.setCategory("Detective");
        cd1.setCost(14.4f);
        cd1.setLength(120);
        cd1.setId(9);
        cd1.setImage(new Image(new FileInputStream("src\\hust\\soict\\khmt\\picture\\CD\\conan.jpg")));
        cd.add(cd1);

        CompactDisc cd2 = new CompactDisc("Doraemon");
        cd2.setArtist("Fujiko F.Fujio");
        cd2.setCategory("Cartoon and Science Fiction");
        cd2.setCost(14.4f);
        cd2.setLength(120);
        cd2.setId(10);
        cd2.setImage(new Image(new FileInputStream("src\\hust\\soict\\khmt\\picture\\CD\\doraemon.jpg")));
        cd.add(cd2);

        CompactDisc cd3 = new CompactDisc("Pokemon");
        cd3.setArtist("Aoyama Gosho");
        cd3.setCategory("Detective");
        cd3.setCost(14.4f);
        cd3.setLength(120);
        cd3.setId(9);
        cd3.setImage(new Image(new FileInputStream("src\\hust\\soict\\khmt\\picture\\CD\\pokemon.jpg")));
        cd.add(cd3);

        launch(args);
        System.exit(0);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField menu = new TextField("Order Management Application");
        menu.setLayoutX(105);
        menu.setLayoutY(14);
        menu.setPrefWidth(390);
        menu.setPrefHeight(54);
        menu.setEditable(false);
        menu.setAlignment(Pos.CENTER_LEFT);
        menu.setStyle("-fx-font: 25 arial");

        Button createOrder = new Button();
        createOrder.setText("Create new Order");
        createOrder.setLayoutX(156);
        createOrder.setLayoutY(80);
        createOrder.setPrefWidth(288);
        createOrder.setPrefHeight(39);
        createOrder.setStyle("-fx-font: 18 System");

        Button addOrder = new Button();
        addOrder.setText("Add item to the order");
        addOrder.setLayoutX(156);
        addOrder.setLayoutY(141);
        addOrder.setPrefWidth(288);
        addOrder.setPrefHeight(39);
        addOrder.setStyle("-fx-font: 18 System");

        Button deleteOrder = new Button();
        deleteOrder.setText("Delete item by id");
        deleteOrder.setLayoutX(156);
        deleteOrder.setLayoutY(200);
        deleteOrder.setPrefWidth(288);
        deleteOrder.setPrefHeight(39);
        deleteOrder.setStyle("-fx-font: 18 System");

        Button listItem = new Button();
        listItem.setText("Display the items list of the order");
        listItem.setLayoutX(156);
        listItem.setLayoutY(258);
        listItem.setPrefWidth(288);
        listItem.setPrefHeight(39);
        listItem.setStyle("-fx-font: 18 System");

        Button exit = new Button();
        exit.setText("Exit");
        exit.setLayoutX(156);
        exit.setLayoutY(315);
        exit.setPrefWidth(288);
        exit.setPrefHeight(39);
        exit.setStyle("-fx-font: 18 System");

        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(menu, createOrder, addOrder, deleteOrder, listItem, exit);

        Scene scene = new Scene(root, 600, 400);

        primaryStage.setTitle("Order Menu");
        primaryStage.setScene(scene);

        ////////////////////// lock after paid stage ///////////////////
        Stage lockStage = new Stage();
        AnchorPane lockPane = new AnchorPane();
        Label lockLabel = new Label("You need to create an order to continue shopping !");
        lockPane.getChildren().add(lockLabel);
        Scene lockScence = new Scene(lockPane, 400, 200);
        lockStage.setScene(lockScence);


        //////////////////// play and stop icons
        Image play = null;
        try {
            play = new Image(new FileInputStream("src\\hust\\soict\\khmt\\picture\\play.jpg"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image stop = null;
        try {
            stop = new Image(new FileInputStream("src\\hust\\soict\\khmt\\picture\\stop.png"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image buy = null;
        try {
            buy = new Image(new FileInputStream("src\\hust\\soict\\khmt\\picture\\buy.png"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        createOrder.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                anOrder.itemsOrdered.clear();
                pay = 0;
                Label newOrderLabel = new Label("New Order was created !");

                StackPane newOrderLayout = new StackPane();
                newOrderLayout.getChildren().add(newOrderLabel);
                Scene newOrderScene = new Scene(newOrderLayout, 230, 100);

                Stage newOrderWindow = new Stage();
                newOrderWindow.setTitle("Create new order");
                newOrderWindow.setScene(newOrderScene);
                newOrderWindow.initModality(Modality.WINDOW_MODAL);
                newOrderWindow.initOwner(primaryStage);
                newOrderWindow.setX(primaryStage.getX() + 200);
                newOrderWindow.setY(primaryStage.getY() + 100);
                newOrderWindow.show();

            }
        });

        Image finalPlay = play;
        Image finalBuy = buy;
        addOrder.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                TextField menuChoose = new TextField("Choose type of item you want to add");
                menuChoose.setLayoutX(78);
                menuChoose.setLayoutY(14);
                menuChoose.setPrefWidth(444);
                menuChoose.setPrefHeight(54);
                menuChoose.setEditable(false);
                menuChoose.setAlignment(Pos.CENTER_LEFT);
                menuChoose.setStyle("-fx-font: 25 System");

                Button bookOrder = new Button();
                bookOrder.setText("Book");
                bookOrder.setLayoutX(156);
                bookOrder.setLayoutY(80);
                bookOrder.setPrefWidth(288);
                bookOrder.setPrefHeight(39);
                bookOrder.setStyle("-fx-font: 18 System");

                Button dvdOrder = new Button();
                dvdOrder.setText("Digital Video Disc");
                dvdOrder.setLayoutX(156);
                dvdOrder.setLayoutY(141);
                dvdOrder.setPrefWidth(288);
                dvdOrder.setPrefHeight(39);
                dvdOrder.setStyle("-fx-font: 18 System");

                Button cdOrder = new Button();
                cdOrder.setText("Compact Disc");
                cdOrder.setLayoutX(156);
                cdOrder.setLayoutY(200);
                cdOrder.setPrefWidth(288);
                cdOrder.setPrefHeight(39);
                cdOrder.setStyle("-fx-font: 18 System");

                Button backOrder = new Button();
                backOrder.setText("Back");
                backOrder.setLayoutX(156);
                backOrder.setLayoutY(258);
                backOrder.setPrefWidth(288);
                backOrder.setPrefHeight(39);
                backOrder.setStyle("-fx-font: 18 System");

                AnchorPane addOrderLayout = new AnchorPane();
                addOrderLayout.getChildren().addAll(menuChoose, bookOrder, dvdOrder, cdOrder, backOrder);
                Scene addOrderScene = new Scene(addOrderLayout, 600, 400);

                Stage addOrderWindow = new Stage();
                addOrderWindow.setTitle("Create new order");
                addOrderWindow.setScene(addOrderScene);
                addOrderWindow.setX(primaryStage.getX());
                addOrderWindow.setY(primaryStage.getY());
                primaryStage.close();

                bookOrder.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        final AnchorPane container = new AnchorPane();
                        ScrollPane bookItem = new ScrollPane();

                        TextField bookTitles = new TextField("Book Items");
                        bookTitles.setLayoutX(407);
                        bookTitles.setLayoutY(7);
                        bookTitles.setPrefWidth(386);
                        bookTitles.setPrefHeight(63);
                        bookTitles.setEditable(false);
                        bookTitles.setAlignment(Pos.CENTER);
                        bookTitles.setStyle("-fx-font: 30 System; -fx-text-fill: #e01216");

                        AnchorPane bookSearch = new AnchorPane();
                        bookSearch.setPrefWidth(383);
                        bookSearch.setPrefHeight(51);
                        bookSearch.setLayoutX(973);
                        bookSearch.setLayoutY(83);

                        TextField searchBookText = new TextField("Search");
                        searchBookText.setPrefWidth(68);
                        searchBookText.setPrefHeight(31);
                        searchBookText.setLayoutX(0);
                        searchBookText.setLayoutY(10);
                        searchBookText.setEditable(false);
                        searchBookText.setAlignment(Pos.CENTER);
                        searchBookText.setStyle("-fx-font: 15 System");

                        TextField searchBook = new TextField();
                        searchBook.setPrefWidth(247);
                        searchBook.setPrefHeight(31);
                        searchBook.setLayoutX(68);
                        searchBook.setLayoutY(10);
                        searchBook.setStyle("-fx-font: 15 System");

                        Button searchBookButton = new Button("Enter");
                        searchBookButton.setPrefWidth(55);
                        searchBookButton.setPrefHeight(31);
                        searchBookButton.setLayoutX(314);
                        searchBookButton.setLayoutY(10);
                        searchBookButton.setStyle("-fx-font: 15 System");

                        bookSearch.getChildren().addAll(searchBookText, searchBook, searchBookButton);

                        ArrayList<AnchorPane> listBookPane = new ArrayList<>();
                        ArrayList<Label> listBookLabel = new ArrayList<>();
                        ArrayList<TextArea> listBookText = new ArrayList<>();
                        ArrayList<Button> listBookAdd = new ArrayList<>();
                        ArrayList<Button> listBookSub = new ArrayList<>();
                        ArrayList<TextField> listBookBuy = new ArrayList<>();

                        ////////////////////////// Set book order interface

                        for (int i = 0; i < book.toArray().length; i++) {
                            listBookPane.add(new AnchorPane());
                            listBookPane.get(i).setLayoutX(50);
                            listBookPane.get(i).setLayoutY(160 + 350 * i);
                            listBookImage.add(null);
                            listBookImage.set(i, new ImageView(book.get(i).getImage()));
                            listBookImage.get(i).setFitWidth(289);
                            listBookImage.get(i).setFitHeight(309);

                            listBookLabel.add(new Label(book.get(i).getTitle()));
                            listBookLabel.get(i).setStyle("-fx-font: 25 System; -fx-text-fill: #45e312");
                            listBookLabel.get(i).setPrefHeight(36);
                            listBookLabel.get(i).setLayoutX(350);

                            listBookText.add(new TextArea());
                            listBookText.get(i).setText("Authors: " + book.get(i).getAuthor() + "\n"
                                    + "Category: " + book.get(i).getCategory() + "\n"
                                    + "Cost: " + book.get(i).getCost() + "\n"
                                    + "Id: " + book.get(i).getId() + "\n");
                            listBookText.get(i).setStyle("-fx-font: 12 System");
                            listBookText.get(i).setLayoutX(300);
                            listBookText.get(i).setLayoutY(50);

                            listBookAdd.add(i, new Button("Add"));
                            listBookAdd.get(i).setStyle("fx-font: 20 System");
                            listBookAdd.get(i).setLayoutX(863);
                            listBookAdd.get(i).setLayoutY(49);
                            listBookAdd.get(i).setPrefWidth(65);
                            listBookAdd.get(i).setPrefHeight(44);

                            listBookSub.add(i, new Button("Sub"));
                            listBookSub.get(i).setStyle("fx-font: 20 System");
                            listBookSub.get(i).setLayoutX(993);
                            listBookSub.get(i).setLayoutY(49);
                            listBookSub.get(i).setPrefWidth(65);
                            listBookSub.get(i).setPrefHeight(44);

                            final int[] buy = {0};
                            listBookBuy.add(i, new TextField(buy[0] + ""));
                            listBookBuy.get(i).setStyle("fx-font: 20 System");
                            listBookBuy.get(i).setLayoutX(928);
                            listBookBuy.get(i).setLayoutY(49);
                            listBookBuy.get(i).setPrefWidth(65);
                            listBookBuy.get(i).setPrefHeight(44);
                            listBookBuy.get(i).setEditable(false);

                            int finalI = i;
                            listBookAdd.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    if (pay == 0){
                                        if (anOrder.itemsOrdered.size() < anOrder.MAX_NUMBERS_ORDERED) {
                                            anOrder.addMedia(book.get(finalI));
                                            buy[0]++;
                                            listBookBuy.get(finalI).setText(buy[0] + "");
                                        }
                                    }
                                    else {
                                        lockStage.show();
                                    }
                                }
                            });
                            listBookSub.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    if (pay == 0){
                                        if (buy[0] > 0) {
                                            anOrder.removeMedia(book.get(finalI));
                                            buy[0]--;
                                            listBookBuy.get(finalI).setText(buy[0] + "");
                                        }
                                    }
                                    else {
                                        lockStage.show();
                                    }
                                }
                            });

                            listBookPane.get(i).getChildren().addAll(listBookImage.get(i), listBookLabel.get(i), listBookText.get(i)
                                    , listBookAdd.get(i), listBookBuy.get(i), listBookSub.get(i));
                            listBookPane.get(i).setStyle("-fx-border-color: #e42312");
                        }

                        container.getChildren().addAll(bookTitles, bookSearch);
                        for (int i = 0; i < book.toArray().length; i++) {
                            container.getChildren().add(listBookPane.get(i));
                        }

                        ///////////////////// Search book items by search button
                        searchBookButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
                            @Override
                            public void handle(MouseEvent mouseEvent) {
                                int j = 0;
                                String stringSearchBook = searchBook.getText();
                                for (int i = 0; i < book.toArray().length; i++) {
                                    if (book.get(i).getTitle().contains(stringSearchBook.trim())) {
                                        listBookPane.get(i).setLayoutY(160 + 350 * j);
                                        if (container.getChildren().contains(listBookPane.get(i))) ;
                                        else {
                                            container.getChildren().add(listBookPane.get(i));
                                        }
                                        j++;
                                    } else {
                                        container.getChildren().remove(listBookPane.get(i));
                                    }
                                }
                            }
                        });

                        ////////////////////// Search book items by Enter
                        searchBook.setOnKeyPressed(new EventHandler<KeyEvent>() {
                            @Override
                            public void handle(KeyEvent keyEvent) {
                                if (keyEvent.getCode() == KeyCode.ENTER) {
                                    int j = 0;
                                    String stringSearchBook = searchBook.getText();
                                    for (int i = 0; i < book.toArray().length; i++) {
                                        if (book.get(i).getTitle().contains(stringSearchBook.trim())) {
                                            listBookPane.get(i).setLayoutY(160 + 350 * j);
                                            if (container.getChildren().contains(listBookPane.get(i))) ;
                                            else {
                                                container.getChildren().add(listBookPane.get(i));
                                            }
                                            j++;
                                        } else {
                                            container.getChildren().remove(listBookPane.get(i));
                                        }
                                    }
                                }
                            }
                        });

                        ImageView buyImage = new ImageView(finalBuy);
                        buyImage.setLayoutX(150);
                        buyImage.setLayoutY(60);
                        buyImage.setFitWidth(110);
                        buyImage.setFitHeight(110);
                        if (pay == 0){
                            buyImage.setOnMouseClicked(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    if (anOrder.itemsOrdered.size() > 0){
                                        for (int i = 0; i < anOrder.itemsOrdered.size(); i++) {
                                            myOrder.addMedia(anOrder.itemsOrdered.get(i));
                                        }
                                        Stage payStage = new Stage();
                                        AnchorPane payPane = new AnchorPane();
                                        Label luckyLabel = new Label("You get a lucky item: " + anOrder.itemsOrdered.get(anOrder.index).getTitle());
                                        Label payLabel = new Label("Your total cost is: " + (anOrder.totalCost() - anOrder.itemsOrdered.get(anOrder.index).getCost()));
                                        luckyLabel.setStyle("-fx-font: 15 System");
                                        payLabel.setStyle("-fx-font: 15 System");
                                        luckyLabel.setAlignment(Pos.CENTER);
                                        payLabel.setAlignment(Pos.BOTTOM_CENTER);
                                        luckyLabel.setLayoutX(100);
                                        luckyLabel.setLayoutY(50);
                                        payLabel.setLayoutX(100);
                                        payLabel.setLayoutY(250);
                                        payPane.getChildren().add(payLabel);
                                        if (anOrder.itemsOrdered.size() > 2) {
                                            anOrder.getALuckyItem();
                                            payPane.getChildren().add(luckyLabel);
                                        }
                                        Scene payScene = new Scene(payPane, 600, 400);
                                        payStage.setScene(payScene);
                                        payStage.show();
                                        pay = 1;
                                        anOrder.itemsOrdered.clear();

                                    }
                                }
                            });
                        }

                        container.getChildren().add(buyImage);
                        bookItem.setContent(container);
                        bookItem.setPannable(true);
                        Scene bookScence = new Scene(bookItem, 1360, 720);
                        Stage bookStage = new Stage();
                        bookStage.setScene(bookScence);
                        bookStage.initModality(Modality.WINDOW_MODAL);
                        bookStage.initOwner(addOrderWindow);
                        bookStage.show();


                    }
                });

                dvdOrder.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        final AnchorPane container = new AnchorPane();
                        ScrollPane dvdItem = new ScrollPane();

                        TextField dvdTitle = new TextField("Digital Video Disc Items");
                        dvdTitle.setLayoutX(407);
                        dvdTitle.setLayoutY(7);
                        dvdTitle.setPrefWidth(386);
                        dvdTitle.setPrefHeight(63);
                        dvdTitle.setEditable(false);
                        dvdTitle.setAlignment(Pos.CENTER);
                        dvdTitle.setStyle("-fx-font: 30 System; -fx-text-fill: #e01216");

                        AnchorPane dvdSearch = new AnchorPane();
                        dvdSearch.setPrefWidth(383);
                        dvdSearch.setPrefHeight(51);
                        dvdSearch.setLayoutX(973);
                        dvdSearch.setLayoutY(83);

                        TextField searchDvdText = new TextField("Search");
                        searchDvdText.setPrefWidth(68);
                        searchDvdText.setPrefHeight(31);
                        searchDvdText.setLayoutX(0);
                        searchDvdText.setLayoutY(10);
                        searchDvdText.setEditable(false);
                        searchDvdText.setAlignment(Pos.CENTER);
                        searchDvdText.setStyle("-fx-font: 15 System");

                        TextField searchDvd = new TextField();
                        searchDvd.setPrefWidth(247);
                        searchDvd.setPrefHeight(31);
                        searchDvd.setLayoutX(68);
                        searchDvd.setLayoutY(10);
                        searchDvd.setStyle("-fx-font: 15 System");

                        Button searchDvdButton = new Button("Enter");
                        searchDvdButton.setPrefWidth(55);
                        searchDvdButton.setPrefHeight(31);
                        searchDvdButton.setLayoutX(314);
                        searchDvdButton.setLayoutY(10);
                        searchDvdButton.setStyle("-fx-font: 15 System");

                        dvdSearch.getChildren().addAll(searchDvdText, searchDvd, searchDvdButton);

                        /////////////////////// add media 1//////////////////
                        Media dvdM1 = new Media(new File("src\\hust\\soict\\khmt\\picture\\DVD\\the_lion_king_trailer.mp4").toURI().toString());
                        dvdTrailer.add(null);
                        dvdPlayer.add(null);
                        dvdPlayer.set(0, new MediaPlayer(dvdM1));
                        dvdTrailer.set(0, new MediaView(dvdPlayer.get(0)));

                        ////////////////////// add media 2/////////////////////
                        Media dvdM2 = new Media(new File("src\\hust\\soict\\khmt\\picture\\DVD\\star_wars_trailer.mp4").toURI().toString());
                        dvdTrailer.add(null);
                        dvdPlayer.add(null);
                        dvdPlayer.set(1, new MediaPlayer(dvdM2));
                        dvdTrailer.set(1, new MediaView(dvdPlayer.get(1)));

                        ////////////////////// add media 3////////////////////////
                        Media dvdM3 = new Media(new File("src\\hust\\soict\\khmt\\picture\\DVD\\aladdin_trailer.mp4").toURI().toString());
                        dvdTrailer.add(null);
                        dvdPlayer.add(null);
                        dvdPlayer.set(2, new MediaPlayer(dvdM3));
                        dvdTrailer.set(2, new MediaView(dvdPlayer.get(2)));

                        ArrayList<AnchorPane> listDvdPane = new ArrayList<>();
                        ArrayList<Label> listDvdLabel = new ArrayList<>();
                        ArrayList<TextArea> listDvdText = new ArrayList<>();
                        ArrayList<Button> listDvdAdd = new ArrayList<>();
                        ArrayList<Button> listDvdSub = new ArrayList<>();
                        ArrayList<TextField> listDvdBuy = new ArrayList<>();
                        ArrayList<ImageView> playImage = new ArrayList<>();

                        ////////////////////////// Set dvd order interface

                        for (int i = 0; i < dvd.toArray().length; i++) {
                            listDvdPane.add(new AnchorPane());
                            listDvdPane.get(i).setLayoutX(50);
                            listDvdPane.get(i).setLayoutY(160 + 350 * i);

                            listDvdImage.add(null);
                            listDvdImage.set(i, new ImageView(dvd.get(i).getImage()));
                            listDvdImage.get(i).setFitWidth(289);
                            listDvdImage.get(i).setFitHeight(309);

                            listDvdLabel.add(new Label(dvd.get(i).getTitle()));
                            listDvdLabel.get(i).setStyle("-fx-font: 25 System; -fx-text-fill: #45e312");
                            listDvdLabel.get(i).setPrefHeight(36);
                            listDvdLabel.get(i).setLayoutX(350);

                            listDvdText.add(new TextArea());
                            listDvdText.get(i).setText("Director: " + dvd.get(i).getDirector() + "\n"
                                    + "Category: " + dvd.get(i).getCategory() + "\n"
                                    + "Length: " + dvd.get(i).getLength() + "\n"
                                    + "Cost: " + dvd.get(i).getCost() + "\n"
                                    + "Id: " + dvd.get(i).getId() + "\n");
                            listDvdText.get(i).setStyle("-fx-font: 12 System");
                            listDvdText.get(i).setLayoutX(300);
                            listDvdText.get(i).setLayoutY(50);

                            listDvdAdd.add(i, new Button("Add"));
                            listDvdAdd.get(i).setStyle("fx-font: 20 System");
                            listDvdAdd.get(i).setLayoutX(863);
                            listDvdAdd.get(i).setLayoutY(49);
                            listDvdAdd.get(i).setPrefWidth(65);
                            listDvdAdd.get(i).setPrefHeight(44);

                            listDvdSub.add(i, new Button("Sub"));
                            listDvdSub.get(i).setStyle("fx-font: 20 System");
                            listDvdSub.get(i).setLayoutX(993);
                            listDvdSub.get(i).setLayoutY(49);
                            listDvdSub.get(i).setPrefWidth(65);
                            listDvdSub.get(i).setPrefHeight(44);

                            final int[] buy = {0};
                            listDvdBuy.add(i, new TextField(buy[0] + ""));
                            listDvdBuy.get(i).setStyle("fx-font: 20 System");
                            listDvdBuy.get(i).setLayoutX(928);
                            listDvdBuy.get(i).setLayoutY(49);
                            listDvdBuy.get(i).setPrefWidth(65);
                            listDvdBuy.get(i).setPrefHeight(44);
                            listDvdBuy.get(i).setEditable(false);

                            int finalI = i;
                            listDvdAdd.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    if (pay == 0) {
                                        if (anOrder.itemsOrdered.size() < anOrder.MAX_NUMBERS_ORDERED) {
                                            anOrder.addMedia(dvd.get(finalI));
                                            buy[0]++;
                                            listDvdBuy.get(finalI).setText(buy[0] + "");
                                        }
                                    }
                                    else {
                                        lockStage.show();
                                    }
                                }
                            });
                            listDvdSub.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    if (pay == 0){
                                        if (buy[0] > 0) {
                                            anOrder.removeMedia(dvd.get(finalI));
                                            buy[0]--;
                                            listDvdBuy.get(finalI).setText(buy[0] + "");
                                        }
                                    }
                                    else {
                                        lockStage.show();
                                    }
                                }
                            });

                            /////////////////////////// play trailer ///////////////////////////////
                            playImage.add(null);
                            playImage.set(i, new ImageView(finalPlay));
                            playImage.get(i).setFitWidth(100);
                            playImage.get(i).setFitHeight(100);
                            playImage.get(i).setLayoutX(920);
                            playImage.get(i).setLayoutY(150);
                            playImage.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    final int[] k = {0};
                                    Group root = new Group();
                                    root.getChildren().add(dvdTrailer.get(finalI));
                                    dvdTrailer.get(finalI).setFitWidth(500);
                                    dvdTrailer.get(finalI).setFitHeight(270);
                                    playImage.get(finalI).setDisable(true);
                                    dvdPlayer.get(finalI).play();
                                    Scene scene = new Scene(root);
                                    Stage stage = new Stage();
                                    stage.setScene(scene);
                                    stage.setTitle(dvd.get(finalI).getTitle() + " trailer");
                                    dvdTrailer.get(finalI).setOnMouseClicked(new EventHandler<MouseEvent>() {
                                        @Override
                                        public void handle(MouseEvent mouseEvent) {
                                            k[0]++;
                                            if (k[0] %2 == 1){
                                                dvdPlayer.get(finalI).pause();
                                            }
                                            else {
                                                dvdPlayer.get(finalI).play();
                                            }
                                        }
                                    });
                                    stage.setResizable(false);
                                    stage.show();
                                    stage.setOnCloseRequest(e -> {
                                        playImage.get(finalI).setDisable(false);
                                        dvdPlayer.get(finalI).stop();
                                    });
                                }
                            });

                            listDvdPane.get(i).getChildren().addAll(listDvdImage.get(i), listDvdLabel.get(i), listDvdText.get(i)
                                    , listDvdAdd.get(i), listDvdBuy.get(i), listDvdSub.get(i), playImage.get(i));
                            listDvdPane.get(i).setStyle("-fx-border-color: #e42312");
                        }

                        container.getChildren().addAll(dvdTitle, dvdSearch);
                        for (int i = 0; i < dvd.toArray().length; i++) {
                            container.getChildren().add(listDvdPane.get(i));
                        }

                        ///////////////////// Search dvd items by search button
                        searchDvdButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
                            @Override
                            public void handle(MouseEvent mouseEvent) {
                                int j = 0;
                                String stringSearchDvd = searchDvd.getText();
                                for (int i = 0; i < dvd.toArray().length; i++) {
                                    if (dvd.get(i).getTitle().contains(stringSearchDvd.trim())) {
                                        listDvdPane.get(i).setLayoutY(160 + 350 * j);
                                        if (container.getChildren().contains(listDvdPane.get(i))) ;
                                        else {
                                            container.getChildren().add(listDvdPane.get(i));
                                        }
                                        j++;
                                    } else {
                                        container.getChildren().remove(listDvdPane.get(i));
                                    }
                                }
                            }
                        });

                        ////////////////////// Search dvd items by Enter
                        searchDvd.setOnKeyPressed(new EventHandler<KeyEvent>() {
                            @Override
                            public void handle(KeyEvent keyEvent) {
                                if (keyEvent.getCode() == KeyCode.ENTER) {
                                    int j = 0;
                                    String stringSearchDvd = searchDvd.getText();
                                    for (int i = 0; i < dvd.toArray().length; i++) {
                                        if (dvd.get(i).getTitle().contains(stringSearchDvd.trim())) {
                                            listDvdPane.get(i).setLayoutY(160 + 350 * j);
                                            if (container.getChildren().contains(listDvdPane.get(i))) ;
                                            else {
                                                container.getChildren().add(listDvdPane.get(i));
                                            }
                                            j++;
                                        } else {
                                            container.getChildren().remove(listDvdPane.get(i));
                                        }
                                    }
                                }
                            }
                        });

                        ImageView buyImage = new ImageView(finalBuy);
                        buyImage.setLayoutX(150);
                        buyImage.setLayoutY(60);
                        buyImage.setFitWidth(110);
                        buyImage.setFitHeight(110);
                        container.getChildren().add(buyImage);
                        if (pay == 0){
                            buyImage.setOnMouseClicked(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    if (anOrder.itemsOrdered.size() >= 1){
                                        for (int i = 0; i < anOrder.itemsOrdered.size(); i++) {
                                            myOrder.addMedia(anOrder.itemsOrdered.get(i));
                                        }
                                        Stage payStage = new Stage();
                                        AnchorPane payPane = new AnchorPane();
                                        Label payLabel = new Label("Your total cost is: " + (anOrder.totalCost() - anOrder.itemsOrdered.get(anOrder.index).getCost()));
                                        payLabel.setStyle("-fx-font: 15 System");
                                        payLabel.setAlignment(Pos.BOTTOM_CENTER);
                                        payLabel.setLayoutX(100);
                                        payLabel.setLayoutY(250);
                                        payPane.getChildren().add(payLabel);
                                        if (anOrder.itemsOrdered.size() > 2) {
                                            anOrder.getALuckyItem();
                                            Label luckyLabel = new Label("You get a lucky item: " + anOrder.itemsOrdered.get(anOrder.index).getTitle());
                                            luckyLabel.setStyle("-fx-font: 15 System");
                                            luckyLabel.setAlignment(Pos.CENTER);
                                            luckyLabel.setLayoutX(100);
                                            luckyLabel.setLayoutY(50);
                                            payPane.getChildren().add(luckyLabel);
                                        }
                                        Scene payScene = new Scene(payPane, 600, 400);
                                        payStage.setScene(payScene);
                                        payStage.show();
                                        pay = 1;
                                        anOrder.itemsOrdered.clear();
                                    }
                                }
                            });
                        }

                        dvdItem.setContent(container);
                        dvdItem.setPannable(true);

                        Scene dvdScence = new Scene(dvdItem, 1360, 720);
                        Stage dvdStage = new Stage();
                        dvdStage.setScene(dvdScence);
                        dvdStage.initModality(Modality.WINDOW_MODAL);
                        dvdStage.initOwner(addOrderWindow);
                        dvdStage.show();
                    }
                });

                cdOrder.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        final AnchorPane container = new AnchorPane();
                        ScrollPane cdItem = new ScrollPane();

                        TextField cdTitle = new TextField("Compact Disc Items");
                        cdTitle.setLayoutX(407);
                        cdTitle.setLayoutY(7);
                        cdTitle.setPrefWidth(386);
                        cdTitle.setPrefHeight(63);
                        cdTitle.setEditable(false);
                        cdTitle.setAlignment(Pos.CENTER);
                        cdTitle.setStyle("-fx-font: 30 System; -fx-text-fill: #e01216");

                        AnchorPane cdSearch = new AnchorPane();
                        cdSearch.setPrefWidth(383);
                        cdSearch.setPrefHeight(51);
                        cdSearch.setLayoutX(973);
                        cdSearch.setLayoutY(83);

                        TextField searchCdText = new TextField("Search");
                        searchCdText.setPrefWidth(68);
                        searchCdText.setPrefHeight(31);
                        searchCdText.setLayoutX(0);
                        searchCdText.setLayoutY(10);
                        searchCdText.setEditable(false);
                        searchCdText.setAlignment(Pos.CENTER);
                        searchCdText.setStyle("-fx-font: 15 System");

                        TextField searchCd = new TextField();
                        searchCd.setPrefWidth(247);
                        searchCd.setPrefHeight(31);
                        searchCd.setLayoutX(68);
                        searchCd.setLayoutY(10);
                        searchCd.setStyle("-fx-font: 15 System");

                        Button searchCdButton = new Button("Enter");
                        searchCdButton.setPrefWidth(55);
                        searchCdButton.setPrefHeight(31);
                        searchCdButton.setLayoutX(314);
                        searchCdButton.setLayoutY(10);
                        searchCdButton.setStyle("-fx-font: 15 System");

                        cdSearch.getChildren().addAll(searchCdText, searchCd, searchCdButton);

                        /////////////////////// add media 1//////////////////
                        Media cdM1 = new Media(new File("src\\hust\\soict\\khmt\\picture\\CD\\conan_trailer.mp4").toURI().toString());
                        cdTrailer.add(null);
                        cdPlayer.add(null);
                        cdPlayer.set(0, new MediaPlayer(cdM1));
                        cdTrailer.set(0, new MediaView(cdPlayer.get(0)));

                        ////////////////////// add media 2/////////////////////
                        Media cdM2 = new Media(new File("src\\hust\\soict\\khmt\\picture\\CD\\doraemon_trailer.mp4").toURI().toString());
                        cdTrailer.add(null);
                        cdPlayer.add(null);
                        cdPlayer.set(1, new MediaPlayer(cdM2));
                        cdTrailer.set(1, new MediaView(cdPlayer.get(1)));

                        ////////////////////// add media 3////////////////////////
                        Media cdM3 = new Media(new File("src\\hust\\soict\\khmt\\picture\\CD\\pokemon_trailer.mp4").toURI().toString());
                        cdTrailer.add(null);
                        cdPlayer.add(null);
                        cdPlayer.set(2, new MediaPlayer(cdM3));
                        cdTrailer.set(2, new MediaView(cdPlayer.get(2)));

                        ArrayList<AnchorPane> listCdPane = new ArrayList<>();
                        ArrayList<Label> listCdLabel = new ArrayList<>();
                        ArrayList<TextArea> listCdText = new ArrayList<>();
                        ArrayList<Button> listCdAdd = new ArrayList<>();
                        ArrayList<Button> listCdSub = new ArrayList<>();
                        ArrayList<TextField> listCdBuy = new ArrayList<>();
                        ArrayList<ImageView> playImage = new ArrayList<>();

                        ////////////////////////// Set dvd order interface

                        for (int i = 0; i < cd.toArray().length; i++) {
                            listCdPane.add(new AnchorPane());
                            listCdPane.get(i).setLayoutX(50);
                            listCdPane.get(i).setLayoutY(160 + 350 * i);

                            listCdImage.add(null);
                            listCdImage.set(i, new ImageView(cd.get(i).getImage()));
                            listCdImage.get(i).setFitWidth(289);
                            listCdImage.get(i).setFitHeight(309);

                            listCdLabel.add(new Label(cd.get(i).getTitle()));
                            listCdLabel.get(i).setStyle("-fx-font: 25 System; -fx-text-fill: #45e312");
                            listCdLabel.get(i).setPrefHeight(36);
                            listCdLabel.get(i).setLayoutX(350);

                            listCdText.add(new TextArea());
                            listCdText.get(i).setText("Artist: " + cd.get(i).getArtist() + "\n"
                                    + "Category: " + cd.get(i).getCategory() + "\n"
                                    + "Length: " + cd.get(i).getLength() + "\n"
                                    + "Cost: " + cd.get(i).getCost() + "\n"
                                    + "Id: " + cd.get(i).getId() + "\n");
                            listCdText.get(i).setStyle("-fx-font: 12 System");
                            listCdText.get(i).setLayoutX(300);
                            listCdText.get(i).setLayoutY(50);

                            listCdAdd.add(i, new Button("Add"));
                            listCdAdd.get(i).setStyle("fx-font: 20 System");
                            listCdAdd.get(i).setLayoutX(863);
                            listCdAdd.get(i).setLayoutY(49);
                            listCdAdd.get(i).setPrefWidth(65);
                            listCdAdd.get(i).setPrefHeight(44);

                            listCdSub.add(i, new Button("Sub"));
                            listCdSub.get(i).setStyle("fx-font: 20 System");
                            listCdSub.get(i).setLayoutX(993);
                            listCdSub.get(i).setLayoutY(49);
                            listCdSub.get(i).setPrefWidth(65);
                            listCdSub.get(i).setPrefHeight(44);

                            final int[] buy = {0};
                            listCdBuy.add(i, new TextField(buy[0] + ""));
                            listCdBuy.get(i).setStyle("fx-font: 20 System");
                            listCdBuy.get(i).setLayoutX(928);
                            listCdBuy.get(i).setLayoutY(49);
                            listCdBuy.get(i).setPrefWidth(65);
                            listCdBuy.get(i).setPrefHeight(44);
                            listCdBuy.get(i).setEditable(false);

                            int finalI = i;
                            listCdAdd.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    if (pay == 0){
                                        if (anOrder.itemsOrdered.size() < anOrder.MAX_NUMBERS_ORDERED) {
                                            anOrder.addMedia(cd.get(finalI));
                                            buy[0]++;
                                            listCdBuy.get(finalI).setText(buy[0] + "");
                                        }
                                    }
                                    else {
                                        lockStage.show();
                                    }
                                }
                            });
                            listCdSub.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    if (pay == 0){
                                        if (buy[0] > 0) {
                                            anOrder.removeMedia(dvd.get(finalI));
                                            buy[0]--;
                                            listCdBuy.get(finalI).setText(buy[0] + "");
                                        }
                                    }
                                    else {
                                        lockStage.show();
                                    }
                                }
                            });

                            /////////////////////////// play trailer ///////////////////////////////
                            playImage.add(null);
                            playImage.set(i, new ImageView(finalPlay));
                            playImage.get(i).setFitWidth(100);
                            playImage.get(i).setFitHeight(100);
                            playImage.get(i).setLayoutX(920);
                            playImage.get(i).setLayoutY(150);
                            playImage.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    final int[] k = {0};
                                    Group root = new Group();
                                    root.getChildren().add(cdTrailer.get(finalI));
                                    cdTrailer.get(finalI).setFitWidth(500);
                                    cdTrailer.get(finalI).setFitHeight(270);
                                    playImage.get(finalI).setDisable(true);
                                    cdPlayer.get(finalI).play();
                                    Scene scene = new Scene(root);
                                    Stage stage = new Stage();
                                    stage.setScene(scene);
                                    stage.setTitle(cd.get(finalI).getTitle() + " trailer");
                                    cdTrailer.get(finalI).setOnMouseClicked(new EventHandler<MouseEvent>() {
                                        @Override
                                        public void handle(MouseEvent mouseEvent) {
                                            k[0]++;
                                            if (k[0] %2 == 1){
                                                cdPlayer.get(finalI).pause();
                                            }
                                            else {
                                                cdPlayer.get(finalI).play();
                                            }
                                        }
                                    });

                                    stage.setResizable(false);
                                    stage.show();
                                    stage.setOnCloseRequest(e -> {
                                        playImage.get(finalI).setDisable(false);
                                        cdPlayer.get(finalI).stop();
                                    });
                                }
                            });

                            listCdPane.get(i).getChildren().addAll(listCdImage.get(i), listCdLabel.get(i), listCdText.get(i)
                                    , listCdAdd.get(i), listCdBuy.get(i), listCdSub.get(i), playImage.get(i));
                            listCdPane.get(i).setStyle("-fx-border-color: #e42312");
                        }

                        container.getChildren().addAll(cdTitle, cdSearch);
                        for (int i = 0; i < cd.toArray().length; i++) {
                            container.getChildren().add(listCdPane.get(i));
                        }

                        ///////////////////// Search dvd items by search button
                        searchCdButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
                            @Override
                            public void handle(MouseEvent mouseEvent) {
                                int j = 0;
                                String stringSearchCd = searchCd.getText();
                                for (int i = 0; i < cd.toArray().length; i++) {
                                    if (cd.get(i).getTitle().contains(stringSearchCd.trim())) {
                                        listCdPane.get(i).setLayoutY(160 + 350 * j);
                                        if (container.getChildren().contains(listCdPane.get(i))) ;
                                        else {
                                            container.getChildren().add(listCdPane.get(i));
                                        }
                                        j++;
                                    } else {
                                        container.getChildren().remove(listCdPane.get(i));
                                    }
                                }
                            }
                        });

                        ////////////////////// Search dvd items by Enter
                        searchCd.setOnKeyPressed(new EventHandler<KeyEvent>() {
                            @Override
                            public void handle(KeyEvent keyEvent) {
                                if (keyEvent.getCode() == KeyCode.ENTER) {
                                    int j = 0;
                                    String stringSearchCd = searchCd.getText();
                                    for (int i = 0; i < cd.toArray().length; i++) {
                                        if (cd.get(i).getTitle().contains(stringSearchCd.trim())) {
                                            listCdPane.get(i).setLayoutY(160 + 350 * j);
                                            if (container.getChildren().contains(listCdPane.get(i))) ;
                                            else {
                                                container.getChildren().add(listCdPane.get(i));
                                            }
                                            j++;
                                        } else {
                                            container.getChildren().remove(listCdPane.get(i));
                                        }
                                    }
                                }
                            }
                        });

                        ImageView buyImage = new ImageView(finalBuy);
                        buyImage.setLayoutX(150);
                        buyImage.setLayoutY(60);
                        buyImage.setFitWidth(110);
                        buyImage.setFitHeight(110);
                        container.getChildren().add(buyImage);
                        if (pay == 0){
                            buyImage.setOnMouseClicked(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    if (anOrder.itemsOrdered.size() > 0){
                                        for (int i = 0; i < anOrder.itemsOrdered.size(); i++) {
                                            myOrder.addMedia(anOrder.itemsOrdered.get(i));
                                        }
                                        Stage payStage = new Stage();
                                        AnchorPane payPane = new AnchorPane();
                                        Label luckyLabel = new Label("You get a lucky item: " + anOrder.itemsOrdered.get(anOrder.index).getTitle());
                                        Label payLabel = new Label("Your total cost is: " +( anOrder.totalCost() - anOrder.itemsOrdered.get(anOrder.index).getCost()));
                                        luckyLabel.setStyle("-fx-font: 15 System");
                                        payLabel.setStyle("-fx-font: 15 System");
                                        luckyLabel.setAlignment(Pos.CENTER);
                                        payLabel.setAlignment(Pos.BOTTOM_CENTER);
                                        luckyLabel.setLayoutX(100);
                                        luckyLabel.setLayoutY(50);
                                        payLabel.setLayoutX(100);
                                        payLabel.setLayoutY(250);
                                        payPane.getChildren().add(payLabel);
                                        if (anOrder.itemsOrdered.size() > 2) {
                                            anOrder.getALuckyItem();
                                            payPane.getChildren().add(luckyLabel);
                                        }
                                        Scene payScene = new Scene(payPane, 600, 400);
                                        payStage.setScene(payScene);
                                        payStage.show();
                                        pay = 1;
                                        anOrder.itemsOrdered.clear();
                                    }
                                }
                            });
                        }

                        cdItem.setContent(container);
                        cdItem.setPannable(true);

                        Scene cdScence = new Scene(cdItem, 1360, 720);
                        Stage cdStage = new Stage();
                        cdStage.setScene(cdScence);
                        cdStage.initModality(Modality.WINDOW_MODAL);
                        cdStage.initOwner(addOrderWindow);
                        cdStage.show();
                    }
                });

                backOrder.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        addOrderWindow.close();
                        primaryStage.show();
                    }
                });

                addOrderWindow.show();
            }
        });

        deleteOrder.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                AnchorPane deleteSearch = new AnchorPane();
                deleteSearch.setPrefWidth(600);
                deleteSearch.setPrefHeight(400);
                deleteSearch.setLayoutX(0);
                deleteSearch.setLayoutY(0);

                TextField searchDeleteText = new TextField("Search");
                searchDeleteText.setPrefWidth(68);
                searchDeleteText.setPrefHeight(31);
                searchDeleteText.setLayoutX(0);
                searchDeleteText.setLayoutY(10);
                searchDeleteText.setEditable(false);
                searchDeleteText.setAlignment(Pos.CENTER);
                searchDeleteText.setStyle("-fx-font: 15 System");

                TextField searchDelete = new TextField();
                searchDelete.setPrefWidth(247);
                searchDelete.setPrefHeight(31);
                searchDelete.setLayoutX(68);
                searchDelete.setLayoutY(10);
                searchDelete.setStyle("-fx-font: 15 System");

                Button searchDeleteButton = new Button("Enter");
                searchDeleteButton.setPrefWidth(55);
                searchDeleteButton.setPrefHeight(31);
                searchDeleteButton.setLayoutX(314);
                searchDeleteButton.setLayoutY(10);
                searchDeleteButton.setStyle("-fx-font: 15 System");

                Pane deleteNotationPane = new Pane();
                deleteNotationPane.setLayoutX(50);
                deleteNotationPane.setLayoutY(200);
                deleteSearch.getChildren().addAll(searchDeleteText, searchDelete, searchDeleteButton, deleteNotationPane);

                ///////////////////// delete media by button
                searchDeleteButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        String stringDeleteSearch = searchDelete.getText();
                        int k = 0;
                        for (int i = 0; i < myOrder.itemsOrdered.size(); i ++) {
                            if (myOrder.itemsOrdered.get(i).getId() == Integer.parseInt(stringDeleteSearch)){
                                Label deleteNotation = new Label("The item " + myOrder.itemsOrdered.get(i).getTitle() + " is deleted !");
                                deleteNotationPane.getChildren().clear();
                                deleteNotationPane.getChildren().add(deleteNotation);
                                k = 1;
                                myOrder.itemsOrdered.remove(i);
                                break;
                            }
                        }
                        if (k == 0) {
                            Label deleteNotation = new Label("There no item has id: " + searchDelete.getText());
                            deleteNotationPane.getChildren().clear();
                            deleteNotationPane.getChildren().add(deleteNotation);
                        }
                    }
                });

                Scene deleteScene = new Scene(deleteSearch, 600, 400);
                Stage deleteStage = new Stage();
                deleteStage.setScene(deleteScene);
                deleteStage.show();
            }
        });

        listItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                final AnchorPane container = new AnchorPane();
                ScrollPane mediaItem = new ScrollPane();

                TextField mediaTitle = new TextField("List items of the order");
                mediaTitle.setLayoutX(407);
                mediaTitle.setLayoutY(7);
                mediaTitle.setPrefWidth(386);
                mediaTitle.setPrefHeight(40);
                mediaTitle.setEditable(false);
                mediaTitle.setAlignment(Pos.CENTER);
                mediaTitle.setStyle("-fx-font: 24 System; -fx-text-fill: #e01216");

                AnchorPane mediaSearch = new AnchorPane();
                mediaSearch.setPrefWidth(383);
                mediaSearch.setPrefHeight(51);
                mediaSearch.setLayoutX(973);
                mediaSearch.setLayoutY(83);

                TextField searchMediaText = new TextField("Search");
                searchMediaText.setPrefWidth(68);
                searchMediaText.setPrefHeight(31);
                searchMediaText.setLayoutX(0);
                searchMediaText.setLayoutY(10);
                searchMediaText.setEditable(false);
                searchMediaText.setAlignment(Pos.CENTER);
                searchMediaText.setStyle("-fx-font: 15 System");

                TextField searchMedia = new TextField();
                searchMedia.setPrefWidth(247);
                searchMedia.setPrefHeight(31);
                searchMedia.setLayoutX(68);
                searchMedia.setLayoutY(10);
                searchMedia.setStyle("-fx-font: 15 System");

                Button searchMediaButton = new Button("Enter");
                searchMediaButton.setPrefWidth(55);
                searchMediaButton.setPrefHeight(31);
                searchMediaButton.setLayoutX(314);
                searchMediaButton.setLayoutY(10);
                searchMediaButton.setStyle("-fx-font: 15 System");

                //////////////////////////  list items interface
                ArrayList<AnchorPane> listMediaPane = new ArrayList<>();
                AnchorPane listBookPane = new AnchorPane();
                AnchorPane listDvdPane = new AnchorPane();
                AnchorPane listCdPane = new AnchorPane();

                TextField listBookTitle = new TextField("List book items");
                listBookTitle.setLayoutX(207);
                listBookTitle.setLayoutY(7);
                listBookTitle.setPrefWidth(386);
                listBookTitle.setPrefHeight(40);
                listBookTitle.setEditable(false);
                listBookTitle.setAlignment(Pos.CENTER);
                listBookTitle.setStyle("-fx-font: 24 System; -fx-text-fill: #e01216");
                listBookPane.getChildren().add(listBookTitle);

                TextField listDvdTitle = new TextField("List digital video disc items");
                listDvdTitle.setLayoutX(207);
                listDvdTitle.setLayoutY(7);
                listDvdTitle.setPrefWidth(386);
                listDvdTitle.setPrefHeight(40);
                listDvdTitle.setEditable(false);
                listDvdTitle.setAlignment(Pos.CENTER);
                listDvdTitle.setStyle("-fx-font: 24 System; -fx-text-fill: #e01216");
                listDvdPane.getChildren().add(listDvdTitle);

                TextField listCdTitle = new TextField("List compact disc items");
                listCdTitle.setLayoutX(207);
                listCdTitle.setLayoutY(7);
                listCdTitle.setPrefWidth(386);
                listCdTitle.setPrefHeight(40);
                listCdTitle.setEditable(false);
                listCdTitle.setAlignment(Pos.CENTER);
                listCdTitle.setStyle("-fx-font: 24 System; -fx-text-fill: #e01216");
                listCdPane.getChildren().add(listCdTitle);

                ArrayList<Label> listMediaLabel = new ArrayList<>();
                ArrayList<TextArea> listMediaText = new ArrayList<>();
                int bookInList = 0;
                int dvdInList = 0;
                int cdInList = 0;

                for (int i = 0; i < myOrder.itemsOrdered.toArray().length; i++) {
                    listMediaPane.add(new AnchorPane());

                    if (listMediaImage.size() < myOrder.itemsOrdered.size()){
                        listMediaImage.add(null);
                    }
                    listMediaImage.set(i, new ImageView(myOrder.itemsOrdered.get(i).getImage()));
                    listMediaImage.get(i).setFitWidth(289);
                    listMediaImage.get(i).setFitHeight(309);

                    listMediaLabel.add(new Label(myOrder.itemsOrdered.get(i).getTitle()));
                    listMediaLabel.get(i).setStyle("-fx-font: 25 System; -fx-text-fill: #45e312");
                    listMediaLabel.get(i).setPrefHeight(36);
                    listMediaLabel.get(i).setLayoutX(350);

                    listMediaText.add(new TextArea());
                    if (myOrder.itemsOrdered.get(i) instanceof Book){
                        listMediaText.get(i).setText("Authors: " + ((Book) myOrder.itemsOrdered.get(i)).getAuthor() + "\n"
                                + "Category: " + myOrder.itemsOrdered.get(i).getCategory() + "\n"
                                + "Cost: " + myOrder.itemsOrdered.get(i).getCost() + "\n"
                                + "Id: " + myOrder.itemsOrdered.get(i).getId() + "\n");
                        listMediaText.get(i).setStyle("-fx-font: 14 System; -fx-border-color: RED");
                        listMediaText.get(i).setLayoutX(300);
                        listMediaText.get(i).setLayoutY(50);
                        listMediaPane.get(i).getChildren().addAll(listMediaImage.get(i), listMediaLabel.get(i), listMediaText.get(i));
                        listMediaPane.get(i).setLayoutY(70 + 350 * bookInList);
                        listMediaPane.get(i).setStyle("-fx-border-color: GREEN");
                        listBookPane.getChildren().add(listMediaPane.get(i));
                        bookInList ++;
                    }
                    if (myOrder.itemsOrdered.get(i) instanceof DigitalVideoDisc){
                        listMediaText.get(i).setText("Director: " + myOrder.itemsOrdered.get(i).getDirector() + "\n"
                                + "Category: " + myOrder.itemsOrdered.get(i).getCategory() + "\n"
                                + "Cost: " + myOrder.itemsOrdered.get(i).getCost() + "\n"
                                + "Length: " + ((DigitalVideoDisc) myOrder.itemsOrdered.get(i)).getLength() + "\n"
                                + "Id: " + myOrder.itemsOrdered.get(i).getId() + "\n");
                        listMediaText.get(i).setStyle("-fx-font: 14 System; -fx-border-color: RED");
                        listMediaText.get(i).setLayoutX(300);
                        listMediaText.get(i).setLayoutY(50);
                        listMediaPane.get(i).getChildren().addAll(listMediaImage.get(i), listMediaLabel.get(i), listMediaText.get(i));
                        listMediaPane.get(i).setLayoutY(70 + 350 * dvdInList);
                        listMediaPane.get(i).setStyle("-fx-border-color: GREEN");
                        listDvdPane.getChildren().add(listMediaPane.get(i));
                        dvdInList ++;
                    }
                    if (myOrder.itemsOrdered.get(i) instanceof CompactDisc){
                        listMediaText.get(i).setText("Director: " + myOrder.itemsOrdered.get(i).getDirector() + "\n"
                                + "Category: " + myOrder.itemsOrdered.get(i).getCategory() + "\n"
                                + "Cost: " + myOrder.itemsOrdered.get(i).getCost() + "\n"
                                + "Length: " + ((CompactDisc) myOrder.itemsOrdered.get(i)).getLength() + "\n"
                                + "Id: " + myOrder.itemsOrdered.get(i).getId() + "\n");
                        listMediaText.get(i).setStyle("-fx-font: 14 System; -fx-border-color: RED");
                        listMediaText.get(i).setLayoutX(300);
                        listMediaText.get(i).setLayoutY(50);
                        listMediaPane.get(i).getChildren().addAll(listMediaImage.get(i), listMediaLabel.get(i), listMediaText.get(i));
                        listMediaPane.get(i).setLayoutY(70 + 350 * cdInList);
                        listMediaPane.get(i).setStyle("-fx-border-color: GREEN");
                        listCdPane.getChildren().add(listMediaPane.get(i));
                        cdInList ++;
                    }

                }
                listBookPane.setPrefWidth(1000);
                listBookPane.setPrefHeight(100 + 350 * bookInList);
                listBookPane.setLayoutX(160);
                listBookPane.setLayoutY(160);
                listBookPane.setStyle("fx-border-color: ORANGE");

                listDvdPane.setPrefWidth(1000);
                listDvdPane.setPrefHeight(100 + 350 * dvdInList);
                listDvdPane.setLayoutX(160);
                listDvdPane.setLayoutY(260 + 350 * bookInList);
                listDvdPane.setStyle("fx-border-color: ORANGE");

                listCdPane.setPrefWidth(1000);
                listCdPane.setPrefHeight(100 + 350 * cdInList);
                listCdPane.setLayoutX(160);
                listCdPane.setLayoutY(350 + 350 * (dvdInList + bookInList));
                listCdPane.setStyle("fx-border-color: ORANGE");

                mediaSearch.getChildren().addAll(searchMediaText, searchMedia, searchMediaButton);
                container.getChildren().addAll(listBookPane, listDvdPane, listCdPane);
                container.getChildren().addAll(mediaTitle, mediaSearch);
                mediaItem.setContent(container);
                Scene scene = new Scene(mediaItem, 1360, 720);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }
        });

        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                primaryStage.close();
            }
        });

        primaryStage.show();
    }
}


