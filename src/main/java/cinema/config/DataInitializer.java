package cinema.config;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.UserService;
import cinema.service.mapper.RoleService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.add(adminRole);

        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleService.add(userRole);

        User user = new User();
        user.setEmail("admin@gmail.cim");
        user.setPassword("qwerty");
        user.setRoles(Set.of(adminRole));
        userService.add(user);

    }
}
