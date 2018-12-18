package entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_seckill_goods", schema = "pyg", catalog = "")
public class TbSeckillGoods {
    private long id;
    private Long goodsId;
    private Long itemId;
    private String title;
    private String smallPic;
    private BigDecimal price;
    private BigDecimal costPrice;
    private String sellerId;
    private Timestamp createTime;
    private Timestamp checkTime;
    private String status;
    private Timestamp startTime;
    private Timestamp endTime;
    private Integer num;
    private Integer stockCount;
    private String introduction;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @javax.persistence.Column(name = "item_id", nullable = true)
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "title", nullable = true, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    @javax.persistence.Column(name = "cost_price", nullable = true, precision = 2)
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "seller_id", nullable = true, length = 100)
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
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
    @javax.persistence.Column(name = "check_time", nullable = true)
    public Timestamp getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Timestamp checkTime) {
        this.checkTime = checkTime;
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
    @javax.persistence.Column(name = "start_time", nullable = true)
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "end_time", nullable = true)
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "num", nullable = true)
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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
    @javax.persistence.Column(name = "introduction", nullable = true, length = 2000)
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbSeckillGoods that = (TbSeckillGoods) o;

        if (id != that.id) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (itemId != null ? !itemId.equals(that.itemId) : that.itemId != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (smallPic != null ? !smallPic.equals(that.smallPic) : that.smallPic != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (costPrice != null ? !costPrice.equals(that.costPrice) : that.costPrice != null) return false;
        if (sellerId != null ? !sellerId.equals(that.sellerId) : that.sellerId != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (checkTime != null ? !checkTime.equals(that.checkTime) : that.checkTime != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (num != null ? !num.equals(that.num) : that.num != null) return false;
        if (stockCount != null ? !stockCount.equals(that.stockCount) : that.stockCount != null) return false;
        if (introduction != null ? !introduction.equals(that.introduction) : that.introduction != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (itemId != null ? itemId.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (smallPic != null ? smallPic.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (costPrice != null ? costPrice.hashCode() : 0);
        result = 31 * result + (sellerId != null ? sellerId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (checkTime != null ? checkTime.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (stockCount != null ? stockCount.hashCode() : 0);
        result = 31 * result + (introduction != null ? introduction.hashCode() : 0);
        return result;
    }
}
