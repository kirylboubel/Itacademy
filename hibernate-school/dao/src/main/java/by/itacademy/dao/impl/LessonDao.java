package by.itacademy.dao.impl;

import by.itacademy.Lesson;
import by.itacademy.dao.DaoException;
import by.itacademy.dao.GenericDao;
import org.hibernate.SessionFactory;

public class LessonDao extends GenericDao<Lesson> {
    public LessonDao(final SessionFactory sessionFactory) {
        super(Lesson.class, DaoException.LessonDaoException::new, sessionFactory);
    }
}
