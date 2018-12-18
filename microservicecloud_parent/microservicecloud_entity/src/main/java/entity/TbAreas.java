package entity;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_areas", schema = "pyg", catalog = "")
public class TbAreas {
    private int id;
    private String areaid;
    private String area;
    private String cityid;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "areaid", nullable = false, length = 20)
    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "area", nullable = false, length = 50)
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "cityid", nullable = false, length = 20)
    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbAreas tbAreas = (TbAreas) o;

        if (id != tbAreas.id) return false;
        if (areaid != null ? !areaid.equals(tbAreas.areaid) : tbAreas.areaid != null) return false;
        if (area != null ? !area.equals(tbAreas.area) : tbAreas.area != null) return false;
        if (cityid != null ? !cityid.equals(tbAreas.cityid) : tbAreas.cityid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (areaid != null ? areaid.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (cityid != null ? cityid.hashCode() : 0);
        return result;
    }
}
