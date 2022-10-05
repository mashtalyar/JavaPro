package com.hillel.mashtalyar.homeworksecond.homework6.util;


import com.hillel.mashtalyar.homeworksecond.homework6.exception.UserExpectedError;
import com.hillel.mashtalyar.homeworksecond.homework6.exception.WrongFieldException;
import com.hillel.mashtalyar.homeworksecond.homework6.exception.WrongSumException;

public class Helper {
    public static void checkIdentifierAccount(String identifierAccount) throws WrongFieldException{
        if(identifierAccount.length()<10 || identifierAccount.length()>10) {
           throw new WrongFieldException();
        }
    }
    public static void checkSum(double sum) throws WrongSumException {
        if(sum>1000) {
          throw new WrongSumException();
        }
    }
    public static void checkTwoIdentifierAccounts(String firstIdentifierAccount, String secondIdentifierAccount){
        if(firstIdentifierAccount.equals(secondIdentifierAccount)){

        }else {throw new UserExpectedError();}

    }
}
