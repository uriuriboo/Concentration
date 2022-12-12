package se.t1865192.card.entity;

import java.util.Random;
/**
 * 対戦相手のコンピュータのクラス
 * @author Yamaoka
 *
 */
public class CPU extends Player {

	private Random r = new Random();

	/**
	 * CPUのコンストラクタ
	 * @param name  CPUの名前
	 */
	public CPU(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	/**
	 * カードを選ぶための数字を決める
	 */
	public void chooseNumber() {
		// TODO 自動生成されたメソッド・スタブ

		System.out.printf("%sが手を決めています．\n", name);
		number = r.nextInt(52);
	}

}
