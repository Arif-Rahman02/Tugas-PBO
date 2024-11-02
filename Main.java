public class Main{
  public static void main(String[] args) {
    Pelanggan pelanggan1 = new Pelanggan("Budi");
    Pelanggan pelanggan2 = new Pelanggan("Joko");
    pelanggan1.tampilanPelanggan();
    pelanggan2.tampilanPelanggan();
    System.out.println();

    Menu menu1 = new Menu("Nasi goreng", 10000);
    Menu menu2 = new Menu("Magelangan", 12000);
    Menu menu3 = new Menu("Es teh", 2000);
    menu1.tampilanMenu();
    menu2.tampilanMenu();
    System.out.println();

    TakeAway takeAway = new TakeAway();
    takeAway.tampilanJenis();

    Pesanan pesanan1 = new Pesanan(pelanggan1, takeAway);
    pesanan1.tambahMenu(menu1);
    pesanan1.tambahMenu(menu3);
    pesanan1.tampilanDetail();
    System.out.println();


  }
}