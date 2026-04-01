import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.io.*;
import java.security.PublicKey;
import java.util.StringTokenizer;


public class Main {
//	static int gcd(int a, int b)
//	{
//		if(b==0) return a;
//		return gcd(b, a%b);
//	}
//	static boolean isPrime(long n) {
//		if(n<2) return false;
//		for(long i=2; i*i<=n; i++) {
//			if(n%i==0) return false;
//		}return true;
//	}
//	static boolean[] isNotPrime = new boolean[10000001];
//	static {
//	isNotPrime[0] = true;
//	isNotPrime[1] = true;
//	for(int i=2; i<=1000000; i++) {
//		if(!isNotPrime[i])
//		{
//			for(int j=i*2; j<=1000000; j+=i)
//			{
//				isNotPrime[j] = true;
//			}
//			}
//		}
//	}
	public static void main(String[] args) throws Exception{
	
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while(true) {
			String input = bf.readLine();
			if(input.equals(".")) break;
			boolean ok = true;
			Stack<Character> stack = new Stack();
			for(int i=0; i<input.length(); i++) {
	            char c = input.charAt(i);
	            
	            if(c == '(' || c == '[') {
	                stack.push(c);
	            } else if(c == ')' || c == ']') {
	                if(stack.isEmpty()) {
	                    ok = false; break;
	                } else if(c == ')' && stack.peek() == '(') {
	                    stack.pop();
	                } else if(c == ']' && stack.peek() == '[') {
	                    stack.pop();
	                } else {
	                    ok = false; break;
	                }
	            }
	        }
			if(ok && stack.isEmpty())
	            bw.write("yes\n");
	        else
	            bw.write("no\n");
	    }
		
		
		bw.flush();
		bw.close();
		
	}
	
}


