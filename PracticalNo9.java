class PrintNumbers {
    int number = 0;
   
    public synchronized void printNumber() {
        for (int i = 0; i < 5; i++) {
            number += 5;
            System.out.print(number + " ");
        }
    }
}
class NumberPrinter implements Runnable {
    PrintNumbers pn;
    NumberPrinter(PrintNumbers pn) {
        this.pn = pn;
    }
    public void run() {
        pn.printNumber();
    }
}
public class PracticalNo9 {
    public static void main(String[] args) {
        PrintNumbers pn = new PrintNumbers();
        Thread t1 = new Thread(new NumberPrinter(pn));
        Thread t2 = new Thread(new NumberPrinter(pn));
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}