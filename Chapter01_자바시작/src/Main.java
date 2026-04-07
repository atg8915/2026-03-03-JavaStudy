import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.io.*;
import java.security.PublicKey;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws Exception{
	
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
			
		
		int N = Integer.parseInt(bf.readLine());
		ArrayDeque<int[]> deque = new ArrayDeque<>();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++)
		{
			int val = Integer.parseInt(st.nextToken());
			deque.addLast(new int[] {i,val});
			
		}
		while(!deque.isEmpty())
		{
			int[] balloon = deque.pollFirst();
			bw.write(balloon[0]+" ");
			
			if(deque.isEmpty())break;
			
			int num = balloon[1];
			
			if(num>0) {
				for(int i=0; i<num-1; i++)
				{
					deque.addLast(deque.pollFirst());
				}
			}
			else {
				for(int i=0; i<Math.abs(num)-1; i++)
				{
					deque.addFirst(deque.pollLast());
				}
			}
			
		}
		
		bw.flush();
		bw.close();
	}
	
	
}


