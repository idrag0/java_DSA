package qbank;
import java.util.*;

public class patter4 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                char ch=(char)('A'+i-1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
}
}
