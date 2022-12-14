import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void space () {
        System.out.println("================================================================================");
    }
    public static void main(String[] args) {
        Product[] products = new Product[10];
        products[0] = new Product(200, "Банан", 1000);
        products[1] = new Product(13, "Арбуз", 1000);
        products[2] = new Product(15, "Дыня", 1000);
        products[3] = new Product(240, "Хурма", 1000);
        products[4] = new Product(250, "Куринная грудка", 300);
        products[5] = new Product(150, "Помидоры", 1000);
        products[6] = new Product(110, "Огурцы", 1000);
        products[7] = new Product(230, "Фарш говяжий", 300);
        products[8] = new Product(80, "Голубика", 100);
        products[9] = new Product(40, "Орехи", 100);

        for (int i = 0; i < products.length; i++) {
            for (int j = i+1; j < products.length; j++) {
                if (products[i].equals(products[j])) {
                    throw new RuntimeException("Созданы два одинаковых продукта");
                }
            }
        }

        Set<Product> productsList = new HashSet<>();
        productsList.add(products[0]);
        productsList.add(products[1]);
        productsList.add(products[2]);
        productsList.add(products[3]);
        productsList.add(products[4]);
        productsList.add(products[5]);
        productsList.add(products[6]);
        productsList.add(products[7]);
        productsList.add(products[8]);
        productsList.add(products[9]);
        productsList.remove(products[9]);


        System.out.printf(Arrays.toString(productsList.toArray()));

        System.out.printf(Arrays.toString(products));

    }
}