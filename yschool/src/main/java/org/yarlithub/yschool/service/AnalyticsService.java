package org.yarlithub.yschool.service;

import net.sf.jasperreports.engine.JRException;
import org.apache.myfaces.custom.fileupload.UploadedFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yarlithub.yschool.analytics.reporting.JasperReport;
import org.yarlithub.yschool.repository.model.obj.yschool.Student;
import org.yarlithub.yschool.setup.schoolSetUp.SchoolInitializer;
import org.yarlithub.yschool.setup.userSetUP.UserIntializer;
import org.yarlithub.yschool.setup.ySchoolSetUp.DataInitializer;
import org.yarlithub.yschool.student.core.GetStudent;

import javax.servlet.ServletOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * TODO description
 */
@Service(value = "analyticsService")
public class AnalyticsService {
    private static final Logger logger = LoggerFactory.getLogger(AnalyticsService.class);



    /**
     * TODO description
     *
     * @param userName
     * @param password
     * @param schoolName
     * @param schoolAddress
     * @param schoolZone
     * @param schoolDistrict
     * @param schoolProvience
     * @param initFile
     * @return
     */
    @Transactional
    public boolean ySchoolSetUP(String userName, String usereMail, String password, String schoolName, String schoolAddress,
                                String schoolZone, String schoolDistrict, String schoolProvience, UploadedFile initFile) throws IOException {
        logger.debug("Starting to create a setup {}, {}", userName, password);

        /**
         *   TODO description
         */
        DataInitializer spreadSheetToDB = new DataInitializer();
        boolean isDataInit = spreadSheetToDB.initializeySchoolData(initFile);


        /**
         *  TODO description
         */
        SchoolInitializer schoolInitializer = new SchoolInitializer();
        boolean isSchoolInit = schoolInitializer.initializeSchool(schoolName, schoolAddress, schoolZone, schoolDistrict, schoolProvience);

        /**
         *  TODO description
         */
        UserIntializer userInitializer = new UserIntializer();
        //TODO password encryption in service layer?
        boolean isUserInit = userInitializer.initializeySchoolUser(userName, usereMail, password, 1);

        logger.debug("Successfuly created a setup {}", userName);
        //TODO check success/failure in each steps.
        return true;
    }

    /**
     * TODO Description
     *
     * @param userName
     * @param password
     */
    @Transactional
    public void logIn(String userName, String password) {
        //TODO authentication

    }

    @Transactional
    public Student getStudent() {
             GetStudent student=new GetStudent();
      return  student.getStudentByID(1);

    }

    @Transactional
    public void  printReport(ServletOutputStream servletOutputStream) throws IOException, JRException {       // ServletOutputStream servletOutputStream
        JasperReport jasperReport= new JasperReport();
        jasperReport.printJasperReport(servletOutputStream );                        //  servletOutputStream
    }
}
