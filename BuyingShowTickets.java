public class BuyingShowTickets {
 public static int waitingTime(int[] tickets, int p) {
  // Minimum time I have to wait is the number of tickets I want to buy.
  int wTime = tickets[p];
  for (int i = 0; i < tickets.length; i++) {
   if (i == p) continue;
   wTime += (Math.min(tickets[p], tickets[i]));
   if (i > p) {
    wTime--;
   }
  }
  return wTime;
 }
 public static void main(String[] args) {
  int tickets[] = {
   2,
   6,
   3,
   4,
   5
  };
  System.out.println(waitingTime(tickets, 2));
 }
}