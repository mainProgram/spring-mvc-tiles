package com.groupeisi.companyspringmvctiles.service;


import com.groupeisi.companyspringmvctiles.dao.AccountUserDao;
import com.groupeisi.companyspringmvctiles.dto.AccountUserDto;
import com.groupeisi.companyspringmvctiles.entities.AccountUserEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class AccountUserServiceTest {
    private AccountUserDao accountUserDao;

    @InjectMocks
    private AccountUserService accountUserService;

    @BeforeEach
    void init() {
        accountUserDao = mock(AccountUserDao.class);
        accountUserService.setAccountUserDao(accountUserDao);
    }

    @Test
    void loginSuccess() {
        Optional<AccountUserEntity> userEntity = Optional.ofNullable(new AccountUserEntity(1, "fz@gmail.com", "passer", true));

        when(accountUserDao.login(anyString(), anyString())).thenReturn(userEntity);

        Optional<AccountUserDto> accountUserDto =accountUserService.login("fz@gmail.com", "passer");
        Assertions.assertTrue(accountUserDto.isPresent());
    }

    @Test
    void loginFailed() {
        Optional<AccountUserDto> accountUserDto = accountUserService.login("", "passer");
        Assertions.assertTrue(accountUserDto.isEmpty());

        accountUserDto = accountUserService.login("fz@gmail.com", "");
        Assertions.assertTrue(accountUserDto.isEmpty());

        when(accountUserDao.login(anyString(), anyString()))
                .thenReturn(Optional.ofNullable(null));

        accountUserDto = accountUserService.login("fz@gmail.com", "passer");
        Assertions.assertTrue(accountUserDto.isEmpty());
    }
}
