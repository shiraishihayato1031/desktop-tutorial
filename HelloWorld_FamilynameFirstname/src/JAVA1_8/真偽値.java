package JAVA1_8;

/**********************************************************************************								
* [概要] JAVA1.7　真偽値と条件式　問1～13								
* [詳細] 条件式の作成と出力								
**********************************************************************************/

public class 真偽値 {
	/*[概要]真偽値と条件式*/
	public static void main(String[] args) {
		//バイト型の宣言
		byte by;
		//短整数型の宣言
		short s;
		//整数型の宣言
		int i;
		//長整数型の宣言
		long l;
		//短精度浮動小数点型の宣言
		float f;
		//倍精度浮動小数点数型の宣言
		double d;
		//文字型の宣言
		char c;
		//文字列型の宣言
		String st;
		//ブーリアン型の電源
		boolean bo;

		//バイト型の宣言
		by = 0;
		//短整数型の初期値を入力
		s = 0;
		//整数型の初期値を入力
		i = 0;
		//長整数型の初期値を入力
		l = 0;
		//短精度浮動小数点型の初期値を入力
		f = 0.0f;
		//倍精度浮動小数点数型の初期値を入力
		d = 0.0;
		//文字型の初期値を入力
		c = '\u0000';
		//文字列型の初期値を入力
		st = null;
		//ブーリアン型の初期値を入力
		bo = false;

		//byte型の初期値を表示する
		System.out.println("byte型は" + by + "です。");
		//shote型の初期値を表示する
		System.out.println("short型は" + s + "です。");
		//int型の初期値を表示する
		System.out.println("int型は" + i + "です。");
		//long型の初期値を表示する
		System.out.println("long型は" + l + "です。");
		//float型の初期値を表示する
		System.out.println("float型は" + f + "です。");
		//double型の初期値を表示する
		System.out.println("double型は" + d + "です。");
		//char型の初期値を表示する
		System.out.println("char型は" + c + "です。");
		//String型の初期値を表示する
		System.out.println("String型は" + st + "です。");
		//boolean型の初期値を表示する
		System.out.println("boolean型は" + bo + "です。");

		//問3

		//変数byに数値10を代入
		by = 10;
		//変数sに数値100を代入
		s = 100;
		//変数iに数値1000を代入
		i = 1000;
		//変数lに数値10000を代入
		l = 10000;
		//変数fに数値9.5を代入
		f = (float) 9.5;
		//変数dに数値10.5を代入
		d = 10.5;
		//変数cに文字aを代入
		c = 'a';
		//変数stに文字列ハローを代入
		st = "ハロー";
		//変数boにtrueを代入
		bo = true;

		//byte型の数値を表示する
		System.out.println("byte型は" + by + "です。");
		//shote型の数値を表示する
		System.out.println("short型は" + s + "です。");
		//int型の数値を表示する
		System.out.println("int型は" + i + "です。");
		//long型の数値を表示する
		System.out.println("long型は" + l + "です。");
		//float型の数値を表示する
		System.out.println("float型は" + f + "です。");
		//double型の数値を表示する
		System.out.println("double型は" + d + "です。");
		//char型の文字を表示する
		System.out.println("char型は" + c + "です。");
		//String型の文字列を表示する
		System.out.println("String型は" + st + "です。");
		//boolean型の結果を表示する
		System.out.println("boolean型は" + bo + "です。");

		//問4

		//変数longを宣言し、数値の合算を実行
		long L = by + s + i + l;
		//変数Dを宣言し、数値の合算を実行
		double D = (double) d + f;
		//変数Gを宣言し、文字列の連結を実行
		String G = c + st + bo;
		//変数Vを宣言し、変数LとDの合算を実行
		double V = L + D;
		//変数Zを宣言し、数値型の乗算を実行
		long Z = by * s * i * l;
		//変数Mを宣言し、変数dを変数sでの除算を実行
		double M = (double) d / s;
		//変数Jを宣言し、変数byから変数sを減算した。
		int J = by - s;
		//変数Lの結果を表示
		System.out.println(L);
		//変数Dの結果を表示
		System.out.println(D);
		//変数Gの結果を表示
		System.out.println(G);
		//変数Vの結果を表示
		System.out.println(V);
		//変数Zの結果を表示
		System.out.println(Z);
		//変数Mの結果を表示
		System.out.println(M);
		//変数Jの結果を表示
		System.out.println(J);

		//問5

		//変数numに数値20を代入
		int num = 20;
		//変数num1に数値23を代入
		int num1 = 23;
		//文章と変数numとnum1の合算の数値を表示
		System.out.println("ハローJAVA" + (num + (int) num1));

		//問6

		//変数nameに文字　山田太郎を代入
		String name = "山田太郎";
		//変数likeに文字　寿司を代入
		String like = "寿司";
		//変数age二数値18を代入
		int age = 18;
		//変数tallに数値170.5を代入
		double tall = 170.5;
		//変数waitに数値62.2を代入
		double wait = 62.2;
		//文章と変数nameを表示
		System.out.println("初めまして" + name + "です");
		//文章と変数ageを表示
		System.out.println("年齢は" + age + "歳です");
		//文章と変数tallを表示
		System.out.println("身長は" + tall + "cmです");
		//文章と変数waitを表示
		System.out.println("体重は" + wait + "kgです");
		//文章と変数likeを表示
		System.out.println("好きな食べ物は" + like + "です");

		//問7

		//変数BMIを宣言し、BMIの計算の結果を表示
		double BMI = wait / ((tall / 100) * (tall / 100));
		//変数resultを宣言し、BMIを小数点第一位まで表示
		String result = String.format("%.1f", BMI);
		//文章と変数resultを表示
		System.out.println("BMIは" + result + "です。");

		//問8

		//変数nameの文字列を鈴木一郎に変更
		name = "鈴木一郎";
		//変数ageの数値を24に変更
		age = 24;
		//変数tallの数値を168.5に変更
		tall = 168.5;
		//変数waitの数値を64.2に変更
		wait = 64.2;
		//変数likeの文字列をオムライスに変更
		like = "オムライス";

		//文章と変数nameを表示
		System.out.println("初めまして" + name + "です");
		//文章と変数ageを表示
		System.out.println("年齢は" + age + "歳です");
		//文章と変数tallを表示
		System.out.println("身長は" + tall + "cmです");
		//文章と変数waitを表示
		System.out.println("体重は" + wait + "kgです");
		//文章と変数likeを表示
		System.out.println("好きな食べ物は" + like + "です");
		//変数BMIの計算の結果を表示
		BMI = wait / ((tall / 100) * (tall / 100));
		//変数resultを宣言し、BMIを小数点第一位まで表示
		result = String.format("%.1f", BMI);
		//文章と変数resultを表示
		System.out.println("BMIは" + result + "です。");

		//問9

		//変数age同士の合算を実行
		age = age + age;
		//変数tall同士の合算を実行
		tall = tall + tall;
		//変数wait同士の合算を実行
		wait = wait + wait;
		//変数BMIの計算の結果を表示
		BMI = wait / ((tall / 100) * (tall / 100));
		//変数resultを宣言し、BMIを小数点第二位まで表示
		result = String.format("%.2f", BMI);

		//文章と変数nameを表示
		System.out.println("初めまして" + name + "です");
		//文章と変数ageを表示
		System.out.println("年齢は" + age + "歳です");
		//文章と変数tallを表示
		System.out.println("身長は" + tall + "cmです");
		//文章と変数waitを表示
		System.out.println("体重は" + wait + "kgです");
		//文章と変数likeを表示
		System.out.println("好きな食べ物は" + like + "です");
		//文章と変数resultを表示
		System.out.println("BMIは" + result + "です。");

		//問10

		//変数nameの文字列を鈴木一郎に変更
		name = "鈴木一郎";
		//変数ageの数値を24に変更
		age = 24;
		//変数tallの数値を168.5に変更
		tall = 168.5;
		//変数waitの数値を64.2に変更
		wait = 64.2;
		//変数likeの文字列をオムライスに変更
		like = "オムライス";
		//変数BMIの計算の結果を表示
		BMI = wait / ((tall / 100) * (tall / 100));
		//変数resultを宣言し、BMIを小数点第一位まで表示
		result = String.format("%.1f", BMI);
		//変数answerを宣言し、変数ageの数値が25以上の場合trueと表示する条件式を代入
		boolean answer = age >= 25;

		//文章と変数nameを表示
		System.out.println("初めまして" + name + "です");
		//文章と変数ageを表示
		System.out.println("年齢は" + age + "歳です");
		//文章と変数tallを表示
		System.out.println("身長は" + tall + "cmです");
		//文章と変数waitを表示
		System.out.println("体重は" + wait + "kgです");
		//文章と変数likeを表示
		System.out.println("好きな食べ物は" + like + "です");
		//文章と変数resultを表示
		System.out.println("BMIは" + result + "です。");
		//変数answerの結果を表示
		System.out.println(answer);

		//問11

		//変数AGEを作成し、変数ageをString型に変換
		String AGE = String.valueOf(age);
		//変数WAITを作成し、変数waitをString型に変換
		String WAIT = String.valueOf(wait);
		//変数TALLを作成し、変数tallをString型に変換
		String TALL = String.valueOf(tall);

		//変数AGEの結果を表示
		System.out.println("年齢は" + AGE + "歳です");
		//変数WAITの結果を表示
		System.out.println("体重は" + WAIT + "kgです");
		//変数TALLの結果を表示
		System.out.println("身長は" + TALL + "cmです");

		//問12

		//変数AGEをintに変換し、変数ageとして宣言
		age = Integer.parseInt(AGE);
		//変数WAITをintに変換し、変数waitとして宣言
		wait = Double.parseDouble(WAIT);
		//変数weightを宣言し、値としてwaitをintに変換市宣言
		int weight = (int) wait;

		//変数ageの結果を表示
		System.out.println(age);
		//変数waitの結果を表示
		System.out.println(wait);
		//変数weightの結果を表示
		System.out.println(weight);

		//問13

		//変数gudgeを宣言し、年齢が25課、身長が160以上の場合trueが表示される条件式を定義
		boolean gudge = (age == 25 || tall >= 160);
		//変数gudgeの結果を表示
		System.out.println(gudge);

	}

};