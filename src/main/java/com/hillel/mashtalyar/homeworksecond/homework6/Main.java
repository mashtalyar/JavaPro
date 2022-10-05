package com.hillel.mashtalyar.homeworksecond.homework6;

import com.hillel.mashtalyar.homeworksecond.homework6.entity.Client;
import com.hillel.mashtalyar.homeworksecond.homework6.exception.UserExpectedError;
import com.hillel.mashtalyar.homeworksecond.homework6.exception.WrongFieldException;
import com.hillel.mashtalyar.homeworksecond.homework6.exception.WrongSumException;
import com.hillel.mashtalyar.homeworksecond.homework6.util.Helper;
import java.util.Scanner;

import static com.hillel.mashtalyar.homeworksecond.homework6.service.ServiceTransaction.transferOfMoney;
import static com.hillel.mashtalyar.homeworksecond.homework6.util.Helper.checkIdentifierAccount;
import static com.hillel.mashtalyar.homeworksecond.homework6.util.Helper.checkSum;

public class Main {
    public static void main(String[] args)  {
        Client client=new Client();
        Client recipient=new Client();
        System.out.println("Enter your identifier client account");
    while (true) {
    try
     {  Scanner scanner = new Scanner(System.in);
         client.identifierAccount = (scanner.nextLine());
         checkIdentifierAccount(client.identifierAccount);
        break;
    } catch (WrongFieldException e) {
        System.out.println("Inputs date is wrong,try again");
        }
    }
        System.out.println("You input identifier for client account:"+client.identifierAccount);
        System.out.println("Enter your identifier recipient account");
        while (true) {
            try
            {  Scanner scanner = new Scanner(System.in);
                recipient.identifierAccount = (scanner.nextLine());
                checkIdentifierAccount(recipient.identifierAccount);
                break;
            } catch (WrongFieldException e) {
                System.out.println("Inputs date is wrong,try again");
            }
        }
        System.out.println("You input identifier for recipient account:"+recipient.identifierAccount);
        System.out.println("Enter the sum for transaction");
        while (true) {
            try
            {  Scanner scanner = new Scanner(System.in);
                client.sum = (scanner.nextDouble());
                checkSum(client.sum);
                break;
            } catch (WrongSumException e) {
                System.out.println("Inputs date is wrong,try again");
            }
        }
        System.out.println("You input client sum:"+client.sum);

        try {
            transferOfMoney(client, recipient.identifierAccount);
            System.out.println("transaction completed");
        } finally {

        }


    }
}

