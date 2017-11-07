/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author student
 */
@Entity(name = "filme")
@Table(name="filme")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    
    private String titlu;
    
    @Temporal(TemporalType.DATE)
    @Column(name="data_aparitie")
    private Date dataAparitie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Date getDataAparitie() {
        return dataAparitie;
    }

    public void setDataAparitie(Date dataAparitie) {
        this.dataAparitie = dataAparitie;
    }

    @Override
    public String toString() {
        return "Film{" + "id=" + id + ", titlu=" + titlu + ", dataAparitie=" + dataAparitie + '}';
    }   
    
}
