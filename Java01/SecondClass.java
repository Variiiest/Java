public class Main {
  public static void main(String[] args) {
    final int num = 15;
    num = 20; // will generate an error because of final
    
    System.out.println(num);
  }
}
