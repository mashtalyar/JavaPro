package com.hillel.mashtalyar.homeworksecond.homework24.service;

import com.hillel.mashtalyar.homeworksecond.homework24.DataBase;
import com.hillel.mashtalyar.homeworksecond.homework24.entity.Account;
import com.hillel.mashtalyar.homeworksecond.homework24.entity.Client;
import com.hillel.mashtalyar.homeworksecond.homework24.entity.Status;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientService {
    public List<Client> getAll() {
        List<Client> clients = new ArrayList<>();
        try (Connection connection = DataBase.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM clients");
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setPhone(resultSet.getInt("phone"));
                client.setAbout(resultSet.getString("about"));
                client.setAge(resultSet.getInt("age"));
                clients.add(client);
                //init settings
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public void save(Client client) {
        try (Connection connection = DataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO clients (name, email, phone, about,age) VALUES (?,?,?,?,?)")) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getEmail());
            preparedStatement.setInt(3, client.getPhone());
            preparedStatement.setString(4, client.getAbout());
            preparedStatement.setInt(5,client.getAge());
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
            boolean resultSet = statement.execute("DELETE FROM clients WHERE id>10");
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Client client){
        try(Connection connection = DataBase.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE clients SET name=?, email=?, phone=?, about=?,age=?")){
            connection.setAutoCommit(false);
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getEmail());
            preparedStatement.setInt(3, client.getPhone());
            preparedStatement.setString(4, client.getAbout());
            preparedStatement.setInt(5,client.getAge());
            preparedStatement.execute();
            connection.commit();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Client> getInPhone(){
        List<Client> clientsOnPhone = new ArrayList<>();
        try (Connection connection = DataBase.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM clients WHERE phone=787");
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setPhone(resultSet.getInt("phone"));
                client.setAbout(resultSet.getString("about"));
                client.setAge(resultSet.getInt("age"));
                clientsOnPhone.add(client);
                //init settings
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientsOnPhone;
    }

    public List<Client> getAllOnId() {
        List<Client> clients = new ArrayList<>();
        try (Connection connection = DataBase.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM clients AS c INNER JOIN accounts AS a ON c.id=a.id");
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Client client = new Client();
                Account account=new Account();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setPhone(resultSet.getInt("phone"));
                client.setAbout(resultSet.getString("about"));
                client.setAge(resultSet.getInt("age"));
                clients.add(client);

                //init settings
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public   List<Client> getFrom2Tables() {
        List<Client> clients = new ArrayList<>();
        try (Connection connection = DataBase.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("select c.name, c.email, s.alias from clients as c inner join client_status as cs on c.id=cs.client_id inner join statuses as s on cs.status_id=s.id WHERE age>18");
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Client client = new Client();
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setAlias(resultSet.getString("alias"));
                clients.add(client);

                //init settings
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }
}







