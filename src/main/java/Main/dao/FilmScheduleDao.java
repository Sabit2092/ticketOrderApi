package Main.dao;


import Main.HibernateUtil;
import Main.model.FilmSchedule;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class FilmScheduleDao {

    List<FilmSchedule> list = null;

    public List getSchedule(int id) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        //Query query = session.createQuery("FROM FilmSchedule where filmid = :id");
        Query query = session.createQuery("Select F.idfilmschedule,F.filmdatetime,F.cinema,F.city," +
                "(select FL.filmdescription FROM FilmList FL where FL.idfilmlist=:id)," +
                "F.filmid FROM FilmSchedule F where F.filmid = :id");
        query.setParameter("id",id);
        list = query.list();
        return list;
    }

}
