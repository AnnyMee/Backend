public abstract class Plant {
    private final String name;
    private final double springGrowth;
    private double height;
    private String season;

    public Plant(String name, double springGrowth) {
        this.name = name;
        this.springGrowth = springGrowth;
    }
    public Plant(String name, double springGrowth, double height) {
        this.name = name;
        this.springGrowth = springGrowth;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Plants{" +
                "name='" + name + '\'' +
                ", springGrowth=" + springGrowth +
                ", height=" + height +
                ", season='" + season + '\'' +
                '}';
    }
    public abstract void grow();

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
    public double getSpringGrowth() {
        return springGrowth;
    }

    public String getSeason() {
        return season;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
