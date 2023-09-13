package top.simba1949.service;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import top.simba1949.domain.Admin;
import top.simba1949.mapper.AdminMapper;

import java.util.List;

/**
 * @author anthony
 * @version 2023/9/13 21:53
 */
@Service
public class AdminService {

	@Resource
	private AdminMapper adminMapper;

	public List<Admin> all(){
		return adminMapper.selectAll();
	}
}
