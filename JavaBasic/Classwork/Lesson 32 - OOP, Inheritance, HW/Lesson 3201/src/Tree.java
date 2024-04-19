public class Tree extends Plant {
    private final double maxHeight;
    private final int SUMMER_GROW = 100;
    private final int AUTUMN_GROW = 50;
    private final int WINTER_GROW = 30;


    public Tree(String name, double springGrowth, double seedlingHeight, double maxHeight) {
        super(name, springGrowth, seedlingHeight);
        this.maxHeight = maxHeight;
    }

    public void grow(){
        switch (getSeason()){
            case "spring": setHeight(getHeight()+getSpringGrowth());break;
            case "summer": seasonGrow(SUMMER_GROW);break;
            case "autumn": seasonGrow(AUTUMN_GROW);break;
            case "winter": seasonGrow(WINTER_GROW);break;
        }
    }
    private void seasonGrow(int factor){
        setHeight(getHeight()+getSpringGrowth()*factor/100);
    }
}
