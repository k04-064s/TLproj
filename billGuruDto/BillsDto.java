package billGuru.dto;

import java.util.Date;

public class BillsDto {

    private Double amount;
    private Date dueDate;
    private String status;
    private String detailedBill;
    private Long adminId;
    private Long userId;
 

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetailedBill() {
        return detailedBill;
    }

    public void setDetailedBill(String detailedBill) {
        this.detailedBill = detailedBill;
    }

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}