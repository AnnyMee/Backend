public class Movie {
    private String title;
    private String country;
    private int year;

    public Movie(String title, String country, int year){
        this.title = title;
        this.country = country;
        this.year = year;
    }
    public String toString(){
        return "Title: " + "\"" + title + "\"" + " (" + year + ")/" + country;
    }
}
