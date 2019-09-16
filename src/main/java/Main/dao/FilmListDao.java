package Main.dao;


import Main.HibernateUtil;
import Main.model.FilmList;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FilmListDao {

    List<FilmList> list = null;

    public List getAllFilms() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM FilmList");
        list = query.list();
        return list;
    }



}
