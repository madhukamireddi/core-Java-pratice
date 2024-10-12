interface I1
{
    int m1(String a,float b);
}
public class LamdaExpresion
{
	public static void main(String[] args) {
	    I1 obj = (a,b) ->{
	        System.out.println(a+b);
	        return 100;
	    };
	    System.out.println(obj.m1("Madhu",2));
	}
}