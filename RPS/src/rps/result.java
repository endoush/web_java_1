package rps;

/**
 * じゃんけん結果 列挙型.
 */
public enum result {
  WIN(1),      // 負け
  DROW(2),     // あいこ
  LOSE(3);  // 勝ち

  private final int id;

  /**
   * コンストラクタ.
   * @param id ID
   */
  private result(final int id) {
    this.id = id;
  }

  /*
   * 列挙型のID取得
   * @return ID
   */
  public int getId() {
    return id;
  }
}
