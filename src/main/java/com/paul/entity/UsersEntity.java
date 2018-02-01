package com.paul.entity;



import javax.persistence.*;
import java.io.Serializable;
import java.util.*;
/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/8/2018
 * Time: 5:27 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
/*@Entity
@Table(name="users")*/
public class UsersEntity implements Serializable{/*,UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "u_id")
    private  Long id;

    @Column(name = "u_username")
    private  String  username;

    @Column(name = "u_password")
    private  String  password;

   *//* @ManyToMany
    @JoinTable(
            name="user_roles",
            joinColumns = {
                    @JoinColumn(name = "ur_user_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "ur_role_id")
            }
    )
private  List<RoleEntity> roles;*//*


  *//*  @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> auths = new ArrayList<>();
        List<RoleEntity> roles = getRoles();
        for(RoleEntity role:roles)
        {
            auths.add(new SimpleGrantedAuthority(role.getName()));
        }
        return auths;
    }*//*

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   *//* public List<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleEntity> roles) {
        this.roles = roles;
    }*/
}
