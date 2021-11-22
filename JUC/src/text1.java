public class text1 {
    public static void main(String[] args) {
        Thread aa= new Thread(()->{System.out.println(Thread.currentThread().getName()+"::"+Thread.currentThread().isDaemon());
            while (true){} },"aa");
            //把aa设置成守护线程
            //aa.setDaemon(true);
            aa.start();

            System.out.println(Thread.currentThread().getName()+"over");
    }

}
