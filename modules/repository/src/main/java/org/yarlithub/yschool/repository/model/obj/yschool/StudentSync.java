package org.yarlithub.yschool.repository.model.obj.yschool;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.yarlithub.yschool.repository.model.obj.yschool.iface.IStudentSync;


/** 
 * Object mapping for hibernate-handled table: student_sync.
 * @author autogenerated
 */

@Entity
@Table(name = "student_sync", schema = "yschool")
public class StudentSync implements Cloneable, Serializable, IPojoGenEntity, IStudentSync {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558977409L;

	

	/** Field mapping. */
	@Id 
	@Column( name = "class_idstudent", nullable = false  )
	private StudentSyncPK id;

	/** Field mapping. */
	@Column( name = "modified_time", nullable = false  )
	private Date modifiedTime;

	/** Field mapping. */
	@Column( name = "sync_status"  )
	private Integer syncStatus;

	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public StudentSync() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public StudentSync(StudentSyncPK id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param id StudentSyncPK object;
	 * @param modifiedTime Date object;
	 */
	public StudentSync(StudentSyncPK id, Date modifiedTime) {

		this.id = id;
		this.modifiedTime = modifiedTime;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return StudentSync.class;
	}
 

    /**
     * Return the value associated with the column: id.
	 * @return A StudentSyncPK object (this.id)
	 */
	@Basic( optional = false )
	@Column( name = "class_idstudent", nullable = false  )
	public StudentSyncPK getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final StudentSyncPK id) {
		this.id = id;
	}

    /**
     * Return the value associated with the column: modifiedTime.
	 * @return A Date object (this.modifiedTime)
	 */
	@Basic( optional = false )
	@Column( name = "modified_time", nullable = false  )
	public Date getModifiedTime() {
		return this.modifiedTime;
		
	}
	

  
    /**  
     * Set the value related to the column: modifiedTime.
	 * @param modifiedTime the modifiedTime value you wish to set
	 */
	public void setModifiedTime(final Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

    /**
     * Return the value associated with the column: syncStatus.
	 * @return A Integer object (this.syncStatus)
	 */
	@Basic( optional = true )
	@Column( name = "sync_status"  )
	public Integer getSyncStatus() {
		return this.syncStatus;
		
	}
	

  
    /**  
     * Set the value related to the column: syncStatus.
	 * @param syncStatus the syncStatus value you wish to set
	 */
	public void setSyncStatus(final Integer syncStatus) {
		this.syncStatus = syncStatus;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public StudentSync clone() throws CloneNotSupportedException {
		
        final StudentSync copy = (StudentSync)super.clone();

		copy.setId(this.getId());
		copy.setModifiedTime(this.getModifiedTime());
		copy.setSyncStatus(this.getSyncStatus());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("id: " + this.getId() + ", ");
		sb.append("modifiedTime: " + this.getModifiedTime() + ", ");
		sb.append("syncStatus: " + this.getSyncStatus());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		if ( this == aThat ) {
			 return true;
		}

		if ((aThat == null) || ( !(aThat.getClass().equals(this.getClass())))) {
			 return false;
		}
	
		final StudentSync that = (StudentSync) aThat;
		return this.getId().equals(that.getId());
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		return getId().hashCode();
	}
	

	
}
