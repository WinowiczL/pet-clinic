package com.winowicz.petclinic.services;

import com.winowicz.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
