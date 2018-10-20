package th.co.abs.map.service.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name="PLACES")
public class Places implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="object_id")
    private Long objectid;
    
    private String place_id;
    
    private Double lat;
    
    private Double lng;
    
    private String adr_address;
    
    private String formatted_address;
    
    private String formatted_phone_number;
    
    private String geometry_json;
    
    private String source_id;
    
    private String name;
    
    private String photos_json;
    
    private String vicinity;
    
    private String rating;
    
    private String types_json;
    
    private String reviews_json;
    
    private String created_by;
    
    @CreationTimestamp
    private Date created_date;
    
    private String updated_by;
    
    @UpdateTimestamp
    private Date updated_date;

	public Places() {
		// TODO Auto-generated constructor stub
	}

}
