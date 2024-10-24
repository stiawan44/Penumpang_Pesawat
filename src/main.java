
public class main {
    public static void main(String[] args) {
        Flight flight = new Flight();

        System.out.println("Daftar Penumpang Awal Masih Kosong:");
        flight.displayPassanger();

        System.out.println("-------------------");
        System.out.println("-------------------");
        flight.addPassenger("1.Nur");
        flight.addPassenger("2.Sefa");
        flight.addPassenger("3.Anggita");
        flight.addPassenger("4.Intan");
        flight.addPassenger("5.Aulia");
        flight.addPassenger("6.TERSERAH");

        System.out.println("\nSetelah di tambah, daftar penumpang saat ini adalah:");
        flight.displayPassanger();
        System.out.println("-----------------");
        System.out.println("-----------------");
        flight.removePassenger("6.TERSERAH");


        System.out.println("\nDaftar penumpang setelah nama TERSERAH di hapus:");
        flight.displayPassanger();
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");

        System.out.println("\nMenghapus Penumpang Yang tidak ada di daftar pelanggan:");
        flight.removePassenger("Tukiyem");
    }
}
