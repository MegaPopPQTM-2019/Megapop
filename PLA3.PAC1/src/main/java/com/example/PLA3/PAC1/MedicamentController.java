package com.example.PLA3.PAC1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/medicaments")
public class MedicamentController {

    @Autowired
    MedicamentService service;
    
    @RequestMapping("/farmacia")
    public String showMedicaments (Model model) {
        
            
        model.addAttribute("medicamentos", service.findAll());
        
        return "medicaments/farmacia";
    }

      @RequestMapping("/newMedicament")
    public String newBook() {
        
        
        return "medicaments/newMedicament.html";
    }
    
    






      @RequestMapping("/insertMedicament")
    public String insertMedicament (Medicament medicament, Model model) {
        
        service.insertMedicament(medicament);
        model.addAttribute("farmacia",service.findAll());
        
        return "medicaments/farmacia.html";    }
    




    @RequestMapping("/deleteMedicament")
    public String deleteMedicament(@RequestParam("medicamentId") String medicamentId, Model model) {
        
        Medicament medicament = new Medicament(medicamentId);
        
        service.deleteMedicament(medicament);
        model.addAttribute("farmacia",service.findAll());
        
        return "medicaments/farmacia.html";
    }

}

