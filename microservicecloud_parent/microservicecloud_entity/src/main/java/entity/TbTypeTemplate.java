package entity;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_type_template", schema = "pyg", catalog = "")
public class TbTypeTemplate {
    private long id;
    private String name;
    private String specIds;
    private String brandIds;
    private String customAttributeItems;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "name", nullable = true, length = 80)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "spec_ids", nullable = true, length = 1000)
    public String getSpecIds() {
        return specIds;
    }

    public void setSpecIds(String specIds) {
        this.specIds = specIds;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "brand_ids", nullable = true, length = 1000)
    public String getBrandIds() {
        return brandIds;
    }

    public void setBrandIds(String brandIds) {
        this.brandIds = brandIds;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "custom_attribute_items", nullable = true, length = 2000)
    public String getCustomAttributeItems() {
        return customAttributeItems;
    }

    public void setCustomAttributeItems(String customAttributeItems) {
        this.customAttributeItems = customAttributeItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbTypeTemplate that = (TbTypeTemplate) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (specIds != null ? !specIds.equals(that.specIds) : that.specIds != null) return false;
        if (brandIds != null ? !brandIds.equals(that.brandIds) : that.brandIds != null) return false;
        if (customAttributeItems != null ? !customAttributeItems.equals(that.customAttributeItems) : that.customAttributeItems != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (specIds != null ? specIds.hashCode() : 0);
        result = 31 * result + (brandIds != null ? brandIds.hashCode() : 0);
        result = 31 * result + (customAttributeItems != null ? customAttributeItems.hashCode() : 0);
        return result;
    }
}
