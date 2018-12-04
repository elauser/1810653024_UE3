public class Aufgabe4reku{

    public static void main(String[] args){
        int a = 10;
        System.out.println("fib("+a+") = " + fibonacci(a));
        System.out.println("fib("+a+") = " + fibIt(a));
    }


    private static int fibonacci(int a){

        if (a==1||a==2) return 1;
        else return fibonacci(a-1)+fibonacci(a-2);
    }
    private static int fibIt(int a){
        if(a == 0) return 0;
        else if (a <= 2) return 1;
        else{
            int b = 3;
            int fib1 = 1;
            int fib2 = 2;
            while (b<=a){
                fib1 = fib1 + fib2;
                b++;
                if(b==a) return fib1;
                fib2 = fib2 + fib1;
                b++;
            }
            return fib2;
        }
    }
}