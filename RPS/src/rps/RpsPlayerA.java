/**
 *
 */
package rps;

/**
 * .
 * @return なんかの数字を返却.
 * @author systena
 *
 */
public class RpsPlayerA extends RpsPlayerBase {
  @Override
  public RpsType go() {
    // 返却する値
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
