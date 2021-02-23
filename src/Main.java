public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact("Sergey", "Bordulev", "913456321");
        contact.print();

        contact.setFirstName("Alex");
        contact.setSecondName("Bogachev");
        contact.setTelephone("913777000");

        System.out.println();
        System.out.println(contact.getFirstName());
        System.out.println(contact.getSecondName());
        System.out.println(contact.getTelephone());
    }
}
