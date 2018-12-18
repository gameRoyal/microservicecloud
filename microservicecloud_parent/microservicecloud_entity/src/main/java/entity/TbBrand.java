package entity;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_brand", schema = "pyg", catalog = "")
public class TbBrand {
    private long id;
    private String name;
    private String firstChar;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "first_char", nullable = true, length = 1)
    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbBrand tbBrand = (TbBrand) o;

        if (id != tbBrand.id) return false;
        if (name != null ? !name.equals(tbBrand.name) : tbBrand.name != null) return false;
        if (firstChar != null ? !firstChar.equals(tbBrand.firstChar) : tbBrand.firstChar != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (firstChar != null ? firstChar.hashCode() : 0);
        return result;
    }
}
