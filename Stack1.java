package Lesson1;

public class Stack1 {
	static final int MAX1 = 1000; 
	int top1; 
	int a1[] = new int[MAX1];  
	boolean isEmpty1() 
	{ 
    		return (top1 < 0); 
	} 
	Stack1() 
	{ 
    		top1 = -1; 
	} 
	boolean push1(int x) 
	{ 
    		if (top1 >= (MAX1-1)) 
    		{ 
        			System.out.println("Stack Overflow"); 
        			return false; 
    		} 
    		else
    		{ 
        			a1[++top1] = x; 
        			System.out.println(x + " pushed into stack"); 
        			return true; 
    		} 
	} 
int pop1() 
	{ 
    		if (top1 < 0) 
    		{ 
        			System.out.println("Stack Underflow"); 
        			return 0; 
    		} 
    		else
    		{ 
        			int x = a1[top1--]; 
        			return x; 
    		} 
	} 

	public static void main1(String args[])
{
    		Stack1 s = new Stack1(); 
    		s.push1(10); 
    		s.push1(20); 
    		s.push1(30); 
    		System.out.println(s.pop1() + " Popped from stack"); 
	}
	static final int MAX = 1000; 
	int top; 
	int a[] = new int[MAX1];  
	boolean isEmpty() 
	{ 
    		return (top1 < 0); 
	} 
	void Stack() 
	{ 
    		top1 = -1; 
	} 
	boolean push(int x) 
	{ 
    		if (top1 >= (MAX1-1)) 
    		{ 
        			System.out.println("Stack Overflow"); 
        			return false; 
    		} 
    		else
    		{ 
        			a1[++top1] = x; 
        			System.out.println(x + " pushed into stack"); 
        			return true; 
    		} 
	} 
int pop()
	{ 
    		if (top1 < 0) 
    		{ 
        			System.out.println("Stack Underflow"); 
        			return 0; 
    		} 
    		else
    		{ 
        			int x = a1[top1--]; 
        			return x; 
    		} 
	} 

	public static void main(String args[])
{
    		Stack1 s = new Stack1(); 
    		s.push1(10); 
    		s.push1(20); 
    		s.push1(30); 
    		System.out.println(s.pop1() + " Popped from stack"); 
	}

}
