package by.overone.online_shop.service;

import by.overone.online_shop.dto.ProductDTO;
import by.overone.online_shop.model.Product;

import java.util.List;

public interface ProductService {

    List<ProductDTO> getAllProducts();
}