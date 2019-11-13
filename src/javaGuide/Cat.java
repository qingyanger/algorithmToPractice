package javaGuide;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author cuichenyang
 * @Description
 * @date 2019/10/29 18:10
 * @Copyright
 */
@Data
public class Cat
{
    private String ccy;
    private int cy;

    public Cat()
    {
    }

    public String getCcy()
    {
        return ccy;
    }

    public void setCcy(String ccy)
    {
        this.ccy = ccy;
    }

    public int getCy()
    {
        return cy;
    }

    public void setCy(int cy)
    {
        this.cy = cy;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Cat").append('[')
                .append("ccy=")
                .append(ccy)
                .append(",cy=")
                .append(cy)
                .append(']');
        return sb.toString();
    }

    public static void main(String[] args)
    {
       Dog dog=new Dog();
        String name = dog.getName();
        System.out.println(dog);
    }
}
