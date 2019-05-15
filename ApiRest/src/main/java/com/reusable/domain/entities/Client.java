package com.reusable.domain.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "AFIP_CLIENT")
public class Client {
    @Id
    @Column(name = "AFIP_ID")
    public long id;
    @Column(name = "AFIP_CUIT")
    public String cuit;
    @Column(name = "AFIP_NAME")
    public String name;
    @Column(name = "AFIP_DIECTION")
    public String direction;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", cuit='" + cuit + '\'' +
                ", name='" + name + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }
}
