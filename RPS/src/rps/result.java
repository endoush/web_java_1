package rps;

/**
 * ����񂯂񌋉� �񋓌^.
 */
public enum result {
  WIN(1),      // ����
  DROW(2),     // ������
  LOSE(3);  // ����

  private final int id;

  /**
   * �R���X�g���N�^.
   * @param id ID
   */
  private result(final int id) {
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
