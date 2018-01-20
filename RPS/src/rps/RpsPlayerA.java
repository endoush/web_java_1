/**
 *
 */
package rps;

/**
 * .
 * @return ‚È‚ñ‚©‚Ì”š‚ğ•Ô‹p.
 * @author systena
 *
 */
public class RpsPlayerA extends RpsPlayerBase {
  @Override
  public RpsType go() {
    // •Ô‹p‚·‚é’l
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
