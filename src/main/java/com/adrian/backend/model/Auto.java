package com.adrian.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autos")
public class Auto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "autPlaca")
    private String placa;

    @Column(name = "autMarca")
    private String marca;

    @Column(name = "autModelo")
    private String modelo;

    @Column(name = "autChasis")
    private String chasis;

    public Auto() {
        super();
    }

    public Auto(String placa, String marca, String modelo, String chasis) {
        super();
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.chasis = chasis;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa.toUpperCase();
    }

    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis.toUpperCase();
    }
}
