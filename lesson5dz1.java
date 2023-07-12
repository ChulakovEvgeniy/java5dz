public class lesson5dz1 {
    public static void main(String[] args) {
        phone phone = new phone();
        phone.addPhone("Петр Иванов", "89997773535");
        phone.addPhone("Петр Сидоров", "89991453235");
        phone.addPhone("Евгений Иванов", "89995721536");
        phone.addPhone("Алексей Иванов", "89997712478");
        phone.addPhone("Евгений Иванов", "89997339977");

        System.out.println(phone.print());
    }
}
