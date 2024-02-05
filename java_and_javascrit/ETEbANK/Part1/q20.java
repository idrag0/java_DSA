package Part1;

public class q20 {
    
    public static void main(String args[]){
        int count=0;
        int sum=0;

        for(int i=50;i<=150;i++){
            if(i%13==0){
                count++;
                sum+=i;
            }
        }

        System.out.println("Count: "+count);
        System.out.println("Sum: "+sum);
    }
}
 