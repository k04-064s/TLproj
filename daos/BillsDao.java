package billGuru.dao;

import java.util.Date;
import java.util.List;

import billGuru.core.exceptions.CustomException;
import billGuru.domain.Admins;
import billGuru.domain.Bills;
import billGuru.domain.Users;


public interface BillsDao {

    Bills getBillsById(long id) throws CustomException;
    
    List<Bills> getAllBills();
    
    List<Bills> getBillsByStatus(String status);
    
    List<Bills> getBillsByDueDate(Date dueDate);
    
    List<Bills> getBillsByAdminId(Admins adminId);
    
    List<Bills> getBillsByUserId(Users userId);
    
    List<Bills> getBillsByAmount(Double amount);
    
    void saveBill(Bills bill);
    
    void updateBill(Bills bill);
    
    void deleteBill(Bills bill);
    
}