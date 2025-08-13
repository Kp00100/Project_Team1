package com.pharmacy.controller;

import com.pharmacy.entity.Drug;
import com.pharmacy.service.DrugService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drugs")
@CrossOrigin(origins = "*")
public class DrugController {
    private final DrugService service;

    public DrugController(DrugService service) {
        this.service = service;
    }

    @GetMapping
    public List<Drug> getAllDrugs() {
        return service.getAllDrugs();
    }

    @PostMapping
    public Drug addDrug(@RequestBody Drug drug) {
        return service.saveDrug(drug);
    }
}