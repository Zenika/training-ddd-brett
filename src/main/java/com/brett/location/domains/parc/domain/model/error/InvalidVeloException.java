package com.brett.location.domains.parc.domain.model.error;

import java.util.List;

public class InvalidVeloException extends Exception {

    List<String> errorMessages;


    public InvalidVeloException(String message, List<String> errorMessages) {
        super(message);
        this.errorMessages = errorMessages;
    }
}
