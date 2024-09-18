package Array.Basic;

public class LastIndexOfOne {

    public static int lastIndex(String str) {
        int index = -1;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1'){
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String str = "001100000";
        System.out.println(lastIndex(str));
    }
}
