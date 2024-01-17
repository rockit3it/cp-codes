import java.util.*;

public class consumer{
    public static int fact(int length){
        if(length == 0 || length == 1){
            return 1;
        }
        return length * fact(length-1);
    }
    public static void permute(int arr[]){

    }
    public static void main(String[] args){
        int arr[] = {1,2,1};
        int fact = fact(arr.length);
        }
}