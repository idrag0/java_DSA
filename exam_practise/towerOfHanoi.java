package exam_practise;

public class towerOfHanoi {
    public static void hanoi(int n,char S,char Tr,char Au){
        if(n==0)
        return;

        hanoi(n-1,S,Au,Tr);
        System.out.print("Disk "+n+" "+S+" -> "+Tr+"\n");
        hanoi(n-1,Au,Tr,S);
    }
    public static void main(String args[]){
        int n=4;
        hanoi(n, 'A', 'C', 'B');
    }
}
