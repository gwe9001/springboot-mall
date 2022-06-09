package net.chunchieh.springbootmall.dao;

import net.chunchieh.springbootmall.dto.ProductRequest;
import net.chunchieh.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void  updateProduct(Integer productId,ProductRequest productRequest);
}
