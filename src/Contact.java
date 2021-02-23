public class Contact {
    private String firstName;
    private String secondName;
    private String telephone;

    public Contact(String firstName, String secondName, String telephone) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.telephone = telephone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void print() {
        System.out.printf("(%s, %s, %s)", firstName, secondName, telephone);
    }
}
