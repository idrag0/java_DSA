package exam_practise.recursion;

public class factorail {
    public static int facto(int n){
        if(n==0)
        return 1;

        int smallP=facto(n-1);
        int bigP=n*smallP;

        return bigP;

    }

    public static void main(String[] args) {
        int ny=facto(5);

        System.out.println(ny);
    }
}
