
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Atharva
 */

 class hello
{
    public void gun(int arr[],int end)
    {
        int temp1=0;
        int temp2=arr.length-1;
        int var=0;
               
        while(temp1<temp2)
	{
		while((arr[temp1]%2==0)&&(temp1<temp2))
		{
			temp1++;
		}
		while((arr[temp2]%2!=0)&&(temp1<temp2))
		{
			temp2--;
		}
		if((arr[temp1]%2!=0)&&(arr[temp2]%2==0))
		{
			var=arr[temp1];
			arr[temp1]=arr[temp2];
			arr[temp2]=var;
		}
	}
    }
}


public class Segragate {

    public static void main(String arg[])
    {
        int num1=0;
        int arr[]=new int[30];
        System.out.println("how many elements you want to enter?\n");
        Scanner sobj=new Scanner(System.in);
        
        num1=sobj.nextInt();
                
        System.out.println("Enter the elements in the array\n");
        for(int i=0;i<num1;i++)
        {
            arr[i]=sobj.nextInt();
        }
        
        hello hobj=new hello();
        
        hobj.gun(arr, num1);
        
        for(int i=0;i<num1;i++)
        {
            arr[i]=sobj.nextInt();
        }
        
    }
    
}
