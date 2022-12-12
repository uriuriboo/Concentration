package se.t1865192.card.test;

import junit.framework.TestCase;
import se.t1865192.card.entity.Card;
import se.t1865192.card.entity.Fields;
/**
 * Fieldクラスのテストクラス
 * @author Yamaoka
 *
 */
public class FieldsTest extends TestCase {

	private Fields fd;
	private Fields[] fs;
	private Card spadeA, diamond10, heartQ, clubK, spade5, diamondA, heartA, clubA, joker;

	/**
	 * 各テストメソッドの実行の前処理
	 */
	protected void setUp() throws Exception {
		// いくつかテスト用のカードインスタンスを作っておく．
		fd = new Fields();
		fs = new Fields[52];
		for(int i = 0;i < 52;i++) {
			fs[i] = new Fields();
		}
		// いくつかテスト用のカードインスタンスを作っておく．
		spadeA = new Card(0, 1); // スペードA
		diamond10 = new Card(1, 10); // ダイヤ10
		heartQ = new Card(2, 12); // ハートQ
		clubK = new Card(3, 13); // クラブK
		// 他にも作っておく．
		spade5 = new Card(0, 5); // スペード5
		diamondA = new Card(1, 1); // ダイヤA
		heartA = new Card(2, 1); // ハートA
		clubA = new Card(3, 1); // クラブA
		joker = new Card(-1, 0); // ジョーカー

	}

	/**
	 * 各テストメソッドの実行の後処理
	 */
	protected void tearDown() throws Exception {
		// 後処理は特に無し
		System.out.println("テスト終了");
	}

	/**
	 * isState()をテストする
	 */
	public void testIsState() {
		assertEquals(true,fd.isState());
		fd.setState(false);
		assertEquals(false,fd.isState());
		fs[1].setState(true);
		assertEquals(true,fs[1].isState());
	}

	/**
	 * getCard()をテストする
	 */
	public void testGetCard() {
		fd.setCard(spadeA);

		assertSame(spadeA,fd.getCard());
		fd.setCard(diamond10);
        assertSame(diamond10,fd.getCard());
		fd.setCard(heartQ);
        assertSame(heartQ,fd.getCard());
        fd.setCard(clubK);
		assertSame(clubK,fd.getCard());
		fd.setCard(spade5);
		assertSame(spade5,fd.getCard());
		fd.setCard(diamondA);
		assertSame(diamondA,fd.getCard());
		fd.setCard(heartA);
		assertSame(heartA,fd.getCard());
		fd.setCard(clubA);
		assertSame(clubA,fd.getCard());
		fd.setCard(joker);
		assertSame(joker,fd.getCard());
	}

	/**
	 * setCard()をテストする
	 */
	public void testSetCard() {
		fd.setCard(spadeA);
		assertSame(spadeA,fd.getCard());
	}

}
