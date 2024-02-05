package Part1;

public class q11 {
    public static int countWord(String str, String subStr) {
        str.toLowerCase();
        subStr.toLowerCase();

        String[] words = str.split("\\s+");

        int count=0;
        for (String word : words) {
            if (word.equals(subStr)) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String str = "Java is a programming language. Java is a platform. Java is an Island.";
        String subStr = "Java";
        System.out.println("Number of occurrences of the word 'Java' in the given string: " + countWord(str, subStr));
    }
}
