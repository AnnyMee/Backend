public class FrontEndProgrammer extends Programmer{

    public FrontEndProgrammer(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "FrontEndProgrammer " + getName();
    }
}
