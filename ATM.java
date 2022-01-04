public class ATM {
public int countBanknotes(int sum){
     int [] banknotes = new int []{500, 200, 100, 50, 20, 10 ,5,2,1};
     int qty=0;
     int i = 0;
     int currentQty = 0;
     while (i<9){
         if (sum < banknotes[i]){
             i++;
             continue;
         }
         currentQty =    sum / banknotes[i];
         qty += currentQty;
         sum = sum - banknotes[i] * currentQty;
     }
     return qty;
 }
} 