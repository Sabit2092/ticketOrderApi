package Main.dao;


import Main.HibernateUtil;
import Main.model.OrderTicket;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class OrderTicketDao {

    List<OrderTicket> list = null;
    OrderTicket orderTicket = new OrderTicket();

    public void orderTicketInfo(String email, Date date1, Date date2, int filmid,String place,String telNumber, String filmSession) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        orderTicket.setEmail(email);
        orderTicket.setFilmdate(date1);
        orderTicket.setFilmid(filmid);
        orderTicket.setOrderdate(date2);

        String[] parts = place.split("-");
        String row = parts[0];
        String spot = parts[1];

        orderTicket.setPlace("Ряд: "+row + ", Место: " + spot);
        orderTicket.setTelephonenumber(telNumber);
        orderTicket.setFilmsession(filmSession);


        session.save(orderTicket);
        session.getTransaction().commit();


    }

    public List showTicketInfo(int id) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM OrderTicket where idorderticket = :id");
        query.setParameter("id",id);

        list = query.list();
        return list;
    }
}
