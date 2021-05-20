package hust.soict.khmt.aims.media;

public class Disc extends Media {
    private int length;
    private String director;

    public Disc(String title) {
        super(title);
    }

    @Override
    public void setCategory(String category) {
        // TODO Auto-generated method stub
        this.category = category;
    }

    @Override
    public void setTitle(String title) {
        // TODO Auto-generated method stub
        this.title = title;
    }

    @Override
    public void setCost(float cost) {
        // TODO Auto-generated method stub
        this.cost = cost;
    }

    public void setLength(int length) {
        // TODO Auto-generated method stub
        this.length = length;
    }

    @Override
    public void setId(int id) {
        // TODO Auto-generated method stub
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
