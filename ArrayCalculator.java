import java.util.Scanner;
public class ArrayCalculator{
  public static void main(String[] args){

    System.out.println("How much was your bill?");
    Scanner textTaker = new Scanner(System.in);
    double name = textTaker.nextDouble();
    double tip = .15;
    double total = name * tip;
    System.out.println("Total Tip: "+  total);
    double bill = total + name;
    System.out.println(bill);
    }
  }


// ask user how much bill is
// initialize Scanner
// user types in name. this is a double.
// tip is also a double.
// total is name multiplied by tip.
// system outputs total bill which is a string (total bill) + the double total.
