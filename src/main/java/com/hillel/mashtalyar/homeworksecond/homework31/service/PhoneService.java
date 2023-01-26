package com.hillel.mashtalyar.homeworksecond.homework31.service;

import com.hillel.mashtalyar.homeworksecond.homework31.exeption.WrongPhoneException;

public class PhoneService {
    public boolean validate(final String phone) throws WrongPhoneException {
        if (phone == null || phone.isBlank()) {
            throw new WrongPhoneException("phone is null");
        }
        if (phone.length() < 13) {
            throw new WrongPhoneException(String.format("phone '%s' is incorrect", phone));
        }
        return phone.contains("+380");
    }
}
