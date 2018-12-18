package entity;

import java.sql.Timestamp;

@javax.persistence.Entity
@javax.persistence.Table(name = "tb_pay_log", schema = "pyg", catalog = "")
public class TbPayLog {
    private String outTradeNo;
    private Timestamp createTime;
    private Timestamp payTime;
    private Long totalFee;
    private String userId;
    private String transactionId;
    private String tradeState;
    private String orderList;
    private String payType;

    @javax.persistence.Id
    @javax.persistence.Column(name = "out_trade_no", nullable = false, length = 30)
    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
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
    @javax.persistence.Column(name = "pay_time", nullable = true)
    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "total_fee", nullable = true)
    public Long getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
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
    @javax.persistence.Column(name = "transaction_id", nullable = true, length = 30)
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "trade_state", nullable = true, length = 1)
    public String getTradeState() {
        return tradeState;
    }

    public void setTradeState(String tradeState) {
        this.tradeState = tradeState;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "order_list", nullable = true, length = 200)
    public String getOrderList() {
        return orderList;
    }

    public void setOrderList(String orderList) {
        this.orderList = orderList;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "pay_type", nullable = true, length = 1)
    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbPayLog tbPayLog = (TbPayLog) o;

        if (outTradeNo != null ? !outTradeNo.equals(tbPayLog.outTradeNo) : tbPayLog.outTradeNo != null) return false;
        if (createTime != null ? !createTime.equals(tbPayLog.createTime) : tbPayLog.createTime != null) return false;
        if (payTime != null ? !payTime.equals(tbPayLog.payTime) : tbPayLog.payTime != null) return false;
        if (totalFee != null ? !totalFee.equals(tbPayLog.totalFee) : tbPayLog.totalFee != null) return false;
        if (userId != null ? !userId.equals(tbPayLog.userId) : tbPayLog.userId != null) return false;
        if (transactionId != null ? !transactionId.equals(tbPayLog.transactionId) : tbPayLog.transactionId != null)
            return false;
        if (tradeState != null ? !tradeState.equals(tbPayLog.tradeState) : tbPayLog.tradeState != null) return false;
        if (orderList != null ? !orderList.equals(tbPayLog.orderList) : tbPayLog.orderList != null) return false;
        if (payType != null ? !payType.equals(tbPayLog.payType) : tbPayLog.payType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = outTradeNo != null ? outTradeNo.hashCode() : 0;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (payTime != null ? payTime.hashCode() : 0);
        result = 31 * result + (totalFee != null ? totalFee.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (transactionId != null ? transactionId.hashCode() : 0);
        result = 31 * result + (tradeState != null ? tradeState.hashCode() : 0);
        result = 31 * result + (orderList != null ? orderList.hashCode() : 0);
        result = 31 * result + (payType != null ? payType.hashCode() : 0);
        return result;
    }
}
