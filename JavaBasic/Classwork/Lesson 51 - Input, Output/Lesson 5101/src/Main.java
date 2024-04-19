import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            Reader fr = new FileReader("C:\\Users\\annyp\\Desktop\\AIT TR\\Java_Projects\\Texts\\1.txt");        //Reader (interface) позволяет читать текстовую информацию из вне
            int res;
            while((res= fr.read())!=-1){
                System.out.print((char)res);
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new RuntimeException(e);
        }catch (IOException e){
            System.out.println("Something went wrong");
            throw new RuntimeException(e);
        }


    }
}