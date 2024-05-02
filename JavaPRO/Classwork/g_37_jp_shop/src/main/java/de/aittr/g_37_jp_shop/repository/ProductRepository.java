package de.aittr.g_37_jp_shop.repository;

import de.aittr.g_37_jp_shop.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository  extends JpaRepository<Product, Long> {

    //в данном случае тело метода и sql запрос будет сгенерирован framework-ом
    // Product findByTitle(String title);

    //в данном случае тело метода будет сгенерирован framework-ом, но sql запрос он применит тот, который мы ему дали
    @Query(value = "SELECT * FROM product WHERE  title = :title", nativeQuery = true)
    Product findByTitle(@Param("title") String productTitle);
}
