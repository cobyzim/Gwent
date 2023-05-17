package com.personal.gwent.model.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;



//import com.personal.gwent.model.gameboard.cards.Faction;
@Entity
public class User implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Username can't be blank")
    @Column(unique = true, nullable = false)
    @Pattern(regexp = "^\\S*$", message = "Username cannot have spaces")
    private String username;

    @Column(nullable = false)
    @Pattern(regexp = "^(?=.*[A-Z].*[A-Z])(?=.*[!@#$&*])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}$",
        message = "Password must have 2 uppercase letters, 1 special character, 2 numbers, 3 lowercase letters, " +
        "and a total length of 8")
    private String password;

    public User() {

    }

    public User(Integer id, @NotBlank String username, @NotBlank String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

}
