package billGuru.dao;

import java.util.List;

import billGuru.core.exceptions.CustomException;
import billGuru.domain.Admins;
import billGuru.domain.Users;
import billGuru.domain.Votes;


public interface VotesDao {

    Votes getVoteById(long id) throws CustomException;
    
    List<Votes> getAllVotes();
    
    List<Votes> getVoteByName(String name);
    
    List<Votes> getVotesByAdminId(Admins adminId);
    
    List<Votes> getVotesByUserId(Users userId);
    
    void saveVotes(Votes vote);
    
    void updateVotes(Votes vote);
    
    void deleteVotes(Votes vote);
    
}