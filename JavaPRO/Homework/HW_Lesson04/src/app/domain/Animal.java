package app.domain;

import java.util.Locale;
import java.util.Objects;

public class Animal {
    private Long id;
    private String type;
    private String name;
    private double price;
    private String article;

    public Animal(Long id, String type, String name, double price) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
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

        Animal animal = (Animal) o;

        if (Double.compare(price, animal.price) != 0) return false;
        if (!Objects.equals(id, animal.id)) return false;
        if (!Objects.equals(type, animal.type)) return false;
        if (!Objects.equals(name, animal.name)) return false;
        return Objects.equals(article, animal.article);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (article != null ? article.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format(Locale.US,"Питомец - %d, тип - %s, имя - %s, цена - %.2f, артикул - %s", id, type, name, price, article);
    }
}
