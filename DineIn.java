class DineIn extends Jenis {
  private int meja;

  public DineIn(int meja) {
      super();
      this.meja = meja;
  }

  public int getMeja() {
      return meja;
  }

  public void setMeja(int meja) {
      this.meja = meja;
  }

  @Override
  public void tampilanJenis() {
      System.out.println("Makan di tempat di meja: " + meja);
  }
}