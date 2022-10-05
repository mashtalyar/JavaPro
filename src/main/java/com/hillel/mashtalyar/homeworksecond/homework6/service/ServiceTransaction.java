package com.hillel.mashtalyar.homeworksecond.homework6.service;

import com.hillel.mashtalyar.homeworksecond.homework6.entity.Client;
import static com.hillel.mashtalyar.homeworksecond.homework6.util.Helper.checkTwoIdentifierAccounts;

public class ServiceTransaction {
    public static void transferOfMoney(Client client, String identifierAccount){
        checkTwoIdentifierAccounts(client.identifierAccount, identifierAccount);

    }
}
