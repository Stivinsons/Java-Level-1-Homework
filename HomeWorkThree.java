import java.util.Scanner;

public class HomeWorkThree {
    public static void main(String[] args) {
        doTaskFour();
    }

    public static boolean doTaskOne(int x, int y){
        if ( x + y >= 10 && x + y <= 20){
            return true;
            //boolean result = true;
            //System.out.println(result);
        }else{
            return false;
            //boolean result = false;
            //System.out.println(result);
        }
    }
    public static void doTaskOne(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first value");
        int x = scan.nextInt();
        System.out.println("Enter second value");
        int y = scan.nextInt();
        if ( x + y >= 10 && x + y <= 20){
            boolean result = true;
            System.out.println(result);
        }else {
            boolean result = false;
            System.out.println(result);
        }
    }

    public static void doTaskTwo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value");
        int x = scan.nextInt();
        if ( x < 0 ){
            System.out.println("Число отрицательное");
        }else{
            System.out.println("Число положительное");
        }
    }

    public static boolean doTaskThree(int x){
        if (x >= 0){
            return false;
        }else {
            return true;
        }
    }

    public static void doTaskFour(String string, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(string);
        }
    }

    public static void doTaskFour() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string");
        String string = scan.nextLine();
        System.out.println("Enter value");
        int x = scan.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println(string);
        }
    }
}

