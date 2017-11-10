public class InTheFuture {
 public static void main(String[] args) {
  System.out.println(minNum(4, 5, 1));
 }
 public static int minNum(int A, int K, int P) {
  int aasha = A + P;
  int kelly = K;
  int days = 1;
  // kelly cannot surpass aasha
  if (K <= A)
   return -1;
  // Repeat until kelly surpasses aasha
  while (kelly <= aasha) {
   aasha += A;
   kelly += K;
   days++;
  }
  // Yippe kelly surpassed aasha
  return days;
 }
}