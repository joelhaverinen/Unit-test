package fi.vamk.studentid;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("2 plus 2 is " + sum(2,2));
       
    }

    public static int sum(int a , int b){
        return a + b;

    }

    public static int divide(int a , int b){
        return a / b;

    }


    public static String returnTwo(String myString){
        //String myString = "abc";
        String valmis = myString.substring(0,2);
        //System.out.println(myString.substring(0,2));

        return valmis;

    }

    public static double divide2(Double a , Double b){
        double c = a / b;
        return c;

    }
}
