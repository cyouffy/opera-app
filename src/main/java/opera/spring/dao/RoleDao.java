package opera.spring.dao;

import java.util.Optional;
import opera.spring.model.Role;

public interface RoleDao {
    void add(Role role);

    Optional<Role> getRoleByName(Role.RoleName roleName);
}
