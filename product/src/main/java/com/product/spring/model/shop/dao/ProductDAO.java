package com.product.spring.model.shop.dao;

import java.util.List;

import com.product.spring.model.shop.dto.ProductDTO;

public interface ProductDAO {
	List<ProductDTO> listProduct();
	ProductDTO datailProduct(int product_id);
	void updateproduct(ProductDTO dto);
	void deleteproduct(int product_id);
	void insertproduct(ProductDTO dto);
	String fileInfo(int product_id);
}
