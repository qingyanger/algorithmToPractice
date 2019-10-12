package javaGuide;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;

/**
 * @author cuichenyang
 * @Description
 * @date 2019/10/11 15:38
 * @Copyright
 */
public class test01
{
    private final Condition notEmpty;

    private final Condition notFull;

    public test01(Condition notEmpty, Condition notFull)
    {
        this.notEmpty = notEmpty;
        this.notFull = notFull;
    }

    public static void main(String[] args)
    {

    }

}

