package Main.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orderticket")
public class OrderTicket {

    private Integer idorderticket;
    private String telephonenumber;
    private String email;
    private Date orderdate;
    private Date filmdate;
    private String filmsession;
    private String place;
    private Integer filmid;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdorderticket() {
        return idorderticket;
    }

    public void setIdorderticket(Integer idorderticket) {
        this.idorderticket = idorderticket;
    }

    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Date getFilmdate() {
        return filmdate;
    }

    public void setFilmdate(Date filmdate) {
        this.filmdate = filmdate;
    }

    public String getFilmsession() {
        return filmsession;
    }

    public void setFilmsession(String filmsession) {
        this.filmsession = filmsession;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Integer getFilmid() {
        return filmid;
    }

    public void setFilmid(Integer filmid) {
        this.filmid = filmid;
    }


    @Override
    public String toString() {
        return "OrderTicket{" +
                "idorderticket=" + idorderticket +
                ", telephonenumber='" + telephonenumber + '\'' +
                ", email='" + email + '\'' +
                ", orderdate=" + orderdate +
                ", filmdate=" + filmdate +
                ", filmsession='" + filmsession + '\'' +
                ", place='" + place + '\'' +
                ", filmid=" + filmid +
                '}';
    }
}
