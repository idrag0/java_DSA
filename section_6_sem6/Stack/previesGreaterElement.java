package section_6_sem6.Stack;

import java.util.*;

public class previesGreaterElement {
    public static void nextGreaterElem(int arr[]){
        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        // ans[0] = -1;
        
        for(int i=0; i<n; i++){
            while (!st.isEmpty() || st.peek() < arr[i]) {
                st.pop();
            }

            if(!st.isEmpty()){
                ans[i] = st.peek();
            }else {
                ans[i] = -1;
            }
            st.push(arr[i]);
        }

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] +" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,1,4,1,5,9,2,6};

       nextGreaterElem(arr);

        
    }
}
