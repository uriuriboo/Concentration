package se.t1865192.card.game;

import se.t1865192.card.entity.CPU;
import se.t1865192.card.entity.User;
import se.t1865192.card.util.KeyBoard;

/**
 * ジャンケンゲームアプリ
 * @author Yamaoka
 *
 */
public class ConcentrationApplication {

	private User user;

	private ConcentrationGame game;

	/**
	 * 初期設定をする
	 */
	public void initialize() {

		System.out.println("神経衰弱ゲームを起動します。");
		System.out.print("名前を入力してください：　");
		String name = KeyBoard.inputString();
		int n;
		do {
			System.out.print("何人で遊びますか(2以上の整数)：");
			n = KeyBoard.inputNumber();
		} while (n < 2);

		System.out.println("ゲームの初期設定をしています。");
		game = new ConcentrationGame();

		// ユーザを追加
		user = new User(name);
		game.addPlayer(user);

		// CPUを追加 (n-1)人分
		for (int i = 1; i < n; i++) {
			game.addPlayer(new CPU("CPU" + i));
		}

		game.initializeFields();
		System.out.println("初期設定が終わりました。");

		}

	/**
	 * ゲームをする
	 */
	public void doGame() {

		game.startGame();
	}

	/**
	 * 結果を表示する
	 */
	public void showResults() {

		game.showRecord();
	}

	/**
	 * アプリを起動する
	 */
	public void startApplication() {
		initialize();
		doGame();
		showResults();

	}
}
