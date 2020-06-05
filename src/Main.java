import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        System.out.println("|||||||Task 1|||||||");
        first(4, 7);

        System.out.println("||||||||Task 2|||||||");
        second(2);

        System.out.println("|||||||Task 3|||||||");
        third(1, 2,30, 1, 3,20);

        System.out.println("|||||||Task 4|||||||");
        fourth(700, 2100);

        System.out.println("|||||||Task 5|||||||");
        fifth(10, 3 ,2);

        System.out.println("|||||||Task 6|||||||");
        sixth(8, 5);

        System.out.println("|||||||Task 7|||||||");
        seventh(1, 1, 2, 1);

        System.out.println("|||||||Task 8|||||||");
        eighth(1, 2, 2);

        System.out.println("|||||||Task 9|||||||");
        ninth(array);

        System.out.println("|||||||Task 10|||||||");
        tenth(array);

        System.out.println("|||||||Task 11|||||||");
        eleventh(array);
    }

    static void first(int a, int b){
        int c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);
    }

    static void second(int lesson){
        int start = 9 * 60;
        int lessonTime = 45;
        int smallBrake = 5;
        int bigBrake = 15;

        int m = start + lesson * lessonTime;
        m+= (lesson - 1) * smallBrake;
        m+= (lesson - 1) / 2 * (bigBrake - smallBrake);

        System.out.println(m / 60 + " " + m % 60);

    }

    static void third( int firstHour, int firstMinute, int firstSecond, int secondHour, int secondMinute, int secondSecond) {

        int firstResult = (firstHour * 3600) + (firstMinute * 60) + firstSecond;
        int secondResult = (secondHour * 3600) + (secondMinute * 60) + secondSecond;

        System.out.println(Math.abs(firstResult - secondResult));
    }

    static void fourth(int n, int m){
        System.out.println((m + n - 1) / n);
    }

    static void fifth(int h, int a, int b){
        System.out.println(1 + (h - b - 1) / (a - b));
    }

    static void sixth(int a, int b){
        System.out.println((a * (a / b) + b * (b / a)) / (b / a + a / b));
    }

    static void seventh(int x1, int x2, int y1, int y2){
        if(x1 == y1 || x2 == y2) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    static void eighth(int a, int b, int c){
        if(a == b && b == c)
            System.out.println(3);
        else if ((a == b && b != c) || (a != b && b == c) || (a == c && c != b)){
            System.out.println(2);
        }
        else {
            System.out.println(0);
        }
    }

    static void ninth(int[] array){
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(i != 0 && array[i] > array[i - 1])
                count++;
        }

        System.out.println(count);
    }

    static void tenth(int[] array){
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if((i != 0 & i != array.length - 1) && (array[i - 1] < array[i] & array[i] > array[i + 1]) ){
                count++;
            }
        }

        System.out.println(count);
    }

    static void eleventh(int[] array){
        int c;

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