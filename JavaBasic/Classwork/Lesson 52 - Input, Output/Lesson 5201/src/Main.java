import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Main {
   static String pathToFile2 = "C:/Users/annyp/Desktop/AIT TR/Java_Projects/ClassWork/Lesson 52 - Input, Output/ClassWork_52_1/files/file2";
    static String pathToFile1 = "C:/Users/annyp/Desktop/AIT TR/Java_Projects/ClassWork/Lesson 52 - Input, Output/ClassWork_52_1/files/file1";
    public static void main(String[] args) { //вместо конструкции try catch можно приписать методу main "throws Exception"

            String str=read();
        System.out.println(str);
        write(str);
    }
    public static String read() {
        try (InputStream is = new URL("https://www.verbformen.ru/").openStream()) {
            int data;
            StringBuilder res = new StringBuilder();
            while((data = is.read())!=-1){
                //System.out.print((char)data);
                res.append((char) data);
            }
            String result = res.toString();
            System.out.println(result);

        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Exception");;
        }
        return "";

    }
    public static void write(String msg){
        try (OutputStream os = new FileOutputStream(pathToFile2)) {
            byte[] bytes = msg.getBytes();
            for(var b:bytes){
                os.write(b);
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Exception");;
        }

    }
}