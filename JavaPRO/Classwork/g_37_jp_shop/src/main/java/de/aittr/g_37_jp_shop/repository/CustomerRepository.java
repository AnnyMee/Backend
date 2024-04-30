package de.aittr.g_37_jp_shop.repository;

import de.aittr.g_37_jp_shop.domen.entity.Customer;
import de.aittr.g_37_jp_shop.domen.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query(value = "SELECT * FROM product WHERE name = :name", nativeQuery = true)
    Customer findByName(@Param("name") String customerName);
}
