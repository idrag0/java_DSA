package Java_Core;

class charAt {
    private boolean vowel(char s){
        if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' ){
            return true;
        }

        return false;
    }

    private int validWord(String s){
        int n = s.length()-1;
        if(vowel(s.charAt(0)) && vowel(s.charAt(n))){
            System.out.println("valid word : "+ s +1);
            return 1;
        }

        System.out.println("valid word : "+ s +0);

        return 0;
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int size = words.length;
        int n = queries.length;
        int m = queries[0].length;
        int ans[] = new int[n];

        for(int i=0;i<n;i++){
            int start = queries[i][0]; // start range
            int end = queries[i][1]; // end range
            int count = 0;

            if(start < end){
                for(int j=start ; j<=end; j++){
                    String s = words[j];
                    count += validWord(s);
                }
            }else{
                String s = words[i];
                count += validWord(s);
            }


            ans[i] = count;
        }

        return ans;
    }

    public static void main(String[] args) {
        charAt obj = new charAt();
        String words[] = {"aba","bcb","ece","aa","e"};
        int queries[][] = {{0,2},{1,3},{2,3}};
        
        int ans[] = obj.vowelStrings(words, queries);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}