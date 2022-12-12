package se.t1865192.card.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 	トランプのデッキのクラス
 * @author Yamaoka
 *
 */
public class CardDeck {

	private ArrayList<Card> cards = new ArrayList<Card>();

	/**
	 * 空のデッキのクラスのコンストラクタ
	 */
	public CardDeck() {

	}

	/**
	 * デッキにすべてのカードを入れる
	 */
	public void createFullDeck() {
		for(int suit = 0;suit < 4; suit++) {
			for(int number = 1; number <= 13 ;number++) {

				Card card = new Card(suit,number);
				cards.add(card);

			}
		}
	}

	/**
	 * デッキからすべてのカードを削除する
	 */
	public void clear() {
		cards.clear();

	}

	/**
	 * カードデッキをシャッフルする
	 */
	public void shuffle() {

		Collections.shuffle(cards);
	}

	/**
	 * カードを最後に加える
	 * @param card
	 *            加えるカード
	 */
	public void addCard(Card card){
		cards.add(card);
	}

	/**
	 * 指定した番号にカードを加える
	 * @param i
	 *         カードを加える番号
	 * @param card
	 *          加えるカード
	 */
	public void addCard(int i,Card card) {

		cards.add(i-1,card);
	}

	/**
	 * 一番上のカードを取る
	 * @return 一番上のカード
	 */
	public Card takeCard() {
		Card card = cards.get(0);
		cards.remove(0);
		return card;

	}

	/**
	 * 指定した番号のカードを取る
	 * @param i
	 *           取るカードの番号
	 * @return  取ったカード
	 */
	public Card takeCard(int i) {
		Card card = cards.get(i-1);
		cards.remove(i-1);
		return card;

	}

	/**
	 * 指定した番号のカードを見る
	 * @param i
	 *         指定した番号
	 * @return  指定した番号のカード
	 */
	public Card seeCard(int i) {

		return cards.get(i-1);
	}

	/**
	 * 同じカードがあるか探す
	 * @param suit
	 *       指定した柄
	 * @param number
	 *        指定したカードの番号
	 * @return   カードの場所 なければ0をかえす
	 */
	public int searchCard(int suit,int number) {
		Card card = new Card(suit,number);
		int index =1;
		for(Card c: cards) {
			if(c.toIndex() == card.toIndex() )
				return index;
			index++;
		}
		return 0;
	}

	/**
	 *
	 * @return デッキが空であるか
	 */
	public boolean isEmpty() {

		return cards.isEmpty();
	}

	/**
	 *
	 * @return デッキのカード数
 	 */
	public int size() {

		return cards.size();
	}

	/**
	 * すべてのカードを表示する
	 */
	public void showAllCards() {

		for(Card c:cards) {
			System.out.println(c);
		}

	}

	/**
	 * すべてのカードを取得する
	 * @return  すべてのカード
	 */
	public List<Card> getAllCardS(){

		return cards;
	}



}
