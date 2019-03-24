package hw_3;

public class Main {

    public static void main(String[] args) {
        Addressee unknow = new Addressee();
        Addressee vasya = new Addressee("Vasilij", "Ivanov", "engineer", "+380970000001");

        System.out.println("first addressee: " + unknow.toString());
        System.out.println("second addressee: " + vasya.toString());

        System.out.println("Name of first addressee: " + vasya.getNameFirst());
        System.out.println("Second name of first addressee: " + vasya.getNameSecond());
        System.out.println("Social status of first addressee: " + vasya.getSocialStatus());
        System.out.println("Phone number of first addressee: " + vasya.getPhoneNumber());

        unknow.setNameFirst("masha");
        unknow.setNameSecond("petrova");
        unknow.setSocialStatus("student");
        unknow.setPhoneNumber("+380630000002");

        System.out.println("second addressee (renew): " + unknow.toString());


    }
}
