package ru.stqa.pft.addressbook.model;

import org.testng.annotations.BeforeMethod;

import java.util.Objects;

public class GroupData {
    private int id = Integer.MAX_VALUE;
    private  String name;
    private  String header;
    private  String footer;


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public GroupData withName(String name) {
        this.name = name;
        return this;
    }

    public GroupData withHeader(String header) {
        this.header = header;
        return this;
    }

    public GroupData withFooter(String footer) {
        this.footer = footer;
        return this;
    }

    public GroupData withId(int id) {
        this.id = id;
        return this;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

    @Override
    public String toString() {
        return "GroupData{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupData groupData = (GroupData) o;
        return getId() == groupData.getId() && Objects.equals(getName(), groupData.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
}