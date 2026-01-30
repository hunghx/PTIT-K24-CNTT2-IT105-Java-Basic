package re.api.service;

import re.api.model.dto.ProductAddDto;
import re.api.model.dto.ProductResponseDto;
import re.api.model.dto.ProductUpdateDto;
import re.api.model.entity.Product;

import java.util.List;

public interface IProductService {
    List<ProductResponseDto> getListProducts();
    ProductResponseDto createProduct(ProductAddDto request);
    Product getProductById(String id);
    ProductResponseDto updateProduct(String id, ProductUpdateDto request);
    ProductResponseDto deleteProduct(String id);
}
