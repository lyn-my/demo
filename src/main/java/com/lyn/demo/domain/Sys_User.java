package com.lyn.demo.domain;

import com.lyn.demo.config.Sys_Pk;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name="sys_user")
public class Sys_User extends Sys_Pk implements Serializable {
    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    @Transient
    private Long id;
    private String name;
}
