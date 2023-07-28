package com.BEintern.restaurantbookingtable.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "posts")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int psId;

    @Column(name = "ps_title")
    private String psTitle;

    @Column(name = "ps_thambnail_link")
    private String psThumbnailLink;

    @Column(name = "ps_created_date")
    private Date psCreatedDate;

    @Column(name = "ps_published")
    private int psPublished;

    @ManyToOne
    @JoinColumn(name = "cf_id")
    private Category cfID;

    @ManyToOne
    @JoinColumn(name = "us_id")
    private Users usID;
}
