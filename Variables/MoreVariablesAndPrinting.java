public class MoreVariablesAndPrinting
{
    public static void main( String[] args )
    {
        String myName, myEyes, myTeeth, myHair;
        int myAge, myHeight, myWeight;
        double convertedWeight, convertedHeight;

        myName = "Neota Moe";
        myAge = 35;     // a lie
        myHeight = 64;  // inches--not a lie
        myWeight = 140; // lbs--is it a lie?
        myEyes = "Brown";
        myTeeth = "White-ish";
        myHair = "Dark Brown";
        convertedHeight = myHeight * 2.54;
        convertedWeight = myWeight / 2.2;

        System.out.println( "Let's talk about " + myName + "." );
        System.out.println( "She's " + myHeight + " inches (or " + convertedHeight + " cm) tall." );
        System.out.println( "She's " + myWeight + " pounds (or " + Math.round(convertedWeight) + " kg) heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "She's got " + myEyes + " eyes and " + myHair + " hair." );
        System.out.println( "Her teeth are usually " + myTeeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight
            + " I get " + (myAge + myHeight + myWeight) + "." );
    }
}
