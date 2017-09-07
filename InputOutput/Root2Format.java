public class Root2Format {
    public static void main(String[] args) {
        int i = 2;
        double r = Math.sqrt(i);

        System.out.format("The square root of %d is %f.%n", i, r);
    }
}

// compare with print and prinln use in Root.java file
/*
Like the three used in this example, all format specifiers begin with a % and end with a 1- or 2-character conversion that specifies the kind of formatted output being generated. The three conversions used here are:

d formats an integer value as a decimal value.
f formats a floating point value as a decimal value.
n outputs a platform-specific line terminator.
Here are some other conversions:

x formats an integer as a hexadecimal value.
s formats any value as a string.
tB formats an integer as a locale-specific month name.
There are many other conversions.

Note:
Except for %% and %n, all format specifiers must match an argument. If they don't, an exception is thrown.

In the Java programming language, the \n escape always generates the linefeed character (\u000A). Don't use \n unless you specifically want a linefeed character. To get the correct line separator for the local platform, use %n.
*/
