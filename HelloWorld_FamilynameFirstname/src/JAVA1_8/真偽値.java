package JAVA1_8;

public class 真偽値 {
	public static void main(String[] args) {
		
		byte by=0;

		short s = 0;

		int i = 0;

		long l =0;

		float f = 0;

		double d = 0;

		char c = 0;

		String st = "";

		boolean bo = false;
		
		System.out.println("byte型は"+by+"です。");
		System.out.println("short型は"+s+"です。");
		System.out.println("int型は"+i+"です。");
		System.out.println("long型は"+l+"です。");
		System.out.println("float型は"+f+"です。");
		System.out.println("double型は"+d+"です。");
		System.out.println("char型は"+c+"です。");
		System.out.println("String型は"+st+"です。");
		System.out.println("boolean型は"+bo+"です。");

by=0;

s = 0;

i = 0;

l =0;

f = (float) 0.0;

d = 0.0;

c = 0;

st = "";

bo = false;

System.out.println("byte型は"+by+"です。");
System.out.println("short型は"+s+"です。");
System.out.println("int型は"+i+"です。");
System.out.println("long型は"+l+"です。");
System.out.println("float型は"+f+"です。");
System.out.println("double型は"+d+"です。");
System.out.println("char型は"+c+"です。");
System.out.println("String型は"+st+"です。");
System.out.println("boolean型は"+bo+"です。");



by=10;

s=100;

i=1000;

l=10000;

f=(float) 9.5;

d=10.5;

c = 'a';

st = "ハロー";

bo = true;


System.out.println("byte型は"+by+"です。");
System.out.println("short型は"+s+"です。");
System.out.println("int型は"+i+"です。");
System.out.println("long型は"+l+"です。");
System.out.println("float型は"+f+"です。");
System.out.println("double型は"+d+"です。");
System.out.println("char型は"+c+"です。");
System.out.println("String型は"+st+"です。");
System.out.println("boolean型は"+bo+"です。");

 long L = by + s + i + l;
 
  double D = (double)d + f;
  
  String G = c + st + bo;
  
 double  V = L + D;
 
 long Z = by*s*i*l;
 
 double M = (double)d / s;
 
 int J = by - s;

System.out.println(L);
System.out.println(D);
System.out.println(G);
System.out.println(V);
System.out.println(Z);
System.out.println(M);
System.out.println(J);




int num=20;
int num1=23;
System.out.println("ハローJAVA"+(num+(int)num1));


String name = "山田太郎" ;

String like = "寿司";

int age = 18;

double tall = 170.5;

double wait = 62.2;

System.out.println("初めまして"+name+"です");
System.out.println("年齢は"+age+"歳です");
System.out.println("身長は"+tall+"cmです");
System.out.println("体重は"+wait+"kgです");
System.out.println("好きな食べ物は"+like+"です");

double BMI = wait / ((tall / 100) * (tall / 100));

String result = String.format("%.1f", BMI);

System.out.println("BMIは"+result+"です。");


 name = "鈴木一郎";
 
 age = 24;
 
 tall = 168.5;
 
 wait = 64.2;

like ="オムライス";

System.out.println("初めまして"+name+"です");
System.out.println("年齢は"+age+"歳です");
System.out.println("身長は"+tall+"cmです");
System.out.println("体重は"+wait+"kgです");
System.out.println("好きな食べ物は"+like+"です");
BMI = wait / ((tall / 100) * (tall / 100));

result = String.format("%.1f", BMI);

System.out.println("BMIは"+result+"です。");


 age = age +age;
 
 tall = tall + tall;
 
 wait = wait + wait;
 
 BMI = wait / ((tall / 100) * (tall / 100));

 result = String.format("%.2f", BMI);
 
 System.out.println("初めまして"+name+"です");
 System.out.println("年齢は"+age+"歳です");
 System.out.println("身長は"+tall+"cmです");
 System.out.println("体重は"+wait+"kgです");
 System.out.println("好きな食べ物は"+like+"です");
 System.out.println("BMIは"+result+"です。");
 
 
 
 name = "鈴木一郎";
 
 age = 24;
 
 tall = 168.5;
 
 wait = 64.2;

like ="オムライス";

BMI = wait / ((tall / 100) * (tall / 100));

result = String.format("%.1f", BMI);

boolean answer = age > 25;

System.out.println("初めまして"+name+"です");
System.out.println("年齢は"+age+"歳です");
System.out.println("身長は"+tall+"cmです");
System.out.println("体重は"+wait+"kgです");
System.out.println("好きな食べ物は"+like+"です");
System.out.println("BMIは"+result+"です。");
System.out.println(answer);

String AGE = String.valueOf(age);
String WAIT = String.valueOf(wait);
String TALL = String.valueOf(tall);

System.out.println("年齢は"+AGE+"歳です");
System.out.println("体重は"+WAIT+"kgです");
System.out.println("身長は"+TALL+"cmです");


age = Integer.parseInt(AGE);
wait = Integer.parseInt(WAIT);

System.out.println(age);
System.out.println(Math.round(wait));







}
	
};