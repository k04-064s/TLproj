package billGuru.dao;

import java.util.Date;
import java.util.List;

import billGuru.core.exceptions.CustomException;
import billGuru.domain.Admins;
import billGuru.domain.Announcements;


public interface AnnouncementsDao {

    Announcements getAnnouncemntById(long id) throws CustomException;
    
    List<Announcements> getAllAnnouncements();
    
    List<Announcements> getAnnouncementByDate(Date date);
    
    List<Announcements> getAnnouncementsByTitle(String title);
    
    List<Announcements> getAnnouncementsByAdminId(Admins admin);
    
    void saveOrder(Announcements announcement);
    
    void updateOrder(Announcements announcement);
    
    void deleteOrder(Announcements announcements);
    
}