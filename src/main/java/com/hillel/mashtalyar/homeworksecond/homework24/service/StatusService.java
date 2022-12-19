package com.hillel.mashtalyar.homeworksecond.homework24.service;

import com.hillel.mashtalyar.homeworksecond.homework24.DataBase;
import com.hillel.mashtalyar.homeworksecond.homework24.entity.Client;
import com.hillel.mashtalyar.homeworksecond.homework24.entity.Status;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StatusService {
    public List<Status> getAll() {
        List<Status> statuses = new ArrayList<>();

        try (Connection connection = DataBase.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM statuses");
            while (resultSet.next()) {
                connection.setAutoCommit(false);
                Status status = new Status();
                status.setId(resultSet.getInt("id"));
                status.setAlias(resultSet.getString("alias"));
                status.setDescription(resultSet.getString("description"));
                statuses.add(status);
                //init settings
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statuses;
    }

    public void save(Status status) {
        try (Connection connection = DataBase.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO statuses (alias, description) VALUES (?,?)")) {
            connection.setAutoCommit(false);
            preparedStatement.setString(1, status.getAlias());
            preparedStatement.setString(2, status.getDescription());
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
            boolean resultSet = statement.execute("DELETE FROM statuses WHERE id>3");
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Status status){
        try(Connection connection = DataBase.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE clients SET alias=?, description=? ")){
            connection.setAutoCommit(false);
            preparedStatement.setString(1, status.getAlias());
            preparedStatement.setString(2, status.getDescription());
            preparedStatement.execute();
            connection.commit();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
