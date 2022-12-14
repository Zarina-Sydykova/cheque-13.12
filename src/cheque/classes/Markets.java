package cheque.classes;

import cheque.enums.Products;

import java.math.BigDecimal;

public class Markets {
    public static Markets[] values;
    private Markets markets;
    private BigDecimal bankAccount;
    private String address;
    private Products products;

    public Markets(Markets markets, BigDecimal bankAccount, String address, Products products) {
        this.markets = markets;
        this.bankAccount = bankAccount;
        this.address = address;
        this.products = products;
    }

    public static Markets valueOf(String toUpperCase) {
        return null;
    }


    public Markets markets() {
        return markets;
    }

    public void setMarkets(Markets markets) {
        this.markets = markets;
    }

    public BigDecimal getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BigDecimal bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Markets{" +
                "markets='" + markets + '\'' +
                ", bankAccount=" + bankAccount +
                ", address='" + address + '\'' +
                ", products=" + products +
                '}';
    }
}
