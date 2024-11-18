package com.project.logistic_management.service.user;

import com.project.logistic_management.entity.User;
import com.project.logistic_management.repository.user.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);
        if (user == null || user.getStatus() != 1) { // Giả sử status=1 là active
            throw new UsernameNotFoundException("Không tìm thấy người dùng với tên đăng nhập: " + username);
        }

        // Trả về một đối tượng UserDetails đơn giản mà không có quyền hạn
        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .build();
    }
}