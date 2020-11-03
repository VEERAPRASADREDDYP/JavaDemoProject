package pack1;

import java.util.Scanner;

public class Upper {
	 void convert(){
		 Scanner scan=new Scanner(System.in);
		 String sentence=scan.nextLine();
		 char[] c=sentence.toCharArray();
		 
		 for(int i=0;i<c.length;i++){
			 if(i==0)
				 c[i]=Character.toUpperCase(c[i]);
			 if(c[i]==' ')
				 c[i+1]=Character.toUpperCase(c[i+1]);
		 }
		 String s=new String(c);
		 System.out.println(s);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Upper obj=new Upper();
		obj.convert();

	}

}
