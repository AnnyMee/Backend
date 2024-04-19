public class BackEndProgrammer extends Programmer{

    public BackEndProgrammer(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "BackEndProgrammer " + getName();
    }
}
