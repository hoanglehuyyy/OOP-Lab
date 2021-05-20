package hust.soict.khmt.aims.media;
public abstract class Media {
    private String title;
    private String category;
    private String director;
    private float cost;
    private int length;
    private int id;

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
    public Media(){

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
    public int getLength() {
        return length;
    }

}