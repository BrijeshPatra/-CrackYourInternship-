package strings_day_1;

public class IndexOfFirstOccurence {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {

    }
}
