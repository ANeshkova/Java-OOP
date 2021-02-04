package shoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name.trim();
    }

    public double getMoney() {
        return this.money;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void buyProduct(Product product) {
        if (this.getMoney() >= product.getCost()) {
            this.setMoney(this.getMoney() - product.getCost());
            this.getProducts().add(product);
        } else {
            throw new IllegalStateException(this.getName() + " can't afford " + product.getName());
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.getName()).append(" - ");
        if (this.getProducts().size() < 1) {
            builder.append("Nothing bought");
        } else {
            builder.append(this.getProducts()
                    .stream()
                    .map(Product::getName)
                    .collect(Collectors.joining(", ")));
        }
        return builder.toString();
    }
}
