package com.BEintern.restaurantbookingtable.model;

import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int us_id;

    @Column(name = "us_username")
    private String userName;

    @NotNull(message = "Please enter the password")
    @Pattern(regexp = "[A-Za-z0-9!@#$%^&*_]{8,15}", message = "Password must be 8-15 characters in length and can include A-Z, a-z, 0-9, or special characters !@#$%^&*_")
    @Column(name = "us_password")
    private String password;

    @NotNull(message = "User full name can not be NULL")
    @Pattern(regexp = "[A-Za-z.\\s]+", message = "Enter valid characters in use name")
    @Column(name = "us_full_name")
    private String usFullName;

    @NotNull(message = "User address can not be NULL")
    @Column(name = "us_address")
    private String usAddress;

    @NotNull(message = "Please enter the mobile number")
    @Pattern(regexp = "0{1}[1-9]{1}[0-9]{8}", message = "Enter valid 10 digit mobile number")
    @Column(name = "us_mobile", unique = true)
    private String mobile;

    @Column(name = "us_status")
    private int usStatus;

    @Column(name = "us_created_date")
    private Date usCreatedData;

    @Column(name = "us_update_password")
    private int usUpdatePassword;

    @Column(name = "us_group")
    private int group;

    @Email
    @Column(name = "us_email", unique = true)
    private String email;

    @OneToMany(mappedBy = "usId")
    private Set<BookTable> listBookTable;

    @OneToMany(mappedBy = "usID")
    private List<Posts> ListPost;
}
