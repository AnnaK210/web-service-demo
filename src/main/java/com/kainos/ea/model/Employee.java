package com.kainos.ea.model;

public class Employee {
    private int salesEmpID;
    private String sName;
    private int salary;
    private char bankNo;
    private char NIN;
    private char phoneNo;
    private float commissionRate;
    private float totalSales;


    public Employee(int i, String s, int i1) {
        setSalesEmpID(i);
        setsName(s);
        setSalary(i1);
    }

    public Employee(int number, String name, int salary, String bankNo, String nin, String phoneNo, float commissionrate, float totalSales) {
        this(number, name, salary, bankNo, )
    }

    int getSalary() {
        return salary;
    }

    private void setSalary(int i1) {
        this.salary = salary;
    }

    public int calcPay() {
        return getSalary() / 12;
    }


    public Employee() {
        salesEmpID = -1;
    }

    public Employee(int newSalesEmpID, int newSalary) {
        this.setSalesEmpID(newSalesEmpID);
        setSalary(newSalary);
    }

    public int getSalesEmpID() {
        return salesEmpID;
    }

    public void setSalesEmpID(int number) {
        this.salesEmpID = salesEmpID;
    }

    public void setSalesEmpID(String salesEmpID) {
        short s = Short.parseShort(salesEmpID);
        setSalesEmpID(s);
    }


    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }


    public char getBankNo() {
        return bankNo;
    }

    public void setBankNo(char bankNo) {
        this.bankNo = bankNo;
    }

    public char getNIN() {
        return NIN;
    }

    public void setNIN(char NIN) {
        this.NIN = NIN;
    }

    public char getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(char phoneNo) {
        this.phoneNo = phoneNo;
    }

    public float getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(float commissionRate) {
        this.commissionRate = commissionRate;
    }

    public float getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(float totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "number=" + getSalesEmpID() +
                ", salary=" + getSalary() +
                ", name='" + getsName() + '\'' +
                '}';
    }
}


