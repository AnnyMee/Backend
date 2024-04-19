public class Duck extends Animal implements Swimming, Running, RunningAndSwimming{
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                '}';
    }
    public void run(){
        System.out.println("I'm a duck. I run hilariously.");
    }
    public void swim(){
        System.out.println("I'm a duck. I swim pretty good.");
    }
    public void fly(){
        System.out.println("I'm a duck. I fly pretty far.");
    }
}
