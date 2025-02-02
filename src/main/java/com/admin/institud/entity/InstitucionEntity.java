package com.admin.institud.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "institucion")
public class InstitucionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idinstitucion")
    private Integer idInstitucion;
    private String nombre;
    private String nit;
    private String ciudad;
    private String telefono;
    private String direccion;
}
