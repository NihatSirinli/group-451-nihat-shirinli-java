package classwork_22;

import java.util.ArrayList;

public class Cart {
    ArrayList<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void removeProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                products.remove(i);
                break;
            }
        }
    }

    double getTotalPrice() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    void printCart() {
        System.out.println("--- Содержимое корзины ---");
        if (products.isEmpty()) {
            System.out.println("Корзина пуста.");
        } else {
            for (Product p : products) {
                System.out.println("- " + p.getName() + ": " + p.getPrice() + " руб.");
            }
        }
        System.out.println("Итоговая сумма: " + getTotalPrice() + " руб.");
        System.out.println("--------------------------");
    }
}
