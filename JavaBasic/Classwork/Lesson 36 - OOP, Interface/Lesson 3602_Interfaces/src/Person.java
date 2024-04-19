public class Person implements Swimming, Jumping, Running, RunningAndSwimming{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
    public void run(){
        System.out.println("I'm a person. I run");
    }

    public void swim(){
        System.out.println("I'm a person. I swim, but not too far.");
    }
    public void jump(){
        System.out.println("I'm a person. I jump, but not too high");
    }
}
