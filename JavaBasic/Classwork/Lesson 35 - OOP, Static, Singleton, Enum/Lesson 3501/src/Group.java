public class Group {
    // singleton - шаблон, который решает следующую задачу: можно создать только один объект для данного класса
    //первый способ реализации
    private String title;
    public static final Group instance = new Group("Группа 37.2");  //константное статическое поле

    private Group(String title) {       //приватный конструктор - ключевой момент для singleton

        this.title = title;
    }

    @Override
    public String toString() {
        return "Group{" +
                "title='" + title + '\'' +
                '}';
    }
}
