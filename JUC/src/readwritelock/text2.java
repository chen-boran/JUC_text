package readwritelock;


        import java.util.concurrent.locks.ReentrantReadWriteLock;

//演示读写锁降级
public class text2{

    public static void main(String[] args) {
        //可重入读写锁对象
        ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock readLock = rwLock.readLock();//读锁
        ReentrantReadWriteLock.WriteLock writeLock = rwLock.writeLock();//写锁

        //锁降级
        //2 获取读锁
        readLock.lock();
        System.out.println("---read");

        //1 获取写锁
        writeLock.lock();
        System.out.println("write");
        //此时读锁不能升级成为写锁，因此会进入等待并且一直阻塞下去

        //3 释放写锁
        //writeLock.unlock();

        //4 释放读锁
        //readLock.unlock();
    }
}

