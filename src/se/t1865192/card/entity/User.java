package se.t1865192.card.entity;

import se.t1865192.card.util.KeyBoard;
/**
 * ユーザのクラス
 * @author Yamaoka
 *
 */
public class User extends Player {



	/**
	 * 名前付きコンストラクタ
	 * @param name ユーザの名前
	 */
	public User(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
		this.point = 0;
	}

	@Override/*
	*
	*ユーザが番号を選ぶ
	*
	*/
	public void chooseNumber() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.printf("%sさんが選ぶ番号を指定してください。\n", name);
		do {
			number = KeyBoard.inputNumber();
		} while (number < 0 || number > 51);

	}



}
