import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        first();

        //second();

        //third();

        //fourth();

        //fifth();

        //sixth();

        //seventh();

        //eighth();

        //ninth();

        //tenth();

        //eleventh();
    }

    static void first(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);
    }

    static void second(){
        String getHours[] = new String[10];

        getHours[0] = "9 45";
        getHours[1] = "10 35";
        getHours[2] = "11 35";
        getHours[3] = "12 25";
        getHours[4] = "13 25";
        getHours[5] = "14 15";
        getHours[6] = "15 15";
        getHours[7] = "16 05";
        getHours[8] = "17 05";
        getHours[9] = "17 50";

        Scanner in = new Scanner(System.in);
        int result = in.nextInt();

        System.out.println(getHours[result - 1]);
    }

    static void third() {
        Scanner in = new Scanner(System.in);
        int firstHour = in.nextInt();
        int firstMinute = in.nextInt();
        int firstSecond = in.nextInt();
        int secondHour = in.nextInt();
        int secondMinute = in.nextInt();
        int secondSecond = in.nextInt();

        int firstResult = (firstHour * 3600) + (firstMinute * 60) + firstSecond;
        int secondResult = (secondHour * 3600) + (secondMinute * 60) + secondSecond;

        System.out.println(Math.abs(firstResult - secondResult));
    }

    static void fourth(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println((m + n - 1) / n);
    }

    static void fifth(){
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(1 + (h - b - 1) / (a - b));
    }

    static void sixth(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println((a * (a / b) + b * (b / a)) / (b / a + a / b));
    }

    static void seventh(){
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int y1 = in.nextInt();
        int y2 = in.nextInt();

        if(x1 == y1 || x2 == y2) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    static void eighth(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a == b && b == c)
            System.out.println(3);
        else if ((a == b && b != c) || (a != b && b == c) || (a == c && c != b)){
            System.out.println(2);
        }
        else {
            System.out.println(0);
        }

    }

    static void ninth(){
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        int[] array = new int[length];

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if(i != 0 && array[i] > array[i - 1])
                count++;
        }

        System.out.println(count);
    }

    static void tenth(){
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        int[] array = new int[length];

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if((i != 0 & i != array.length - 1) && (array[i - 1] < array[i] & array[i] > array[i + 1]) ){
                count++;
            }
        }

        System.out.println(count);
    }

    static void eleventh(){
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int[] array = new int[length];
        int c;

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < array.length; i += 2) {
            if(i == array.length - 1 &  array.length % 2 == 1){
                break;
            }
            c = array[i];
            array[i] = array[i + 1];
            array[i + 1] = c;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}