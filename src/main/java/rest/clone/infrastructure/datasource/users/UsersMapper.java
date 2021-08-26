package rest.clone.infrastructure.datasource.users;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import rest.clone.domain.model.user.User;
import rest.clone.domain.model.user.UserIds;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UsersMapper {
    List<User> findUsers(@Param("userIds") UserIds userIds);
}
