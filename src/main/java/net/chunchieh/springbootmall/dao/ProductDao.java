package net.chunchieh.springbootmall.dao;

import net.chunchieh.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
