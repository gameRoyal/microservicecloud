package entity;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_provinces", schema = "pyg", catalog = "")
public class TbProvinces {
    private int id;
    private String provinceid;
    private String province;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "provinceid", nullable = false, length = 20)
    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "province", nullable = false, length = 50)
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbProvinces that = (TbProvinces) o;

        if (id != that.id) return false;
        if (provinceid != null ? !provinceid.equals(that.provinceid) : that.provinceid != null) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (provinceid != null ? provinceid.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        return result;
    }
}
