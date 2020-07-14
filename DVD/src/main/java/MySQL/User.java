package MySQL;

public class User {
    private String name;
    private String surname;
    private int pesel;
    private int numOfBorrowedMovies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public int getNumOfBorrowedMovies() {
        return numOfBorrowedMovies;
    }

    public void setNumOfBorrowedMovies(int numOfBorrowedMovies) {
        this.numOfBorrowedMovies = numOfBorrowedMovies;
    }
}
