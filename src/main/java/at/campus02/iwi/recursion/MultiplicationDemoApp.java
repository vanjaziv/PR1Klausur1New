package at.campus02.iwi.recursion;

public class MultiplicationDemoApp {

    public static void main(String[] args) {
        System.out.println(multiplicate(3,4));
    }

    public static int multiplicate(int number1, int number2){

        if(number2 == 1) {
            return number1;
        }
        return (number1 + multiplicate(number1, --number2));
    }
}
