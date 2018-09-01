import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int waiters = sc.nextInt();
	    int families = sc.nextInt();
	    int[] amount = new int[families];
	    
	    for(int i=0;i<families;i++)
	        amount[i]=sc.nextInt();
	    
	    int[] totalamount = new int[waiters];
	    for(int i=0,temp=0;i<families;i++,temp++)
	    {
	        if(temp>waiters-1)
	            temp=0;

	        totalamount[temp]+= amount[i];
	    }
	    
	    for(int i=0;i<waiters;i++)
	    {
	        if(totalamount[i]>0)
	            System.out.print(totalamount[i]+" ");
	        else
	            System.out.print("0 ");
	    }

	}
}
