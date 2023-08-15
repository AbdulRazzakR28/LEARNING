package practice;

public class coder 
{
 public static void main(String[]args)
 {
	add();
	int x =10;
	int y =20;
	int res = sub(x,y);
	System.out.println(res);
	boolean s = trf(x,y);
	System.out.println(s);
	int vs = multi(x,y);
	System.out.println(vs);
	
 }
 public static void add()
 {
     int a = 10;
     int b = 20;
     int c = a+b;
	 System.out.println(c);
 }
 public static int sub(int a,int b)
 {
	 return a-b;
 }
 public static  boolean trf(int a,int b)
 {
	 return a==b;
 }
 public static int multi(int a,int b)
 {
	 return a*b;
 }
 public static void gun()
 {
	//int q;
	int f = 12;
	int v = 23	;	
	int q = f-v;
	System.out.println(q);
 }
}
