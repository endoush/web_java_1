package rps;

import java.util.Date;

/**
 * Hello�N���X.
 *
 * @author systena
 *
 */
public class Hello {

  /**
   * �又��.
   *
   */
  public void test() {
    System.out.println("HelloWorld1");
    Date date = new Date();
    String dateString = date.toString();

    int num = 0;
    System.out.println("Today is " + dateString);

    if (dateString.contains("Dec")) {
      System.out.println("��̏�ł̓f�B�Z���o�[�I�I�I�I");
      num = 1;
    } else {
      num = 2;
      System.out.println("����");
    }
    switch (num) {
      case 0: {
        System.out.println("���B���Ȃ�");
        break;
      }
      case 1: {
        System.out.println("1�ʉ�");
      }
//        break;
      case 2: {
        System.out.println("1����2�ɒʉ�");
        break;
      }
    }
  }
}
