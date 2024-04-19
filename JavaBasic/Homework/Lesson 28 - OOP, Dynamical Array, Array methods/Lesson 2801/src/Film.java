public class Film {
    private String name;
    private String country;
    private int year;


    public Film (String name,String country, int year){
        this.name = name;
        this.country = country;
        this.year = year;
    }
    public String toString(){

        return "Name: " + name + " (" + year + ") Country: " + country;
    }

    public String getName() {
        return name;
    }
}