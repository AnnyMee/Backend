/*
Дано два массива.
Первый - массив с именами студентов.
Второй (такой же длинны, как и первый) - количество пропущенных занятий.
Написать метод, который вернет имя студента, прогулявшего больше всех.
В рамках данной задачи, если есть несколько студентов с одинаковым количеством прогулов,
можно вернуть имя любого из них.
 */

public class Main {
    public static void main(String[] args) {
        String[] nameOfStudents = {"Mariia", "Ivan", "Clarice", "Victoria", "Alejandro", "Vladimir"};
        int[] absentLessons = {2, 0, 6, 5, 8, 7};

        System.out.println(nameOfStudents[indexOfMaxAbsences(absentLessons)]);
    }
    public static int indexOfMaxAbsences(int[] lessons) {

        int maxIndex = 0;
        for (int i = 1; i < lessons.length; i++) {
            if (lessons[maxIndex] < lessons[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}