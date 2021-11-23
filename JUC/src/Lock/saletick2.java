package Lock;

import java.util.concurrent.locks.ReentrantLock;

public class saletick2 {
    private int number =30;
    //使用lock
    //创建可重入锁
    private final ReentrantLock lock=new ReentrantLock();
    public void sale() {
            lock.lock();
            try {

                if (number > 0) {
                    System.out.println(Thread.currentThread().getName() + "saled" + number-- + "result" + number);
                }
            }finally {
                lock.unlock();
            }
        }
    }
