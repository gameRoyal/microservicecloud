package entity;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_item_cat", schema = "pyg", catalog = "")
public class TbItemCat {
    private long id;
    private Long parentId;
    private String name;
    private Long typeId;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "parent_id", nullable = true)
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "type_id", nullable = true)
    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbItemCat tbItemCat = (TbItemCat) o;

        if (id != tbItemCat.id) return false;
        if (parentId != null ? !parentId.equals(tbItemCat.parentId) : tbItemCat.parentId != null) return false;
        if (name != null ? !name.equals(tbItemCat.name) : tbItemCat.name != null) return false;
        if (typeId != null ? !typeId.equals(tbItemCat.typeId) : tbItemCat.typeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        return result;
    }
}
