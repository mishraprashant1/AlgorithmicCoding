
import java.util.*;
import java.lang.*;
import java.io.*;

public class MaximumIncreasingSubsequence {
    static int getProduct(int arr[]){
        int tmp[]=new int[arr.length];
        Arrays.fill(tmp,0);
        tmp[0]=arr[0];
        int max=0;
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    int tp=arr[i]+tmp[j];
                    if(tp>tmp[i])
                        tmp[i]=tp;
                }
            }
            if(tmp[i]==0)
            tmp[i]=arr[i];
        }
        for(int i:tmp){
            if(i>max)
            max=i;
        }
        return max;
    }
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++){
		    int s=scan.nextInt();
		    int arr[]=new int[s];
		    for(int j=0;j<s;j++){
		        arr[j]=scan.nextInt();
		    }
		    System.out.println(getProduct(arr));
		}
	}
}