import java.util.Scanner;
  public class Input {
    public static void main(String[] args){
      int given = giveNumber();

      System.out.println("yo yo yo! What your name is?");
      Scanner textTaker = new Scanner(System.in);
      String name = textTaker.next();
      System.out.println("What it is " + name);
    }
    public static int giveNumber(){
      return 3;
    }
  }
