public class Sleep {
    public static void main(String[] args) {

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        System.out.println("Hello World!");
                        sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
