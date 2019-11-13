package javaGuide;

/**
 * @author cuichenyang
 * @Description 最长回文子串
 * @date 2019/10/23 9:38
 * @Copyright
 */
public class test05
{
    public static String longestPalindrome(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++)
        {
            char charAt = s.charAt(i);
            String str = Character.toString(charAt);
            str.indexOf(str);

        }
        return null;
    }

    public static void main(String[] args)
    {
            String str="jjjjsdfsdv";

    }


}
