package com.db.model;

import lombok.*;


@Builder
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Product {
    private Integer rating;

    private Integer id;

    private String title;

    private Integer  price;

    private String description;

    private String categories;

    public Product(String title, Integer id) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }
}
