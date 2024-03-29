package com.winowicz.petclinic.bootstrap;

import com.winowicz.petclinic.model.Owner;
import com.winowicz.petclinic.model.Vet;
import com.winowicz.petclinic.services.OwnerService;
import com.winowicz.petclinic.services.VetService;
import com.winowicz.petclinic.services.map.OwnerServiceMap;
import com.winowicz.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Tom");
        owner2.setLastName("Bell");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Ramona");
        vet1.setLastName("Worder");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Tomy");
        vet2.setLastName("Because");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
