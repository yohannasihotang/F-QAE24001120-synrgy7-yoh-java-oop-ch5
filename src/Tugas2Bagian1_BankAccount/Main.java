package Tugas2Bagian1_BankAccount;

public class Main {
    public static void main(String[] args) {
        // Membuat objek BankAccount
        BankAccount account1 = new BankAccount("11421007", 1000, "Yohanna Melani Sihotang", "yohannasihotang27@gmail.com", "081397268661");

        // Menampilkan informasi akun
        System.out.println("Informasi Akun:");
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Balance: " + account1.getBalance());
        System.out.println("Customer Name: " + account1.getCustomerName());
        System.out.println("Customer Email: " + account1.getCustomerEmail());
        System.out.println("Customer Phone: " + account1.getCustomerPhone());

        // Melakukan deposit dan menampilkan saldo baru
        account1.deposit(500);
        System.out.println("\nSetelah deposit 500:");
        System.out.println("Balance: " + account1.getBalance());

        // Melakukan withdraw dan menampilkan saldo baru
        account1.withdraw(200);
        System.out.println("\nSetelah withdraw 200:");
        System.out.println("Balance: " + account1.getBalance());

        // Melakukan withdraw dengan saldo tidak mencukupi
        account1.withdraw(2000);
    }
}
