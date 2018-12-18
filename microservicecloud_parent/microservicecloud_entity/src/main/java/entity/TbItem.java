package entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_item", schema = "pyg", catalog = "")
public class TbItem {
    private long id;
    private String title;
    private String sellPoint;
    private BigDecimal price;
    private Integer stockCount;
    private int num;
    private String barcode;
    private String image;
    private long categoryId;
    private String status;
    private Timestamp createTime;
    private Timestamp updateTime;
    private String itemSn;
    private BigDecimal costPirce;
    private BigDecimal marketPrice;
    private String isDefault;
    private Long goodsId;
    private String sellerId;
    private String cartThumbnail;
    private String category;
    private String brand;
    private String spec;
    private String seller;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "title", nullable = false, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "sell_point", nullable = true, length = 500)
    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "price", nullable = false, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "stock_count", nullable = true)
    public Integer getStockCount() {
        return stockCount;
    }

    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "num", nullable = false)
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "barcode", nullable = true, length = 30)
    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "image", nullable = true, length = 2000)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "categoryId", nullable = false)
    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "status", nullable = false, length = 1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "create_time", nullable = false)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "update_time", nullable = false)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "item_sn", nullable = true, length = 30)
    public String getItemSn() {
        return itemSn;
    }

    public void setItemSn(String itemSn) {
        this.itemSn = itemSn;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "cost_pirce", nullable = true, precision = 2)
    public BigDecimal getCostPirce() {
        return costPirce;
    }

    public void setCostPirce(BigDecimal costPirce) {
        this.costPirce = costPirce;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "market_price", nullable = true, precision = 2)
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
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
    @javax.persistence.Column(name = "goods_id", nullable = true)
    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
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
    @javax.persistence.Column(name = "cart_thumbnail", nullable = true, length = 150)
    public String getCartThumbnail() {
        return cartThumbnail;
    }

    public void setCartThumbnail(String cartThumbnail) {
        this.cartThumbnail = cartThumbnail;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "category", nullable = true, length = 200)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "brand", nullable = true, length = 100)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "spec", nullable = true, length = 200)
    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "seller", nullable = true, length = 200)
    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbItem tbItem = (TbItem) o;

        if (id != tbItem.id) return false;
        if (num != tbItem.num) return false;
        if (categoryId != tbItem.categoryId) return false;
        if (title != null ? !title.equals(tbItem.title) : tbItem.title != null) return false;
        if (sellPoint != null ? !sellPoint.equals(tbItem.sellPoint) : tbItem.sellPoint != null) return false;
        if (price != null ? !price.equals(tbItem.price) : tbItem.price != null) return false;
        if (stockCount != null ? !stockCount.equals(tbItem.stockCount) : tbItem.stockCount != null) return false;
        if (barcode != null ? !barcode.equals(tbItem.barcode) : tbItem.barcode != null) return false;
        if (image != null ? !image.equals(tbItem.image) : tbItem.image != null) return false;
        if (status != null ? !status.equals(tbItem.status) : tbItem.status != null) return false;
        if (createTime != null ? !createTime.equals(tbItem.createTime) : tbItem.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(tbItem.updateTime) : tbItem.updateTime != null) return false;
        if (itemSn != null ? !itemSn.equals(tbItem.itemSn) : tbItem.itemSn != null) return false;
        if (costPirce != null ? !costPirce.equals(tbItem.costPirce) : tbItem.costPirce != null) return false;
        if (marketPrice != null ? !marketPrice.equals(tbItem.marketPrice) : tbItem.marketPrice != null) return false;
        if (isDefault != null ? !isDefault.equals(tbItem.isDefault) : tbItem.isDefault != null) return false;
        if (goodsId != null ? !goodsId.equals(tbItem.goodsId) : tbItem.goodsId != null) return false;
        if (sellerId != null ? !sellerId.equals(tbItem.sellerId) : tbItem.sellerId != null) return false;
        if (cartThumbnail != null ? !cartThumbnail.equals(tbItem.cartThumbnail) : tbItem.cartThumbnail != null)
            return false;
        if (category != null ? !category.equals(tbItem.category) : tbItem.category != null) return false;
        if (brand != null ? !brand.equals(tbItem.brand) : tbItem.brand != null) return false;
        if (spec != null ? !spec.equals(tbItem.spec) : tbItem.spec != null) return false;
        if (seller != null ? !seller.equals(tbItem.seller) : tbItem.seller != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (sellPoint != null ? sellPoint.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (stockCount != null ? stockCount.hashCode() : 0);
        result = 31 * result + num;
        result = 31 * result + (barcode != null ? barcode.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (int) (categoryId ^ (categoryId >>> 32));
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (itemSn != null ? itemSn.hashCode() : 0);
        result = 31 * result + (costPirce != null ? costPirce.hashCode() : 0);
        result = 31 * result + (marketPrice != null ? marketPrice.hashCode() : 0);
        result = 31 * result + (isDefault != null ? isDefault.hashCode() : 0);
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (sellerId != null ? sellerId.hashCode() : 0);
        result = 31 * result + (cartThumbnail != null ? cartThumbnail.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (spec != null ? spec.hashCode() : 0);
        result = 31 * result + (seller != null ? seller.hashCode() : 0);
        return result;
    }
}
