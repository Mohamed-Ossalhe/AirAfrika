package com.youcode.airafrika.Services;

import com.youcode.airafrika.Dao.AdminDao;
import com.youcode.airafrika.Entities.Admin;
import com.youcode.airafrika.Helpers.PasswordHasher;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminService {
    private AdminDao adminDao;

    public AdminService() {
        adminDao = new AdminDao();
    }

    public Admin login(Admin admin) {
        try {
            if (admin != null) {
                Optional<Admin> admin1 = adminDao.findByEmail(admin);
                if (admin1.isPresent()) {
                    if (PasswordHasher.PasswordVerify(admin.getPassword(), admin1.get().getPassword())) {
                        return admin1.get();
                    }
                }
            }else {
                throw new Exception("Admin Cannot be Null.");
            }
        }catch (Exception exception) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "A Admin Service Error Occurred", exception);
        }
        return null;
    }
}
