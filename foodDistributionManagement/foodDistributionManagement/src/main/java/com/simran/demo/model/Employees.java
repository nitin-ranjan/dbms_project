package com.simran.demo.model;

public class Employees {
    private String E_ID;
    private String E_Name;
    private String Designation;
    private String Contact;
    private String Address;
    private Long Salary;
    public String getE_ID() {
        return E_ID;
    }
    public void setE_ID(String e_ID) {
        E_ID = e_ID;
    }
    public String getE_Name() {
        return E_Name;
    }
    public void setE_Name(String e_Name) {
        E_Name = e_Name;
    }
    public String getDesignation() {
        return Designation;
    }
    public void setDesignation(String designation) {
        Designation = designation;
    }
    public String getContact() {
        return Contact;
    }
    public void setContact(String contact) {
        Contact = contact;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public Long getSalary() {
        return Salary;
    }
    public void setSalary(Long salary) {
        Salary = salary;
    }
}