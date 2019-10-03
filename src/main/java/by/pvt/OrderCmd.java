package by.pvt;

import java.io.Serializable;
import java.util.Date;

public class OrderCmd implements Serializable {

    private Long id;
    private Long productId;
    private Double productPrice;
    private Integer itemCount;
    private String comment;
    private Date createdDate;

    public OrderCmd() {
    }

    public OrderCmd(Long id, Long productId, Double productPrice, Integer itemCount, String comment, Date createdDate) {
        this.id = id;
        this.productId = productId;
        this.productPrice = productPrice;
        this.itemCount = itemCount;
        this.comment = comment;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderCmd orderCmd = (OrderCmd) o;

        if (id != null ? !id.equals(orderCmd.id) : orderCmd.id != null) return false;
        if (productId != null ? !productId.equals(orderCmd.productId) : orderCmd.productId != null) return false;
        if (productPrice != null ? !productPrice.equals(orderCmd.productPrice) : orderCmd.productPrice != null)
            return false;
        if (itemCount != null ? !itemCount.equals(orderCmd.itemCount) : orderCmd.itemCount != null) return false;
        if (comment != null ? !comment.equals(orderCmd.comment) : orderCmd.comment != null) return false;
        return createdDate != null ? createdDate.equals(orderCmd.createdDate) : orderCmd.createdDate == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (productPrice != null ? productPrice.hashCode() : 0);
        result = 31 * result + (itemCount != null ? itemCount.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
               "id=" + id +
               ", productId=" + productId +
               ", productPrice=" + productPrice +
               ", itemCount=" + itemCount +
               ", comment='" + comment + '\'' +
               ", createdDate=" + createdDate +
               '}';
    }
}