package com.alpha.portfolio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "studentForm")
public class studentform {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String student_name;
    private String email;
    private String password;
    private String dob;
}
