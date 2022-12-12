package se.t1865192.card.entity;
/**
 * カードを置き場所を表し選択をされたか管理するクラス
 * @author Yamaoka
 *
 */
public class Fields {

	private boolean state;
	private Card card;

	/**空のコンストラクタ
	 *
	 */
	public Fields() {

		this.state = true;
	}

    /**
     * カードの状態を取得する
     * @return  カードが選択されているか
     */
	public boolean isState() {
		return state;
	}

	/**
	 * カードの状態をセットする
	 * @param state カードの状態
	 */
	public void setState(boolean state) {
		this.state = state;
	}
	/**
	 * カードを取得する
	 * @return カード
	 */
	public Card getCard() {
		return card;
	}

	/**
	 * カードをセットする
	 * @param card フィールドにセットするカード
	 */
	public void setCard(Card card) {
		this.card = card;
	}


}
