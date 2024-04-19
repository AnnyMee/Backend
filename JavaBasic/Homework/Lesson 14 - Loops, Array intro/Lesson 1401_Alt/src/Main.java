import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password = getPassword();

        System.out.println(validatePassword(password) ? "Password is set" : "Password invalid. Please set a password that has at least 8 characters and at least one digit");
    }

    public static String getPassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input password: ");

        return scanner.nextLine();
    }

    public static boolean validatePassword(String password){

        return checkLength(password)&&checkDigits(password);
    }

    public static boolean checkLength(String password){

        return password.length()>=8;
    }
    public static boolean checkDigits(String password){
        for(int i=0; i<password.length(); i++){
            char current = password.charAt(i);
            if (isDigit(current)){
                return true;
            }
        }
        return false;
    }
    public static boolean isDigit(char current){

        //return current=='0' || current=='1' || current=='2' || current=='3' || current=='4' || current=='5' || current=='6' || current=='7' || current=='8' || current=='9';
        return current>='0' && current<='9';
        //Character.isDigit(current);
    }
}

/*
if (condition){ из метода  isDigit
            return true;
        }else{
            return false;
        }
        можно заменить на просто return (condition);
 */