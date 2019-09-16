package Main.controller;

import Main.dao.FilmListDao;
import Main.dao.FilmScheduleDao;
import Main.dao.OrderTicketDao;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


@RestController
public class RestControllerClass {

    @RequestMapping(value = "/getAllFilms", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List getAllFilmsList() {
        FilmListDao filmListDao = new FilmListDao();
        return filmListDao.getAllFilms();

    }

    @RequestMapping(value = "/getScheduleByFilm", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List getSchedule(int id) {
        FilmScheduleDao filmSchedule = new FilmScheduleDao();
        return filmSchedule.getSchedule(id);
    }



    @RequestMapping(value = "/infoAboutTicket", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public void addTicketOrderInfo(String email,String filmDate, String orderDate, int filmid,String place,String telNumber) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        Random r = new Random();
        String filmSession =  String.valueOf(r.nextInt(999999999));
        try {
            Date filmDateTime = formatter.parse(filmDate);
            Date orderDateTime = formatter.parse(orderDate);
            OrderTicketDao orderTicketDao = new OrderTicketDao();
            orderTicketDao.orderTicketInfo(email, filmDateTime, orderDateTime, filmid, place, telNumber,filmSession);
        }catch (ParseException t) {
            t.getErrorOffset();
        }


    }


    @RequestMapping(value = "/showInfo", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public List showInfoAboutTicket(int id) {
            OrderTicketDao orderTicketDao = new OrderTicketDao();
            return orderTicketDao.showTicketInfo(id);
    }



    }

