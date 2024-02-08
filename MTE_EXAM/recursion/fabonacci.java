package exam_practise.recursion;

public class fabonacci {
public static int fab(int n){
    if(n==0 || n==1){
        return n;

    }

    return fab(n-1)+fab(n-2);
}

public static void main(String[] args) {
    for(int i=0;i<7;i++){
        System.out.print(fab(i)+" ");
    }
}
}
