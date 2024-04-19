public class NamesHandler {
    private String[] names;

    public NamesHandler(String[] names) {
        this.names = names;
    }
    public NamesHandler(String names) {

        this.names = names.split(",");
    }
    public String toString() {
        return "Name: " + join(",");
    }
    private String join(String delimiter){
        if (names.length==0){
            return "";
        }
        String result = "";
        for(String str : names){
            result = result + str + delimiter;
        }
        return result.substring(0,result.length()-1);
    }
    public String toStringByLength(int length){
        String result = "";
        for(String str : names){
            if(str.length()==length){
                result = result + str + ",";
            }
        }
        return (result.length()==0 ? "" : result.substring(0,result.length()-1));
    }
    public String toStringByStartWith (String sim){
        String result = "";
        for(String str : names){
            if(str.startsWith(sim)){
                result = result + str + ",";
            }
        }
        return (result.length()==0 ? "" : result.substring(0,result.length()-1));
    }
}
