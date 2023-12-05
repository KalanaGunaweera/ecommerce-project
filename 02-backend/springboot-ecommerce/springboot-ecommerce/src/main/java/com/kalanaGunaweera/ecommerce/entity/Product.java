package com.kalanaGunaweera.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private ProductCategory category;

    @Column(name="sku")
    private String sku;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="unit_Price")
    private BigDecimal unitPrice;

    @Column(name="image_Url")
    private String imageUrl;

    @Column(name="active")
    private boolean active;

    @Column(name="units_In_Stock")
    private int unitsInStock;

    @Column(name="date_Created")
    @CreationTimestamp  //Hybernate will automatically manage the timestamps
    private Date dateCreated;

    @Column(name="last_Updated")
    @UpdateTimestamp  //Hybernate will automatically manage the timestamps
    private Date lastUpdated;


}
