package com.BEintern.restaurantbookingtable.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "food")
@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fdID;

    @Column(name = "fd_name")
    private String foodName;

    @Column(name = "fd_thumbnail")
    private String fdThumbnail;

    @Column(name = "fd_price")
    private int fdPrice;

    @Column(name = "fd_description")
    private String foodDescription;

    @Column(name = "fd_youtube_link")
    private String foodYoutubeLink;

    @ManyToOne
    @JoinColumn(name = "cf_id")
    private Category cfID;

//    @Column(name = "us_id")
//    private int usID;
    @OneToMany(mappedBy = "fdID")
    private Set<Image> ListImage;

    @OneToMany(mappedBy = "fdId")
    private Set<BookTable> listBookTable;
}
