import java.util.Scanner;
public class factorial {
    public static int factorials(int number){
        int i,fact=1;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;
    }
}
