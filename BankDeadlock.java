class BankDeadlock extends Thread {

    static Object account1 = new Object();
    static Object account2 = new Object();

    public void run() {

        if (Thread.currentThread().getName().equals("Thread-0")) {

            synchronized (account1) {
                System.out.println("Thread 1 locked Account 1");

                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }

                synchronized (account2) {
                    System.out.println("Thread 1 locked Account 2");
                }
            }

        } else {

            synchronized (account2) {
                System.out.println("Thread 2 locked Account 2");

                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }

                synchronized (account1) {
                    System.out.println("Thread 2 locked Account 1");
                }
            }
        }
    }

    public static void main(String[] args) {

        BankDeadlock t1 = new BankDeadlock();
        BankDeadlock t2 = new BankDeadlock();

        t1.start();
        t2.start();
    }
}