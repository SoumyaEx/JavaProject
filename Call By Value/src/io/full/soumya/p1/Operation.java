package io.full.soumya.p1;

public class Operation {
	
	 int data=50;  
	  
	 void change(int data){  
	 data=data+100;//changes will be in the local variable only  
	// System.out.println("data is :" +data);
	 }  

	public static void main(String[] args) {
		  Operation op=new Operation();  
		  
		   System.out.println("before change "+op.data);  
		   op.change(100);  
		   System.out.println("after change "+op.data);   

	}

}
