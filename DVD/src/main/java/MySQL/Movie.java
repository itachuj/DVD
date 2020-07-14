package MySQL;

import java.util.Date;

public class Movie {
    private int id;
    private String title;
    private String genre;
    private String director;
    private Date date;
    private boolean Borrowed;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isBorrowed() {
        return Borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        Borrowed = borrowed;
    }
}
