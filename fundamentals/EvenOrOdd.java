class evenoroddchecker {
    public static String even_or_odd(int number){
        return (number % 2 == 0) ? "Even" : "Odd";
    }
}

public class EvenOrOdd {
    public static void main(String []args){
        System.out.println(evenoroddchecker.even_or_odd(2));
        System.out.println(evenoroddchecker.even_or_odd(3));
    }
} 
