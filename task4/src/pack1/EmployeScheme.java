package pack1;

import java.util.*;
public class EmployeScheme extends Scheme {
	void accept() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter name:");
		name=scan.next();
		System.out.println("enter id:");
		id=scan.nextInt();
		System.out.println("enter Designation:");
		designation=scan.next();
		System.out.println("enter salary:");
		salary=scan.nextInt();
		scheme=employeeScheme(salary);
		}
	void display() {
		System.out.println("Employee name:"+name+" "+"employ id:"+id+" "+"employee designation"+designation+" "+"employee salary:"+salary+" "+"insurance sheme:"+scheme);
	}
void search() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter id:");
		int s1=scan.nextInt();
		for(int i=0;i<3;i++) {
			if(s1==id) {
				System.out.println("Employee name:"+this.name+"" +"employee designation:"+this.designation+" "+"emplyee salary:"+this.salary+" "+"employee scheme:"+this.scheme);
			}
		}
	}
public static void main(String[] args) {
	EmployeScheme[] obj=new EmployeScheme[10];
	for(int i=0;i<3;i++) {
		obj[i]=new EmployeScheme();
		obj[i].accept();
		obj[i].display();
	}
for(int i=0;i<3;i++) {
			obj[i].search();

		}
}
}


