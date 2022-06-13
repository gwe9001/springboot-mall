package net.chunchieh.springbootmall.dao;

import net.chunchieh.springbootmall.constant.ProductCategory;
import net.chunchieh.springbootmall.dto.ProductRequest;
import net.chunchieh.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void  updateProduct(Integer productId,ProductRequest productRequest);

    void  deleteProductById(Integer productId);
}
