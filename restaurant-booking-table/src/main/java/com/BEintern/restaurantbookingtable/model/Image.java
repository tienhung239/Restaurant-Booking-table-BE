package com.BEintern.restaurantbookingtable.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imID;

    @Column(name = "im_link")
    private String imLink;

    @ManyToOne
    @JoinColumn(name = "fd_id")
    private Food fdID;
}
