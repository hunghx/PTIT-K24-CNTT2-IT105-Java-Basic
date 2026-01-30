package re.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import re.api.model.dto.ProductAddDto;
import re.api.model.dto.ProductResponseDto;
import re.api.model.dto.ProductUpdateDto;
import re.api.model.entity.Product;
import re.api.service.IProductService;

import java.util.List;

@RestController// trả về JSON
@RequestMapping("/api/v1/products") // api cho sản phẩm phiên bản v1
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping
    public ResponseEntity<List<ProductResponseDto>> getProducts(){
        List<ProductResponseDto> list = productService.getListProducts();
        if(list.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND) ;// 404 ko có tài nguyên nào phù hơp
        }
        return new ResponseEntity<>(list, HttpStatus.OK); // 200
    }
    // thêm mới
    @PostMapping
    public ResponseEntity<ProductResponseDto> createProduct(@RequestBody ProductAddDto request){
        return new ResponseEntity<>(productService.createProduct(request),HttpStatus.CREATED); // 201 , tạo thành công
    }
    // lấy chi tiết sp theo id
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable String id){
        Product p = productService.getProductById(id);
        if(p == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(p, HttpStatus.OK);
    }
    // cập nhật thông tin sản phẩm theo id
    @PutMapping("/{id}")
    public ResponseEntity<ProductResponseDto> updateProduct(@PathVariable String id,@RequestBody ProductUpdateDto request){
        ProductResponseDto res = productService.updateProduct(id, request);
        if(res == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(res, HttpStatus.OK);

        // 201 , tạo thành công
    }
    // Xóa cứng
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable String id){
        ProductResponseDto res = productService.deleteProduct(id);
        if(res == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
//        return new ResponseEntity<>(res, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
