package DSA;
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of the element");
        int n=sc.nextInt();
        int[] ar=new int[n];
        System.out.println("Enter the elements of the elements");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        sc.close();
        //Moore's voting algo
        int ele=0;
        int count=1;
        for(int i=0;i<n;i++){
            if(count==0)
            {
                ele=ar[i];
                count=1;
            }
            else if(ar[i]==ele)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<n;i++)
        {
            if(ele==ar[i])
            {
                count1++;
            }
        }
        if(count1>n/2)
        {
            System.out.println("Majority is "+ele);
        }
        else{
            System.out.println("Not a majority element found");
        }
    }
}
