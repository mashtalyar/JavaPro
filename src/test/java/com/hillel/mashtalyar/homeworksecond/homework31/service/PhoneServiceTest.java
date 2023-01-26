package com.hillel.mashtalyar.homeworksecond.homework31.service;

import com.hillel.mashtalyar.homeworksecond.homework31.exeption.WrongPhoneException;
import lombok.SneakyThrows;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PhoneServiceTest {
    private PhoneService phoneService = new PhoneService();

    @BeforeEach
    void setUp() {
        System.out.println("test before each");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("test before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("test after all");
    }

    @AfterEach
    void tearDown() {
        System.out.println("test after each");
    }

    @Test
    void validateIfPhoneIsNullTest() {
        final WrongPhoneException wrongPhoneException = assertThrows(
                WrongPhoneException.class,
                () -> phoneService.validate(null)
        );

        assertEquals("phone is null", wrongPhoneException.getMessage());
    }
    @Test
    void validateIfPhoneIsEmptyTest() {
        final WrongPhoneException wrongPhoneException = assertThrows(
                WrongPhoneException.class,
                () -> phoneService.validate("")
        );

        assertEquals("phone is null", wrongPhoneException.getMessage());
    }
    @SneakyThrows
    @Test
    void validateIfPhoneFormatIsCorrectTest(){
        final String phone = "+380111111";
        final boolean validate = phoneService.validate(phone);

        assertTrue(validate, String.format("%s is incorrect", phone));
    }
    @SneakyThrows
    @Test
    void validateIfPhoneFormatIsIncorrectTest() {
        final String phone = "+390111111";
        final boolean validate = phoneService.validate(phone);

        assertFalse(validate, String.format("%s is correct", phone));
    }

}