class Pesanan {
  private final Pelanggan pelanggan;
  private final Jenis jenisPesanan;
  private final Menu[] menu;
  private int jumlah;

  public Pesanan(Pelanggan pelanggan, Jenis jenisPesanan) {
      this.pelanggan = pelanggan;
      this.jenisPesanan = jenisPesanan;
      this.menu = new Menu[20];
      this.jumlah = 0;
  }

  public void tambahMenu(Menu pilihanMenu) {
      if (jumlah < menu.length) {
          menu[jumlah++] = pilihanMenu;
      } else {
          System.out.println("Tidak bisa menambah menu.");
      }
  }

  public double totalHarga() {
      double total = 0;
      for (int i = 0; i < jumlah; i++) {
          total += menu[i].getHarga();
      }
      return total;
  }

  public void tampilanDetail() {
      pelanggan.tampilanPelanggan();
      jenisPesanan.tampilanJenis();
      System.out.println("Detail pesanan:");
      for (int i = 0; i < jumlah; i++) {
          menu[i].tampilanMenu();
      }
      System.out.println("Total harga: Rp " + totalHarga());
      System.out.println("Status pesanan: " + jenisPesanan.getStatus());
  }
}