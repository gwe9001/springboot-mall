package net.chunchieh.springbootmall.service;

import net.chunchieh.springbootmall.dto.ProductRequest;
import net.chunchieh.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void  updateProduct(Integer productId,ProductRequest productRequest);

    void  deleteProductById(Integer productId);
}
