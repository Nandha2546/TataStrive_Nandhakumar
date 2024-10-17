package instance;

public class instance_variable{
	public int add(int a,int b) {
		return  a+b;
	}
 static public int sub(int a,int b) {
	 return a-b;
 }
 public void mul (int a,int b) {
	 System.out.print(a*b);
 }
 public static void main (String agrs[]) {
	 instance_variable r= new instance_variable();
	 System.out.println(r.add(5, 6));
	 System.out.println(sub(5, 9));
	 r.mul(4, 6);
 }

}
