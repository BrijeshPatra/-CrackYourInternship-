package strings_day_3;

public class ReverseString {
    public String reverseWords(String s) {
        String[]words=s.split(" ");
        StringBuilder result=new StringBuilder();

        for(int i= words.length-1;i>0;i--){
            if (!words[i].isEmpty()){
                result.append(words[i]);
                result.append(" ");
            }
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {

    }
}
