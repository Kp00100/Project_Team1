package com.pharmacy.service;

import com.pharmacy.entity.Drug;
import com.pharmacy.repository.DrugRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DrugService {
    private final DrugRepository repo;

    public DrugService(DrugRepository repo) {
        this.repo = repo;
    }

    public List<Drug> getAllDrugs() {
        return repo.findAll();
    }

    public Drug saveDrug(Drug drug) {
        return repo.save(drug);
    }
}