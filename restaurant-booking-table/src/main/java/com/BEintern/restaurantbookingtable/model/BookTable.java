package com.BEintern.restaurantbookingtable.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="book_table")
public class BookTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int btId;

    @Column(name = "bt_datetime")
    private Date btDateTime;

    @Column(name = "bt_number_people")
    private int btNumberPeople;

    @Column(name = "bt_note")
    private String btNote;

    @ManyToOne
    @JoinColumn(name = "fd_id")
    private Food fdId;

    @ManyToOne
    @JoinColumn(name = "us_id")
    private Users usId;

}