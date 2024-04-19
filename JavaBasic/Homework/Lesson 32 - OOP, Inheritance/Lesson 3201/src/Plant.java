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
    public abstract int getSummerGrowFactor();

    public abstract int getAutumnGrowFactor();

    public abstract int getWinterGrowFactor();

    public int getSpringGrowFactor(){
        return 100;
    }

    public void grow() {
        switch (getSeason()){
            case "spring": seasonGrow(getSpringGrowFactor()); break;
            case "summer": seasonGrow(getSummerGrowFactor());break;
            case "autumn": seasonGrow(getAutumnGrowFactor());;break;
            case "winter": seasonGrow(getWinterGrowFactor());;break;
        }
    }
    private void seasonGrow(int factor){
        height += calcSeasonGrow(factor);
    }
    public double calcSeasonGrow(int factor){
        return (double) Math.round(getSpringGrowth()/100.0 * factor);
    }
}
