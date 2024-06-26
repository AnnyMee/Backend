/*
Давайте реанимируем наш проект Hotel. Помните, в нем были комнаты разного вида.
Тогда мы умели только хранить список комнат, сейчас Вы знаете гораздо больше.
Давайте превратим на проект в полноценное приложение:

1. Список комнат не должен храниться в коде программы. Он должен быть прочитан из файла при старте программы.
На этом этапе важно следующее: в будущем ваша программа будет получать данные о комнатах из базы данных.
Разрабатывайте программу предполагая легкую замену функционала чтения из файла, функционалом чтения из БД (ключевое слово интерфейс).
Постарайтесь корректно обработать ошибки чтения файла данных (Exception)

2. Попробуем отразить факт бронирования номера. Т.е. вам необходимо будет создать класс Booking,
который отражает информацию о бронирование (даты, номер, клиент и т.д.).
Для хранения дат можно конечно использовать самописные классы, но лучше познакомиться с тем, как в Java работают с датами
(ключевое слово Java DateTime API, классы LocalDate, Duration)

3. На этом этапе необходимо реализовать класс, который управляет списком бронирований. Он должен позволять:
добавить\удалить бронь
получить список всех броней
получить список всех броней по имени
получить список всех броней на дату
получить список всех броней заданного номера, начиная с заданной даты
получить список доступных номеров на заданный интервал дат
получить список доступных номеров, заданной категории, на заданный интервал дат
получить список занятых номеров на заданный интервал дат

Не забудьте проконтролировать, что ваша программа не позволяет бронировать один и тот же номер дважды, на одни и те же даты.

4. На этом этапе стоит “прикрутить” к нашей программе возможность для пользователя добавить бронь с клавиатуры.
Внимательно отнеситесь к обработке ошибок пользователя при вводе данных.

5. Пришло время научиться сохранять данные о бронированиях в файл, чтобы программа не теряла информацию при завершение.
Научите вашу программу сохранять данные при добавлении брони
(кстати, подумайте, в каком формате удобно хранить:
в одном файле, или отдельный файл на бронь или отдельный файл на брони одной комнаты.
У каждого решения есть плюсы и минусы, подумайте какие).
Возможно, вам понадобится вспомнить IO + почитать о методах класса File и Path.
Не забывайте про использование интерфейсов, ведь сервис сохранения данных в файле, может быть заменен сервисом сохранения данных в БД.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}