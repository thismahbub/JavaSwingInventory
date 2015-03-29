/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.beans;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
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
@Table(name = "sales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sales.findAll", query = "SELECT s FROM Sales s"),
    @NamedQuery(name = "Sales.findBySalesId", query = "SELECT s FROM Sales s WHERE s.salesId = :salesId"),
    @NamedQuery(name = "Sales.findByDate", query = "SELECT s FROM Sales s WHERE s.date = :date")})
public class Sales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sales_id")
    private Integer salesId;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(optional = false)
    private Customer customerId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sales")
    private Collection<SalesDetail> salesDetailCollection;

    public Sales() {
    }

    public Sales(Integer salesId) {
        this.salesId = salesId;
    }

    public Sales(Integer salesId, Date date) {
        this.salesId = salesId;
        this.date = date;
    }

    public Integer getSalesId() {
        return salesId;
    }

    public void setSalesId(Integer salesId) {
        this.salesId = salesId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    @XmlTransient
    public Collection<SalesDetail> getSalesDetailCollection() {
        return salesDetailCollection;
    }

    public void setSalesDetailCollection(Collection<SalesDetail> salesDetailCollection) {
        this.salesDetailCollection = salesDetailCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salesId != null ? salesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sales)) {
            return false;
        }
        Sales other = (Sales) object;
        if ((this.salesId == null && other.salesId != null) || (this.salesId != null && !this.salesId.equals(other.salesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.beans.Sales[ salesId=" + salesId + " ]";
    }
    
}
