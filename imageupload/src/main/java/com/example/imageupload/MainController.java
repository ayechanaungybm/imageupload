package com.example.imageupload;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import antlr.StringUtils;

@Controller
public class MainController {
	@Autowired
	UserService service;
	@GetMapping("/")
	public String displayindex(ModelMap model) {
		model.addAttribute("list",service.getAllUsers());
		return "index";
	}
	@GetMapping("/setupuser")
	public ModelAndView userregister(ModelMap model) {
		//model.addAttribute("user",new User());
		return new ModelAndView("adduser","user",new User());
	}
	@PostMapping("/adduser")
	public String adduser(User user,@RequestParam("images")MultipartFile multipartfile)throws IOException {
		if(!multipartfile.isEmpty()) {
			String fileName=org.springframework.util.StringUtils.cleanPath(multipartfile.getOriginalFilename());
			user.setPhoto(fileName);
			System.out.println(user.getUsername());
			String upload="/home/ayechanaung/Maven Project/imageupload/src/main/resources/static/images/";
			FileUploadUtil.saveFile(upload, fileName, multipartfile);
			
		}else {
			if(user.getPhoto().isEmpty()) {
				user.setPhoto(null);
				//service.save(user);
			}
		}
		service.save(user);
		return "redirect:/";
	}
}
