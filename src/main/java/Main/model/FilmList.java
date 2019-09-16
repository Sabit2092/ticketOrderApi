package Main.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "filmlist")
public class FilmList implements Serializable {

    private Integer idfilmlist;
    private String filmname;
    private String filmgenre;
    private String filmdescription;
    private float filmrating;
    private Date datefrom;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdfilmlist() {
        return idfilmlist;
    }

    public void setIdfilmlist(Integer idfilmlist) {
        this.idfilmlist = idfilmlist;
    }

    public String getFilmname() {
        return filmname;
    }

    public void setFilmname(String filmname) {
        this.filmname = filmname;
    }

    public String getFilmgenre() {
        return filmgenre;
    }

    public void setFilmgenre(String filmgenre) {
        this.filmgenre = filmgenre;
    }

    public String getFilmdescription() {
        return filmdescription;
    }

    public void setFilmdescription(String filmdescription) {
        this.filmdescription = filmdescription;
    }

    public float getFilmrating() {
        return filmrating;
    }

    public void setFilmrating(float filmrating) {
        this.filmrating = filmrating;
    }

    public Date getDatefrom() {
        return datefrom;
    }

    public void setDatefrom(Date datefrom) {
        this.datefrom = datefrom;
    }


    @Override
    public String toString() {
        return "FilmList{" +
                "idfilmlist=" + idfilmlist +
                ", filmname='" + filmname + '\'' +
                ", filmgenre='" + filmgenre + '\'' +
                ", filmdescription='" + filmdescription + '\'' +
                ", filmrating=" + filmrating +
                ", datefrom=" + datefrom +
                '}';
    }
}
