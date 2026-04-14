/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package jp.co.sss.java100_questions_cac.lesson01.challenge05;

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

		int sito = Integer.parseInt(str1);
		int syoko = Integer.parseInt(str2);
		int pisu = Integer.parseInt(str3);

		System.out.println("シトロン　　" + sito + "個");
		System.out.println("ショコラ　　" + syoko + "個");
		System.out.println("ピスターシャ " + pisu + "個");

		int sum0 = sito + syoko + pisu;
		int sum1 = sito * 250;
		int sum2 = syoko * 280;
		int sum3 = pisu * 320;
		int sum4 = sum1 + sum2 + sum3;

		System.out.println("合計個数" + sum0 + "個");
		System.out.println("合計金額" + sum4 + "円");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");

	}

}
