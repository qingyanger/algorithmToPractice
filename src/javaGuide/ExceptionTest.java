package javaGuide;

import java.util.ArrayList;

/**
 * @author cuichenyang
 * @Description
 * @date 2019/11/8 16:03
 * @Copyright
 */
public class ExceptionTest
{
    public void test()throws Exception{

        Boolean exception = exception();
    }
    private Boolean exception()throws Exception{
        return false;
    }

    public static void main(String[] args)
    {
        ArrayList<String> strings = new ArrayList<>();
        boolean empty = Utils.isEmpty(strings);
        System.out.println(empty);
    }
}
