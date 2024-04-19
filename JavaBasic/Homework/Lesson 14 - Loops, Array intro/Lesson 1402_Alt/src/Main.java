public class Main {
    public static void main(String[] args) {


    }
    public static String insertStr (String target, String source, int position){
        String result = "";
        if (position>=target.length()){
            return target + source;
        }
        if (position<=0){
            return source + target;
        }
        for (int i = 0; i<target.length(); i++){
            if (i==position){
                result += source;
            }
            char current = target.charAt(i);
            result = result+current;
        }
        return result;
    }
}