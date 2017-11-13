public class LargestSubsetSum {

 static long[] maxSubsetSum(int[] k) {
  int index = 0;
  long[] sums = new long[k.length];
  for (int j = 0; j < k.length; j++) {
   int item = k[j];
   int max = 0;
   for (int i = 1; i <= item; i++) {
    if (item % i == 0) {
     max = max + i;
    }
   }
   sums[index] = max;
   index++;
  }
  return sums;
 }
 public static void main(String[] args) {
  int input[] = {
   2,
   6
  };
  long[] results = (maxSubsetSum(input));
  for (int i = 0; i < results.length; i++) {
   System.out.println(results[i]);
  }
 }
}