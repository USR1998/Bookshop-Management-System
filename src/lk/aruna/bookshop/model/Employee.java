/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.aruna.bookshop.model;

public class Employee {
    String enumber;
    String name;
    String address;
    String tpnumber;

    public Employee() {
    }

    public Employee(String enumber, String name, String address, String tpnumber) {
        this.enumber = enumber;
        this.name = name;
        this.address = address;
        this.tpnumber = tpnumber;
    }

    public String getEnumber() {
        return enumber;
    }

    public void setEnumber(String enumber) {
        this.enumber = enumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTpnumber() {
        return tpnumber;
    }

    public void setTpnumber(String tpnumber) {
        this.tpnumber = tpnumber;
    }

    @Override
    public String toString() {
        return "Employee{" + "enumber=" + enumber + ", name=" + name + ", address=" + address + ", tpnumber=" + tpnumber + '}';
    }
    
    
}
