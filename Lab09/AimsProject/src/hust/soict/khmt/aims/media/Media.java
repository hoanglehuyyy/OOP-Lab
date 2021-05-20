package hust.soict.khmt.aims.media;

import javafx.scene.image.Image;

public abstract class Media {
    protected String category;
    protected String title;
    protected String director;
    protected float cost;
    protected int id;
    protected Image image;


    public Image getImage(){
        return image;
    }
    public int getId() {
        return id;
    }
    public String getDirector() {
        return director;
    }

    public Media(String title){
        this.title = title;
    }
    Media(String title, String category){
        this(title);
        this.category = category;
    }

    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public float getCost() {
        return cost;
    }

    public abstract void setCategory(String category);
    public abstract void setTitle(String title);
    public abstract void setCost(float cost);
    public abstract void setId(int id);
    public abstract void setImage(Image image);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Media media = (Media) o;
        return id == media.id;
    }

}