package project.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MyEntityManager {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaSwingInventoryPU");
    EntityManager em = emf.createEntityManager();

    public boolean add(Object object) {
        boolean isAdded = false;    
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
            isAdded = true;
        } catch (Exception e) {
            em.getTransaction().rollback();
        } 
        return isAdded;
    }

    public boolean update(Object object) {
        boolean isUpdated = false;
        em.getTransaction().begin();
        try {
            em.merge(object);
            em.getTransaction().commit();
            isUpdated = true;
        } catch (Exception e) {
            em.getTransaction().rollback();
        } 
        return isUpdated;
    }


    public boolean delete(Object object) {
        boolean isDeleted = false;
        em.getTransaction().begin();
        try {
            em.remove(object);
            em.getTransaction().commit();
            isDeleted = true;
        } catch (Exception e) {
            em.getTransaction().rollback();
        } 
        return isDeleted;
    }

    public Object find(Class objectClass,Object id)
    {
        return em.find(objectClass, id);
    }

    public EntityManager getEm() {
        return em;
    }


    public int getNewSalesId()
    {
        int salesId = 0;

        Object id = getEm().createNativeQuery("SELECT max(sales_id) FROM Sales").getSingleResult();
        if(id!=null)
        {
            salesId = Integer.parseInt(id.toString());
        }
        salesId++;
        return salesId;
    }

    public int getNewCategoryId()
    {
        int categoryId = 0;

        Object id = getEm().createNativeQuery("SELECT max(category_id) FROM Category").getSingleResult();
        if(id!=null)
        {
            categoryId = Integer.parseInt(id.toString());
        }
        categoryId++;
        return categoryId;
    }

    public int getNewCustomerId()
    {
        int customerId = 0;

        Object id = getEm().createNativeQuery("SELECT max(customer_id) FROM Customer").getSingleResult();
        if(id!=null)
        {
            customerId = Integer.parseInt(id.toString());
        }
        customerId++;
        return customerId;
    }

    public int getNewProductId()
    {
        int productId = 0;

        Object id = getEm().createNativeQuery("SELECT max(product_id) FROM Product").getSingleResult();
        if(id!=null)
        {
            productId = Integer.parseInt(id.toString());
        }
        productId++;
        return productId;
    }

    public int getNewPurchaseId()
    {
        int purcahseId = 0;

        Object id = getEm().createNativeQuery("SELECT max(purchase_id) FROM purchase").getSingleResult();
        if(id!=null)
        {
            purcahseId = Integer.parseInt(id.toString());
        }
        purcahseId++;
        return purcahseId;
    }

    public int getNewSupplierId()
    {
        int supplierId = 0;

        Object id = getEm().createNativeQuery("SELECT max(supplier_id) FROM Supplier").getSingleResult();
        if(id!=null)
        {
            supplierId = Integer.parseInt(id.toString());
        }
        supplierId++;
        return supplierId;
    }

}