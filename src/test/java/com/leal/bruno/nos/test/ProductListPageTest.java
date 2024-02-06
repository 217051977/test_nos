package com.leal.bruno.nos.test;

import com.leal.bruno.nos.test.pages.ProductListPage;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductListPageTest {

    @Test
    void testGetAllProducts() {
        ProductListPage productListPage = new ProductListPage();
        assertEquals(productListPage.getAll(), List.of(new Product("bag", "asda3453sad", 19.99)));
    }

    @Test
    void testGetProduct() {
        ProductListPage productListPage = new ProductListPage();
        assertEquals(productListPage.get("asda3453sad"), new Product("bag", "asda3453sad", 19.99));
    }

}
