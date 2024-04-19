public class NamesHandler {
    private String[] names;

    public NamesHandler(String[] names) {
        this.names = names;
    }
    public NamesHandler(String names) {

        this.names = names.split(",");
    }

    public String toString() {
        return "Name: " + String.join(",", names);
    }

    public String[] getNames() {
        return names;
    }
}