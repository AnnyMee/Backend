public class Group2 {
    // singleton - шаблон, который решает следующую задачу: можно создать только один объект для данного класса
    //второй способ реализации
    private String title;
    private static Group2 instance = null;  //тут же делаю прайват статик - ниже создам публичный метод

    private Group2(String title) {    //приватный конструктор - ключевой момент для singleton

        this.title = title;
    }

    public static Group2 getInstance (String title){   //создаём публичный метод
        if (instance == null) {
            instance = new Group2(title);
        }
            return instance;
    }

    @Override
    public String toString() {
        return "Group{" +
                "title='" + title + '\'' +
                '}';
    }
}
