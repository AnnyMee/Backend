package app.domain;

import java.util.Locale;
import java.util.Objects;

public class Product {

    private Long id;
    private String name;
    private double price;
    private String article;

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(price, product.price) != 0) return false;
        if (!Objects.equals(id, product.id)) return false;
        if (!Objects.equals(name, product.name)) return false;
        return Objects.equals(article, product.article);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (article != null ? article.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format(Locale.US,"Продукт: ИД - %d, наименование - %s, цена - %.2f, артикул - %s", id, name, price,article);
    }

}
