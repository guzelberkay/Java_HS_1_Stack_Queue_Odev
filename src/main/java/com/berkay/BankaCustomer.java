package com.berkay;

public class BankaCustomer {
    String fullname;
    boolean isBankCustomer;
    int id;

 @Override
 public String toString() {
  final StringBuffer sb = new StringBuffer("Customer{");
  sb.append("fullname='").append(fullname).append('\'');
  sb.append(", isBankCustomer=").append(isBankCustomer);
  sb.append(", id='").append(id).append('\'');
  sb.append('}');
  return sb.toString();
 }

 public BankaCustomer(String fullname, boolean isBankCustomer, int id) {
  this.fullname = fullname;
  this.isBankCustomer = isBankCustomer;
  this.id = id;
 }

 public String getFullname() {
  return fullname;
 }

 public void setFullname(String fullname) {
  this.fullname = fullname;
 }

 public boolean isBankCustomer() {
  return isBankCustomer;
 }

 public void setBankCustomer(boolean bankCustomer) {
  isBankCustomer = bankCustomer;
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }
}
