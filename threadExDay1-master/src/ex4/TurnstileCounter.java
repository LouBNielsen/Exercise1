package ex4;

public class TurnstileCounter
{

    // private final AtomicInteger count = new AtomicInteger(0); - løsning 2
    // private final ReentrantLock lock = new ReentrantLock(); - løsning 3
    static final long DELAY_VAL = 10000;
    long count = 0;

    public long getValue()
    {
        return count;
        // return count.get(); - løsning 2
    }

    public void incr()
    {
//   If the program initially does not fail, replace the count line with the lines below
        // lock.lock(); - løsning 3

        long n = count;

//    //Spend some time to force preemtion
        for (long a = 0; a < 10000; a++)
        {

        }
//        try - løsning 3 .... 
//        {
            n = n + 1;
            count = n;
            //count.getAndIncrement(); - løsning 2
//        } finally - løsning 3
//        {
//            lock.unlock(); - løsning 3
//        } 
    }
}
