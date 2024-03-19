package SelfStudy;

public class User {
    private String name;
    private String password;
    private String idNumber;
    private String phoneNumber;

    public User() {
    }

    public User(String name, String password, String idNumber, String phoneNumber) {
        this.name = name;
        this.password = password;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
