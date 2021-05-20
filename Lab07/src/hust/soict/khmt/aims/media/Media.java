package hust.soict.khmt.aims.media;
public abstract class Media {
    protected String category;
    protected String title;
    protected String director;
    protected float cost;
    protected int id;

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
}