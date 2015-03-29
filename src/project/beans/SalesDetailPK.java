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
public class SalesDetailPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "sales_id")
    private int salesId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private int productId;

    public SalesDetailPK() {
    }

    public SalesDetailPK(int salesId, int productId) {
        this.salesId = salesId;
        this.productId = productId;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
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
        hash += (int) salesId;
        hash += (int) productId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SalesDetailPK)) {
            return false;
        }
        SalesDetailPK other = (SalesDetailPK) object;
        if (this.salesId != other.salesId) {
            return false;
        }
        if (this.productId != other.productId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.beans.SalesDetailPK[ salesId=" + salesId + ", productId=" + productId + " ]";
    }
    
}
