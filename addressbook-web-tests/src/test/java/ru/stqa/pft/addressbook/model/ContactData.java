package ru.stqa.pft.addressbook.model;

public class ContactData {


    private  String name;
    private  String lastName;
    private  String mobile;
    private  String group;


    public ContactData(String name, String lastName, String mobile,String group) {
        this.name = name;
        this.lastName = lastName;
        this.mobile = mobile;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
