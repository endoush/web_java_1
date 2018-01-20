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
   * �����Ă����X�L�����͎g���܂킷�B�N���[�Y�͂��Ȃ��B.
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
      // ����񂯂񃂁[�h�I���̊J�n
      modeSelect();

    } catch (Exception e) {
      // �����N���Ă�������B�A�v���͐�Ύ��ȂȂ��B
      System.out.println("�o�O���������܂����B " + e);
    }
  }

  /**
   * @param args
   */
  public static void modeSelect() {

    // ���[�h����
    System.out.println("����񂯂�̃��[�h��I�����Ă��������B\n�um:�}�j���A���v\n�ua:�I�[�g�v\n�ue:����񂯂�̏I���v");
    // �ǂݍ��݋��ʏ���
    String input = readLine();

    if ("m".equals(input)) {
      // �um�v�}�j���A������͂��ꂽ�ꍇ�͏I������B
      System.out.println("�}�j���A������񂯂񃂁[�h���J�n���܂��B");
      manual();
      System.out.println("");
      // �I�������A������񃁃j���[�ɖ߂�
      modeSelect();

    } else if ("a".equals(input)) {
      // �ua�v�I������͂��ꂽ�ꍇ�͏I������B
      System.out.println("�I�[�g����񂯂񃂁[�h���J�n���܂��B");
      System.out.println("�I�[�g����񂯂񃂁[�h�͖������ł��B");
      System.out.println("");
      // �I�������A������񃁃j���[�ɖ߂�
      modeSelect();

    } else if ("e".equals(input)) {
      // �ue�v�I������͂��ꂽ�ꍇ�͏I������B
      System.out.println("����񂯂���I�����܂��B");
    } else {
      // ���҂���������ȊO����͂��ꂽ�ꍇ�́A���[�j���O���b�Z�[�W��\�����A�ēx���͂����߂�
      System.out.println("���͂��ꂽ������Ɍ�肪����܂��B������x�ŏ������蒼���Ă��������B");
      System.out.println("");
      // ������񃁃j���[�ɖ߂�
      modeSelect();
    }

  }

  /**
   * @param args
   */
  public static void manual() {
    // �}�j���A�����[�h�̏���

    int num = 0;

    // �ǂݍ��݋��ʏ���
    System.out.println("�u1�v:�O�[�A�u2�v:�`���L�A�u3�v:�p�[����͂��Ă��������B");
    String input = readLine();

    try {
      // �ǂݍ��ݕ����񔻒�
      num = Integer.parseInt(input);

      switch (num) {
        case 1: {
          System.out.println("���Ȃ��F�O�[");
        }
          break;
        case 2: {
          System.out.println("���Ȃ��F�`���L");
          break;
        }
        case 3: {
          System.out.println("���Ȃ��F�p�[");
          break;
        }
        default: {
          // ���[�j���O����
          manual();
        }
      }
      int aNum = new RpsPlayerA().go().getId();
      switch (aNum) {
        case 1: {
          System.out.println("�����āF�O�[");
          break;
        }
        case 2: {
          System.out.println("�����āF�`���L");
          break;
        }
        case 3: {
          System.out.println("�����āF�p�[");
          break;
        }
        default: {
          // ���[�j���O����
        }
      }
      // ���ʔ���
      result res = calcResult(num, aNum);
      if (res == result.WIN) {
        System.out.println("���Ȃ��̏����ł��I");
      } else if (res == result.LOSE) {
        System.out.println("�c�O�B�B�B");
      } else {
        System.out.println("�������Ȃ̂ŁA�������I");
        manual();
      }
    } catch (NumberFormatException e) {
      // �ǂݍ��ݕ�����s��
      if (input.equals("e")) {
        // �ue�v�I������͂��ꂽ�ꍇ
        System.out.println("�}�j���A�����[�h�ł̂���񂯂���I�����܂��B");
      } else {
        // �ue�v�I���ȊO��������ē��͂�����B
        manual();
      }
    }
  }

  /**
   * @return �ǂݍ��ݕ�����
   */
  private static String readLine() {
    // �X�L�����J�n
    String input = scan.next();
    // �X�L�����I��
    // scan.close();

    return input;
  }

  /**
   * @return �ǂݍ��ݕ�����
   */
  private static result calcResult(int num, int aite) {
    // ���ʂ̏�����
    result res = result.DROW;
    int resNum = num - aite;

    // ������������
    if (resNum < 0) {
      res = result.LOSE;
    } else if (resNum > 0) {
      res = result.WIN;
    } else {
      // ��������A��������
      res = result.DROW;
    }

    return res;
  }

  /**
   * @param args �Ƃ肠�����I�I�I�I�I�I�I�I�I�I�I�I�I�I�I�I
   */
  public static void test() {
    Date date = new Date();
    String dateString = date.toString();
    System.out.println("Today is " + dateString);

    // ���[�h����
    int num = 0;

    // �ǂݍ��݋��ʏ���
    String input = readLine();

    try {
      // �ǂݍ��ݕ����񔻒�
      num = Integer.parseInt(input);

      switch (num) {
        case 0: {
          System.out.println("���B���Ȃ��͂�");
          break;
        }
        case 1: {
          System.out.println("1�ʉ�");
        }
          break;
        case 2: {
          System.out.println("1����2�ɒʉ�");
          break;
        }
      }
    } catch (NumberFormatException e) {
      // �ǂݍ��ݕ�����s��
      if (input.equals("e")) {
        // e�ȊO�̕��������͂��ꂽ�ꍇ
        System.out.println("�����ȊO����͂���܂����B�u�v");
      }
      System.out.println("�����ȊO����͂���܂����B " + e);
    }
  }
}

