package javaGuide;

import org.junit.Test;

import javax.annotation.processing.Processor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author cuichenyang
 * @Description
 * @date 2019/10/18 15:37
 * @Copyright
 */
public class ceshi implements Runnable
{

    @Override
    public void run()
    {
        long count=0;
        int idx=0;
        while (idx++<10000){
            count+=1;
            System.out.println(Thread.currentThread().getName() + "--------" + count);
        }
    }

    public static void main(String[] args)
    {
        ceshi p = new ceshi();
        ceshi p2 = new ceshi();
        Thread t1 = new Thread(p);
        t1.setName("t1");
        Thread t2 = new Thread(p2);
        t2.setName("t2");
        t1.start();
        t2.start();
        List<Object> objects = Collections.synchronizedList(new ArrayList<>());


    }
}
