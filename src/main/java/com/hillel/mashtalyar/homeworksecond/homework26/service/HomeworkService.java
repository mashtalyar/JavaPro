package com.hillel.mashtalyar.homeworksecond.homework26.service;

import com.hillel.mashtalyar.homeworksecond.homework26.dao.HomeworkDao;
import com.hillel.mashtalyar.homeworksecond.homework26.entity.Homework;

public class HomeworkService {
    private HomeworkDao homeworkDao = new HomeworkDao();

    public void save(Homework homework) {
        homeworkDao.save(homework);
    }
}
