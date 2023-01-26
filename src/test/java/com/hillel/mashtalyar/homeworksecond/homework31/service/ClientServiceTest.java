package com.hillel.mashtalyar.homeworksecond.homework31.service;

import com.hillel.mashtalyar.homeworksecond.homework31.entity.Client;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ClientServiceTest {
    private ClientService clientService;
    private PhoneService phoneService;

    @BeforeEach
    void setUp() {
        phoneService = mock(PhoneService.class);
        clientService = new ClientService(phoneService);

    }

    @SneakyThrows
    @Test
    void createClientIfValidateSuccess() {
        when(phoneService.validate(anyString())).thenReturn(true);

        final Client serhii = clientService.create("Mashtalyar","+380989151795");

        assertNotNull(serhii, "order is null");
        assertEquals(19, serhii.getAge());
        assertEquals("+380989151795", serhii.getNumber());
        assertEquals("Mashtalyar", serhii.getSurname());
    }

}