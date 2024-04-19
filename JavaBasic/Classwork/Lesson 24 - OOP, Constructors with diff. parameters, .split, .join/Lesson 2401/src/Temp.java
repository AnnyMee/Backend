public class Temp {
    private int index = 10;

    public String toString(){
        return "Temp: " + index;
    }
    public Temp(){                  //если мы не создаём конструктора в ручную, компилятор создаст его за нас и выглядеть он будет так
        System.out.println("Hello Temp 1");
    }
    public Temp(int index){
        this.index = index;
        System.out.println("Hello Temp 2");
    }
    public Temp (int index, int index2){
        System.out.println("Hello Temp 3");
        this.index = index*index2;
    }
    public Temp(String str){
        System.out.println(str);
        this.index = str.length();
    }
    public Temp(String str, int index) {
        System.out.println(str);
        this.index = index;
    }
    //Выше мы создали пару конструкторов (как положено, с одинаковым именем) с разными параметрами.
    //Так они и отличаются друг от друга, по типу параметров, которые мы туда передаём

    public void print() {

        Temp temp1 = new Temp();
        System.out.println(temp1);

        Temp temp2 = new Temp(100);
        System.out.println(temp2);

        Temp temp3 = new Temp(7, 2);
        System.out.println(temp3);

        Temp temp4 = new Temp("Hello Temp 4!");
        System.out.println(temp4);

        Temp temp5 = new Temp("Hello Temp 5!", 5);
        System.out.println(temp5);

        System.out.println("-".repeat(40));
        String str = "qw1,we2,tyeu3,wtt4";
        String[] strings = str.split(",");          //ещё один метод string, разделяет строку по наитию символа, который мы ему задаём
        for (String s : strings){
            System.out.println(s);
        }
    }
}
