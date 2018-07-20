import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int i=0;i<t;i++){
		    int s=scan.nextInt();
		    int count_0=0,count_1=0,count_2=0;
		    for(int j=0;j<s;j++){
		        int l=scan.nextInt();
		        switch(l){
		            case 0:
		                count_0++;
		                break;
		            case 1:
		                count_1++;
		                break;
		            case 2:
		                count_2++;
		                break;
		        }
		    }
		    for(int l=0;l<count_0;l++){
		        System.out.print(0+" ");
		    }
		    for(int l=0;l<count_1;l++){
		        System.out.print(1+" ");
		    }
		    for(int l=0;l<count_2;l++){
		        System.out.print(2+" ");
		    }
		    System.out.println("");
		}
	}
}