package top.simba1949.mapper;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import top.simba1949.domain.Admin;

/**
 * @author anthony
 * @version 2023/9/13 21:45
 */
@Repository
public interface AdminMapper extends Mapper<Admin> {
}
