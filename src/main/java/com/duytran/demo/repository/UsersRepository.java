package com.duytran.demo.repository;

import com.duytran.demo.model.AccountCredentials;
import org.springframework.data.repository.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface UsersRepository extends Repository<AccountCredentials, Integer> {
    AccountCredentials getAccountCredentialsByUsername(String Username);
    List<AccountCredentials> findAll();


}