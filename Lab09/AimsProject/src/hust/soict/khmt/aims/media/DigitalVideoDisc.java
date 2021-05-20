package hust.soict.khmt.aims.media;

import javafx.scene.image.Image;

public class DigitalVideoDisc extends Disc implements Playable, Comparable{
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public String getDirector() {
        return director;
    }

    @Override
    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public void setImage(Image image) {
        this.image = image;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public DigitalVideoDisc(String title) {
        super(title);
        this.title =title;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(director);
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    @Override
    public int compareTo(Object o) {

        return 0;
    }
}