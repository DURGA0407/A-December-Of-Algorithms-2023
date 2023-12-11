import java.util.*;
public class Conversion
{
    public static void main(String args[])
    {
        int n1,n2,i,j,sum=0;
        int bin[]=new int[64];
        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        sum = n1 + n2;
        i=0;
        while(sum>0)
        {
            bin[i]=sum%2;
            sum=sum/2;
            i++;
        }
        for(j=i-1;j>=0;j--)
            System.out.println(bin[j]);
    }
}