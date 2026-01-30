package re.api.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Product {
    @Id
    private String productId;
    private String productName;
    private String productDescription;
    private float productPrice;
    private int productStock;
    private String category;
    private LocalDate createAt;
    private LocalDate updateAt;
}
