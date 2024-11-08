package com.idimis.montrack.model;

public class Wallet {
    private Integer id;
    private String name;
    private Integer amount;
    private Boolean isActive;

    // Constructors
    public Wallet(int id, int userId, String name, int amount, boolean isActive) {}

    public Wallet(Integer id, String name, Integer amount, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.isActive = isActive;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
