package com.babyboom.entities;


import javax.persistence.*;

@Entity
@Table (name = "soportetecnico")
public class Soportetecnico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSoporte;

    @Column(name="NombreSoporte", length = 35,nullable = false)
    private String NombreSoporte;

    public Soportetecnico(){
    }

    public Soportetecnico(int idSoporte, String NombreSoporte) {
        this.idSoporte = idSoporte;
        this.NombreSoporte = NombreSoporte;
    }

    public int getIdSoporte() {
        return idSoporte;
    }

    public void setIdSoporte(int idSoporte) {
        this.idSoporte = idSoporte;
    }

    public String getNombreSoporte() {
        return NombreSoporte;
    }

    public void setNombreSoporte(String nombreSoporte) {
        this.NombreSoporte = nombreSoporte;
    }
}
