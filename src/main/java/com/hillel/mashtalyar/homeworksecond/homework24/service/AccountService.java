package com.hillel.mashtalyar.homeworksecond.homework24.service;

import com.hillel.mashtalyar.homeworksecond.homework24.DataBase;
import com.hillel.mashtalyar.homeworksecond.homework24.entity.Account;
import com.hillel.mashtalyar.homeworksecond.homework24.entity.Client;


import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
    public List<Account> getAll() {
        List<Account> accounts = new ArrayList<>();
        try (Connection connection = DataBase.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM accounts");
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Account account = new Account();
                account.setId(resultSet.getInt("id"));
                account.setClient_id(resultSet.getInt("client_id"));
                account.setNumber(resultSet.getString("number"));
                account.setValue(resultSet.getDouble("value"));
                accounts.add(account);
                //init settings
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public void save(Account account) {
        try (Connection connection = DataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO accounts (client_id, number, value) VALUES (?,?,?)")) {
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, account.getClient_id());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setDouble(3, account.getValue());
            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        try (Connection connection = DataBase.getConnection();
             Statement statement = connection.createStatement()) {
            connection.setAutoCommit(false);
            boolean resultSet = statement.execute("DELETE FROM accounts WHERE id>10");
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Account account){
        try(Connection connection = DataBase.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE accounts SET client_id=?, number=?, value=?")){
            connection.setAutoCommit(false);
            preparedStatement.setInt(1, account.getClient_id());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setDouble(3, account.getValue());
            preparedStatement.execute();
            connection.commit();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    Can't use query methods that take a query string on a PreparedStatement.
//    public List<Account> getOnValue(double valueCount) {
//        List<Account> accounts = new ArrayList<>();
//        try (Connection connection = DataBase.getConnection();
//             PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM accounts WHERE value>?")) {
//            ResultSet resultSet = preparedStatement.executeQuery("SELECT * FROM accounts WHERE value>?");
//            while (resultSet.next()) {
//                connection.setAutoCommit(false);
//                preparedStatement.setDouble(1,valueCount);
//                Account account = new Account();
//                account.setId(resultSet.getInt("id"));
//                account.setClient_id(resultSet.getInt("client_id"));
//                account.setNumber(resultSet.getString("number"));
//                account.setValue(resultSet.getDouble("value"));
//                accounts.add(account);
//                //init settings
//            }
//            connection.commit();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return accounts;
//    }




}
