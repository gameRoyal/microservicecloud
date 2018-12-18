package entity;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_specification", schema = "pyg", catalog = "")
public class TbSpecification {
    private long id;
    private String specName;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "spec_name", nullable = true, length = 255)
    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbSpecification that = (TbSpecification) o;

        if (id != that.id) return false;
        if (specName != null ? !specName.equals(that.specName) : that.specName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (specName != null ? specName.hashCode() : 0);
        return result;
    }
}
