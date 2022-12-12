package se.t1865192.card.entity;

/**
 * プレイヤを表す抽象クラス
 * @author Yamaoka
 *
 */
public abstract class Player {

	protected String name;
	protected int point;
	protected int number;

	/**
	 * 名前付きコンストラクタ
	 * @param name プレイヤの名前
	 */
	public Player(String name) {
		if (name.length()==0 || name==null) {
			this.name = "名無し";
		} else {
			this.name = name;
		}
		this.point = 0;
	}

	/**
	 * 数字を選択する抽象メゾット
	 */
	public abstract void chooseNumber();

	/**
	 * 選んだ番号を表示する
	 */
	public void showNumber() {
		System.out.printf("%d番目を選びました\n",number);
	}

	/**
	 * ポイントを1ポイント増加させる
	 */
	public void addPoint() {
		System.out.println("ポイントを1つ増やします。");
		point++;
	}

	/**
	 * プレイヤのポイントを表示する
	 */
	public void showPoint(){
		System.out.printf("%sさんのポイントは%dです。\n",name,point);

	}

	/**
	 * プレイヤの名前を取得する
	 * @return 名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * プレイヤのポイントを取得する
	 * @return  ポイント
	 */
	public int getPoint() {
		return point;
	}

	/**
	 * プレイヤが選んだ数字を取得する
	 * @return  選んだ数字
	 */
	public int getNumber() {
		return number;
	}


}
