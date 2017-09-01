public class CompareToChallenge {
  public static void main (String[] args){
    System.out.print("Comparing \"axe\" with \"dog\" produces ");
    int i = "axe".compareTo("dog");
    System.out.println(i); // -

    System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
    System.out.println("applebee's".compareTo("apple")); // +

    System.out.print( "Comparing \"Eli\" with \"Sam\" produces ");
    System.out.println( "Eli".compareTo("Sam")); // -

    System.out.print( "Comparing \"Superbly\" with \"Excellent\" produces ");
    System.out.println( "Superbly".compareTo("Excellent"));  // +

    System.out.print( "Comparing \"supercali\" with \"go\" produces ");
    System.out.println("supercali".compareTo("go"));  // +

    System.out.print( "Comparing \"cat\" with \"cat\" produces ");
    System.out.println("cat".compareTo("cat")); // 0

    System.out.print( "Comparing \"Ape\" with \"ape\" produces ");
    System.out.println("Ape".compareTo("ape")); // -

  }
}
