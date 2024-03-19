package SelfStudy;

public class GirlFriend {
    private String name;
    private int year;
    private String gender;
    private String hobby;

    public GirlFriend(String name, int year, String gender, String hobby) {
        this.name = name;
        this.year = year;
        this.gender = gender;
        this.hobby = hobby;
    }

    public GirlFriend() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
