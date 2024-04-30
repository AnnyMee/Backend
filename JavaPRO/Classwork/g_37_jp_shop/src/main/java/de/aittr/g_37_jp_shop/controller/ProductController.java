package de.aittr.g_37_jp_shop.controller;

import de.aittr.g_37_jp_shop.domen.dto.ProductDto;
import de.aittr.g_37_jp_shop.domen.entity.Product;
import de.aittr.g_37_jp_shop.service.interfaces.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // 1 способ: GET - localhost:8080/products/example/5 - если использовать этот метод, необходима аннотация в параметрах (@PathVariable)
    // более того, необходимо дописать путь в аннотации @GetMapping ("/example/{id}")

//    @GetMapping("/example/{id}")
//    public Product getById(@PathVariable Long id){
//
//        return service.getById(id);
//    }

    // 2 способ: GET - localhost:8080/products/example?id=5 - если использовать этот метод, необходима аннотация в параметрах (@RequestParam)
    // не нужно менять строку в аннотации @GetMapping
    @GetMapping
    public ProductDto getById(@RequestParam Long id){

        return service.getById(id);
    }

    @PostMapping
    public ProductDto save(@RequestBody ProductDto product){

        return service.save(product);
    }
}
