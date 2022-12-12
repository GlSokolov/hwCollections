import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private Set<Product> products = new HashSet<>();

    public void add(Product product) {
        if (products.contains(product)){
            throw new IllegalArgumentException("Продукт с таким названием уже имеется");
        } else {products.add(product);}
    }

    @Override
    public String toString() {
        return "Продуктовый лист: "
                + products
                ;
    }
}
