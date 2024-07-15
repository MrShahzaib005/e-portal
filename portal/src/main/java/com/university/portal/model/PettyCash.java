package com.university.portal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class PettyCash {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int amount;
    private int used_by;
    private int notes;
    //For the purpose on where the cash was spent on.
    private int requested_by;
    private String created_at;
    private String updated_at;
}
