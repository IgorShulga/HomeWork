package hw_3;

import java.util.Objects;

public class Addressee {

    private String nameFirst;
    private String nameSecond;
    private String socialStatus;
    private String phoneNumber;

    public Addressee() {
    }

    public Addressee(String nameFirst, String phoneNumber) {
        this.nameFirst = nameFirst;
        this.nameSecond = nameSecond;
        this.socialStatus = socialStatus;
        this.phoneNumber = phoneNumber;
    }

    public Addressee(String nameFirst, String nameSecond, String socialStatus, String phoneNumber) {
        this.nameFirst = nameFirst;
        this.nameSecond = nameSecond;
        this.socialStatus = socialStatus;
        this.phoneNumber = phoneNumber;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameSecond() {
        return nameSecond;
    }

    public void setNameSecond(String nameSecond) {
        this.nameSecond = nameSecond;
    }

    public String getSocialStatus() {
        return socialStatus;
    }

    public void setSocialStatus(String socialStatus) {
        this.socialStatus = socialStatus;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Addressee addressee = (Addressee) o;
        return Objects.equals(nameFirst, addressee.nameFirst) &&
                Objects.equals(nameSecond, addressee.nameSecond) &&
                Objects.equals(socialStatus, addressee.socialStatus) &&
                Objects.equals(phoneNumber, addressee.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFirst, nameSecond, socialStatus, phoneNumber);
    }

    @Override
    public String toString() {
        return "Addressee{" +
                "nameFirst='" + nameFirst + '\'' +
                ", nameSecond='" + nameSecond + '\'' +
                ", socialStatus='" + socialStatus + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
