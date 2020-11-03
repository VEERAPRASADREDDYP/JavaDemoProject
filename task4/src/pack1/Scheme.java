package pack1;
import pack1.*;

interface I{
	String employeeScheme(int salary);
}
public class Scheme extends Employee4 implements I{
	public String employeeScheme(int salary) {
		String result="";
		if((salary>5000)&& (salary<20000)) {
			result= "C";
		}
		if((salary>=20000)&&(salary<40000)) {
			result= "B";
		}
		if(salary>40000) {
			result= "A";
		}
return result;
	}
}

