//method to compute number of ways
// in which N can be represented as sum of
// consecutive number
public class ConsecutiveSum {
 static int consecutive(long num) {
   int count = 0;
   for (int L = 1; L * (L + 1) < 2 * num; L++) {
    float a = (float)((1.0 * num - (L * (L + 1)) / 2) / (L + 1));
    if (a - (int) a == 0.0)
     count++;
   }
   return count;
  }
  // Driver code to test above function
 public static void main(String[] args) {
  long num = 15;
  System.out.println(consecutive(num));
  num = 10;
  System.out.println(consecutive(num));
 }
}