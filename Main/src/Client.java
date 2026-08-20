public class Client {

    // A client has attributes

    String name;
    String surName;
    String phoneNumber;

    public Client(String name , String surName , String phoneNumber){
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;

    }

    public String getName() {
        return name;
    }
}
