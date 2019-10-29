package com.example.PLA3.PAC1;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MedicamentService {

    @Autowired
    MedicamentRepository repository;
    
    
    public Iterable<Medicament> findAll() {
        
        return repository.findAll();
    }
    
    public void insertMedicament(Medicament medicament) {
        
        repository.save(medicament);
    }
    
    public void deleteMedicament(Medicament medicament) {
        
        repository.delete(medicament);
    }

}