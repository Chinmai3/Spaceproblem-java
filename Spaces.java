//no of spaces is less than previous then it becomes the child of previous file 
import java.util.*;
import java.lang.*;
public class Spaces{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //No of files going to be taken.
        int n=sc.nextInt();
        System.out.println();
        String s[]=new String[n];
        //reads the file names as my string values.
        for(int i=0;i<n;i++)
        {
            s[i]=sc.nextLine();
        }
        //array to count the no of spaces.
        int cnt[]=new int[n];
        for(int i=0;i<n;i++)
        {
            //function to cnt the no of the times the specified element is present in string.
            //cnt[i]=StringUtils.countMatches(s[i], " ");
            cnt[i]=s[i].length()-((s[i].trim()).length());
        }
        //String s1=s[0].trim();
        //System.out.println(s1+" is my root file");
        //now compare the values of cnt array to find the parent files of each file
        for(int i=1;i<n;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(cnt[j]<cnt[i])
                {
                    System.out.println(s[i].trim()+"\t"+s[j].trim());
                    break;
                }
                if(j==0 &&(cnt[j]>=cnt[i]))
                {
                    System.out.println(s[i]+"\t null");
                    
                }
            }
        }
    }
}