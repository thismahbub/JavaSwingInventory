/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.beans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Administrator
 */
@Embeddable
public class PurchaseDetailPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "purchase_id")
    private int purchaseId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;

    public PurchaseDetailPK() {
    }

    public PurchaseDetailPK(int purchaseId, int productId) {
        this.purchaseId = purchaseId;
        this.productId = productId;
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) purchaseId;
        hash += (int) productId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PurchaseDetailPK)) {
            return false;
        }
        PurchaseDetailPK other = (PurchaseDetailPK) object;
        if (this.purchaseId != other.purchaseId) {
            return false;
        }
        if (this.productId != other.productId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.beans.PurchaseDetailPK[ purchaseId=" + purchaseId + ", productId=" + productId + " ]";
    }
    
}
