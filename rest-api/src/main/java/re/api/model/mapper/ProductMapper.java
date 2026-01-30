package re.api.model.mapper;

import re.api.model.dto.ProductAddDto;
import re.api.model.dto.ProductResponseDto;
import re.api.model.dto.ProductUpdateDto;
import re.api.model.entity.Product;

import java.time.LocalDate;

public class ProductMapper {
    public static ProductResponseDto toProductDto(Product product){
        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setProductId(product.getProductId());
        productResponseDto.setProductName(product.getProductName());
        productResponseDto.setProductPrice(product.getProductPrice());
        productResponseDto.setProductStock(product.getProductStock());
        return productResponseDto;

    }

    public static Product toEntity(ProductAddDto request){
        Product p = new Product();
        p.setProductId(request.getProductId());
        p.setProductName(request.getProductName());
        p.setProductPrice(request.getProductPrice());
        p.setProductStock(request.getProductStock());
        p.setProductDescription(request.getProductDescription());
        p.setCategory(request.getCategory());
        p.setCreateAt(LocalDate.now());
        return p;
    }
    public static Product updateProduct(Product old , ProductUpdateDto request){
        if(request.getProductName() !=null && !request.getProductName().trim().isBlank()){
            old.setProductName(request.getProductName());
        }
        if (request.getProductDescription() !=null && !request.getProductDescription().trim().isBlank()){
            old.setProductDescription(request.getProductDescription());
        }
        if(request.getProductStock()>=0){
            old.setProductStock(request.getProductStock());
        }
        if(request.getProductPrice()>=0){
            old.setProductPrice(request.getProductPrice());
        }
        old.setUpdateAt(LocalDate.now());
        return old;
    }
}
