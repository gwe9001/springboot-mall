package net.chunchieh.springbootmall.dao;

import net.chunchieh.springbootmall.dto.ProductQueryParams;
import net.chunchieh.springbootmall.dto.ProductRequest;
import net.chunchieh.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void  updateProduct(Integer productId,ProductRequest productRequest);

    void  deleteProductById(Integer productId);
}
