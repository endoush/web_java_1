package rps;

/**
 * ����񂯂�o���� �񋓌^.
 */
public enum RpsType {
  ROCK(1),      // �O�[
  SCISSORS(2),     // �`���L
  PAPER(3);  // �p�[

  private final int id;

  /**
   * �R���X�g���N�^.
   * @param id ID
   */
  private RpsType(final int id) {
    this.id = id;
  }

  /*
   * �񋓌^��ID�擾
   * @return ID
   */
  public int getId() {
    return id;
  }
}
