package entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_order", schema = "pyg", catalog = "")
public class TbOrder {
    private long orderId;
    private BigDecimal payment;
    private String paymentType;
    private String postFee;
    private String status;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Timestamp paymentTime;
    private Timestamp consignTime;
    private Timestamp endTime;
    private Timestamp closeTime;
    private String shippingName;
    private String shippingCode;
    private String userId;
    private String buyerMessage;
    private String buyerNick;
    private String buyerRate;
    private String receiverAreaName;
    private String receiverMobile;
    private String receiverZipCode;
    private String receiver;
    private Timestamp expire;
    private String invoiceType;
    private String sourceType;
    private String sellerId;

    @javax.persistence.Id
    @javax.persistence.Column(name = "order_id", nullable = false)
    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "payment", nullable = true, precision = 2)
    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "payment_type", nullable = true, length = 1)
    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "post_fee", nullable = true, length = 50)
    public String getPostFee() {
        return postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
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
    @javax.persistence.Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "update_time", nullable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "payment_time", nullable = true)
    public Timestamp getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Timestamp paymentTime) {
        this.paymentTime = paymentTime;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "consign_time", nullable = true)
    public Timestamp getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Timestamp consignTime) {
        this.consignTime = consignTime;
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
    @javax.persistence.Column(name = "close_time", nullable = true)
    public Timestamp getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Timestamp closeTime) {
        this.closeTime = closeTime;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "shipping_name", nullable = true, length = 20)
    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "shipping_code", nullable = true, length = 20)
    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
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
    @javax.persistence.Column(name = "buyer_message", nullable = true, length = 100)
    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "buyer_nick", nullable = true, length = 50)
    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "buyer_rate", nullable = true, length = 2)
    public String getBuyerRate() {
        return buyerRate;
    }

    public void setBuyerRate(String buyerRate) {
        this.buyerRate = buyerRate;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "receiver_area_name", nullable = true, length = 100)
    public String getReceiverAreaName() {
        return receiverAreaName;
    }

    public void setReceiverAreaName(String receiverAreaName) {
        this.receiverAreaName = receiverAreaName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "receiver_mobile", nullable = true, length = 12)
    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "receiver_zip_code", nullable = true, length = 15)
    public String getReceiverZipCode() {
        return receiverZipCode;
    }

    public void setReceiverZipCode(String receiverZipCode) {
        this.receiverZipCode = receiverZipCode;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "receiver", nullable = true, length = 50)
    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "expire", nullable = true)
    public Timestamp getExpire() {
        return expire;
    }

    public void setExpire(Timestamp expire) {
        this.expire = expire;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "invoice_type", nullable = true, length = 1)
    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
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
    @javax.persistence.Column(name = "seller_id", nullable = true, length = 100)
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbOrder tbOrder = (TbOrder) o;

        if (orderId != tbOrder.orderId) return false;
        if (payment != null ? !payment.equals(tbOrder.payment) : tbOrder.payment != null) return false;
        if (paymentType != null ? !paymentType.equals(tbOrder.paymentType) : tbOrder.paymentType != null) return false;
        if (postFee != null ? !postFee.equals(tbOrder.postFee) : tbOrder.postFee != null) return false;
        if (status != null ? !status.equals(tbOrder.status) : tbOrder.status != null) return false;
        if (createTime != null ? !createTime.equals(tbOrder.createTime) : tbOrder.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(tbOrder.updateTime) : tbOrder.updateTime != null) return false;
        if (paymentTime != null ? !paymentTime.equals(tbOrder.paymentTime) : tbOrder.paymentTime != null) return false;
        if (consignTime != null ? !consignTime.equals(tbOrder.consignTime) : tbOrder.consignTime != null) return false;
        if (endTime != null ? !endTime.equals(tbOrder.endTime) : tbOrder.endTime != null) return false;
        if (closeTime != null ? !closeTime.equals(tbOrder.closeTime) : tbOrder.closeTime != null) return false;
        if (shippingName != null ? !shippingName.equals(tbOrder.shippingName) : tbOrder.shippingName != null)
            return false;
        if (shippingCode != null ? !shippingCode.equals(tbOrder.shippingCode) : tbOrder.shippingCode != null)
            return false;
        if (userId != null ? !userId.equals(tbOrder.userId) : tbOrder.userId != null) return false;
        if (buyerMessage != null ? !buyerMessage.equals(tbOrder.buyerMessage) : tbOrder.buyerMessage != null)
            return false;
        if (buyerNick != null ? !buyerNick.equals(tbOrder.buyerNick) : tbOrder.buyerNick != null) return false;
        if (buyerRate != null ? !buyerRate.equals(tbOrder.buyerRate) : tbOrder.buyerRate != null) return false;
        if (receiverAreaName != null ? !receiverAreaName.equals(tbOrder.receiverAreaName) : tbOrder.receiverAreaName != null)
            return false;
        if (receiverMobile != null ? !receiverMobile.equals(tbOrder.receiverMobile) : tbOrder.receiverMobile != null)
            return false;
        if (receiverZipCode != null ? !receiverZipCode.equals(tbOrder.receiverZipCode) : tbOrder.receiverZipCode != null)
            return false;
        if (receiver != null ? !receiver.equals(tbOrder.receiver) : tbOrder.receiver != null) return false;
        if (expire != null ? !expire.equals(tbOrder.expire) : tbOrder.expire != null) return false;
        if (invoiceType != null ? !invoiceType.equals(tbOrder.invoiceType) : tbOrder.invoiceType != null) return false;
        if (sourceType != null ? !sourceType.equals(tbOrder.sourceType) : tbOrder.sourceType != null) return false;
        if (sellerId != null ? !sellerId.equals(tbOrder.sellerId) : tbOrder.sellerId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (orderId ^ (orderId >>> 32));
        result = 31 * result + (payment != null ? payment.hashCode() : 0);
        result = 31 * result + (paymentType != null ? paymentType.hashCode() : 0);
        result = 31 * result + (postFee != null ? postFee.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (paymentTime != null ? paymentTime.hashCode() : 0);
        result = 31 * result + (consignTime != null ? consignTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (closeTime != null ? closeTime.hashCode() : 0);
        result = 31 * result + (shippingName != null ? shippingName.hashCode() : 0);
        result = 31 * result + (shippingCode != null ? shippingCode.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (buyerMessage != null ? buyerMessage.hashCode() : 0);
        result = 31 * result + (buyerNick != null ? buyerNick.hashCode() : 0);
        result = 31 * result + (buyerRate != null ? buyerRate.hashCode() : 0);
        result = 31 * result + (receiverAreaName != null ? receiverAreaName.hashCode() : 0);
        result = 31 * result + (receiverMobile != null ? receiverMobile.hashCode() : 0);
        result = 31 * result + (receiverZipCode != null ? receiverZipCode.hashCode() : 0);
        result = 31 * result + (receiver != null ? receiver.hashCode() : 0);
        result = 31 * result + (expire != null ? expire.hashCode() : 0);
        result = 31 * result + (invoiceType != null ? invoiceType.hashCode() : 0);
        result = 31 * result + (sourceType != null ? sourceType.hashCode() : 0);
        result = 31 * result + (sellerId != null ? sellerId.hashCode() : 0);
        return result;
    }
}
