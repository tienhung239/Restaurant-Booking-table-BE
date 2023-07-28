package com.BEintern.restaurantbookingtable.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cfID;

    @Column(name = "cf_name")
    private String cfName;

    @Column(name = "cf_image_link")
    private String cfImageLink;

    @Column(name = "cf_description")
    private String cfDescription;

    @Column(name = "cf_type")
    private int cfType;

    @OneToMany(mappedBy = "cfID")
    private Set<Food> ListFood;

    @OneToMany(mappedBy = "cfID")
    private List<Posts> ListPost;
}
