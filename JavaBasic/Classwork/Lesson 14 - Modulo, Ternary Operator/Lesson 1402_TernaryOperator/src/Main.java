public class Main {
    public static void main(String[] args) {
        int result = countChar("I'm glad learning Java programming language!", 'a');

    }
    public static int countChar (String str, char ch){

        int i;
        for (i = 0; i < 100 && i < str.length(); i++) {
            ch = str.charAt(i);

            System.out.println("i в цикле = " + i);
        }
        System.out.println(i);
        System.out.println("--------------------------");
        /*
        if (str.length() > 12) {
            i = 12;
        } else {
            i = str.length();
        }

         */
        for (i = (str.length()>12 ? 12 : str.length()); i >= 0; i--) ; //это формула для перебирания строки с конца к началу
        return i;
    }


}