package com.youcode.airafrika.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    protected Long id;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;
}
