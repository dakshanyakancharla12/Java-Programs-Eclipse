//Finding Maximum element in an array.

package CIET;
//import java.util.Scanner;

public class maximum_Code {
	static int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[]  a = {56, 76, 89, 330};
		System.out.println(findMax(a));
 	}
}
