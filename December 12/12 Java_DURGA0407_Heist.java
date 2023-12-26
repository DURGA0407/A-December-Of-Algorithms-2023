import java.util.*;
public class Binary
{
int BinarySearch(String a[],int n,String sv)
{
    int low = 0;
    int high = n-1;
    int mid = (low+high)/2;
    while(low<=high)
    {
        if(sv.equals(a[mid]))
            return mid;
        else if(sv.compareTo(a[mid])<0)
            high = mid-1;
        else if(sv.compareTo(a[mid])<0)
            low = mid+1;
        mid = (low+high)/2;
    }
    return -1;
}

public static void main(String args[])
{
    Binary obj = new Binary();
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String b1[] = new String[n];
    String b2[] = new String[n];
    String b3[] = new String[n];
    System.out.println("Enter b1 values : ");
    for(int i=0;i<n;i++)
    {
        b1[i]=in.next();
    }
    System.out.println("Enter b2 values : ");
    for(int i=0;i<n;i++)
    {
        b2[i]=in.next();
    }
    System.out.println("Enter b3 values : ");
    for(int i=0;i<n;i++)
    {
        b3[i]=in.next();
    }
    
    int result =0 ;
    if((result = obj.BinarySearch(b1,n,"Gold"))!=-1)
        System.out.println("Box 1 contains Gold\n");
    else if((result = obj.BinarySearch(b2,n,"Gold"))!=-1)
        System.out.println("Box 2 contains Gold\n");
    else 
        System.out.println("Box 3 contains Gold\n");
}
}