public class Guest {

    private String name;
    private String passportNumber;
    private String phone;

    public Guest(String name, String passportNumber, String phone) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
