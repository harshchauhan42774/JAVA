class Pre25 extends Thread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread 1");
                try {
                    Thread.sleep(1000); // Removed unnecessary reference to Thread.currentThread()
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread 2");
                try {
                    Thread.sleep(2000); // Removed unnecessary reference to Thread.currentThread()
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
