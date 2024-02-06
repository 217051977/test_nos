package com.leal.bruno.nos.test;

import com.leal.bruno.nos.test.pages.ProductListPage;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductPageTest {

    @Test
    void testBuy() {
        ProductListPage productListPage = new ProductListPage();
        assertEquals(productListPage.getAll(), List.of(new Product("bag", "asda3453sad", 19.99)));
    }

}
