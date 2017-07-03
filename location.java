/////////////////////////////////////////////////////////////////////////////// 
// Title:            Project 2 												 //
// Files:            - 														 //
// Semester:         Spring 2017 											 //
// 																			 //
// Author:           Nitin Gangasagar 										 //
// Email:            nsg150230@utdallas.edu 								 //
// CS Login:         - 														 //
// Lecturer's Name:  Nassim Sohaee											 //
// Course Section:   6323.501 												 //
//  																		 //
///////////////////////////////////////////////////////////////////////////////

package project2;
import java.util.Scanner;
// Class: location
// Getting location of largest number in the array and
// Getting the number
public class location
{
//Largest number location detection
// return : int[] - integer array
	public static int[] locateLargest(double[][] a)
	 {    double max = a[0][0];
	      int i1 =0,j1=0;
	    for (int i= 0;i <a.length;i++)
	    {
	      for (int j =0; j<a[i].length;j++)
	      {
	        if (a[i][j] > max)
	        {
	          max = a[i][j];
	          i1 =i;
	          j1 =j;
	        }
	      }
	    }
	    int[] bla = {i1,j1};
	    return bla;
	  }
	  
// Largest number in the array
// return : double 
	static double getMax(double[][] A) {
	    double max = 0;
	    boolean maxValid = false;
	    if (A != null) {
	        for (int k = 0; k < A.length; k++) {
	            if (A[k] != null) {
	                for (int l = 0; l < A[k].length; l++) {
	                    if (!maxValid || max < A[k][l]) {
	                        max = A[k][l];
	                        maxValid = true;
	                    }
	                }
	            }
	        }
	    }
	    if (!maxValid) throw new IllegalArgumentException("no elements in the array");
	    return max;
	}
// Main class 
  public static void main (String[] args)
  {
    Scanner scan = new Scanner (System.in);
    System.out.print("Enter the number of rows " +
                               "and columns of the array: ");
    double[][] nums = new double[scan.nextInt()][scan.nextInt()];
    System.out.println("Enter the array:");
    for (int i =0;i<nums.length;i++)
    {
      for (int j =0;j<nums[i].length;j++)
      {
        nums[i][j] = scan.nextDouble();
      }
    }
    double aa = getMax(nums);
    int[] zizi = locateLargest(nums);
    //System.out.println(aa);
    System.out.println("The location of the largest element " +
            "is "+ aa +" at (" + zizi[0] +", " +zizi[1] +")");
  }
}
