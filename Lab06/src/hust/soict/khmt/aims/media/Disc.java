package hust.soict.khmt.aims.media;

public class Disc extends Media {
    private int length;
    private String director;

    public Disc(String title) {
        super(title);
    }
    @Override
    public int getLength() {
        return length;
    }
    @Override
    public String getDirector() {
        return director;
    }
}
