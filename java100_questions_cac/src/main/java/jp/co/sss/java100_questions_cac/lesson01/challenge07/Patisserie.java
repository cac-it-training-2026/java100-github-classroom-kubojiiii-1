/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより回転です！！");

		System.out.println("本日のおすすめ");
		System.out.println("シトロン　　　\\250");
		System.out.println("ショコラ　　　\\280");
		System.out.println("ピスターシュ　\\320");

		int num1 = 30;
		int num2 = 30;
		int num3 = 30;

		System.out.println("本日のおすすめ商品です\n");
		System.out.println("シトロン　　　\\250　・・・　残り" + num1 + "個");
		System.out.println("ショコラ　　　\\280　・・・　残り" + num2 + "個");
		System.out.println("ピスターシュ　\\320　・・・　残り" + num3 + "個");

		System.out.println("それぞれ何個ずつ買いますか？");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("シトロン　　　>");
		String str1 = reader.readLine();
		System.out.print("ショコラ　　　>");
		String str2 = reader.readLine();
		System.out.print("ピスターシュ　>");
		String str3 = reader.readLine();

		double sito = Double.parseDouble(str1);
		double syoko = Double.parseDouble(str2);
		double pisu = Double.parseDouble(str3);

		System.out.println("シトロン　　" + sito + "個");
		System.out.println("ショコラ　　" + syoko + "個");
		System.out.println("ピスターシャ " + pisu + "個");

		double sum0 = sito + syoko + pisu;
		int sum1 = (int) (sito * 250 + syoko * 280 + pisu * 320);

		System.out.println("合計個数" + sum0 + "個");
		System.out.println("合計金額" + sum1 + "円");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");

		num1 = (int) (num1 - sito);
		num2 = (int) (num2 - syoko);
		num3 = (int) (num3 - pisu);

		System.out.println("本日のおすすめ商品です\n");
		System.out.println("シトロン　　　\\250　・・・　残り" + num1 + "個");
		System.out.println("ショコラ　　　\\280　・・・　残り" + num2 + "個");
		System.out.println("ピスターシュ　\\320　・・・　残り" + num3 + "個");

	}

}
