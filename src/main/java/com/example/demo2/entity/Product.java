package com.example.demo2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="PRODUCT_TABLE")
public class Product {
    @Id
    @GeneratedValue()
    public int id;
    public String name;
    public int quantity;
    public double price;
    public double stock_price;

}
