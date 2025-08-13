package com.pharmacy.entity;

import jakarta.persistence.*;

@Entity
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
    private int stock;

    // Getters & Setters
}