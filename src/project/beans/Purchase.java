/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.beans;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "purchase")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Purchase.findAll", query = "SELECT p FROM Purchase p"),
    @NamedQuery(name = "Purchase.findByPurchaseId", query = "SELECT p FROM Purchase p WHERE p.purchaseId = :purchaseId"),
    @NamedQuery(name = "Purchase.findByDate", query = "SELECT p FROM Purchase p WHERE p.date = :date")})
public class Purchase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "purchase_id")
    private Integer purchaseId;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @JoinColumn(name = "supplier_id", referencedColumnName = "supplier_id")
    @ManyToOne(optional = false)
    private Supplier supplierId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "purchase")
    private Collection<PurchaseDetail> purchaseDetailCollection;

    public Purchase() {
    }

    public Purchase(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Purchase(Integer purchaseId, Date date) {
        this.purchaseId = purchaseId;
        this.date = date;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Supplier getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Supplier supplierId) {
        this.supplierId = supplierId;
    }

    @XmlTransient
    public Collection<PurchaseDetail> getPurchaseDetailCollection() {
        return purchaseDetailCollection;
    }

    public void setPurchaseDetailCollection(Collection<PurchaseDetail> purchaseDetailCollection) {
        this.purchaseDetailCollection = purchaseDetailCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (purchaseId != null ? purchaseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Purchase)) {
            return false;
        }
        Purchase other = (Purchase) object;
        if ((this.purchaseId == null && other.purchaseId != null) || (this.purchaseId != null && !this.purchaseId.equals(other.purchaseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.beans.Purchase[ purchaseId=" + purchaseId + " ]";
    }
    
}
