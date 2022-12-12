package se.t1865192.card.game;

import java.util.ArrayList;
import java.util.List;

import se.t1865192.card.entity.CardDeck;
import se.t1865192.card.entity.Fields;
import se.t1865192.card.entity.Player;

/**
 * 神経衰弱ゲームクラス
 * @author Yamaoka
 *
 */
public class ConcentrationGame {

	private CardDeck carddeck;
	private Fields[] fields; //カードを置くための場所
	private List<Player> players = new ArrayList<Player>();

	/**
	 * プレイヤを追加する
	 * @param player 参加するプレイや
	 */
	public void addPlayer(Player player){

		players.add(player);
		System.out.printf("「%s」さんをゲームに登録しました．\n", player.getName());
	}

	/**
	 * すべてのプレイヤを取得する
	 * @return 参加プレイヤ
	 */
	public List<Player> getPlayers() {

		return players;
	}

	/**
	 * フィールドの初期設定を行う
	 */
	public void initializeFields() {
		carddeck = new CardDeck();  //カードデッキの作成
		carddeck.createFullDeck();  //カードデッキにカードを入れる
		carddeck.shuffle();         //カードをシャッフルをする
		fields = new Fields[52];    //カードを置くための場所を作る

		//カードをフィールドにおいていく
		for(int i = 0;i < 52;i++) {
			fields[i] = new Fields();
			System.out.println("現在アクセスしている配列のインデックス番号は"+i+"です");

		    fields[i].setCard(carddeck.takeCard());

		}

	}

	/**
	 * まだ選択されていないカードの番号をすべて表示する
	 */
	public void showchoosableCard() {
		System.out.println("選択可能なカードは以下の通りです。");

		for(int i = 0;i < 52;i++) {
			if(fields[i].isState() == true) {
				System.out.printf("%d ",i);
			}

		}
		System.out.println();

	}

	/**
	 * フィールドのカードがすべて選択されたか確認する
	 * @return 状態
	 */
	public boolean checkFields() {

		for(int i = 0;i < 52;i++) {
			//選択されていないカードがあればtrueを返す。
			if(fields[i].isState() == true) {
				return true;
			}
		}
		//なければfalseを返す
		return false;
	}

	/**
	 * ゲームを始める
	 */
	public void startGame() {
		if (players.size() < 2) {
			System.out.println("×プレイヤが足りません．ゲームを開始できません");
			return;
		}
		System.out.println("神経衰弱開始です.");

		doConcentration();
	}

	/**
	 *ゲームをする
	 */
	public void doConcentration() {

		int num1,num2;

		while(true) {

			for(Player player:players) {

				if(checkFields() == false) {//ゲームの終了
					System.out.println("ガードはすべて取られました。ゲームを終了します。");
					return;
				}

				System.out.printf("%sさんの番です。\n",player.getName());
				System.out.println("選ぶカードの番号を二つ指定してください。(0～51番まで)");
				showchoosableCard();//選択可能なカードを表示する

				do {

				//ここをユーザのみの表示にしておく
				System.out.println("1つ目番号を選んでください。");

				player.chooseNumber();
				num1 = player.getNumber();

				//ここも
				System.out.println("2つ目の番号を選んでください");

				player.chooseNumber();
				num2 = player.getNumber();

				/*同じカードの場所を選ぶか
				 * 選択済みでfalseになっている場所を選ぶとやり直し
				 *
				 * */
				if(num1 == num2 || fields[num1].isState() == false || fields[num2].isState() == false) {
					System.out.println("もう一度選んでください。");
				}


				}while(num1 == num2 || fields[num1].isState() == false || fields[num2].isState() == false);

				System.out.printf("%sさんは%dと%dの番号を選びました",player.getName(),num1,num2);
				System.out.println();
				System.out.printf("%d番は%s、%dは%sです。",num1,fields[num1].getCard().toString(),num2,fields[num2].getCard().toString());


				if(fields[num1].getCard().getNumber() == fields[num2].getCard().getNumber()) {
					fields[num1].setState(false);//選択済みにする
					fields[num2].setState(false);//選択済みにする

				}
			}
		}

	}

	/**
	 * すべてのプレイヤのポイントを表示する
	 */
	public void showRecord() {

		for(Player p:players) {

			System.out.printf("%sさんのポイント%dポイントです",p.getName(),p.getPoint());
			System.out.println();

		}

	}

}
