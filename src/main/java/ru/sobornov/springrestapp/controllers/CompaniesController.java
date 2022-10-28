package ru.sobornov.springrestapp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.sobornov.springrestapp.dto.CompanyDTO;
import ru.sobornov.springrestapp.models.Company;
import ru.sobornov.springrestapp.services.CompanyService;

import java.util.List;
import java.util.Optional;

/**
 * @author : Sobornov Vladimir
 * @since : 28.10.2022
 **/
@RestController
@RequestMapping("/companies")
@RequiredArgsConstructor
public class CompaniesController {

    private final CompanyService companyService;

    @GetMapping
    public List<Company> getCompanies(){
        return companyService.findAll();
    }

    @GetMapping("/{id}")
    public Company getCompany(@PathVariable("id") int id) throws Exception {
        Optional<Company> company = companyService.findById(id);
        if (company.isPresent()) {
            return company.get();
        } else {
            throw new Exception();
        }
    }

    @PostMapping
    public ResponseEntity<HttpStatus> create(@RequestBody CompanyDTO companyDTO) {
        Company company = companyService.convertToCompany(companyDTO);
        companyService.save(company);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
