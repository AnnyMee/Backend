package app.service;

import app.domain.Product;
import app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:application.properties")
public class ProductServiceImpl implements ProductService {

    private String articlePrefix;
    private ProductRepository repository;

    public ProductServiceImpl(@Value("${article.prefix}") String articlePrefix, @Qualifier("productRepositoryMap") ProductRepository repository) {
        this.articlePrefix = articlePrefix;
        this.repository = repository;
    }

    @Override
    public Product getById(Long id) {
        Product product = repository.getById(id);
        setArticle(product);
        return product;
    }

    @Override
    public void setArticle(Product product) {
        // prefix-first letter of product-id
        // АРТ-Б-2
            String article = String.format("%s:%C-%d", articlePrefix, product.getName().charAt(0), product.getId());
            product.setArticle(article);
    }
}
