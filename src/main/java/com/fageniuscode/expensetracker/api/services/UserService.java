package com.fageniuscode.expensetracker.api.services;

import com.fageniuscode.expensetracker.api.domain.User;
import com.fageniuscode.expensetracker.api.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;

}
