package com.gtsasil.dslearnbds.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "tb_role")
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ig;
    private String authority;

    public Role() {
    }

    public Role(Long ig, String authority) {
        this.ig = ig;
        this.authority = authority;
    }

    public Long getIg() {
        return ig;
    }

    public void setIg(Long ig) {
        this.ig = ig;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role)) return false;
        Role role = (Role) o;
        return getIg().equals(role.getIg());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIg());
    }
}



