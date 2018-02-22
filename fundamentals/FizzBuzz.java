public class FizzBuzz{

    public static void main(String[] args){
        for(int x = 1; x <= 100; x++){
            if(x % 15 == 0){
                System.out.println(x + "FizzBuzz");
            }else if(x % 3 == 0){
                System.out.println(x + "Fizz");
            }else if(x % 5 == 0){
                System.out.println(x + "Buzz");
            }else{
                System.out.println(x);
            }
        }
    }

}
