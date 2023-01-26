package com.hillel.mashtalyar.homeworksecond.homework31.exeption;

import java.io.IOException;

public class WrongPhoneException extends IOException {
    public WrongPhoneException(String message) {
        super(message);
    }
}
