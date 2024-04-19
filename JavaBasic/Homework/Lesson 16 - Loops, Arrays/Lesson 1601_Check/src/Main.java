/*
Дан массив строк. Необходимо написать метод, который все строки в этом массиве, которые длиннее 5 символов,
обрежет до первых 5 символов и добавит в конце "[+]"
Например: {"Hello Java", "Jack", "Ann is a programmer", "She has a good offer"} ->
{"Hello[+]", "Jack", "Ann i[+]", "She h[+]"}
способ создав второй массив:
 */
public class Main {
    public static void main(String[] args) {
        String[] sentences = {"Hello Java", "Jack", "Ann is a programmer", "She has a good offer"};
        int limit = 4;
        printArray(sentences);
        System.out.println();

        String[] newArray = transformStringsArray(sentences, limit);
        printArray(newArray);
    }
    public static String[] transformStringsArray(String[] array, int limit){
        String[] result = new String[array.length];
        for (int i=0; i< array.length; i++){                // for (String str : array){
            result[i] = array[i].length()>=limit ? transformString(array[i],limit) : array[i] ;       //ternar way
        }
        return result;
    }
    public static String transformString (String str, int limit){
        return str.substring(0,limit) + "[+] ";
    }
    public static void printArray(String[] array) {
        for (String str : array) {
            System.out.println(str);
        }
    }
}
/* initial way:
            if (str[i].length()>=5){
                System.out.print(str[i].substring(0,5)+ "[+],  ");
            }else{
                System.out.print(str[i] + ",  ");
            }
            */