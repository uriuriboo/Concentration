package se.t1865192.card.test;

import junit.framework.TestCase;
import se.t1865192.card.entity.User;

/**
 * Userクラスののテストクラス
 * @author Yamaoka
 *
 */
public class UserTest extends TestCase {

	private User user1;

	/**
	 * 各テストメソッドの実行の前処理
	 */
	protected void setUp() throws Exception {
		// いくつかテスト用のカードインスタンスを作っておく．

		user1 = new User("user1");
	}

	/**
	 * 各テストメソッドの実行の後処理
	 */
	protected void tearDown() throws Exception {
		// 後処理は特に無し
		System.out.println("テスト終了");
	}


	/**
	 * chooseNumber()のテスト
	 */
	public void testChooseNumber() {
		System.out.println("数字の0を入力してください");
		user1.chooseNumber();
		assertEquals(0,user1.getNumber());
		System.out.println("数字の1を入力してください");
		user1.chooseNumber();
		assertEquals(1,user1.getNumber());
		System.out.println("数字の51を入力してください");
		user1.chooseNumber();
		assertEquals(51,user1.getNumber());
	}

	/**
	 * showNumber()のテスト
	 */
	public void testShowNumber() {

		System.out.println("0から51までの数字を入力してください");
		user1.chooseNumber();
		user1.showNumber();
	}

	/**
	 * addPoint()のテスト
	 */
	public void testAddPoint() {
		assertEquals(0,user1.getPoint());
		user1.addPoint();
		assertEquals(1,user1.getPoint());
	}

	/**
	 * showPoint()のテスト
	 */
	public void testShowPoint() {
		user1.addPoint();
		user1.showPoint();
	}

	/**
	 * getName()のテスト
	 */
	public void testGetName() {
		assertEquals("user1",user1.getName());
	}

	/**
	 * getPoint()のテスト
	 */
	public void testGetPoint() {
		assertEquals(0,user1.getPoint());
		user1.addPoint();
		assertEquals(1,user1.getPoint());
	}

	/**
	 * getNumber()のテスト
	 */
	public void testGetNumber() {
		System.out.println("数字の23を入力してください");
		user1.chooseNumber();
		assertEquals(23,user1.getNumber());
	}

}
