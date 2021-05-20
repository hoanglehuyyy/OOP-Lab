package hust.soict.khmt.aims.media;

import java.util.ArrayList;

public class Book extends Media{
    private ArrayList<String> authors = new ArrayList<String>();

    public Book(String title) {
        super(title);
    }
    public Book(String title, String category){
        super(title, category);
    }


    public Book(String title, String category, ArrayList<String> authors){
        super(title, category);
        this.authors = authors;
    }
    public void addAuthor(String atName) {
        int a = 0;
        for( int i = 0; i< this.authors.size(); i++) {
            if(atName.equals(this.authors.get(i))) {
                a = 1;
                break;
            }
        }
        if(a == 0) {
            authors.add(atName);
        }
    }

    public void removeAuthor(String Name) {
        int a = 0;
        for( int i = 0; i< this.authors.size(); i++) {
            if(Name.equals(this.authors.get(i))) {
                a = 1;
                authors.remove(i);
                break;
            }
        }
        if(a == 0) {
            System.out.println("Author '" + Name + "' no exist");
        }
    }

    public ArrayList<String> getAuthor() {
        return authors;
    }

    public void setAuthor(ArrayList <String> author) {
        this.authors = author;
    }
    @Override
    public void setCategory(String category) {
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
    @Override
    public void setId(int id) {
        // TODO Auto-generated method stub
        this.id = id;
    }
}