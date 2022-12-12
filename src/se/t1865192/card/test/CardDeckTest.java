package se.t1865192.card.test;


import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import se.t1865192.card.entity.Card;
import se.t1865192.card.entity.CardDeck;

public class CardDeckTest extends TestCase {

	private CardDeck cd;
	private Card spadeA,diamond10, heartQ, clubK,spade5;

	protected void setUp() throws Exception {

		cd = new CardDeck();
		cd.createFullDeck();//整列している状態でスタート
		spadeA = new Card(0, 1); // スペードA
		diamond10 = new Card(1, 10); // ダイヤ10
		heartQ = new Card(2, 12); // ハートQ
		clubK = new Card(3, 13); // クラブK
		spade5 = new Card(0, 5); // スペード5
	}

	protected void tearDown() throws Exception {
		// 後処理は特に無し
		System.out.println("テスト終了");
	}

	public void testTakeCard() {
		assertEquals(spadeA.toIndex(),cd.takeCard().toIndex());
		cd.takeCard();
		cd.takeCard();
		cd.takeCard();
		//上から4枚取った カード番号は0,1,2,3,
		assertEquals(4,cd.takeCard().toIndex());
	}

	public void testTakeCardInt() {
		assertEquals(spadeA.toIndex(),cd.takeCard(1).toIndex());
		//一枚取った後spade5と一致するか確かめるspade5のあるのは4番目
		assertEquals(spade5.toIndex(),cd.takeCard(4).toIndex());
	}

	public void testSeeCard() {
		assertEquals(spadeA.toIndex(),cd.seeCard(1).toIndex());
		assertEquals(spade5.toIndex(),cd.seeCard(5).toIndex());
		//インデックスは0からはじまるので

		assertEquals(diamond10.toIndex(),cd.seeCard(diamond10.toIndex()+1).toIndex());
		assertEquals(heartQ.toIndex(),cd.seeCard(heartQ.toIndex()+1).toIndex());
		assertEquals(clubK.toIndex(),cd.seeCard(clubK.toIndex()+1).toIndex());
	}

	public void testSerchCard() {
		assertEquals(1,cd.searchCard(0,1));
		assertEquals(14,cd.searchCard(1,1));
	}

	public void testSize() {

		assertEquals(52,cd.size());
	}

	public void testGetAllCardS() {
		List<Card>  cs = new ArrayList<Card>();

		cs = cd.getAllCardS();
		assertEquals(52,cs.size());

	}

}
