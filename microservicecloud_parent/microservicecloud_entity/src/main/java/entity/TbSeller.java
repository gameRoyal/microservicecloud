package entity;

import java.sql.Timestamp;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_seller", schema = "pyg", catalog = "")
public class TbSeller {
    private String sellerId;
    private String name;
    private String nickName;
    private String password;
    private String email;
    private String mobile;
    private String telephone;
    private String status;
    private String addressDetail;
    private String linkmanName;
    private String linkmanQq;
    private String linkmanMobile;
    private String linkmanEmail;
    private String licenseNumber;
    private String taxNumber;
    private String orgNumber;
    private Long address;
    private String logoPic;
    private String brief;
    private Timestamp createTime;
    private String legalPerson;
    private String legalPersonCardId;
    private String bankUser;
    private String bankName;

    @javax.persistence.Id
    @javax.persistence.Column(name = "seller_id", nullable = false, length = 100)
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
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
    @javax.persistence.Column(name = "nick_name", nullable = true, length = 50)
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "password", nullable = true, length = 60)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "email", nullable = true, length = 40)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "mobile", nullable = true, length = 11)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "telephone", nullable = true, length = 50)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "status", nullable = true, length = 1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "address_detail", nullable = true, length = 100)
    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "linkman_name", nullable = true, length = 50)
    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "linkman_qq", nullable = true, length = 13)
    public String getLinkmanQq() {
        return linkmanQq;
    }

    public void setLinkmanQq(String linkmanQq) {
        this.linkmanQq = linkmanQq;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "linkman_mobile", nullable = true, length = 11)
    public String getLinkmanMobile() {
        return linkmanMobile;
    }

    public void setLinkmanMobile(String linkmanMobile) {
        this.linkmanMobile = linkmanMobile;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "linkman_email", nullable = true, length = 40)
    public String getLinkmanEmail() {
        return linkmanEmail;
    }

    public void setLinkmanEmail(String linkmanEmail) {
        this.linkmanEmail = linkmanEmail;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "license_number", nullable = true, length = 20)
    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "tax_number", nullable = true, length = 20)
    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "org_number", nullable = true, length = 20)
    public String getOrgNumber() {
        return orgNumber;
    }

    public void setOrgNumber(String orgNumber) {
        this.orgNumber = orgNumber;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "address", nullable = true)
    public Long getAddress() {
        return address;
    }

    public void setAddress(Long address) {
        this.address = address;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "logo_pic", nullable = true, length = 100)
    public String getLogoPic() {
        return logoPic;
    }

    public void setLogoPic(String logoPic) {
        this.logoPic = logoPic;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "brief", nullable = true, length = 2000)
    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "legal_person", nullable = true, length = 40)
    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "legal_person_card_id", nullable = true, length = 25)
    public String getLegalPersonCardId() {
        return legalPersonCardId;
    }

    public void setLegalPersonCardId(String legalPersonCardId) {
        this.legalPersonCardId = legalPersonCardId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "bank_user", nullable = true, length = 50)
    public String getBankUser() {
        return bankUser;
    }

    public void setBankUser(String bankUser) {
        this.bankUser = bankUser;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "bank_name", nullable = true, length = 100)
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbSeller tbSeller = (TbSeller) o;

        if (sellerId != null ? !sellerId.equals(tbSeller.sellerId) : tbSeller.sellerId != null) return false;
        if (name != null ? !name.equals(tbSeller.name) : tbSeller.name != null) return false;
        if (nickName != null ? !nickName.equals(tbSeller.nickName) : tbSeller.nickName != null) return false;
        if (password != null ? !password.equals(tbSeller.password) : tbSeller.password != null) return false;
        if (email != null ? !email.equals(tbSeller.email) : tbSeller.email != null) return false;
        if (mobile != null ? !mobile.equals(tbSeller.mobile) : tbSeller.mobile != null) return false;
        if (telephone != null ? !telephone.equals(tbSeller.telephone) : tbSeller.telephone != null) return false;
        if (status != null ? !status.equals(tbSeller.status) : tbSeller.status != null) return false;
        if (addressDetail != null ? !addressDetail.equals(tbSeller.addressDetail) : tbSeller.addressDetail != null)
            return false;
        if (linkmanName != null ? !linkmanName.equals(tbSeller.linkmanName) : tbSeller.linkmanName != null)
            return false;
        if (linkmanQq != null ? !linkmanQq.equals(tbSeller.linkmanQq) : tbSeller.linkmanQq != null) return false;
        if (linkmanMobile != null ? !linkmanMobile.equals(tbSeller.linkmanMobile) : tbSeller.linkmanMobile != null)
            return false;
        if (linkmanEmail != null ? !linkmanEmail.equals(tbSeller.linkmanEmail) : tbSeller.linkmanEmail != null)
            return false;
        if (licenseNumber != null ? !licenseNumber.equals(tbSeller.licenseNumber) : tbSeller.licenseNumber != null)
            return false;
        if (taxNumber != null ? !taxNumber.equals(tbSeller.taxNumber) : tbSeller.taxNumber != null) return false;
        if (orgNumber != null ? !orgNumber.equals(tbSeller.orgNumber) : tbSeller.orgNumber != null) return false;
        if (address != null ? !address.equals(tbSeller.address) : tbSeller.address != null) return false;
        if (logoPic != null ? !logoPic.equals(tbSeller.logoPic) : tbSeller.logoPic != null) return false;
        if (brief != null ? !brief.equals(tbSeller.brief) : tbSeller.brief != null) return false;
        if (createTime != null ? !createTime.equals(tbSeller.createTime) : tbSeller.createTime != null) return false;
        if (legalPerson != null ? !legalPerson.equals(tbSeller.legalPerson) : tbSeller.legalPerson != null)
            return false;
        if (legalPersonCardId != null ? !legalPersonCardId.equals(tbSeller.legalPersonCardId) : tbSeller.legalPersonCardId != null)
            return false;
        if (bankUser != null ? !bankUser.equals(tbSeller.bankUser) : tbSeller.bankUser != null) return false;
        if (bankName != null ? !bankName.equals(tbSeller.bankName) : tbSeller.bankName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sellerId != null ? sellerId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (addressDetail != null ? addressDetail.hashCode() : 0);
        result = 31 * result + (linkmanName != null ? linkmanName.hashCode() : 0);
        result = 31 * result + (linkmanQq != null ? linkmanQq.hashCode() : 0);
        result = 31 * result + (linkmanMobile != null ? linkmanMobile.hashCode() : 0);
        result = 31 * result + (linkmanEmail != null ? linkmanEmail.hashCode() : 0);
        result = 31 * result + (licenseNumber != null ? licenseNumber.hashCode() : 0);
        result = 31 * result + (taxNumber != null ? taxNumber.hashCode() : 0);
        result = 31 * result + (orgNumber != null ? orgNumber.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (logoPic != null ? logoPic.hashCode() : 0);
        result = 31 * result + (brief != null ? brief.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (legalPerson != null ? legalPerson.hashCode() : 0);
        result = 31 * result + (legalPersonCardId != null ? legalPersonCardId.hashCode() : 0);
        result = 31 * result + (bankUser != null ? bankUser.hashCode() : 0);
        result = 31 * result + (bankName != null ? bankName.hashCode() : 0);
        return result;
    }
}
