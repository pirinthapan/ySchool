package org.yarlithub.yschool.repository.services.data;

import java.io.Serializable;
import org.yarlithub.yschool.repository.factories.yschool.*;
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
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import com.felees.hbnpojogen.persistence.GenericDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.hibernate.LockOptions;
import org.hibernate.SessionFactory;
import org.hibernate.proxy.HibernateProxy;
/** 
 * Data layer.
 * @author autogenerated
 */
@org.springframework.stereotype.Component
public class DataLayerYschoolImpl implements DataLayerYschool {
	/** Singleton reference to this class. */
	private static DataLayerYschool instance;
	/** map lock. */
	private static Object daoMapLock = new Object();

	/** Internal handle. */
	private static Map<Class<?>, GenericDAO<?, ?>> daoMap = null; 
	
		/** Inner handle. */
	private static ApplicationContext context;
 /** Sessionfactory in use. Filled in by Spring. */ 
    private SessionFactory sessionFactory = null;
	
	/** Handle to get back ourselves and perform correct injection. 
	 * @param ctxt filled by spring
	 */
	@Autowired
	public void setApplicationContext(ApplicationContext ctxt) {
		DataLayerYschoolImpl.context = ctxt;
	}
	
	
		
 	/**
     * Set session factory.
     * @param sessionFactory sessionfactory to use. 
     */
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    /** 
	* Returns a DAO instance of the given type.
	* @param <T> Type
	* @param persistentObject to get
	* @return GenericDAO<T, ?> object
     */
    @SuppressWarnings("unchecked")
    private <T> GenericDAO<T, ?> getDAO(final T persistentObject) {
		T persistent = persistentObject;

		synchronized (daoMapLock) {
    		if (daoMap == null) {
    			daoMap = new ConcurrentHashMap<Class<?>, GenericDAO<?, ?>>(); 
	 	   		daoMap.put(Classroom.class, HibernateYschoolDaoFactory.getClassroomDao());
	 	   		daoMap.put(ClassroomHasStaffHasRole.class, HibernateYschoolDaoFactory.getClassroomHasStaffHasRoleDao());
	 	   		daoMap.put(ClassroomStudent.class, HibernateYschoolDaoFactory.getClassroomStudentDao());
	 	   		daoMap.put(ClassroomSubject.class, HibernateYschoolDaoFactory.getClassroomSubjectDao());
	 	   		daoMap.put(ClassroomSubjectHasStaffHasRole.class, HibernateYschoolDaoFactory.getClassroomSubjectHasStaffHasRoleDao());
	 	   		daoMap.put(ClassAnalyzerClassifier.class, HibernateYschoolDaoFactory.getClassAnalyzerClassifierDao());
	 	   		daoMap.put(Exam.class, HibernateYschoolDaoFactory.getExamDao());
	 	   		daoMap.put(ExamSync.class, HibernateYschoolDaoFactory.getExamSyncDao());
	 	   		daoMap.put(ExamType.class, HibernateYschoolDaoFactory.getExamTypeDao());
	 	   		daoMap.put(Marks.class, HibernateYschoolDaoFactory.getMarksDao());
	 	   		daoMap.put(Results.class, HibernateYschoolDaoFactory.getResultsDao());
	 	   		daoMap.put(Role.class, HibernateYschoolDaoFactory.getRoleDao());
	 	   		daoMap.put(School.class, HibernateYschoolDaoFactory.getSchoolDao());
	 	   		daoMap.put(SchoolHasStaffHasRole.class, HibernateYschoolDaoFactory.getSchoolHasStaffHasRoleDao());
	 	   		daoMap.put(Section.class, HibernateYschoolDaoFactory.getSectionDao());
	 	   		daoMap.put(SectionHasStaffHasRole.class, HibernateYschoolDaoFactory.getSectionHasStaffHasRoleDao());
	 	   		daoMap.put(Staff.class, HibernateYschoolDaoFactory.getStaffDao());
	 	   		daoMap.put(StaffHasRole.class, HibernateYschoolDaoFactory.getStaffHasRoleDao());
	 	   		daoMap.put(Student.class, HibernateYschoolDaoFactory.getStudentDao());
	 	   		daoMap.put(StudentClassroomSubject.class, HibernateYschoolDaoFactory.getStudentClassroomSubjectDao());
	 	   		daoMap.put(StudentGeneralexamProfile.class, HibernateYschoolDaoFactory.getStudentGeneralexamProfileDao());
	 	   		daoMap.put(StudentSync.class, HibernateYschoolDaoFactory.getStudentSyncDao());
	 	   		daoMap.put(Subject.class, HibernateYschoolDaoFactory.getSubjectDao());
	 	   		daoMap.put(User.class, HibernateYschoolDaoFactory.getUserDao());
	 	   		daoMap.put(UserRole.class, HibernateYschoolDaoFactory.getUserRoleDao());
    		}
		 }
		if (persistentObject instanceof HibernateProxy) {
			persistent = (T) ((HibernateProxy) persistentObject).getHibernateLazyInitializer().getImplementation();
		} 
		
		GenericDAO<T, ?> result = (GenericDAO<T, ?>) daoMap.get(persistent.getClass());
		if (result == null) {
			throw new IllegalAccessError("The given object is of an incorrect type. ");
		}
		return result;
    }

    /**
     * Deletes the given object from disk.
     * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to delete
     */
    public <T> void delete(T persistentObject) {
    	    	getDAO(persistentObject).delete(persistentObject);
    }
    /**
     * Refresh the object $class.className from disk.
     * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to reload
     */
    public <T> void refresh(T persistentObject) {
	    	getDAO(persistentObject).refresh(persistentObject);
    }

    /**
     * Saves the given object to disk.
     * @param persistentObject Object to save
	 * @param <T> A DataLayerObject-derived type
     * @return Identifier of saved object 
     */
    public <T> Serializable save(T persistentObject) {
        return getDAO(persistentObject).save(persistentObject);
    }
    /**
     * Saves or updates the given $class.className object to disk.
	 * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to save 
     */
    public <T> void saveOrUpdate(T persistentObject) {
        getDAO(persistentObject).saveOrUpdate(persistentObject);
    }
    /**
     * Updates the given object to disk.
	 * @param <T> A DataLayerObject-derived type
     * @param persistentObject Object to update 
     */
    public <T> void update(T persistentObject) {
        getDAO(persistentObject).update(persistentObject);
    }


    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Classroom obj) directly
     * @param id Identifier to delete
     */
    public void deleteClassroom(final Integer id)  {
        HibernateYschoolDaoFactory.getClassroomDao().delete(loadClassroom(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Classroom object
     */
    public Classroom loadClassroom(final Integer id) {
        return HibernateYschoolDaoFactory.getClassroomDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Classroom getClassroom(final Integer id) {
        return HibernateYschoolDaoFactory.getClassroomDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ClassroomHasStaffHasRole obj) directly
     * @param id Identifier to delete
     */
    public void deleteClassroomHasStaffHasRole(final ClassroomHasStaffHasRolePK id)  {
        HibernateYschoolDaoFactory.getClassroomHasStaffHasRoleDao().delete(loadClassroomHasStaffHasRole(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ClassroomHasStaffHasRole object
     */
    public ClassroomHasStaffHasRole loadClassroomHasStaffHasRole(final ClassroomHasStaffHasRolePK id) {
        return HibernateYschoolDaoFactory.getClassroomHasStaffHasRoleDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public ClassroomHasStaffHasRole getClassroomHasStaffHasRole(final ClassroomHasStaffHasRolePK id) {
        return HibernateYschoolDaoFactory.getClassroomHasStaffHasRoleDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ClassroomStudent obj) directly
     * @param id Identifier to delete
     */
    public void deleteClassroomStudent(final Integer id)  {
        HibernateYschoolDaoFactory.getClassroomStudentDao().delete(loadClassroomStudent(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ClassroomStudent object
     */
    public ClassroomStudent loadClassroomStudent(final Integer id) {
        return HibernateYschoolDaoFactory.getClassroomStudentDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public ClassroomStudent getClassroomStudent(final Integer id) {
        return HibernateYschoolDaoFactory.getClassroomStudentDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ClassroomSubject obj) directly
     * @param id Identifier to delete
     */
    public void deleteClassroomSubject(final Integer id)  {
        HibernateYschoolDaoFactory.getClassroomSubjectDao().delete(loadClassroomSubject(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ClassroomSubject object
     */
    public ClassroomSubject loadClassroomSubject(final Integer id) {
        return HibernateYschoolDaoFactory.getClassroomSubjectDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public ClassroomSubject getClassroomSubject(final Integer id) {
        return HibernateYschoolDaoFactory.getClassroomSubjectDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ClassroomSubjectHasStaffHasRole obj) directly
     * @param id Identifier to delete
     */
    public void deleteClassroomSubjectHasStaffHasRole(final ClassroomSubjectHasStaffHasRolePK id)  {
        HibernateYschoolDaoFactory.getClassroomSubjectHasStaffHasRoleDao().delete(loadClassroomSubjectHasStaffHasRole(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ClassroomSubjectHasStaffHasRole object
     */
    public ClassroomSubjectHasStaffHasRole loadClassroomSubjectHasStaffHasRole(final ClassroomSubjectHasStaffHasRolePK id) {
        return HibernateYschoolDaoFactory.getClassroomSubjectHasStaffHasRoleDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public ClassroomSubjectHasStaffHasRole getClassroomSubjectHasStaffHasRole(final ClassroomSubjectHasStaffHasRolePK id) {
        return HibernateYschoolDaoFactory.getClassroomSubjectHasStaffHasRoleDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ClassAnalyzerClassifier obj) directly
     * @param id Identifier to delete
     */
    public void deleteClassAnalyzerClassifier(final Integer id)  {
        HibernateYschoolDaoFactory.getClassAnalyzerClassifierDao().delete(loadClassAnalyzerClassifier(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ClassAnalyzerClassifier object
     */
    public ClassAnalyzerClassifier loadClassAnalyzerClassifier(final Integer id) {
        return HibernateYschoolDaoFactory.getClassAnalyzerClassifierDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public ClassAnalyzerClassifier getClassAnalyzerClassifier(final Integer id) {
        return HibernateYschoolDaoFactory.getClassAnalyzerClassifierDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Exam obj) directly
     * @param id Identifier to delete
     */
    public void deleteExam(final Integer id)  {
        HibernateYschoolDaoFactory.getExamDao().delete(loadExam(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Exam object
     */
    public Exam loadExam(final Integer id) {
        return HibernateYschoolDaoFactory.getExamDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Exam getExam(final Integer id) {
        return HibernateYschoolDaoFactory.getExamDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ExamSync obj) directly
     * @param id Identifier to delete
     */
    public void deleteExamSync(final ExamSyncPK id)  {
        HibernateYschoolDaoFactory.getExamSyncDao().delete(loadExamSync(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ExamSync object
     */
    public ExamSync loadExamSync(final ExamSyncPK id) {
        return HibernateYschoolDaoFactory.getExamSyncDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public ExamSync getExamSync(final ExamSyncPK id) {
        return HibernateYschoolDaoFactory.getExamSyncDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (ExamType obj) directly
     * @param id Identifier to delete
     */
    public void deleteExamType(final Integer id)  {
        HibernateYschoolDaoFactory.getExamTypeDao().delete(loadExamType(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a ExamType object
     */
    public ExamType loadExamType(final Integer id) {
        return HibernateYschoolDaoFactory.getExamTypeDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public ExamType getExamType(final Integer id) {
        return HibernateYschoolDaoFactory.getExamTypeDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Marks obj) directly
     * @param id Identifier to delete
     */
    public void deleteMarks(final Integer id)  {
        HibernateYschoolDaoFactory.getMarksDao().delete(loadMarks(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Marks object
     */
    public Marks loadMarks(final Integer id) {
        return HibernateYschoolDaoFactory.getMarksDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Marks getMarks(final Integer id) {
        return HibernateYschoolDaoFactory.getMarksDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Results obj) directly
     * @param id Identifier to delete
     */
    public void deleteResults(final Integer id)  {
        HibernateYschoolDaoFactory.getResultsDao().delete(loadResults(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Results object
     */
    public Results loadResults(final Integer id) {
        return HibernateYschoolDaoFactory.getResultsDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Results getResults(final Integer id) {
        return HibernateYschoolDaoFactory.getResultsDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Role obj) directly
     * @param id Identifier to delete
     */
    public void deleteRole(final Integer id)  {
        HibernateYschoolDaoFactory.getRoleDao().delete(loadRole(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Role object
     */
    public Role loadRole(final Integer id) {
        return HibernateYschoolDaoFactory.getRoleDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Role getRole(final Integer id) {
        return HibernateYschoolDaoFactory.getRoleDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (School obj) directly
     * @param id Identifier to delete
     */
    public void deleteSchool(final Integer id)  {
        HibernateYschoolDaoFactory.getSchoolDao().delete(loadSchool(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a School object
     */
    public School loadSchool(final Integer id) {
        return HibernateYschoolDaoFactory.getSchoolDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public School getSchool(final Integer id) {
        return HibernateYschoolDaoFactory.getSchoolDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (SchoolHasStaffHasRole obj) directly
     * @param id Identifier to delete
     */
    public void deleteSchoolHasStaffHasRole(final SchoolHasStaffHasRolePK id)  {
        HibernateYschoolDaoFactory.getSchoolHasStaffHasRoleDao().delete(loadSchoolHasStaffHasRole(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a SchoolHasStaffHasRole object
     */
    public SchoolHasStaffHasRole loadSchoolHasStaffHasRole(final SchoolHasStaffHasRolePK id) {
        return HibernateYschoolDaoFactory.getSchoolHasStaffHasRoleDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public SchoolHasStaffHasRole getSchoolHasStaffHasRole(final SchoolHasStaffHasRolePK id) {
        return HibernateYschoolDaoFactory.getSchoolHasStaffHasRoleDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Section obj) directly
     * @param id Identifier to delete
     */
    public void deleteSection(final Integer id)  {
        HibernateYschoolDaoFactory.getSectionDao().delete(loadSection(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Section object
     */
    public Section loadSection(final Integer id) {
        return HibernateYschoolDaoFactory.getSectionDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Section getSection(final Integer id) {
        return HibernateYschoolDaoFactory.getSectionDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (SectionHasStaffHasRole obj) directly
     * @param id Identifier to delete
     */
    public void deleteSectionHasStaffHasRole(final SectionHasStaffHasRolePK id)  {
        HibernateYschoolDaoFactory.getSectionHasStaffHasRoleDao().delete(loadSectionHasStaffHasRole(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a SectionHasStaffHasRole object
     */
    public SectionHasStaffHasRole loadSectionHasStaffHasRole(final SectionHasStaffHasRolePK id) {
        return HibernateYschoolDaoFactory.getSectionHasStaffHasRoleDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public SectionHasStaffHasRole getSectionHasStaffHasRole(final SectionHasStaffHasRolePK id) {
        return HibernateYschoolDaoFactory.getSectionHasStaffHasRoleDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Staff obj) directly
     * @param id Identifier to delete
     */
    public void deleteStaff(final Integer id)  {
        HibernateYschoolDaoFactory.getStaffDao().delete(loadStaff(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Staff object
     */
    public Staff loadStaff(final Integer id) {
        return HibernateYschoolDaoFactory.getStaffDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Staff getStaff(final Integer id) {
        return HibernateYschoolDaoFactory.getStaffDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (StaffHasRole obj) directly
     * @param id Identifier to delete
     */
    public void deleteStaffHasRole(final Integer id)  {
        HibernateYschoolDaoFactory.getStaffHasRoleDao().delete(loadStaffHasRole(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a StaffHasRole object
     */
    public StaffHasRole loadStaffHasRole(final Integer id) {
        return HibernateYschoolDaoFactory.getStaffHasRoleDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public StaffHasRole getStaffHasRole(final Integer id) {
        return HibernateYschoolDaoFactory.getStaffHasRoleDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Student obj) directly
     * @param id Identifier to delete
     */
    public void deleteStudent(final Integer id)  {
        HibernateYschoolDaoFactory.getStudentDao().delete(loadStudent(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Student object
     */
    public Student loadStudent(final Integer id) {
        return HibernateYschoolDaoFactory.getStudentDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Student getStudent(final Integer id) {
        return HibernateYschoolDaoFactory.getStudentDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (StudentClassroomSubject obj) directly
     * @param id Identifier to delete
     */
    public void deleteStudentClassroomSubject(final Integer id)  {
        HibernateYschoolDaoFactory.getStudentClassroomSubjectDao().delete(loadStudentClassroomSubject(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a StudentClassroomSubject object
     */
    public StudentClassroomSubject loadStudentClassroomSubject(final Integer id) {
        return HibernateYschoolDaoFactory.getStudentClassroomSubjectDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public StudentClassroomSubject getStudentClassroomSubject(final Integer id) {
        return HibernateYschoolDaoFactory.getStudentClassroomSubjectDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (StudentGeneralexamProfile obj) directly
     * @param id Identifier to delete
     */
    public void deleteStudentGeneralexamProfile(final Integer id)  {
        HibernateYschoolDaoFactory.getStudentGeneralexamProfileDao().delete(loadStudentGeneralexamProfile(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a StudentGeneralexamProfile object
     */
    public StudentGeneralexamProfile loadStudentGeneralexamProfile(final Integer id) {
        return HibernateYschoolDaoFactory.getStudentGeneralexamProfileDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public StudentGeneralexamProfile getStudentGeneralexamProfile(final Integer id) {
        return HibernateYschoolDaoFactory.getStudentGeneralexamProfileDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (StudentSync obj) directly
     * @param id Identifier to delete
     */
    public void deleteStudentSync(final StudentSyncPK id)  {
        HibernateYschoolDaoFactory.getStudentSyncDao().delete(loadStudentSync(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a StudentSync object
     */
    public StudentSync loadStudentSync(final StudentSyncPK id) {
        return HibernateYschoolDaoFactory.getStudentSyncDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public StudentSync getStudentSync(final StudentSyncPK id) {
        return HibernateYschoolDaoFactory.getStudentSyncDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (Subject obj) directly
     * @param id Identifier to delete
     */
    public void deleteSubject(final Integer id)  {
        HibernateYschoolDaoFactory.getSubjectDao().delete(loadSubject(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a Subject object
     */
    public Subject loadSubject(final Integer id) {
        return HibernateYschoolDaoFactory.getSubjectDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public Subject getSubject(final Integer id) {
        return HibernateYschoolDaoFactory.getSubjectDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (User obj) directly
     * @param id Identifier to delete
     */
    public void deleteUser(final Integer id)  {
        HibernateYschoolDaoFactory.getUserDao().delete(loadUser(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a User object
     */
    public User loadUser(final Integer id) {
        return HibernateYschoolDaoFactory.getUserDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public User getUser(final Integer id) {
        return HibernateYschoolDaoFactory.getUserDao().get(id);
    }  

    /** Deletes an object of a given Id. 
     * Will load the object internally so consider using delete (UserRole obj) directly
     * @param id Identifier to delete
     */
    public void deleteUserRole(final Integer id)  {
        HibernateYschoolDaoFactory.getUserRoleDao().delete(loadUserRole(id));
    }
	
    /**
     * Loads the given Object.
     * @param id Identifier to load
     * @return a UserRole object
     */
    public UserRole loadUserRole(final Integer id) {
        return HibernateYschoolDaoFactory.getUserRoleDao().load(id);
    }
    /**
     * Loads the given Object.
     * @param id Id to load
     * @return An object of type T
     */
     public UserRole getUserRole(final Integer id) {
        return HibernateYschoolDaoFactory.getUserRoleDao().get(id);
    }  
    /** Returns a singleton instance of this class.
     * @return an singleton instance
     */
    public static synchronized DataLayerYschool getInstance() {
        
        if (instance == null) {
        	if (context == null) {
        		throw new IllegalStateException("Context is null. Make sure Spring is initialized.");
        	}
     		instance = (DataLayerYschool) context.getBean("dataLayerYschoolImpl");
        }
        
        return instance; 
    }
    /** Returns a query handle.
     * @param query Query to use
     * @return A query instance
     */
     public Query createQuery(final String query) {
        return this.sessionFactory.getCurrentSession().createQuery(query);
    }
    /** Returns a criteria handle.
     * @param criteria Criteria to use
     * @return A criteria instance
     */
     public Criteria createCriteria(final String criteria) {
        return this.sessionFactory.getCurrentSession().createCriteria(criteria);
    }
    /** Returns a Query handle based on your package-level named query.
     * @param query Query to use
     * @return A query instance
     */
     public Query getNamedQuery(final String query) {
        return this.sessionFactory.getCurrentSession().getNamedQuery(query);
    }
    /** Create a new Criteria instance, for the given entity class, or a superclass of an entity class.
	* @param persistentObject a class, which is persistent, or has persistent subclasses 
	* @return Criteria instance
	*/
	@SuppressWarnings("rawtypes")
	public Criteria createCriteria(Class persistentObject) {
        return this.sessionFactory.getCurrentSession().createCriteria(persistentObject);
    }
    /** Flushes the currently open session.
	*/
	public void flushSession() {
        this.sessionFactory.getCurrentSession().flush();
    }
    /** Clears the currently open session.
	*/
	public void clearSession() {
        this.sessionFactory.getCurrentSession().clear();
    }
    /** Flushes and clears the currently open session.
	*/
	public void flushAndClearSession() {
		flushSession();
		clearSession();
    }
	/** Call currentSession.replicate.
	 * @param obj to replicate
	 * @param replicationMode mode
	 */ 
	public void replicate(Object obj, ReplicationMode replicationMode) {
		this.sessionFactory.getCurrentSession().replicate(obj, replicationMode);
	}
	/** Hibernate Merge. 
	 * @param obj to merge
	 * @return obj merged.
	 */
	public Object merge(Object obj) {
		return this.sessionFactory.getCurrentSession().merge(obj);
	}
	/** Returns the current session.
	 * @return the currently active session
	 */
	public Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	/** Returns a query handle.
     * @param query Query to use
     * @return A query instance
     */
     public SQLQuery createSQLQuery(final String query) {
        return this.sessionFactory.getCurrentSession().createSQLQuery(query);
    }
    /** Remove this instance from the session cache. 
	 * Changes to the instance will not be synchronized with the database
	 * @param obj object to evict
	 */
	public void evict(Object obj) {
        this.sessionFactory.getCurrentSession().evict(obj);
    }
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
	public Object get(Class<?> clazz, Serializable id) throws HibernateException {
        return this.sessionFactory.getCurrentSession().get(clazz, id);
    }	


    /**
     * Return the persistent instance of the given entity class with the given identifier, assuming that the instance exists.
     *You should not use this method to determine if an instance exists (use get() instead). Use this only to retrieve an instance that you assume exists, where non-existence would be an actual error.
     *
     * @param clazz a persistent class
     * @param id a valid identifier of an existing persistent instance of the class
     * @return the persistent instance or proxy
     * @throws HibernateException
     */
	public Object load(Class<?> clazz, Serializable id) throws HibernateException {
        return this.sessionFactory.getCurrentSession().load(clazz, id);  
    }
	/**
	 * Reattaches the given entity to the current session using LockMode.NONE
	 *
	 * @param entity to reattach
	 */
	public void reattachEntityWithNoLock(IPojoGenEntity entity) {
		if (entity != null) {
            		this.sessionFactory.getCurrentSession().buildLockRequest(LockOptions.NONE).lock(entity);
    		}
	}
	/**
	 * Reattaches the given entities to the current session.
	 *
	 * @param entities to attach
	 */
	public void reattachEntitiesWithNoLock(Collection<? extends IPojoGenEntity> entities) {
   		if (entities != null) {
		       for (IPojoGenEntity entity : entities) {
            		this.sessionFactory.getCurrentSession().buildLockRequest(LockOptions.NONE).lock(entity);
        		 }
    		}
	}}

