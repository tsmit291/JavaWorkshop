public class ArrayMaker {
  private int mine = 2;
  public int yours = 4;
  public static void main(String[] args){
    int[] anArray = new int[]{1,2,3,4,5,6};
    int total = 0;
    for(int i=0; i<anArray.length; i++) {
      total += anArray[i];
    }
  }
}
