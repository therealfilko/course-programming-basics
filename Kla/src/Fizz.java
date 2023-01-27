public class Fizz {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            } else if(i%3 == 0){
                System.out.println("Fizz");
            } else if(i%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public Fizz(int n, String s1, String s2) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(s1);
            }
            System.out.println(s2);
        }
    }
}
