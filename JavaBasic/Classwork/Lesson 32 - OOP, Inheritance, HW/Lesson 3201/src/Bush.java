public class Bush extends Plant {

    private final int SUMMER_GROW = 50;
    private final int AUTUMN_GROW = 20;
    private final int WINTER_GROW = 0;
    public Bush(String name, double springGrowth, double seedlingHeight) {
        super(name, springGrowth, seedlingHeight);

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