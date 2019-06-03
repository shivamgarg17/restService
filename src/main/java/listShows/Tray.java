package listShows;

import javax.persistence.*;


@Entity
@Table(name = "trays")
public class Tray {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String show;
    private String uri;
    private String imgsource;

    private String trayName;

    public Tray() {
    }

    public Tray(String show) {
        this.show = show;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getID() {
        return id;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }

    public String getTrayName() {
        return trayName;
    }

    public void setTrayName(String trayName) {
        this.trayName = trayName;
    }

    public String getImgsourceource() {
        return imgsource;
    }

    public void setImgsourceource(String imgsource) {
        this.imgsource = imgsource;
    }


}
