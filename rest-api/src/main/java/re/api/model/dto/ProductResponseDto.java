package re.api.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDto {
    private String productId;
    private String productName;
    private float productPrice;
    private int productStock;
}
