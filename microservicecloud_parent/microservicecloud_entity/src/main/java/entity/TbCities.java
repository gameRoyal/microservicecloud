package entity;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_cities", schema = "pyg", catalog = "")
public class TbCities {
    private int id;
    private String cityid;
    private String city;
    private String provinceid;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "cityid", nullable = false, length = 20)
    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "city", nullable = false, length = 50)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "provinceid", nullable = false, length = 20)
    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbCities tbCities = (TbCities) o;

        if (id != tbCities.id) return false;
        if (cityid != null ? !cityid.equals(tbCities.cityid) : tbCities.cityid != null) return false;
        if (city != null ? !city.equals(tbCities.city) : tbCities.city != null) return false;
        if (provinceid != null ? !provinceid.equals(tbCities.provinceid) : tbCities.provinceid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (cityid != null ? cityid.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (provinceid != null ? provinceid.hashCode() : 0);
        return result;
    }
}
