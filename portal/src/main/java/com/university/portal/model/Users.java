package com.university.portal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;


@Getter
@Setter
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;
    private String email;

    private String name;
    private String pwd;
    private String phone;

    private String status;

    private String created_at;

    private String updated_at;

    private String roleId;

}
