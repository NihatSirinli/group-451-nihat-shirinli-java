package classwork_7;

class NumberPrinter implements Runnable {

public void run() {

for (int i = 1; i <= 5; i++) {

System.out.println(i);

try { Thread.sleep(500); } catch (InterruptedException e) { }

}

}

}

public class Main {

public static void main(String[] args) {

new Thread(new NumberPrinter()).start();

}

}
