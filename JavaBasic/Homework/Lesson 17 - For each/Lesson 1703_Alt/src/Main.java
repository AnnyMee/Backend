public class Main {
    public static void main(String[] args) {
        String[] nameOfStudents = {"Mariia", "Ivan", "Clarice", "Victoria", "Alejandro", "Vladimir"};
        int[] absentLessons = {2,0,6,5,8,7};

        printMaxAbsentee(nameOfStudents,absentLessons);
    }
    public static int indexOfMaxAbsences (int[] lessons) {

        int maxIndex = 0;
        for (int i = 1; i < lessons.length; i++) {
            if (lessons[maxIndex] < lessons[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void printMaxAbsentee (String [] names, int[] lessons){

        System.out.println(names[indexOfMaxAbsences(lessons)]);
    }
}