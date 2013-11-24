package org.yarlithub.yschool.repository.services.data;

import java.io.Serializable;
import org.yarlithub.yschool.repository.model.obj.yschool.ClassAnalyzerClassifier;
import org.yarlithub.yschool.repository.model.obj.yschool.Classroom;
import org.yarlithub.yschool.repository.model.obj.yschool.ClassroomHasStaffHasRole;
import org.yarlithub.yschool.repository.model.obj.yschool.ClassroomHasStaffHasRolePK;
import org.yarlithub.yschool.repository.model.obj.yschool.ClassroomStudent;
import org.yarlithub.yschool.repository.model.obj.yschool.ClassroomSubject;
import org.yarlithub.yschool.repository.model.obj.yschool.ClassroomSubjectHasStaffHasRole;
import org.yarlithub.yschool.repository.model.obj.yschool.ClassroomSubjectHasStaffHasRolePK;
import org.yarlithub.yschool.repository.model.obj.yschool.Exam;
import org.yarlithub.yschool.repository.model.obj.yschool.ExamSync;
import org.yarlithub.yschool.repository.model.obj.yschool.ExamSyncPK;
import org.yarlithub.yschool.repository.model.obj.yschool.ExamType;
import org.yarlithub.yschool.repository.model.obj.yschool.Marks;
import org.yarlithub.yschool.repository.model.obj.yschool.Results;
import org.yarlithub.yschool.repository.model.obj.yschool.Role;
import org.yarlithub.yschool.repository.model.obj.yschool.School;
import org.yarlithub.yschool.repository.model.obj.yschool.SchoolHasStaffHasRole;
import org.yarlithub.yschool.repository.model.obj.yschool.SchoolHasStaffHasRolePK;
import org.yarlithub.yschool.repository.model.obj.yschool.Section;
import org.yarlithub.yschool.repository.model.obj.yschool.SectionHasStaffHasRole;
import org.yarlithub.yschool.repository.model.obj.yschool.SectionHasStaffHasRolePK;
import org.yarlithub.yschool.repository.model.obj.yschool.Staff;
import org.yarlithub.yschool.repository.model.obj.yschool.StaffHasRole;
import org.yarlithub.yschool.repository.model.obj.yschool.Student;
import org.yarlithub.yschool.repository.model.obj.yschool.StudentClassroomSubject;
import org.yarlithub.yschool.repository.model.obj.yschool.StudentGeneralexamProfile;
import org.yarlithub.yschool.repository.model.obj.yschool.StudentSync;
import org.yarlithub.yschool.repository.model.obj.yschool.StudentSyncPK;
import org.yarlithub.yschool.repository.model.obj.yschool.Subject;
import org.yarlithub.yschool.repository.model.obj.yschool.User;
import org.yarlithub.yschool.repository.model.obj.yschool.UserRole;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.ReplicationMode;
import org.hibernate.Session;
import java.util.Collection;
import com.felees.hbnpojogen.persistence.IPojoGenEntity;
/** 
 * Data layer.
 * @author autogenerated
 */
public interface DataLayerYschool {

    /**
     * Deletes the given object from disk.
     * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to delete
     */
    <T> void delete(T persistentObject);
    /**
     * Refresh the object $class.className from disk.
     * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to reload
     */
    <T> void refresh(T persistentObject);

    /**
     * Saves the given object to disk.
     * @param persistentObject Object to save
	 * @param <T> A DataLayerObject-derived type
     * @return Identifier of saved object 
     */
    <T> Serializable save(T persistentObject);
    /**
     * Saves or updates the given $class.className object to disk.
	 * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to save 
     */
    <T> void saveOrUpdate(T persistentObject);
    /**
     * Updates the given object to disk.
	 * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to update 
     */
    <T> void update(T persistentObject);


    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Classroom obj) directly
     * @param id Identifier to delete
     */
    void deleteClassroom(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Classroom object
     */
    Classroom loadClassroom(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Classroom getClassroom(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ClassroomHasStaffHasRole obj) directly
     * @param id Identifier to delete
     */
    void deleteClassroomHasStaffHasRole(final ClassroomHasStaffHasRolePK id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ClassroomHasStaffHasRole object
     */
    ClassroomHasStaffHasRole loadClassroomHasStaffHasRole(final ClassroomHasStaffHasRolePK id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     ClassroomHasStaffHasRole getClassroomHasStaffHasRole(final ClassroomHasStaffHasRolePK id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ClassroomStudent obj) directly
     * @param id Identifier to delete
     */
    void deleteClassroomStudent(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ClassroomStudent object
     */
    ClassroomStudent loadClassroomStudent(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     ClassroomStudent getClassroomStudent(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ClassroomSubject obj) directly
     * @param id Identifier to delete
     */
    void deleteClassroomSubject(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ClassroomSubject object
     */
    ClassroomSubject loadClassroomSubject(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     ClassroomSubject getClassroomSubject(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ClassroomSubjectHasStaffHasRole obj) directly
     * @param id Identifier to delete
     */
    void deleteClassroomSubjectHasStaffHasRole(final ClassroomSubjectHasStaffHasRolePK id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ClassroomSubjectHasStaffHasRole object
     */
    ClassroomSubjectHasStaffHasRole loadClassroomSubjectHasStaffHasRole(final ClassroomSubjectHasStaffHasRolePK id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     ClassroomSubjectHasStaffHasRole getClassroomSubjectHasStaffHasRole(final ClassroomSubjectHasStaffHasRolePK id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ClassAnalyzerClassifier obj) directly
     * @param id Identifier to delete
     */
    void deleteClassAnalyzerClassifier(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ClassAnalyzerClassifier object
     */
    ClassAnalyzerClassifier loadClassAnalyzerClassifier(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     ClassAnalyzerClassifier getClassAnalyzerClassifier(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Exam obj) directly
     * @param id Identifier to delete
     */
    void deleteExam(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Exam object
     */
    Exam loadExam(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Exam getExam(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ExamSync obj) directly
     * @param id Identifier to delete
     */
    void deleteExamSync(final ExamSyncPK id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ExamSync object
     */
    ExamSync loadExamSync(final ExamSyncPK id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     ExamSync getExamSync(final ExamSyncPK id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ExamType obj) directly
     * @param id Identifier to delete
     */
    void deleteExamType(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ExamType object
     */
    ExamType loadExamType(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     ExamType getExamType(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Marks obj) directly
     * @param id Identifier to delete
     */
    void deleteMarks(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Marks object
     */
    Marks loadMarks(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Marks getMarks(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Results obj) directly
     * @param id Identifier to delete
     */
    void deleteResults(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Results object
     */
    Results loadResults(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Results getResults(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Role obj) directly
     * @param id Identifier to delete
     */
    void deleteRole(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Role object
     */
    Role loadRole(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Role getRole(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (School obj) directly
     * @param id Identifier to delete
     */
    void deleteSchool(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a School object
     */
    School loadSchool(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     School getSchool(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (SchoolHasStaffHasRole obj) directly
     * @param id Identifier to delete
     */
    void deleteSchoolHasStaffHasRole(final SchoolHasStaffHasRolePK id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a SchoolHasStaffHasRole object
     */
    SchoolHasStaffHasRole loadSchoolHasStaffHasRole(final SchoolHasStaffHasRolePK id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     SchoolHasStaffHasRole getSchoolHasStaffHasRole(final SchoolHasStaffHasRolePK id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Section obj) directly
     * @param id Identifier to delete
     */
    void deleteSection(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Section object
     */
    Section loadSection(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Section getSection(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (SectionHasStaffHasRole obj) directly
     * @param id Identifier to delete
     */
    void deleteSectionHasStaffHasRole(final SectionHasStaffHasRolePK id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a SectionHasStaffHasRole object
     */
    SectionHasStaffHasRole loadSectionHasStaffHasRole(final SectionHasStaffHasRolePK id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     SectionHasStaffHasRole getSectionHasStaffHasRole(final SectionHasStaffHasRolePK id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Staff obj) directly
     * @param id Identifier to delete
     */
    void deleteStaff(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Staff object
     */
    Staff loadStaff(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Staff getStaff(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (StaffHasRole obj) directly
     * @param id Identifier to delete
     */
    void deleteStaffHasRole(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a StaffHasRole object
     */
    StaffHasRole loadStaffHasRole(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     StaffHasRole getStaffHasRole(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Student obj) directly
     * @param id Identifier to delete
     */
    void deleteStudent(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Student object
     */
    Student loadStudent(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Student getStudent(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (StudentClassroomSubject obj) directly
     * @param id Identifier to delete
     */
    void deleteStudentClassroomSubject(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a StudentClassroomSubject object
     */
    StudentClassroomSubject loadStudentClassroomSubject(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     StudentClassroomSubject getStudentClassroomSubject(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (StudentGeneralexamProfile obj) directly
     * @param id Identifier to delete
     */
    void deleteStudentGeneralexamProfile(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a StudentGeneralexamProfile object
     */
    StudentGeneralexamProfile loadStudentGeneralexamProfile(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     StudentGeneralexamProfile getStudentGeneralexamProfile(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (StudentSync obj) directly
     * @param id Identifier to delete
     */
    void deleteStudentSync(final StudentSyncPK id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a StudentSync object
     */
    StudentSync loadStudentSync(final StudentSyncPK id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     StudentSync getStudentSync(final StudentSyncPK id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Subject obj) directly
     * @param id Identifier to delete
     */
    void deleteSubject(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Subject object
     */
    Subject loadSubject(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     Subject getSubject(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (User obj) directly
     * @param id Identifier to delete
     */
    void deleteUser(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a User object
     */
    User loadUser(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     User getUser(final Integer id);  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (UserRole obj) directly
     * @param id Identifier to delete
     */
    void deleteUserRole(final Integer id);
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a UserRole object
     */
    UserRole loadUserRole(final Integer id);
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     UserRole getUserRole(final Integer id);  
    /** Returns a query handle.
     * @param query Query to use
     * @return A query instance
     */
     Query createQuery(final String query);
    /** Returns a criteria handle.
     * @param criteria Criteria to use
     * @return A criteria instance
     */
     Criteria createCriteria(final String criteria);
    /** Returns a Query handle based on your package-level named query.
     * @param query Query to use
     * @return A query instance
     */
     Query getNamedQuery(final String query);
    /** Create a new Criteria instance, for the given entity class, or a superclass of an entity class.
	* @param persistentObject a class, which is persistent, or has persistent subclasses 
	* @return Criteria instance
	*/
	@SuppressWarnings("rawtypes")
	Criteria createCriteria(Class persistentObject);
    /** Flushes the currently open session.
	*/
	void flushSession();
    /** Clears the currently open session.
	*/
	void clearSession();
    /** Flushes and clears the currently open session.
	*/
	void flushAndClearSession();
	/** Call currentSession.replicate.
	 * @param obj to replicate
	 * @param replicationMode mode
	 */ 
	void replicate(Object obj, ReplicationMode replicationMode);
	/** Hibernate Merge. 
	 * @param obj to merge
	 * @return obj merged.
	 */
	Object merge(Object obj);
	/** Returns the current session.
	 * @return the currently active session
	 */
	Session getCurrentSession();
	/** Returns a query handle.
     * @param query Query to use
     * @return A query instance
     */
     SQLQuery createSQLQuery(final String query);
    /** Remove this instance from the session cache. 
	 * Changes to the instance will not be synchronized with the database
	 * @param obj object to evict
	 */
	void evict(Object obj);
    /**
     * Return the persistent instance of the given entity class with the given 
     * identifier, or null if there is no such persistent instance. 
     * (If the instance, or a proxy for the instance, is already 
     * associated with the session, return that instance or proxy)
     *
     * @param clazz a persistent class
     * @param id a valid identifier of an existing persistent instance of the class
     * @return a persistent instance or null
     * @throws HibernateException
     */
	Object get(Class<?> clazz, Serializable id) throws HibernateException;	


    /**
     * Return the persistent instance of the given entity class with the given identifier, assuming that the instance exists.
     *You should not use this method to determine if an instance exists (use get() instead). Use this only to retrieve an instance that you assume exists, where non-existence would be an actual error.
     *
     * @param clazz a persistent class
     * @param id a valid identifier of an existing persistent instance of the class
     * @return the persistent instance or proxy
     * @throws HibernateException
     */
	Object load(Class<?> clazz, Serializable id) throws HibernateException;
	/**
	 * Reattaches the given entity to the current session using LockMode.NONE
	 *
	 * @param entity to reattach
	 */
	void reattachEntityWithNoLock(IPojoGenEntity entity);
	/**
	 * Reattaches the given entities to the current session.
	 *
	 * @param entities to attach
	 */
	void reattachEntitiesWithNoLock(Collection<? extends IPojoGenEntity> entities);}

