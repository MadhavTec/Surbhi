public class FindTheWinner {
 public static void main(String[] args) {
  int andrea[] = {
   1,
   2,
   3
  };
  int maria[] = {
   2,
   1,
   3
  };
  String gameType = "even";
  System.out.println(winner(andrea, maria, gameType));
 }
 static String winner(int[] andrea, int[] maria, String s) {
  int index = s.toLowerCase().equals("odd") ? 1 : 0;
  int andreaPoints = 0;
  int mariaPoints = 0;
  while (index < andrea.length) {
   andreaPoints += andrea[index] - maria[index];
   mariaPoints += maria[index] - andrea[index];
   index += 2;
  }
  if (andreaPoints > mariaPoints)
   return "Andrea";
  else if (andreaPoints < mariaPoints)
   return "Maria";
  else
   return "Tie";
 }
}