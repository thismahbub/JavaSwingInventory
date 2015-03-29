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
@Table(name = "purchase_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PurchaseDetail.findAll", query = "SELECT p FROM PurchaseDetail p"),
    @NamedQuery(name = "PurchaseDetail.findByPurchaseId", query = "SELECT p FROM PurchaseDetail p WHERE p.purchaseDetailPK.purchaseId = :purchaseId"),
    @NamedQuery(name = "PurchaseDetail.findByProductId", query = "SELECT p FROM PurchaseDetail p WHERE p.purchaseDetailPK.productId = :productId"),
    @NamedQuery(name = "PurchaseDetail.findByQuantity", query = "SELECT p FROM PurchaseDetail p WHERE p.quantity = :quantity"),
    @NamedQuery(name = "PurchaseDetail.findByPrice", query = "SELECT p FROM PurchaseDetail p WHERE p.price = :price")})
public class PurchaseDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PurchaseDetailPK purchaseDetailPK;
    @Basic(optional = false)
    @Column(name = "Quantity")
    private int quantity;
    @Basic(optional = false)
    @Column(name = "Price")
    private int price;
    @JoinColumn(name = "purchase_id", referencedColumnName = "purchase_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Purchase purchase;
    @JoinColumn(name = "product_id", referencedColumnName = "product_id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;

    public PurchaseDetail() {
    }

    public PurchaseDetail(PurchaseDetailPK purchaseDetailPK) {
        this.purchaseDetailPK = purchaseDetailPK;
    }

    public PurchaseDetail(PurchaseDetailPK purchaseDetailPK, int quantity, int price) {
        this.purchaseDetailPK = purchaseDetailPK;
        this.quantity = quantity;
        this.price = price;
    }

    public PurchaseDetail(int purchaseId, int productId) {
        this.purchaseDetailPK = new PurchaseDetailPK(purchaseId, productId);
    }

    public PurchaseDetailPK getPurchaseDetailPK() {
        return purchaseDetailPK;
    }

    public void setPurchaseDetailPK(PurchaseDetailPK purchaseDetailPK) {
        this.purchaseDetailPK = purchaseDetailPK;
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

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
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
        hash += (purchaseDetailPK != null ? purchaseDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PurchaseDetail)) {
            return false;
        }
        PurchaseDetail other = (PurchaseDetail) object;
        if ((this.purchaseDetailPK == null && other.purchaseDetailPK != null) || (this.purchaseDetailPK != null && !this.purchaseDetailPK.equals(other.purchaseDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.beans.PurchaseDetail[ purchaseDetailPK=" + purchaseDetailPK + " ]";
    }
    
}
