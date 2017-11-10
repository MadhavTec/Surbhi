public class PsychometricTesting {
 static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
  int[] Finalarray = new int[lowerLimits.length];
  int finalIndex = 0;
  int count = 0;
  for (int q = 0; q < lowerLimits.length; q++) {
   int LL = lowerLimits[q];
   int UL = upperLimits[q];
   count = 0;
   for (int i = 0; i < scores.length; i++) {
    if (scores[i] >= LL && scores[i] <= UL) {
     count++;
    }
   }
   Finalarray[finalIndex] = count;
   finalIndex++;
  }
  return Finalarray;
 }
 public static void main(String[] args) {
  int scores[] = {
   4,
   8,
   7
  };
  int lowerLimits[] = {
   2,
   4
  };
  int upperLimits[] = {
   8,
   4
  };
  int[] result = (jobOffers(scores, lowerLimits, upperLimits));
  for (int i = 0; i < result.length; i++) {
   System.out.println(result[i]);
  }
 }
}