package Main.model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "filmschedule")
public class FilmSchedule implements Serializable {

    private Integer idfilmschedule;
    private Date filmdatetime;
    private String cinema;
    private String city;
    private Integer filmid;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdfilmschedule() {
        return idfilmschedule;
    }

    public void setIdfilmschedule(Integer idfilmschedule) {
        this.idfilmschedule = idfilmschedule;
    }

    public Date getFilmdatetime() {
        return filmdatetime;
    }

    public void setFilmdatetime(Date filmdatetime) {
        this.filmdatetime = filmdatetime;
    }

    public String getCinema() {
        return cinema;
    }

    public void setCinema(String cinema) {
        this.cinema = cinema;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getFilmid() {
        return filmid;
    }

    public void setFilmid(Integer filmid) {
        this.filmid = filmid;
    }


    @Override
    public String toString() {
        return "FilmSchedule{" +
                "idfilmschedule=" + idfilmschedule +
                ", filmdatetime=" + filmdatetime +
                ", cinema='" + cinema + '\'' +
                ", city='" + city + '\'' +
                ", filmid=" + filmid +
                '}';
    }
}
