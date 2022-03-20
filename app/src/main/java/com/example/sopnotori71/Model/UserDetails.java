package com.example.sopnotori71.Model;

public class UserDetails {

    String uid, email, name, phone, address, blood, gender, dob, last;

    public UserDetails() {
    }

    public UserDetails(String uid, String email, String name, String phone, String address,
                       String blood, String gender, String dob, String last) {
        this.uid = uid;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.blood = blood;
        this.gender = gender;
        this.dob = dob;
        this.last = last;
    }

    public String getUid() {
        return uid;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getBlood() {
        return blood;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public String getLast() {
        return last;
    }
}
