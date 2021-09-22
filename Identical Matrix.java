import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter size of array"); 
	    int n=sc.nextInt(); 
	    int count=0;
	    int a[][]=new int[n][n]; 
	    int b[][]=new int[n][n]; 
	    System.out.println("enter elements of 1st array"); 
	    for(int i=0;i<n;i++){ 
	        for(int j=0;j<n;j++) 
	            a[i][j]=sc.nextInt(); 
	    } 
	    System.out.println("enter elements of 2nd array"); 
	    for(int i=0;i<n;i++){ 
	        for(int j=0;j<n;j++) 
	            b[i][j]=sc.nextInt(); 
	    }
	    System.out.println("Matrix form 1st array:"); 
	    for(int i=0;i<n;i++){ 
	        for(int j=0;j<n;j++) 
	            System.out.print(a[i][j]+" "); 
	        System.out.println(); 
	    }
	    System.out.println("Matrix form 2nd array:"); 
	    for(int i=0;i<n;i++){ 
	        for(int j=0;j<n;j++) 
	            System.out.print(b[i][j]+" "); 
	        System.out.println(); 
	    }
 
	    for(int i=0;i<n;i++){ 
	        for(int j=0;j<n;j++){
	            if(a[i][j]-b[i][j]!=0){
	                count=1;
	                break;
	            }
	        }
	    }
	    if(count!=1){
	        System.out.println("Identical");
	    }
	    else{
	        System.out.println("Not Identical");
	        System.out.println("Result: ");
	        for(int i=0;i<n;i++){ 
    	        for(int j=0;j<n;j++)
    	            System.out.print((a[i][j]-b[i][j])+" ");
    	        System.out.println();
    	    }
	    }
	}
}