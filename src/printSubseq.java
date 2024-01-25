import java.util.*;

public class printSubseq {
    public static void genrate(String text, String temp, int idx){
        if(idx == text.length()){
            System.out.println(temp);
            return;
        }
        genrate(text, temp + text.charAt(idx), idx+1);
        genrate(text, temp, idx+1);
    }
    public static void main(String[] args) {
        String text1 = "weare";
        genrate(text1, "", 0);
    }
}
