/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acn.manu.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author manuela.mondelli
 */
@Entity
@Table(name = "LOGIN", catalog = "", schema = "HR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Login.findAll", query = "SELECT l FROM Login l")
    , @NamedQuery(name = "Login.findByUsername", query = "SELECT l FROM Login l WHERE l.loginPK.username = :username")
    , @NamedQuery(name = "Login.findByPwd", query = "SELECT l FROM Login l WHERE l.loginPK.pwd = :pwd")
    , @NamedQuery(name = "Login.findUser", query = "SELECT l FROM Login l WHERE l.loginPK.username = :username AND l.loginPK.pwd = :pwd")})
public class Login implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LoginPK loginPK;
    @JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Employees employeeId;

    public Login() {
    }

    public Login(LoginPK loginPK) {
        this.loginPK = loginPK;
    }

    public Login(String username, String pwd) {
        this.loginPK = new LoginPK(username, pwd);
    }

    public LoginPK getLoginPK() {
        return loginPK;
    }

    public void setLoginPK(LoginPK loginPK) {
        this.loginPK = loginPK;
    }

    public Employees getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employees employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loginPK != null ? loginPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Login)) {
            return false;
        }
        Login other = (Login) object;
        if ((this.loginPK == null && other.loginPK != null) || (this.loginPK != null && !this.loginPK.equals(other.loginPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.acn.manu.model.Login[ loginPK=" + loginPK + " ]";
    }
    
}
