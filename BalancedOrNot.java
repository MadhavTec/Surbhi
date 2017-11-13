import java.util.Stack;

public class BalancedOrNot {
 static int[] balancedOrNotFun(String[] expressions, int[] maxReplacements) {
  int[] isBalancedOrNot = new int[expressions.length];
  int b = 0;
  for (String expression: expressions) {
   boolean isBalanced = false;
   Stack < Character > balancedStack = new Stack < > ();
   for (char c: expression.toCharArray()) {
    switch (c) {
     case '<':
      balancedStack.push(c);
      break; //optional  
     case '>':
      if (!balancedStack.isEmpty() && balancedStack.peek() == '<') {
       isBalanced = true;
       balancedStack.pop();
      } else
       balancedStack.push(c);
      //code to be executed;    
      break; //optional   

     default:
      balancedStack.push(c);
    }

   }
   if (!balancedStack.isEmpty()) {
    isBalanced = false;
    int unmatched = 0;
    while (!balancedStack.isEmpty()) {
     if (balancedStack.pop() == '>') {
      unmatched++;
     }
    }
    if (unmatched == maxReplacements[b])
     isBalanced = true;
   }
   if (isBalanced == true)
    isBalancedOrNot[b] = 1;
   b++;
  }
  return isBalancedOrNot;
 }
 public static void main(String[] args) {
  String expressions[] = {
   "<>",
   "<>><"
  };
  int maxReplacements[] = {
   1,
   0
  };
  int[] results = (balancedOrNotFun(expressions, maxReplacements));
  for (int i = 0; i < results.length; i++) {
   System.out.println(results[i]);
  }
 }
}
