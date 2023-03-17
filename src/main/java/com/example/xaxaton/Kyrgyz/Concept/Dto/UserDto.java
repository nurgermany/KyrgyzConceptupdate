package com.example.xaxaton.Kyrgyz.Concept.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @Id
    private Long id;
    private String username;
    private String password;
    private String email;
}
