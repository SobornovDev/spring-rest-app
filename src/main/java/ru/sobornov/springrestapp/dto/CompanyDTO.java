package ru.sobornov.springrestapp.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : Sobornov Vladimir
 * @since : 28.10.2022
 **/
@Getter
@Setter
@EqualsAndHashCode
public class CompanyDTO {

    private String name;
    private String email;
    private int size;
}
