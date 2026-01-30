package re.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import re.api.model.dto.ProductAddDto;
import re.api.model.dto.ProductResponseDto;
import re.api.model.dto.ProductUpdateDto;
import re.api.model.entity.Product;
import re.api.model.mapper.ProductMapper;
import re.api.repository.IProductRepository;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService{
    @Autowired
    private IProductRepository productRepository;
    @Override
    public List<ProductResponseDto> getListProducts() {
        return productRepository.findAll().stream()
                .map(ProductMapper::toProductDto)
                .toList();

    }

    @Override
    public Product getProductById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public ProductResponseDto createProduct(ProductAddDto request) {
        // biến đổi từ request -> entity
        Product p = ProductMapper.toEntity(request);
        // lưu lại entity
        p = productRepository.save(p);
        // biến đổi từ entity -> response
        return ProductMapper.toProductDto(p);
    }

    @Override
    public ProductResponseDto updateProduct(String id, ProductUpdateDto request) {
        // tìm theo id
        Product p = productRepository.findById(id).orElse(null);
        if (p == null) {
            return null;
        }
        ProductMapper.updateProduct(p, request);
        productRepository.save(p);
        return ProductMapper.toProductDto(p);
    }

    @Override
    public ProductResponseDto deleteProduct(String id) {
        Product p = productRepository.findById(id).orElse(null);
        if (p == null) {
            return null;
        }
        productRepository.deleteById(id);
        return ProductMapper.toProductDto(p);
    }
}
