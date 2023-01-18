package com.hillel.mashtalyar.homeworksecond.homework25.service;

import com.hillel.mashtalyar.homeworksecond.homework25.dao.StatusDao;
import com.hillel.mashtalyar.homeworksecond.homework25.dao.StatusDaoImpl;
import com.hillel.mashtalyar.homeworksecond.homework25.model.Status;
import org.apache.log4j.Logger;

public class StatusService {
    private final Logger logger=Logger.getLogger(StatusService.class);
    private final StatusDao statusDao = new StatusDaoImpl();

    public void save(Status status) {
        if (status == null) {
            System.out.println("Client is null");
        }
        logger.debug(status.toString());
        statusDao.save(status);
    }

    public void update(Status status) {
        logger.debug(status.toString());
        statusDao.update(status);
    }

    public void delete(Status status) {
        logger.debug(status.toString());
        statusDao.delete(status);
    }

    public Status getById(int id) {
        final Status status = statusDao.getById(id);
        logger.debug(id);
        return status;
    }
}
