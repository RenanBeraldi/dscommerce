package com.devsuperior.dscommerce.dtos;

import com.devsuperior.dscommerce.entities.Product;

import jakarta.validation.constraints.*;

public class ProductDTO {
    private Long id;

    @NotBlank(message = "Campo requerido")
    @Size(min = 3, max = 80, message = "Nome deve possuir entre 3 e 80 caracteres")
    private String name;

    @NotBlank(message = "Campo requerido")
    @Size(min = 10, message = "Descrição deve possuir no mínimo 10 caracteres")
    private String description;

    @Positive(message = "O Preço deve ser positivo")
    private Double price;

    private String imgUrl;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product product) {
        id = product.getId();
        name = product.getName();
        description = product.getDescription();
        price = product.getPrice();
        imgUrl = product.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
