package ru.sobornov.springrestapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sobornov.springrestapp.models.Company;

/**
 * @author : Sobornov Vladimir
 * @since : 28.10.2022
 **/
@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
