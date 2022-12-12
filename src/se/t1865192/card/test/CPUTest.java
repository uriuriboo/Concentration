package se.t1865192.card.test;

import junit.framework.TestCase;
import se.t1865192.card.entity.CPU;

/**
 * CPUクラスのテストクラス
 * @author Yamaoka
 *
 */
public class CPUTest extends TestCase {

	private CPU cpu1;

	/**
	 * 各テストメソッドの実行の前処理
	 */
	protected void setUp() throws Exception {
		// いくつかテスト用のカードインスタンスを作っておく．
		cpu1 = new CPU("CPU1");

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

		cpu1.chooseNumber();
		assertTrue(0 <= cpu1.getNumber() && cpu1.getNumber() <= 51);
		cpu1.chooseNumber();
		assertTrue(0 <= cpu1.getNumber() && cpu1.getNumber() <= 51);
		cpu1.chooseNumber();
		assertTrue(0 <= cpu1.getNumber() && cpu1.getNumber() <= 51);
	}


	/**
	 * showNumber()のテスト
	 */
	public void testShowNumber() {
		cpu1.chooseNumber();
		cpu1.showNumber();
	}

	/**
	 * addPoint()のテスト
	 */
	public void testAddPoint() {
		cpu1.addPoint();
		cpu1.showPoint();
	}

	/**
	 * showPoint()のテスト
	 */
	public void testShowPoint() {
		cpu1.showPoint();
		cpu1.addPoint();
		cpu1.showPoint();
	}

	/**
	 * getName()のテスト
	 */
	public void testGetName() {
		assertEquals("CPU1",cpu1.getName());
	}

	/**
	 * getPoint()のテスト
	 */
	public void testGetPoint() {
		assertEquals(0,cpu1.getPoint());
		cpu1.addPoint();
		assertEquals(1,cpu1.getPoint());
	}

	/**
	 * getNumber()のテスト
	 */
	public void testGetNumber() {
		cpu1.chooseNumber();
		assertTrue(0 <= cpu1.getNumber() && cpu1.getNumber() <= 51);
	}

}
