/**
 *
 */
package rps;

import java.util.Date;
import java.util.Scanner;

/**
 * @author systena
 *
 */
public class RPSGame {


  /**
   * 生きてる限りスキャンは使いまわす。クローズはしない。.
   */
  static Scanner scan = new Scanner(System.in);

  /**
   * @param args
   */
  public static void main(String[] args) {
    Date date = new Date();
    String dateString = date.toString();
    System.out.println("Today is " + dateString);

    try {
      // じゃんけんモード選択の開始
      modeSelect();

    } catch (Exception e) {
      // 何が起きても生きる。アプリは絶対死なない。
      System.out.println("バグが発生しました。 " + e);
    }
  }

  /**
   * @param args
   */
  public static void modeSelect() {

    // モード判定
    System.out.println("じゃんけんのモードを選択してください。\n「m:マニュアル」\n「a:オート」\n「e:じゃんけんの終了」");
    // 読み込み共通処理
    String input = readLine();

    if ("m".equals(input)) {
      // 「m」マニュアルを入力された場合は終了する。
      System.out.println("マニュアルじゃんけんモードを開始します。");
      manual();
      System.out.println("");
      // 終わったら、もう一回メニューに戻る
      modeSelect();

    } else if ("a".equals(input)) {
      // 「a」終了を入力された場合は終了する。
      System.out.println("オートじゃんけんモードを開始します。");
      System.out.println("オートじゃんけんモードは未実装です。");
      System.out.println("");
      // 終わったら、もう一回メニューに戻る
      modeSelect();

    } else if ("e".equals(input)) {
      // 「e」終了を入力された場合は終了する。
      System.out.println("じゃんけんを終了します。");
    } else {
      // 期待した文字列以外を入力された場合は、ワーニングメッセージを表示し、再度入力を求める
      System.out.println("入力された文字列に誤りがあります。もう一度最初からやり直してください。");
      System.out.println("");
      // もう一回メニューに戻る
      modeSelect();
    }

  }

  /**
   * @param args
   */
  public static void manual() {
    // マニュアルモードの処理

    int num = 0;

    // 読み込み共通処理
    System.out.println("「1」:グー、「2」:チョキ、「3」:パーを入力してください。");
    String input = readLine();

    try {
      // 読み込み文字列判定
      num = Integer.parseInt(input);

      switch (num) {
        case 1: {
          System.out.println("あなた：グー");
        }
          break;
        case 2: {
          System.out.println("あなた：チョキ");
          break;
        }
        case 3: {
          System.out.println("あなた：パー");
          break;
        }
        default: {
          // ワーニング応答
          manual();
        }
      }
      int aNum = new RpsPlayerA().go().getId();
      switch (aNum) {
        case 1: {
          System.out.println("あいて：グー");
          break;
        }
        case 2: {
          System.out.println("あいて：チョキ");
          break;
        }
        case 3: {
          System.out.println("あいて：パー");
          break;
        }
        default: {
          // ワーニング応答
        }
      }
      // 結果判定
      result res = calcResult(num, aNum);
      if (res == result.WIN) {
        System.out.println("あなたの勝ちです！");
      } else if (res == result.LOSE) {
        System.out.println("残念。。。");
      } else {
        System.out.println("あいこなので、もう一回！");
        manual();
      }
    } catch (NumberFormatException e) {
      // 読み込み文字列不正
      if (input.equals("e")) {
        // 「e」終了を入力された場合
        System.out.println("マニュアルモードでのじゃんけんを終了します。");
      } else {
        // 「e」終了以外だったら再入力させる。
        manual();
      }
    }
  }

  /**
   * @return 読み込み文字列
   */
  private static String readLine() {
    // スキャン開始
    String input = scan.next();
    // スキャン終了
    // scan.close();

    return input;
  }

  /**
   * @return 読み込み文字列
   */
  private static result calcResult(int num, int aite) {
    // 結果の初期化
    result res = result.DROW;
    int resNum = num - aite;

    // 勝った負けた
    if (resNum < 0) {
      res = result.LOSE;
    } else if (resNum > 0) {
      res = result.WIN;
    } else {
      // 困ったら、引き分け
      res = result.DROW;
    }

    return res;
  }

  /**
   * @param args とりあえず！！！！！！！！！！！！！！！！
   */
  public static void test() {
    Date date = new Date();
    String dateString = date.toString();
    System.out.println("Today is " + dateString);

    // モード判定
    int num = 0;

    // 読み込み共通処理
    String input = readLine();

    try {
      // 読み込み文字列判定
      num = Integer.parseInt(input);

      switch (num) {
        case 0: {
          System.out.println("到達しないはず");
          break;
        }
        case 1: {
          System.out.println("1通過");
        }
          break;
        case 2: {
          System.out.println("1から2に通過");
          break;
        }
      }
    } catch (NumberFormatException e) {
      // 読み込み文字列不正
      if (input.equals("e")) {
        // e以外の文字列を入力された場合
        System.out.println("数字以外を入力されました。「」");
      }
      System.out.println("数字以外を入力されました。 " + e);
    }
  }
}

