/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 02-11-2020
 *
 * Description of program
 ********************************************/

package Chapter_10;

public class MyInteger {


    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() { return this.value; }

    public boolean isOdd() { if (this.value % 2 == 1) {return true;} else {return false;} }

    public boolean isEven() { if (this.value % 2 == 0) {return true;} else {return false;} }

    public boolean isPrime() {

        int num = this.value;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) { return true; } else { return false; }

    }

    public static boolean isOdd(int i) { if (i % 2 == 1) {return true;} else {return false;} }

    public static boolean isEven(int i) { if (i % 2 == 0) {return true;} else {return false;} }

    public static boolean isPrime(int i) {

        int num = i;
        boolean flag = false;
        for (int n = 2; n <= num / 2; ++n) {
            if (num % n == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) { return true; } else { return false; }

    }

    public static boolean isOdd(MyInteger i) { if (i.getValue() % 2 == 1) {return true;} else {return false;} }

    public static boolean isEven(MyInteger i) { if (i.getValue() % 2 == 0) {return true;} else {return false;} }

    public static boolean isPrime(MyInteger i) {

        int num = i.getValue();
        boolean flag = false;
        for (int n = 2; n <= num / 2; ++n) {
            if (num % n == 0) {
                flag = true;
                break;
            }
        }

        if (!flag) { return true; } else { return false; }

    }

    public boolean equal(int i) { if (this.value == i) { return true; } else { return false; } }

    public boolean equal(MyInteger i) { if (this.value == i.getValue()) { return true; } else { return false; } }

    public static int parseInt(char[] chars) {

        int result = 0;

        if (chars[0] != '-') {
            for (int i = 0; i < chars.length; ++i) {
                /* '0' has a value of 48 in the ASCII/Unicode and fx. '2' has a value of 50,
                 so when we do '2' - '0' then its like saying 50 - 48 which as we all know is 2.
                 What this means is that we converted the chars to the digits */
                result = result * 10 + (chars[i] - '0');
            }
        } else {
            for (int i = 1; i < chars.length; i++) {
                result = result * 10 + (chars[i] - '0');
            }
            result = -result;
        }

        return result;
    }

    public static int parseInt(String str) {

        int i = 0;
        int num = 0;
        boolean isNeg = false;

        // Check for negative sign; if it's there, set the isNeg flag
        if (str.charAt(0) == '-') {
            isNeg = true;
            i = 1;
        }

        // Process each character of the string;
        while( i < str.length()) {
            num *= 10;
            num += str.charAt(i++) - '0'; // Minus the ASCII code of '0' to get the value of the charAt(i++).
        }

        if (isNeg) { num = -num; }
        return num;
    }

}
