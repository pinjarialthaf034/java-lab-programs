import java.util.Scanner;

class Signal implements Runnable {
    String color;
    int time;

    Signal(String color, int time) {
        this.color = color;
        this.time = time;
    }

    public void run() {
        try {
            System.out.println(color + " LIGHT IS ON");
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Trafficc{
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter RED time: ");
        int t1_time = sc.nextInt();

        System.out.print("Enter ORANGE time: ");
        int t2_time = sc.nextInt();

        System.out.print("Enter GREEN time: ");
        int t3_time = sc.nextInt();

        Signal red = new Signal("RED", t1_time);
        Signal orange = new Signal("ORANGE", t2_time);
        Signal green = new Signal("GREEN", t3_time);

        for(int i = 0; i < 5; i++) {

            Thread t1 = new Thread(red);
            t1.start();
            t1.join();   // wait until RED finishes

            Thread t2 = new Thread(orange);
            t2.start();
            t2.join();   // wait

            Thread t3 = new Thread(green);
            t3.start();
            t3.join();   // wait

            System.out.println("------------------");
        }
    }
}