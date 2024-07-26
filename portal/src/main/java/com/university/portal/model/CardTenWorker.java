package com.university.portal.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

// ORM object relation modeling
@Entity
@Getter
@Setter

public class CardTenWorker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private int title;
    private String issue_date;
    private String expiry_date;
    private String approval;
    private String created_at;
    private String updated_at;
    private boolean status;

}
