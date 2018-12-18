package entity;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_specification_option", schema = "pyg", catalog = "")
public class TbSpecificationOption {
    private long id;
    private String optionName;
    private Long specId;
    private Integer orders;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "option_name", nullable = true, length = 200)
    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "spec_id", nullable = true)
    public Long getSpecId() {
        return specId;
    }

    public void setSpecId(Long specId) {
        this.specId = specId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "orders", nullable = true)
    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbSpecificationOption that = (TbSpecificationOption) o;

        if (id != that.id) return false;
        if (optionName != null ? !optionName.equals(that.optionName) : that.optionName != null) return false;
        if (specId != null ? !specId.equals(that.specId) : that.specId != null) return false;
        if (orders != null ? !orders.equals(that.orders) : that.orders != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (optionName != null ? optionName.hashCode() : 0);
        result = 31 * result + (specId != null ? specId.hashCode() : 0);
        result = 31 * result + (orders != null ? orders.hashCode() : 0);
        return result;
    }
}
