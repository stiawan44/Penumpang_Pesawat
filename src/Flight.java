
public class Flight {
    Passenger head;
    public void addPassenger(String name){
        Passenger passenger = new Passenger(name);
        if (head == null){
            head = passenger;
        } else {
            Passenger current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = passenger;
        }
    }
    public void removePassenger(String name){
        if (head == null){
            System.out.println("Penumpang Kosong");
            return;
        }
        if (head.name.equalsIgnoreCase(name)){
            head = head.next;
            return;
        }
        Passenger current = head;
        Passenger prev = null;

        while (current != null && !current.name.equalsIgnoreCase(name)){
            prev = current;
            current = current.next;
        }
        if (current == null){
            System.out.println("Nama " + name + " tidak ditemukan");
        } else {
            assert prev != null;
            assert prev != null;
            prev.next = current.next;
        }
    }
    public void displayPassanger(){
        if (head == null){
            System.out.println("Saat Ini Tidak Ada Penumpang Dalam Daftar");
        } else {
            Passenger current = head;
            while (current != null){
                System.out.println(current.name);
                current = current.next;
            }
        }
    }
}
