package billGuru.dto;

public class PremiumUsersDto {

  
    private Integer points;
    private Long userId;
    
    public Integer getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    public Long getUserId() {
    	return userId;
    }
    
    public void setUserId(Long userId) {
    	this.userId = userId;
    }
}