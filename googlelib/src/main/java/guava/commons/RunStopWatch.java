package guava.commons;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * Created by yangqi on 9/14/14.
 */
public class RunStopWatch {
    public static void main(String[] args) {
        Stopwatch watch=Stopwatch.createUnstarted();
        watch.start();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        watch.stop();
        System.out.println(watch.elapsed(TimeUnit.MILLISECONDS));


    }
}
