/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.beans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "sales_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesDetail.findAll", query = "SELECT s FROM SalesDetail s"),
    @NamedQuery(name = "SalesDetail.findBySalesId", query = "SELECT s FROM SalesDetail s WHERE s.salesDetailPK.salesId = :salesId"),
    @NamedQuery(name = "SalesDetail.findByProductId", query = "SELECT s FROM SalesDetail s WHERE s.salesDetailPK.productId = :productId"),
    @NamedQuery(name = "SalesDetail.findByQuantity", query = "SELECT s FROM SalesDetail s WHERE s.quantity = :quantity"),
    @NamedQuery(name = "SalesDetail.findByPrice", query = "SELECT s FROM SalesDetail s WHERE s.price = :price")})
public class SalesDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SalesDetailPK salesDetailPK;
    @Basic(optional = false)
    @Column(name = "Quantity")
    private int quantity;
    @Basic(optional = false)
    @Column(name = "price")
    private int price;
    @JoinColumn(name = "sales_id", referencedColumnName = "sales_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sales sales;
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;

    public SalesDetail() {
    }

    public SalesDetail(SalesDetailPK salesDetailPK) {
        this.salesDetailPK = salesDetailPK;
    }

    public SalesDetail(SalesDetailPK salesDetailPK, int quantity, int price) {
        this.salesDetailPK = salesDetailPK;
        this.quantity = quantity;
        this.price = price;
    }

    public SalesDetail(int salesId, int productId) {
        this.salesDetailPK = new SalesDetailPK(salesId, productId);
    }

    public SalesDetailPK getSalesDetailPK() {
        return salesDetailPK;
    }

    public void setSalesDetailPK(SalesDetailPK salesDetailPK) {
        this.salesDetailPK = salesDetailPK;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesDetailPK != null ? salesDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesDetail)) {
            return false;
        }
        SalesDetail other = (SalesDetail) object;
        if ((this.salesDetailPK == null && other.salesDetailPK != null) || (this.salesDetailPK != null && !this.salesDetailPK.equals(other.salesDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.beans.SalesDetail[ salesDetailPK=" + salesDetailPK + " ]";
    }
    
}
