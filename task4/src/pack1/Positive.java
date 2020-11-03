package pack1;

import java.util.Arrays;
import java.util.Scanner;

public class Positive {
	void check(){
		Scanner scan=new Scanner(System.in);
		String name=scan.next();
		char[] ch = name.toCharArray(); 
		int[]  num=new int[ch.length];
		int[] fin=new int[ch.length];
		for(int i=0;i<ch.length;i++){
			fin[i]=(int)(ch[i]);
			
		}
		for(int i=0;i<ch.length;i++){
			num[i]=(int)(ch[i]);
			
		}
		
		
		Arrays.sort(num);
		
		if(Arrays.equals(fin,num)){
			System.out.println("yes");
		}
		else
			System.out.println("no");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Positive obj1=new Positive();
		obj1.check();
	}

}
