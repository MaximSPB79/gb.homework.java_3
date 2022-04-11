package lesson_4;

class Test {

    public synchronized void printA() {
        System.out.print("A");
        try {
            wait(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }

    public synchronized void printB() {
        System.out.print("B");
       try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }

   public synchronized void printC() {
        System.out.print("C");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }
}

class Multithreading {

    public static void main(String[] args) {
        Test test = new Test();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                test.printA();
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                test.printB();
            }
        }).start();

       new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                test.printC();
            }
        }).start();
    }
}


