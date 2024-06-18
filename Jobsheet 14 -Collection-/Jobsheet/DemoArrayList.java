import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        
        Customer customer1 =  new Customer(1, "Zakia");
        Customer customer2 = new Customer(5, "Budi");
        
        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer(4, "Cica"));

        //menambahkan di indeks tertentu
        customers.add(2, new Customer(100, "Rosa"));

        //mencari tahu posisi indeks
        System.out.println(customers.indexOf(customer2));

        //mengembalikan object pada indeks tertentu
        Customer customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        //untuk menambahkan data pada arraylist baru ke arraylist lama
        ArrayList<Customer> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer(201, "Della"));
        newCustomers.add(new Customer(202, "Victor"));
        newCustomers.add(new Customer(203, "Sarah"));

        customers.addAll(newCustomers);

        for(Customer cust : customers){
            System.out.println(cust.toString());
        }

        //ketika memakai method toString()
        System.out.println(customers);

        //Collections sort
        ArrayList<String> daftarSiswa = new ArrayList<>();
        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");
        Collections.sort(daftarSiswa);

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println(customers);
        customers.sort((c1, c2) -> Integer.compare(c1.id, c2.id));
        System.out.println(customers);
        
    }
}
