package top.simba1949.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.simba1949.domain.Admin;
import top.simba1949.service.AdminService;

import java.util.List;

/**
 * @author anthony
 * @version 2023/9/13 21:53
 */
@RestController
@RequestMapping("admin")
public class AdminController {

	@Resource
	private AdminService adminService;

	@GetMapping("all")
	public List<Admin> all(){
		return adminService.all();
	}
}
