package com.myweb.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myweb.dao.UserDao;
import com.myweb.model.User;

@Controller
public class UserControl {

	private ApplicationContext ac = new ClassPathXmlApplicationContext
			("applicationContext.xml");
	private UserDao userDao = (UserDao) ac.getBean("userDao");
	
	@RequestMapping("/add")
	public String add(User user){
		System.out.println("增加");
		userDao.save(user);
		return "redirect:list.do";
	}
	
	@RequestMapping("/addpage")
	public String addpage(){
		System.out.println("asdf");
		
		
		
		
		
		return "add";
	}
	
	/**
	 * 
	 * @return
	 * 2017��4��29��
	 */
	@RequestMapping("/list")
	public ModelAndView list(){
		ModelAndView mav = new ModelAndView();
		ArrayList users = userDao.query();
		mav.addObject("users", users);
		mav.setViewName("list");
		return mav;
	}
	
	@RequestMapping("/delete")
	public String delete(User user){
		
		userDao.delete(user);
		return "redirect:list.do";
	}
	
	@RequestMapping("/update")
	public String update(User user){
		
		userDao.update(user);
		return "redirect:list.do";
	}
	
	@RequestMapping("/updatepage")
	public String update(User user,Model model){
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("user", user);
//		mav.setViewName()
		Map<String,Object> user1 = userDao.queryOne(user);
		
		model.addAttribute("user", user1);
		return "update";
	}
	
	
	
	@RequestMapping("/test")
	public void test(HttpServletResponse response){
		try {
			response.getWriter().write("k");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
