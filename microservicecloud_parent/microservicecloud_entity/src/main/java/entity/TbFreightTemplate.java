package entity;

import java.sql.Timestamp;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_freight_template", schema = "pyg", catalog = "")
public class TbFreightTemplate {
    private long id;
    private String sellerId;
    private String isDefault;
    private String name;
    private String sendTimeType;
    private Integer price;
    private Timestamp createTime;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "seller_id", nullable = true, length = 30)
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "is_default", nullable = true, length = 1)
    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
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
    @javax.persistence.Column(name = "send_time_type", nullable = true, length = 1)
    public String getSendTimeType() {
        return sendTimeType;
    }

    public void setSendTimeType(String sendTimeType) {
        this.sendTimeType = sendTimeType;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "price", nullable = true, precision = 0)
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbFreightTemplate that = (TbFreightTemplate) o;

        if (id != that.id) return false;
        if (sellerId != null ? !sellerId.equals(that.sellerId) : that.sellerId != null) return false;
        if (isDefault != null ? !isDefault.equals(that.isDefault) : that.isDefault != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (sendTimeType != null ? !sendTimeType.equals(that.sendTimeType) : that.sendTimeType != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (sellerId != null ? sellerId.hashCode() : 0);
        result = 31 * result + (isDefault != null ? isDefault.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sendTimeType != null ? sendTimeType.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
