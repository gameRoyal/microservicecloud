package entity;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_goods_desc", schema = "pyg", catalog = "")
public class TbGoodsDesc {
    private long goodsId;
    private String introduction;
    private String specificationItems;
    private String customAttributeItems;
    private String itemImages;
    private String packageList;
    private String saleService;

    @javax.persistence.Id
    @javax.persistence.Column(name = "goods_id", nullable = false)
    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "introduction", nullable = true, length = 3000)
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "specification_items", nullable = true, length = 3000)
    public String getSpecificationItems() {
        return specificationItems;
    }

    public void setSpecificationItems(String specificationItems) {
        this.specificationItems = specificationItems;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "custom_attribute_items", nullable = true, length = 3000)
    public String getCustomAttributeItems() {
        return customAttributeItems;
    }

    public void setCustomAttributeItems(String customAttributeItems) {
        this.customAttributeItems = customAttributeItems;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "item_images", nullable = true, length = 3000)
    public String getItemImages() {
        return itemImages;
    }

    public void setItemImages(String itemImages) {
        this.itemImages = itemImages;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "package_list", nullable = true, length = 3000)
    public String getPackageList() {
        return packageList;
    }

    public void setPackageList(String packageList) {
        this.packageList = packageList;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "sale_service", nullable = true, length = 3000)
    public String getSaleService() {
        return saleService;
    }

    public void setSaleService(String saleService) {
        this.saleService = saleService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbGoodsDesc that = (TbGoodsDesc) o;

        if (goodsId != that.goodsId) return false;
        if (introduction != null ? !introduction.equals(that.introduction) : that.introduction != null) return false;
        if (specificationItems != null ? !specificationItems.equals(that.specificationItems) : that.specificationItems != null)
            return false;
        if (customAttributeItems != null ? !customAttributeItems.equals(that.customAttributeItems) : that.customAttributeItems != null)
            return false;
        if (itemImages != null ? !itemImages.equals(that.itemImages) : that.itemImages != null) return false;
        if (packageList != null ? !packageList.equals(that.packageList) : that.packageList != null) return false;
        if (saleService != null ? !saleService.equals(that.saleService) : that.saleService != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (goodsId ^ (goodsId >>> 32));
        result = 31 * result + (introduction != null ? introduction.hashCode() : 0);
        result = 31 * result + (specificationItems != null ? specificationItems.hashCode() : 0);
        result = 31 * result + (customAttributeItems != null ? customAttributeItems.hashCode() : 0);
        result = 31 * result + (itemImages != null ? itemImages.hashCode() : 0);
        result = 31 * result + (packageList != null ? packageList.hashCode() : 0);
        result = 31 * result + (saleService != null ? saleService.hashCode() : 0);
        return result;
    }
}
