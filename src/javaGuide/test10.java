package javaGuide;

import com.sun.istack.internal.NotNull;

/**
 * @author cuichenyang
 * @Description 正则表达式匹配;
 * @date 2019/10/12 15:05
 * @Copyright
 */
public class test10
{
    /**
     * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配
     */
    public static boolean isMatch(String s, String p)
    {
        char[] charsP = p.toCharArray();
        char[] charsS = s.toCharArray();
        int indexDouhao;
        int indexXinghao;
        int lengthS = s.length();
        int lengthP = p.length();
        int length = lengthP > lengthS ? lengthP : lengthS;

        if (p.contains("*") || p.contains("."))
        {
            if (p.contains("."))
            {
                indexDouhao = p.indexOf(".");
                for (int i = 0; i < length; i++)
                {
                    if (i != indexDouhao)
                    {
                        if (s.charAt(i) == p.charAt(i))
                        {
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                }
            }
            if (p.contains("*"))
            {
                indexXinghao = p.indexOf("*");
                char c = s.charAt(indexXinghao - 1);
                /*if(c==s.charAt(indexXinghao))*/
            }


        }

        return false;
    }

    public static void main(String[] args)
    {
        boolean abc = isMatch("abc", "abd");
        System.out.println(abc);
    }
}
