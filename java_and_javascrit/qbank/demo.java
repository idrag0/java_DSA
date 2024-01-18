public class RemoveDuplicates {
 public static void main(String[] args) {
 int[] array = {1, 2, 2, 3, 4, 4, 5};
 array = removeDuplicates(array);
 System.out.println("Array after removing duplicates: " +
Arrays.toString(array));
 }
 private static int[] removeDuplicates(int[] array) {
 Set<Integer> set = new HashSet<>();
 for (int num : array) {
 set.add(num);
 }
 int[] result = new int[set.size()];
 int index = 0;
 for (int num : set) {
 result[index++] = num;
 }
 return result;
 }
}