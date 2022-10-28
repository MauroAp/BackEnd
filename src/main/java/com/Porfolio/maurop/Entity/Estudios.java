/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Porfolio.maurop.Entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author Perez Mauro
 */
@Entity
@Getter
@Setter
@Table(name = "estudios")
public class Estudios implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String lugar;
    private String fecha_inicio;
    private String fecha_fin;
    private String titulo;
    private String img;
    private String descripcion;

    public Estudios() {
    }

    public Estudios(String lugar, String fecha_inicio, String fecha_fin, String titulo, String img,
            String descripcion) {
        this.lugar = lugar;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.titulo = titulo;
        this.img = img;
        this.descripcion = descripcion;
    }

}
