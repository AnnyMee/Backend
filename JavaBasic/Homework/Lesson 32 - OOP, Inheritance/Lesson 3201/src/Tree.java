public class Tree extends Plant {
    private final double maxHeight;
    private final int SUMMER_GROW = 100;
    private final int AUTUMN_GROW = 50;
    private final int WINTER_GROW = 30;


    public Tree(String name, double springGrowth, double seedlingHeight, double maxHeight) {
        super(name, springGrowth, seedlingHeight);
        this.maxHeight = maxHeight;
    }
    @Override
    public int getSummerGrowFactor() {
        return SUMMER_GROW;
    }

    @Override
    public int getAutumnGrowFactor() {
        return AUTUMN_GROW;
    }

    @Override
    public int getWinterGrowFactor() {
        return WINTER_GROW;
    }

    @Override
    public double calcSeasonGrow(int factor){
        double change = (double)Math.round(getSpringGrowth()/100.0 * factor);
        return getHeight()+change> maxHeight ? maxHeight-getHeight() : change;
    }
}