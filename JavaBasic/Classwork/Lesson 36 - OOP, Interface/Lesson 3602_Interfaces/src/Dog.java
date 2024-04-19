public class Dog extends Animal implements Swimming, Jumping, Running, RunningAndSwimming{

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
    public void run(){
        System.out.println("I'm a dog. I run");
    }

    public void swim(){
        System.out.println("I'm a dog. I swim, but not too far.");
    }
    public void jump(){
        System.out.println("I'm a dog. I jump, but not too high");
    }
}
