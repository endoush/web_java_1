package rps;

import java.util.Date;

/**
 * Helloクラス.
 *
 * @author systena
 *
 */
public class Hello {

  /**
   * 主処理.
   *
   */
  public void test() {
    System.out.println("HelloWorld1");
    Date date = new Date();
    String dateString = date.toString();

    int num = 0;
    System.out.println("Today is " + dateString);

    if (dateString.contains("Dec")) {
      System.out.println("暦の上ではディセンバー！！！！");
      num = 1;
    } else {
      num = 2;
      System.out.println("おお");
    }
    switch (num) {
      case 0: {
        System.out.println("到達しない");
        break;
      }
      case 1: {
        System.out.println("1通過");
      }
//        break;
      case 2: {
        System.out.println("1から2に通過");
        break;
      }
    }
  }
}
