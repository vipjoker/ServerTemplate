package com.nitsoft.ecommerce.database.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@DynamicInsert
@DynamicUpdate
@Table(name = "products")
@XmlRootElement
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_id")
    private Long productId;
    
    @Basic(optional = false)
    @Column(name = "company_id")
    private Long companyId;
    
    @Basic(optional = false)
    @Column(name = "name",length = 1024)
    private String name;
    
    @Column(name = "browsing_name",length = 1024)
    private String browsingName;
    
    @Basic(optional = false)
    @Column(name = "sale_price")
    private double salePrice;
    
    @Basic(optional = false)
    @Column(name = "list_price")
    private double listPrice;
    
    @Basic(optional = false)
    @Column(name = "default_image",length = 1024)
    private String defaultImage;
    
    @Basic(optional = false)
    @Column(name = "overview",length = 1024)
    private String overview;
    
    @Basic(optional = false)
    @Column(name = "quantity")
    private int quantity;
    
    @Column(name = "is_stock_controlled")
    private Boolean isStockControlled;
    
    @Basic(optional = false)
    @Column(name = "status")
    private int status;
    
    @Column(name = "description",length = 1024)
    private String description;
    
    @Basic(optional = false)
    @Column(name = "rank")
    private int rank;
    
    @Basic(optional = false)
    @Column(name = "sku",length = 1024)
    private String sku;
    
    @Basic(optional = false)
    @Column(name = "created_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    
    @Column(name = "updated_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;

}
