package billGuru.dao;

import java.util.List;

import billGuru.core.exceptions.CustomException;
import billGuru.domain.Admins;
import billGuru.domain.Offers;
import billGuru.domain.PremiumUsers;


public interface OffersDao {

    Offers getOfferById(long id) throws CustomException;
    
    List<Offers> getAllOffers();
    
    List<Offers> getOfferByAdminId(Admins adminId);
    
    List<Offers> getOffersByDiscount(Double discount);
    
    List<Offers> getOffersByPremUserId(PremiumUsers premUserId);
    
    void saveOrder(Offers offer);
    
    void updateOrder(Offers offer);
    
    void deleteOrder(Offers offer);
    
}