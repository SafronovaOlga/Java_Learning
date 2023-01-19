package codewars_01;

public class EvenOrOdd {
    public static String even_or_odd(int number) {
        //Place code here
        if (number % 2 == 0) {

            return "Even";
        } else {

            return "Odd";
        }
    }

        public static String even_or_odd_01(int number){

            return number % 2 == 0 ? "Even" : "Odd";

        }

    public static void main (String[] args) {



        System.out.println(even_or_odd(6));
        System.out.println(even_or_odd(7));

        System.out.println(even_or_odd_01(4));
        System.out.println(even_or_odd_01(9));




    }

}
