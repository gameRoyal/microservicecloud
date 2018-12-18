package entity;

import java.math.BigDecimal;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_goods", schema = "pyg", catalog = "")
public class TbGoods {
    private long id;
    private String sellerId;
    private String goodsName;
    private Long defaultItemId;
    private String auditStatus;
    private String isMarketable;
    private Long brandId;
    private String caption;
    private Long category1Id;
    private Long category2Id;
    private Long category3Id;
    private String smallPic;
    private BigDecimal price;
    private Long typeTemplateId;
    private String isEnableSpec;
    private String isDelete;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "seller_id", nullable = true, length = 20)
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "goods_name", nullable = true, length = 100)
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "default_item_id", nullable = true)
    public Long getDefaultItemId() {
        return defaultItemId;
    }

    public void setDefaultItemId(Long defaultItemId) {
        this.defaultItemId = defaultItemId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "audit_status", nullable = true, length = 2)
    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "is_marketable", nullable = true, length = 1)
    public String getIsMarketable() {
        return isMarketable;
    }

    public void setIsMarketable(String isMarketable) {
        this.isMarketable = isMarketable;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "brand_id", nullable = true)
    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "caption", nullable = true, length = 100)
    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "category1_id", nullable = true)
    public Long getCategory1Id() {
        return category1Id;
    }

    public void setCategory1Id(Long category1Id) {
        this.category1Id = category1Id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "category2_id", nullable = true)
    public Long getCategory2Id() {
        return category2Id;
    }

    public void setCategory2Id(Long category2Id) {
        this.category2Id = category2Id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "category3_id", nullable = true)
    public Long getCategory3Id() {
        return category3Id;
    }

    public void setCategory3Id(Long category3Id) {
        this.category3Id = category3Id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "small_pic", nullable = true, length = 150)
    public String getSmallPic() {
        return smallPic;
    }

    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "price", nullable = true, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "type_template_id", nullable = true)
    public Long getTypeTemplateId() {
        return typeTemplateId;
    }

    public void setTypeTemplateId(Long typeTemplateId) {
        this.typeTemplateId = typeTemplateId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "is_enable_spec", nullable = true, length = 1)
    public String getIsEnableSpec() {
        return isEnableSpec;
    }

    public void setIsEnableSpec(String isEnableSpec) {
        this.isEnableSpec = isEnableSpec;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "is_delete", nullable = true, length = 1)
    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbGoods tbGoods = (TbGoods) o;

        if (id != tbGoods.id) return false;
        if (sellerId != null ? !sellerId.equals(tbGoods.sellerId) : tbGoods.sellerId != null) return false;
        if (goodsName != null ? !goodsName.equals(tbGoods.goodsName) : tbGoods.goodsName != null) return false;
        if (defaultItemId != null ? !defaultItemId.equals(tbGoods.defaultItemId) : tbGoods.defaultItemId != null)
            return false;
        if (auditStatus != null ? !auditStatus.equals(tbGoods.auditStatus) : tbGoods.auditStatus != null) return false;
        if (isMarketable != null ? !isMarketable.equals(tbGoods.isMarketable) : tbGoods.isMarketable != null)
            return false;
        if (brandId != null ? !brandId.equals(tbGoods.brandId) : tbGoods.brandId != null) return false;
        if (caption != null ? !caption.equals(tbGoods.caption) : tbGoods.caption != null) return false;
        if (category1Id != null ? !category1Id.equals(tbGoods.category1Id) : tbGoods.category1Id != null) return false;
        if (category2Id != null ? !category2Id.equals(tbGoods.category2Id) : tbGoods.category2Id != null) return false;
        if (category3Id != null ? !category3Id.equals(tbGoods.category3Id) : tbGoods.category3Id != null) return false;
        if (smallPic != null ? !smallPic.equals(tbGoods.smallPic) : tbGoods.smallPic != null) return false;
        if (price != null ? !price.equals(tbGoods.price) : tbGoods.price != null) return false;
        if (typeTemplateId != null ? !typeTemplateId.equals(tbGoods.typeTemplateId) : tbGoods.typeTemplateId != null)
            return false;
        if (isEnableSpec != null ? !isEnableSpec.equals(tbGoods.isEnableSpec) : tbGoods.isEnableSpec != null)
            return false;
        if (isDelete != null ? !isDelete.equals(tbGoods.isDelete) : tbGoods.isDelete != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (sellerId != null ? sellerId.hashCode() : 0);
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (defaultItemId != null ? defaultItemId.hashCode() : 0);
        result = 31 * result + (auditStatus != null ? auditStatus.hashCode() : 0);
        result = 31 * result + (isMarketable != null ? isMarketable.hashCode() : 0);
        result = 31 * result + (brandId != null ? brandId.hashCode() : 0);
        result = 31 * result + (caption != null ? caption.hashCode() : 0);
        result = 31 * result + (category1Id != null ? category1Id.hashCode() : 0);
        result = 31 * result + (category2Id != null ? category2Id.hashCode() : 0);
        result = 31 * result + (category3Id != null ? category3Id.hashCode() : 0);
        result = 31 * result + (smallPic != null ? smallPic.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (typeTemplateId != null ? typeTemplateId.hashCode() : 0);
        result = 31 * result + (isEnableSpec != null ? isEnableSpec.hashCode() : 0);
        result = 31 * result + (isDelete != null ? isDelete.hashCode() : 0);
        return result;
    }
}
