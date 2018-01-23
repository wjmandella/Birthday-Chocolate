// My solution to the HackerRank problem "Birthday Chocolate." 
// https://www.hackerrank.com/challenges/the-birthday-bar/problem

import java.util.Scanner;

public class BirthdayChocolateApp {
    static int solve(int n, int[] s, int d, int m){

    	int count = 0;
    	int sum = 0;
    	for(int i = 0; i <= (s.length - m); i++) {
    		sum = 0;
    		for(int j = i; j < (i + m); j++) {
    			sum += s[j];
    		}
    		System.out.println("Sum = "+sum);
    		if(sum == d) {
    			count++;
    			System.out.println("Count ="+count);
    		}
    	}   	
    	return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of chocolate squares (integer 1 - 100): "); 
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            System.out.print("Enter an integer (integer 1 - 5): "); 
            s[s_i] = in.nextInt();
        }
        System.out.print("Enter the birthday 'day number' (integer 1 - 31): "); 
        int d = in.nextInt();
        System.out.print("Enter the birthday 'month number' (integer 1 - 12): "); 
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
        in.close();
    }
}
