import javax.lang.model.element.Name;
import java.util.Objects;

public class Product {
    private int price;
    private String name;
    private int amount;

    public Product(int price, String name, int amount) {
        setName(name);
        setPrice(price);
        setAmount(amount);

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("Заполните карточки товара полностью (Название)");
        } else {
            this.name = name;}
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        try {
            if (price > 0) {
                this.price = price;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException msg) {
            System.out.println("Заполните карточку товара ["+ getName() +"] полностью (Цена)");
        }
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        try {
            if (amount > 0) {
                this.amount = amount;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException msg) {
            System.out.println("Заполните карточку товара "+ getName() +" полностью (Вес)");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && amount == product.amount && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, amount);
    }

    @Override
    public String toString() {
        return  name +
                " цена за "+amount+"гр. = "+ price +
                "руб.";
    }
}
