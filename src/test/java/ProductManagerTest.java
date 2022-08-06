import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    ProductRepo repo = new ProductRepo();
    ProductManager manager = new ProductManager(repo);


    Book book1 = new Book(12, "The sky", 100, "Rodger Red");
    Book book2 = new Book(122, "Sunflower", 300, "Emma Lee");
    Book book3 = new Book(143, "Night sky ", 200, "Phil Stone");


    Smartphone smartphone1 = new Smartphone(56, "Iphone", 300, "Apple");
    Smartphone smartphone2 = new Smartphone(99, "Galaxy", 300, "Samsung Electronics");
    Smartphone smartphone3 = new Smartphone(103, "Galaxy Global", 300, "Samsung Electronics");


    @Test

    public void test1() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("Sunflower");
        Product[] expected = {book2};

        assertArrayEquals(expected, actual);
    }

    @Test

    public void test2() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("sky");
        Product[] expected = {book1, book3};

        assertArrayEquals(expected, actual);

    }

    @Test

    public void test3() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("cat");
        Product[] expected = {};

        assertArrayEquals(expected, actual);

    }

    @Test

    public void test4() {
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = manager.searchBy("Galaxy");
        Product[] expected = {smartphone2, smartphone3};

        assertArrayEquals(expected, actual);
    }

    @Test

    public void test5() {
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = manager.searchBy("Iphone");
        Product[] expected = {smartphone1};

        assertArrayEquals(expected, actual);
    }

    @Test

    public void test6() {
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);

        Product[] actual = manager.searchBy("Xiaomi");
        Product[] expected = {};

        assertArrayEquals(expected, actual);
    }

}
