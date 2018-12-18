package entity;

import java.sql.Timestamp;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_address", schema = "pyg", catalog = "")
public class TbAddress {
    private long id;
    private String userId;
    private String provinceId;
    private String cityId;
    private String townId;
    private String mobile;
    private String address;
    private String contact;
    private String isDefault;
    private String notes;
    private Timestamp createDate;
    private String alias;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_id", nullable = true, length = 50)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "province_id", nullable = true, length = 10)
    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "city_id", nullable = true, length = 10)
    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "town_id", nullable = true, length = 10)
    public String getTownId() {
        return townId;
    }

    public void setTownId(String townId) {
        this.townId = townId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "mobile", nullable = true, length = 255)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "contact", nullable = true, length = 255)
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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
    @javax.persistence.Column(name = "notes", nullable = true, length = 255)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "create_date", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "alias", nullable = true, length = 50)
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbAddress tbAddress = (TbAddress) o;

        if (id != tbAddress.id) return false;
        if (userId != null ? !userId.equals(tbAddress.userId) : tbAddress.userId != null) return false;
        if (provinceId != null ? !provinceId.equals(tbAddress.provinceId) : tbAddress.provinceId != null) return false;
        if (cityId != null ? !cityId.equals(tbAddress.cityId) : tbAddress.cityId != null) return false;
        if (townId != null ? !townId.equals(tbAddress.townId) : tbAddress.townId != null) return false;
        if (mobile != null ? !mobile.equals(tbAddress.mobile) : tbAddress.mobile != null) return false;
        if (address != null ? !address.equals(tbAddress.address) : tbAddress.address != null) return false;
        if (contact != null ? !contact.equals(tbAddress.contact) : tbAddress.contact != null) return false;
        if (isDefault != null ? !isDefault.equals(tbAddress.isDefault) : tbAddress.isDefault != null) return false;
        if (notes != null ? !notes.equals(tbAddress.notes) : tbAddress.notes != null) return false;
        if (createDate != null ? !createDate.equals(tbAddress.createDate) : tbAddress.createDate != null) return false;
        if (alias != null ? !alias.equals(tbAddress.alias) : tbAddress.alias != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (provinceId != null ? provinceId.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (townId != null ? townId.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (contact != null ? contact.hashCode() : 0);
        result = 31 * result + (isDefault != null ? isDefault.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        return result;
    }
}
