package ch.froorider.cheesecakefactory_jeeservice.entity;

import java.util.UUID;

public class Meal{

private String name;
private String description;
private int price;
private UUID identifier;

    public Meal(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
        identifier = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
    }
}