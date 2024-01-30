package com.fageniuscode.expensetracker.api.repositories;
import com.fageniuscode.expensetracker.api.domain.User;
import com.fageniuscode.expensetracker.api.exceptions.EtAuthException;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository{

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);

}
