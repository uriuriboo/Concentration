package se.t1865192.card.entity;


/**
 * トランプのカードのクラス
 * @author Yamaoka
 * @since JDK1.8
 * @see CardDeck
 */
public class Card {
	private int suit;
	private int number;

	/**
	 * トランプの柄と数字を指定する
	 * @param suit
	 *             絵柄絵柄 (0:スペード，1:ダイヤ，2:ハート，3:クラブ, -1:ジョーカー)
	 * @param number
	 *               数字 (1-13)
	 */
	public Card(int suit,int number) {
		this.suit = suit;
		this.number = number;
	}

	/**
	 * そのカードの絵柄を取得する
	 *
	 * @return 絵柄 (0:スペード，1:ダイヤ，2:ハート，3:クラブ, -1:ジョーカー)
	 */
	public int getSuit() {
		return suit;
	}


	/**
	 * そのカードの数字を取得する 0はジョーカー
	 *
	 * @return 数字 (1-13, 0)
	 *
	 */
	public int getNumber() {
		return number;
	}

	/**
	 *
	 * @return トランプの整数表現
	 */
	public int toIndex() {

		return getIndex(getSuit(), getNumber());

	}

	/**
	 *
	 * @return トランプの文字表現
	 */
	public String toString() {

		return getString(getSuit(), getNumber());
	}

	/**
	 * 文字表現の出力
	 */
	public void show() {

		System.out.println(toString());

	}

	/**
	 *
	 * @param suit
	 *          絵柄 (0:スペード，1:ダイヤ，2:ハート，3:クラブ, -1:ジョーカー)
	 * @param number
	 *          数字 (1-13, 0)
	 * @return  カードの整数表現 (0-51, -1)
	 */
	public static int getIndex(int suit,int number) {
		int index;

		if (suit == -1) {
			index = -1;
		}
		else {
			index = suit * 13 + number-1;
		}

		return index;

	}

	/**
	 *
	 * @param suit
	 *         絵柄 (0:スペード，1:ダイヤ，2:ハート，3:クラブ, -1:ジョーカー)
	 * @param number
	 *           数字 (1-13, 0)
	 * @return   カードの柄と数字
	 */
	public static String getString(int suit,int number) {
		String suitStr, numStr;

		String[] mark = { "スペード", "ダイヤ", "ハート", "クラブ" };

		if (suit == -1) {

			suitStr = "ジョーカー";
			numStr = "";

		}
		else if (2 <= number && number <= 10) {

			suitStr = mark[suit];
			numStr = Integer.toString(number);

		}

		else {
			suitStr = mark[suit];
			switch (number) {
			case 1:
				numStr = "A";
				break;
			case 11:
				numStr = "J";
				break;
			case 12:
				numStr = "Q";
				break;
			case 13:
				numStr = "K";
				break;
			default:
				numStr = "存在しないカード";
			}
		}


		return suitStr + numStr;


	}

}
