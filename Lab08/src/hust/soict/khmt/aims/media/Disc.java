package hust.soict.khmt.aims.media;

public class Disc extends Media {
    private int length;
    private String director;

    public Disc(String title) {
        super(title);
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getLength() {
        return length;
    }
    @Override
    public String getDirector() {
        return director;
    }
}
