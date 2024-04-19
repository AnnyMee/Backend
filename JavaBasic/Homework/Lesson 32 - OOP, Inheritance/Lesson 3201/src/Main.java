/*
В этом задание мы будем выращивать сад (как тамагочи, только для сада). Вам необходимо реализовать три класса: Дерево, Куст, Цветок.
Для каждого растения задается название и на сколько сантиметров оно вырастает весной. Кроме того:
Для кустов и деревьев задается начальный размер саженца.
Для деревьев задается еще и максимальная высота, после которой дерево не растет.

Далее действуют следующие правила:
                            лето                    осень                    зима
                    % от роста весной       % от роста весной           % от роста весной
деревья                     100                       50                      30
кусты                       50                        20                      0
цветы                       110                       0                       0

Т.е. например, есть куст, который растет весной на 10см.
Тогда за лето он вырастает на 5см (т.е. 50% от весеннего роста), за осень еще на 2см (20% от весеннего роста) и зимой не растет.

Время года - свойство заданное в растение и задаваемое сеттером.
В Main у вас должен быть реализован
1. массив растений.
2. метод, который меняет сезон у всех растений.
3. метод, который заставляет все растения расти в соответствие с их правилами и сезоном.
4. метод, который выводит текущее состояние сада, т.е. распечатывает все растения.
 */
public class Main {
    public static void main(String[] args) {

        Plant tree1 = new Tree("Oak",15,60,460);
        Plant bush1 = new Bush("Currant",10,15);
        Plant flower1 = new Flower("Tulip",12);

        /*
        double a = 7.3;
        System.out.println(Math.floor(a)); //(as floor) estimating downwards
        System.out.println(Math.ceil(a));  //(as ceiling) estimating upwards
        System.out.println(Math.round(a)); //estimating as per math rules

         */

        Plant[] plants = {tree1,bush1,flower1};
        print(plants);

        System.out.println("----------- grow spring -----------");
        setSeason(plants,"spring");
        grow(plants);
        print(plants);

        System.out.println("----------- grow summer -----------");
        setSeason(plants,"summer");
        grow(plants);
        print(plants);

        System.out.println("----------- grow autumn -----------");
        setSeason(plants,"autumn");
        grow(plants);
        print(plants);

        System.out.println("----------- grow winter -----------");
        setSeason(plants,"winter");
        grow(plants);
        print(plants);


    }
    public static void print(Plant[] garden){
        for (Plant plant : garden){
            System.out.println(plant);
        }
    }
    public static void setSeason(Plant[] garden, String season){
        for (Plant plant : garden){
            plant.setSeason(season);
        }
    }
    public static void grow(Plant[] garden) {
        for (Plant plant : garden) {
            plant.grow();
        }
    }
}