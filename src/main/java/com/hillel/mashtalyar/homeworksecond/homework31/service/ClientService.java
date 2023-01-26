package com.hillel.mashtalyar.homeworksecond.homework31.service;

;
import com.hillel.mashtalyar.homeworksecond.homework31.entity.Client;
import com.hillel.mashtalyar.homeworksecond.homework31.exeption.WrongPhoneException;

public class ClientService {
    private final PhoneService phoneService;

    public ClientService(final PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    public Client create(final String surname, final String phone) throws WrongPhoneException {
         phoneService.validate(phone);
        return new Client(19,"Mashtalyar","+380989151795");
    }

}
