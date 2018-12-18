package entity;

import java.sql.Timestamp;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_user", schema = "pyg", catalog = "")
public class TbUser {
    private long id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private Timestamp created;
    private Timestamp updated;
    private String sourceType;
    private String nickName;
    private String name;
    private String status;
    private String headPic;
    private String qq;
    private Integer accountBalance;
    private String isMobileCheck;
    private String isEmailCheck;
    private String sex;
    private Integer userLevel;
    private Integer points;
    private Integer experienceValue;
    private Timestamp birthday;
    private Timestamp lastLoginTime;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "username", nullable = false, length = 50)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "password", nullable = false, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "phone", nullable = true, length = 20)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "email", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "created", nullable = false)
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "updated", nullable = false)
    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "source_type", nullable = true, length = 1)
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
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
    @javax.persistence.Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @javax.persistence.Column(name = "head_pic", nullable = true, length = 150)
    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "qq", nullable = true, length = 20)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "account_balance", nullable = true, precision = 0)
    public Integer getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "is_mobile_check", nullable = true, length = 1)
    public String getIsMobileCheck() {
        return isMobileCheck;
    }

    public void setIsMobileCheck(String isMobileCheck) {
        this.isMobileCheck = isMobileCheck;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "is_email_check", nullable = true, length = 1)
    public String getIsEmailCheck() {
        return isEmailCheck;
    }

    public void setIsEmailCheck(String isEmailCheck) {
        this.isEmailCheck = isEmailCheck;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "sex", nullable = true, length = 1)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_level", nullable = true)
    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "points", nullable = true)
    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "experience_value", nullable = true)
    public Integer getExperienceValue() {
        return experienceValue;
    }

    public void setExperienceValue(Integer experienceValue) {
        this.experienceValue = experienceValue;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "birthday", nullable = true)
    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "last_login_time", nullable = true)
    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbUser tbUser = (TbUser) o;

        if (id != tbUser.id) return false;
        if (username != null ? !username.equals(tbUser.username) : tbUser.username != null) return false;
        if (password != null ? !password.equals(tbUser.password) : tbUser.password != null) return false;
        if (phone != null ? !phone.equals(tbUser.phone) : tbUser.phone != null) return false;
        if (email != null ? !email.equals(tbUser.email) : tbUser.email != null) return false;
        if (created != null ? !created.equals(tbUser.created) : tbUser.created != null) return false;
        if (updated != null ? !updated.equals(tbUser.updated) : tbUser.updated != null) return false;
        if (sourceType != null ? !sourceType.equals(tbUser.sourceType) : tbUser.sourceType != null) return false;
        if (nickName != null ? !nickName.equals(tbUser.nickName) : tbUser.nickName != null) return false;
        if (name != null ? !name.equals(tbUser.name) : tbUser.name != null) return false;
        if (status != null ? !status.equals(tbUser.status) : tbUser.status != null) return false;
        if (headPic != null ? !headPic.equals(tbUser.headPic) : tbUser.headPic != null) return false;
        if (qq != null ? !qq.equals(tbUser.qq) : tbUser.qq != null) return false;
        if (accountBalance != null ? !accountBalance.equals(tbUser.accountBalance) : tbUser.accountBalance != null)
            return false;
        if (isMobileCheck != null ? !isMobileCheck.equals(tbUser.isMobileCheck) : tbUser.isMobileCheck != null)
            return false;
        if (isEmailCheck != null ? !isEmailCheck.equals(tbUser.isEmailCheck) : tbUser.isEmailCheck != null)
            return false;
        if (sex != null ? !sex.equals(tbUser.sex) : tbUser.sex != null) return false;
        if (userLevel != null ? !userLevel.equals(tbUser.userLevel) : tbUser.userLevel != null) return false;
        if (points != null ? !points.equals(tbUser.points) : tbUser.points != null) return false;
        if (experienceValue != null ? !experienceValue.equals(tbUser.experienceValue) : tbUser.experienceValue != null)
            return false;
        if (birthday != null ? !birthday.equals(tbUser.birthday) : tbUser.birthday != null) return false;
        if (lastLoginTime != null ? !lastLoginTime.equals(tbUser.lastLoginTime) : tbUser.lastLoginTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        result = 31 * result + (sourceType != null ? sourceType.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (headPic != null ? headPic.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (accountBalance != null ? accountBalance.hashCode() : 0);
        result = 31 * result + (isMobileCheck != null ? isMobileCheck.hashCode() : 0);
        result = 31 * result + (isEmailCheck != null ? isEmailCheck.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (userLevel != null ? userLevel.hashCode() : 0);
        result = 31 * result + (points != null ? points.hashCode() : 0);
        result = 31 * result + (experienceValue != null ? experienceValue.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (lastLoginTime != null ? lastLoginTime.hashCode() : 0);
        return result;
    }
}
