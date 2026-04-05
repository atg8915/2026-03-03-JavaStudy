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
		LinkedList<Integer> deque = new LinkedList<Integer>();	
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++)
		{
			deque.add(Integer.parseInt(st.nextToken()));
			
		}
		
		bw.flush();
		bw.close();
	}
	
	
}


