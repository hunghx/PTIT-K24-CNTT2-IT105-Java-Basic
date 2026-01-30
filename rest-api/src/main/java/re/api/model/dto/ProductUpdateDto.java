package re.api.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductUpdateDto {
    private String productName;
    private String productDescription;
    private float productPrice;
    private int productStock;
    private String category;
}
