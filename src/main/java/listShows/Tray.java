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
    @Column(name = "TrayName")
    private String TrayName;

    public Tray() {
    }

    public Tray(String show,String TrayName) {
        this.show = show;
        this.TrayName=TrayName;
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
        return TrayName;
    }

    public void setTrayName(String TrayName) {
        this.TrayName = TrayName;
    }

}
