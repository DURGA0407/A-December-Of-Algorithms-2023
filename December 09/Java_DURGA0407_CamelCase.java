import java.util.*;
public class CamelCase
{
    public static void main(String args[])
    {
        String str;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        str = sc.nextLine();
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if((ch[i]>='A') && (ch[i]<='Z'))
            {
                ++count;
            }
        }
        System.out.println(count);
    }
}