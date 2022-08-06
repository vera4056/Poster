import java.util.Arrays;

public class ProductRepo {
    protected Product[] products = new Product[0];

    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }

        tmp[tmp.length - 1] = product;
        products = tmp;

    }


    public Product[] findAll() {
        return products;

    }

    public void removeById(int id) {

        Product[] tmp = new Product[products.length - 1];
        int copyToIndex = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[copyToIndex] = product;
                copyToIndex++;
            }

        }
        products = tmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Arrays.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(products);
    }
}




