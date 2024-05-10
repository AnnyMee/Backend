package de.aittr.g_37_jp_shop.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.lang.NonNull;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    @NotNull(message = "Product title cannot be null")
    @NotBlank(message = "Product title cannot be empty")
    @Pattern(regexp = "[A-Z][a-z]{2,}", message = "Product title should be at least 3 character length, start with a capital letter and may contain only latin characters")
    private String title;

    @Column(name = "price")
    @NotNull(message = "Product price cannot be null")
    @DecimalMin(value = "5.00", message = "Product price should be equal to or greater than 5")
    @DecimalMax(value = "100000.00", inclusive = false, message = "Product price should be less than 100 000")
    private BigDecimal price;

    @Column(name = "is_active")
    private boolean isActive;

    public Product() {
    }

    public Product(Long id, String title, BigDecimal price, boolean isActive) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (isActive != product.isActive) return false;
        if (!Objects.equals(id, product.id)) return false;
        if (!Objects.equals(title, product.title)) return false;
        return Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Product: ID - %d, title - %s, price - %f.2, active - %s",id, title, price, isActive ? "Yes" : "No");
    }
}
