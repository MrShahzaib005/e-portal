package com.university.portal.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// ORM object relation modeling
@Entity
@Getter
@Setter

public class PettyCash {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int amount;
    private int used_by;
    private String notes;
    private int requested_by;
    private String created_at;
    private String updated_at;

}
