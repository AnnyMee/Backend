public class Bush extends Plant {

    private final int SUMMER_GROW = 50;
    private final int AUTUMN_GROW = 20;
    private final int WINTER_GROW = 0;
    public Bush(String name, double springGrowth, double seedlingHeight) {
        super(name, springGrowth, seedlingHeight);
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
}