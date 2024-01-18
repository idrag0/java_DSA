package java_strings;
import java.util.*;

public class palimdrome{
    public static boolean validchar(char ch){
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>=1 && ch<=9){
            return true;
        }
        return false;
    }
    // char toLowerCase(char ch){
    //     if(ch>='a' && ch<='z' || ch>=1 && ch<=9){
    //         return ch;
    //     }
    //     else{
    //         char temp= ch-'A' +'a';
    //         return temp;
    //     }
    // }
    public static boolean checkPalindrome(String str){

        String newStr="";
        
        for(int i=0;i<str.length();i++){
            if( validchar(str.charAt(i)) ){
                newStr += str.charAt(i);
            }
        }
        newStr.toLowerCase();

        int start=0;
        int end=newStr.length()-1;

        while (start<=end) {
            if(newStr.charAt(start)!=newStr.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
            
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your String: ");
        String str = sc.nextLine();

        System.out.print("String is palindrome : "+ checkPalindrome(str));
    }
}
