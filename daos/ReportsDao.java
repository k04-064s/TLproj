package billGuru.dao;

import java.util.List;

import billGuru.core.exceptions.CustomException;
import billGuru.domain.Reports;
import billGuru.domain.Users;


public interface ReportsDao {

    Users getReportById(long id) throws CustomException;
    
    List<Users> getAllReports();
    
    List<Users> getReportByTitle(String title);
    
    List<Users> getReportsByStatus(String status);
    
    void saveReport(Reports report);
    
    void updateReport(Reports report);
    
    void deleteReport(Reports report);
    
}