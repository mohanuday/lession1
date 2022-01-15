package Lession1;

public class MyExceptionextendsException {
	String str1;
	   MyException(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}


