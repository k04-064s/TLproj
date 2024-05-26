package billGuru.dto;

import java.util.Date;

public class MetersDto {

    private Double consumption;
    private String type;
    private Date fromDate;
    private Date toDate;
    private Float enrgPlan;
    private Boolean notification;
    private Long premUserId;

 
    public Double getConsumption() {
        return consumption;
    }

    public void setConsumption(Double consumption) {
        this.consumption = consumption;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Float getEnrgPlan() {
        return enrgPlan;
    }

    public void setEnrgPlan(Float enrgPlan) {
        this.enrgPlan = enrgPlan;
    }

    public Boolean getNotification() {
        return notification;
    }

    public void setNotification(Boolean notification) {
        this.notification = notification;
    }

    public long getPremUserId() {
        return premUserId;
    }

    public void setPremUserId(Long premUserId) {
        this.premUserId = premUserId;
    }
}