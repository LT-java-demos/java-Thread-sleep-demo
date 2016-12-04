#java-Thread-sleep-demo

`Thread.sleep()` 方法可以使当前线程进入休眠状态

```java
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

```