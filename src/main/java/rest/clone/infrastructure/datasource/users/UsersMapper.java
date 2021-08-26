package rest.clone.infrastructure.datasource.users;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import rest.clone.domain.model.user.User;
import rest.clone.presentation.view.model.users.UserId;

@Mapper
public interface UsersMapper {
    User findUser(@Param("userId") UserId userId);
}
