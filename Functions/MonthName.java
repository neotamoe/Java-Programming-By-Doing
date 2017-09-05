public class MonthName {
  public static void main( String[] args ){
    System.out.println( "Month 1: " + month_name(1) );
    System.out.println( "Month 2: " + month_name(2) );
    System.out.println( "Month 3: " + month_name(3) );
    System.out.println( "Month 4: " + month_name(4) );
    System.out.println( "Month 5: " + month_name(5) );
    System.out.println( "Month 6: " + month_name(6) );
    System.out.println( "Month 7: " + month_name(7) );
    System.out.println( "Month 8: " + month_name(8) );
    System.out.println( "Month 9: " + month_name(9) );
    System.out.println( "Month 10: " + month_name(10) );
    System.out.println( "Month 11: " + month_name(11) );
    System.out.println( "Month 12: " + month_name(12) );
    System.out.println( "Month 43: " + month_name(43) );
  }

  public static String month_name (int month){
    String name;
    if (month==1){
      name = "January";
    } else if (month==2){
      name = "February";
    } else if (month==3){
      name = "March";
    } else if (month==4){
      name = "April";
    } else if (month==5){
      name = "May";
    } else if (month==6){
      name = "June";
    } else if (month==7){
      name = "July";
    } else if (month==8){
      name = "August";
    } else if (month==9){
      name = "September";
    } else if (month==10){
      name = "October";
    } else if (month==11){
      name = "November";
    } else if (month==12){
      name = "December";
    } else {
      name = "error";
    }
    return name;
  }
}
