// Number letter counts
// Problem 17
// If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
//
// If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
//
//
// NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.

// NOTE: This code does not work.  It is close, but not quite there.  Argh!

public class NumberLetterCounts{
  public static void main (String[] args){
    int sum = 0;
    String word="";
    // for (int i = 1; i<1001; i++) {
    //   if(i<=20){
    //     if(i==1 || i==2 || i==6 || i==10){
    //       sum += 3;
    //       System.out.println("i: " + i + ", sum: " + sum);
    //     } else if (i==3 || i==7 || i==8){
    //       sum +=5;
    //       System.out.println("i: " + i + ", sum: " + sum);
    //     } else if (i==4 || i==5 || i==9){
    //       sum += 4;
    //       System.out.println("i: " + i + ", sum: " + sum);
    //     } else if(i==11 || i==12 || i==20){
    //       sum +=6;
    //       System.out.println("i: " + i + ", sum: " + sum);
    //     } else if (i==13 || i==14 || i==18 || i==19){
    //       sum += 8;
    //       System.out.println("i: " + i + ", sum: " + sum);
    //     } else if (i==15 || i==16){
    //       sum += 7;
    //       System.out.println("i: " + i + ", sum: " + sum);
    //     } else {
    //       sum += 9;
    //       System.out.println("i: " + i + ", sum: " + sum);
    //     }
    //   }
    // }
    for (int i = 21; i<100; i++) {

      if (i>20 && i<100){
        word = Integer.toString(i);
        if((word.charAt(0)==3 || word.charAt(0)==8 || word.charAt(0)==9) && (word.charAt(1)==0)){
        // if(i==30 || i==80 || i==90){
          sum += 6;
          System.out.println("i: " + i + ", sum: " + sum);
        } else if((word.charAt(0)==4 || word.charAt(0)==5 || word.charAt(0)==6) && (word.charAt(1)==0)){
          sum += 5;
          System.out.println("i: " + i + ", sum: " + sum);
        } else if(word.charAt(0)==7 && word.charAt(1)==0){
          sum +=7;
          System.out.println("i: " + i + ", sum: " + sum);
        } else if ((word.charAt(0)==3 || word.charAt(0)==8 || word.charAt(0)==9 || word.charAt(0)==2) && (word.charAt(1)==1 || word.charAt(0)==2 || word.charAt(0)==6) ){
          sum += 9; // six in thirty, fifty, eighty, ninety, twenty
          System.out.println("i: " + i + ", sum: " + sum);
        } else if ((word.charAt(0)==3 || word.charAt(0)==8 || word.charAt(0)==9 || word.charAt(0)==2) && (word.charAt(1)==4 || word.charAt(0)==5 || word.charAt(0)==9) ){
          sum += 10;
          System.out.println("i: " + i + ", sum: " + sum);
        } else if ((word.charAt(0)==3 || word.charAt(0)==8 || word.charAt(0)==9 || word.charAt(0)==2) && (word.charAt(1)==3 || word.charAt(0)==7 || word.charAt(0)==8) ){
          sum += 11;
          System.out.println("i: " + i + ", sum: " + sum);
        } else if ((word.charAt(0)==4 || word.charAt(0)==5 || word.charAt(0)==6) && (word.charAt(1)==1 || word.charAt(0)==2 || word.charAt(0)==6) ){
          sum += 8; // five in forty, fifty, sixty,
          System.out.println("i: " + i + ", sum: " + sum);
        } else if ((word.charAt(0)==4 || word.charAt(0)==5 || word.charAt(0)==6) && (word.charAt(1)==4 || word.charAt(0)==5 || word.charAt(0)==9) ){
          sum += 9; // five in forty, fifty, sixty,
          System.out.println("i: " + i + ", sum: " + sum);
        } else if ((word.charAt(0)==4 || word.charAt(0)==5 || word.charAt(0)==6) && (word.charAt(1)==3 || word.charAt(0)==7 || word.charAt(0)==8) ){
          sum += 10; // five in forty, fifty, sixty,
          System.out.println("i: " + i + ", sum: " + sum);
        } else if ((word.charAt(0)==7 ) && (word.charAt(1)==1 || word.charAt(0)==2 || word.charAt(0)==6) ){
          sum += 10;          // seven in seventy
          System.out.println("i: " + i + ", sum: " + sum);
        } else if ((word.charAt(0)==7 ) && (word.charAt(1)==4 || word.charAt(0)==5 || word.charAt(0)==9) ){
          sum += 11;
          System.out.println("i: " + i + ", sum: " + sum);
        } else if ((word.charAt(0)==7 ) && (word.charAt(1)==3 || word.charAt(0)==7 || word.charAt(0)==8) ){
          sum += 12;
          System.out.println("i: " + i + ", sum: " + sum);
        }
      }
    }

      // } else if (i>99 && i<1000){
      //   word = Integer.toString(i);
      //   if(word.charAt(0)==1 || word.charAt(0)==2 || word.charAt(0)==6 ){
      //     sum += 10;  // one hundred, two hundred, six hundred
      //     System.out.println("i: " + i + ", sum: " + sum);
      //     if((word.charAt(2)==0) && (word.charAt(1)==3 || word.charAt(1)==8 || word.charAt(1)==9 || word.charAt(1)==2)){
      //       sum +=9;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if((word.charAt(2)==0) && (word.charAt(1)==4 || word.charAt(1)==5 || word.charAt(1)==6)){
      //       sum +=8;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if((word.charAt(2)==0) && (word.charAt(1)==7)){
      //       sum += 10;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==3 || word.charAt(1)==8 || word.charAt(1)==9 || word.charAt(1)==2) && (word.charAt(2)==1 || word.charAt(1)==2 || word.charAt(1)==6) ){
      //       sum += 12; // six in thirty, eighty, ninety, twenty
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==3 || word.charAt(1)==8 || word.charAt(1)==9 || word.charAt(1)==2) && (word.charAt(2)==4 || word.charAt(1)==5 || word.charAt(1)==9) ){
      //       sum += 13;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==3 || word.charAt(1)==8 || word.charAt(1)==9 || word.charAt(1)==2) && (word.charAt(2)==3 || word.charAt(1)==7 || word.charAt(1)==8) ){
      //       sum += 14;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==4 || word.charAt(1)==5 || word.charAt(1)==6) && (word.charAt(2)==1 || word.charAt(1)==2 || word.charAt(1)==6) ){
      //       sum += 11; // five in forty, fifty, sixty,
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==4 || word.charAt(1)==5 || word.charAt(1)==6) && (word.charAt(2)==4 || word.charAt(1)==5 || word.charAt(1)==9) ){
      //       sum += 12; // five in forty, fifty, sixty,
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==4 || word.charAt(1)==5 || word.charAt(1)==6) && (word.charAt(2)==3 || word.charAt(1)==7 || word.charAt(1)==8) ){
      //       sum += 13; // five in forty, fifty, sixty,
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==7 ) && (word.charAt(2)==1 || word.charAt(1)==2 || word.charAt(1)==6) ){
      //       sum += 13;          // seven in seventy
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==7 ) && (word.charAt(2)==4 || word.charAt(1)==5 || word.charAt(1)==9) ){
      //       sum += 14;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==1) && (word.charAt(2)==1 || word.charAt(2)==2)){
      //       sum += 9; // eleven, twelve,
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==1) && (word.charAt(2)==3 || word.charAt(2)==4 || word.charAt(2)==8 || word.charAt(2)==9)){
      //       sum += 11; // thirteen, fourteen, eighteen, nineteen
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==1) && (word.charAt(2)==5 || word.charAt(2)==6) ){
      //       sum += 10; // fifteen, sixteen,
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==1) && (word.charAt(2)==7) ){
      //       sum += 12; // seventeen,
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if((word.charAt(1)==1) && (word.charAt(2)==0) ){
      //       sum += 6; // ten,
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==0) && (word.charAt(2)==1 || word.charAt(2)==2 || word.charAt(2)==6)){
      //       sum += 6; // one, two, six
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==0) && (word.charAt(2)==3 || word.charAt(2)==7 || word.charAt(2)==8) ){
      //       sum += 8; // three, seven, eight
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==0) && (word.charAt(2)==4 || word.charAt(2)==5 || word.charAt(2)==9) ){
      //       sum += 7; // four, five, nine
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else {
      //       // ((word.charAt(1)==7 ) && (word.charAt(1)==3 || word.charAt(0)==7 || word.charAt(0)==8) )
      //       sum += 15;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     }
      //
      //
      //   } else if(word.charAt(0)==3 || word.charAt(0)==7 || word.charAt(0)==8 ){
      //     sum += 12;  // three hundred, seven hundred, eight hundred
      //     System.out.println("i: " + i + ", sum: " + sum);
      //     if((word.charAt(2)==0) && (word.charAt(1)==3 || word.charAt(1)==8 || word.charAt(1)==9)){
      //       sum +=9;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if((word.charAt(2)==0) && (word.charAt(1)==4 || word.charAt(1)==5 || word.charAt(1)==6)){
      //       sum +=8;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if((word.charAt(2)==0) && (word.charAt(1)==7)){
      //       sum += 10;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==3 || word.charAt(1)==8 || word.charAt(1)==9 || word.charAt(1)==2) && (word.charAt(2)==1 || word.charAt(1)==2 || word.charAt(1)==6) ){
      //       sum += 12; // six in thirty, fifty, eighty, ninety, twenty
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==3 || word.charAt(1)==8 || word.charAt(1)==9 || word.charAt(1)==2) && (word.charAt(2)==4 || word.charAt(1)==5 || word.charAt(1)==9) ){
      //       sum += 13;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==3 || word.charAt(1)==8 || word.charAt(1)==9 || word.charAt(1)==2) && (word.charAt(2)==3 || word.charAt(1)==7 || word.charAt(1)==8) ){
      //       sum += 14;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==4 || word.charAt(1)==5 || word.charAt(1)==6) && (word.charAt(2)==1 || word.charAt(1)==2 || word.charAt(1)==6) ){
      //       sum += 11; // five in forty, fifty, sixty,
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==4 || word.charAt(1)==5 || word.charAt(1)==6) && (word.charAt(2)==4 || word.charAt(1)==5 || word.charAt(1)==9) ){
      //       sum += 12; // five in forty, fifty, sixty,
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==4 || word.charAt(1)==5 || word.charAt(1)==6) && (word.charAt(2)==3 || word.charAt(1)==7 || word.charAt(1)==8) ){
      //       sum += 13; // five in forty, fifty, sixty,
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==7 ) && (word.charAt(2)==1 || word.charAt(1)==2 || word.charAt(1)==6) ){
      //       sum += 13;          // seven in seventy
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==7 ) && (word.charAt(2)==4 || word.charAt(1)==5 || word.charAt(1)==9) ){
      //       sum += 14;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==7 ) && (word.charAt(1)==3 || word.charAt(0)==7 || word.charAt(0)==8) ){
      //       sum += 15;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     }
      //   } else if(word.charAt(0)==4 || word.charAt(0)==5 || word.charAt(0)==9 ){
      //     sum += 11;  // four hundred, five hundred, nine hundred
      //     System.out.println("i: " + i + ", sum: " + sum);
      //     if((word.charAt(2)==0) && (word.charAt(1)==3 || word.charAt(1)==8 || word.charAt(1)==9)){
      //       sum +=9;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if((word.charAt(2)==0 )&& (word.charAt(1)==4 || word.charAt(1)==5 || word.charAt(1)==6)){
      //       sum +=8;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if((word.charAt(2)==0) && (word.charAt(1)==7)){
      //       sum += 10;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==3 || word.charAt(1)==8 || word.charAt(1)==9 || word.charAt(1)==2) && (word.charAt(2)==1 || word.charAt(1)==2 || word.charAt(1)==6) ){
      //       sum += 12; // six in thirty, fifty, eighty, ninety, twenty
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==3 || word.charAt(1)==8 || word.charAt(1)==9 || word.charAt(1)==2) && (word.charAt(2)==4 || word.charAt(1)==5 || word.charAt(1)==9) ){
      //       sum += 13;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==3 || word.charAt(1)==8 || word.charAt(1)==9 || word.charAt(1)==2) && (word.charAt(2)==3 || word.charAt(1)==7 || word.charAt(1)==8) ){
      //       sum += 14;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==4 || word.charAt(1)==5 || word.charAt(1)==6) && (word.charAt(2)==1 || word.charAt(1)==2 || word.charAt(1)==6) ){
      //       sum += 11; // five in forty, fifty, sixty,
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==4 || word.charAt(1)==5 || word.charAt(1)==6) && (word.charAt(2)==4 || word.charAt(1)==5 || word.charAt(1)==9) ){
      //       sum += 12; // five in forty, fifty, sixty,
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==4 || word.charAt(1)==5 || word.charAt(1)==6) && (word.charAt(2)==3 || word.charAt(1)==7 || word.charAt(1)==8) ){
      //       sum += 13; // five in forty, fifty, sixty,
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==7 ) && (word.charAt(2)==1 || word.charAt(1)==2 || word.charAt(1)==6) ){
      //       sum += 13;          // seven in seventy
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else if ((word.charAt(1)==7 ) && (word.charAt(2)==4 || word.charAt(1)==5 || word.charAt(1)==9) ){
      //       sum += 14;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     } else {
      //       // ((word.charAt(1)==7 ) && (word.charAt(1)==3 || word.charAt(0)==7 || word.charAt(0)==8) )
      //       sum += 15;
      //       System.out.println("i: " + i + ", sum: " + sum);
      //     }
      //
      //   } else {  // one thousand
      //     sum += 11;
      //     System.out.println("i: " + i + ", sum: " + sum);
      //   }
    //   }
    // }
    System.out.println("Sum is: " + sum);
  }
}
