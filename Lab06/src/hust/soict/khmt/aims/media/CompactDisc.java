package hust.soict.khmt.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String title;
    private String category;
    private float cost;
    private String artist;
    private ArrayList<Track> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public CompactDisc(String title, String title1) {
        super(title);
        this.title = title1;
    }

    public CompactDisc(String title) {
        super(title);
    }
    public boolean checkTrack(){
        for (int i = 0; i < tracks.size(); i++){
            if(tracks.get(i).getTitle().equals(this.title)){
                return true;
            }
        }
        return false;
    }
    public String addTrack(Track track){
        return "track was added";
    }

    @Override
    public void play() {
        for (int i = 0; i < tracks.size(); i++){
            tracks.get(i).play();
        }
    }
}
