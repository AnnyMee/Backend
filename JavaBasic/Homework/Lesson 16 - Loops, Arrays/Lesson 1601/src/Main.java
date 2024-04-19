/*
Дан массив строк. Необходимо написать метод, который все строки в этом массиве, которые длиннее 5 символов,
обрежет до первых 5 символов и добавит в конце "[+]"
Например: {"Hello Java", "Jack", "Ann is a programmer", "She has a good offer"} ->
{"Hello[+]", "Jack", "Ann i[+]", "She h[+]"}
 */
public class Main {
    public static void main(String[] args) {
        String[] sentences = {"Hello Java", "Jack", "Ann is a programmer", "She has a good offer"};
        trim(sentences);
    }
    public static void trim (String[] str){
        for (int i=0; i< str.length; i++){
            if (str[i].length()>=5){
                System.out.print(str[i].substring(0,5)+ "[+],  ");
            }else{
                System.out.print(str[i] + ",  ");
            }
        }
    }
}