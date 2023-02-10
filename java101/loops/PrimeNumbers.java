package java101.loops;

public class PrimeNumbers {
    //Write a program that prints prime numbers from 1 to 100 in Java.
    public static void main(String[] args) {

        for (int i = 2; i <=100 ; i++) {
            boolean isPrime=true;

            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    isPrime=false;
                }

            }
            if (isPrime){
                System.out.print(i +" ");
            }
        }
    }
}
