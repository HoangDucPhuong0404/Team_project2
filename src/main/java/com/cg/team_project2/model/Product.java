package com.cg.team_project2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "category_id")
    private Category categoryId;

    private Size sizeId;

    private Color colorId;

    private String title;

    @ManyToOne
    @JoinColumn(name = "image_id")
    private Image imageId;

    private BigDecimal price;

    private int quantity;

    private String status;

    private Date createAt;

    private String description;
}
