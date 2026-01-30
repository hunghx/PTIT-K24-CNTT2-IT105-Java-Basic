package re.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import re.api.model.entity.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product,String> {

}
