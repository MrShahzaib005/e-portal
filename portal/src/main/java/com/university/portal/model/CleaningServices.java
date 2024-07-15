package com.university.portal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class CleaningServices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    //(Monthly Subscription or weekly or 1 time)
    private String type;
    private String requested_by;
    private int cost;
    private boolean service_status;
    private boolean status;
    private String created_at;
    private String updated_at;
}
