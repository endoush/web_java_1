/**
 *
 */
package rps;

/**
 * .
 * @return �Ȃ񂩂̐�����ԋp.
 * @author systena
 *
 */
public class RpsPlayerA extends RpsPlayerBase {
  @Override
  public RpsType go() {
    // �ԋp����l
    RpsType retType = RpsType.ROCK;

    int retNum = 0;

    retNum = ((int)Math.random()) % 3;

    if (0 == retNum) {
      retType = RpsType.ROCK;
    } else if (1 == retNum) {
      retType = RpsType.PAPER;
    } else if (2 == retNum) {
      retType = RpsType.SCISSORS;
    } else {
      retType = RpsType.ROCK;
    }

    return retType;
  }

}
