package ru.sobornov.springrestapp.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.sobornov.springrestapp.dto.CompanyDTO;
import ru.sobornov.springrestapp.models.Company;
import ru.sobornov.springrestapp.repositories.CompanyRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * @author : Sobornov Vladimir
 * @since : 28.10.2022
 **/
@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public void save (Company company) {
        companyRepository.save(company);
    }

    public Optional<Company> findById(int id) {
        return companyRepository.findById(id);
    }

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public Company convertToCompany(CompanyDTO companyDTO) {

        Company company = new Company();
        company.setName(companyDTO.getName());
        company.setEmail(companyDTO.getEmail());
        company.setSize(companyDTO.getSize());
        enrichCompany(company);
        return company;

    }

    private void enrichCompany(Company company) {
        company.setCreatedAt(LocalDateTime.now());
        company.setUpdatedAt(LocalDateTime.now());
        company.setCreatedWhom("ADMIN");
    }

}
