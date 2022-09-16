package com.simple.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.simple.basic.category.CategoryService;
import com.simple.basic.command.CategoryDTO;
import com.simple.basic.community.CommunityService;

@Controller
public class CommunityController {

	@Autowired
	CommunityService communityService;
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/commuInsert")
	public String commuInsert(Model model) {
		List<CategoryDTO> list3 = categoryService.listAll();
		
		model.addAttribute("list3", list3);
		return "communityRegist";
	}
	
	@GetMapping("/communityList")
	public String commuList(Model model) {
		List<CategoryDTO> list3 = categoryService.listAll();
		
		model.addAttribute("list3", list3);
		return "communityList";
	}
	
	@GetMapping("/commuDetail")
	public String commuDetail(Model model) {
		List<CategoryDTO> list3 = categoryService.listAll();
		
		model.addAttribute("list3", list3);
		return "communityDetail";
	}
	
	@PostMapping("/commuDelete")
	public String commuDelete() {
		
		return "redirect:/commuList";
	}
	
	@PostMapping("/commuUpdate")
	public String commuUpdate() {
		
		return "redirect:/commuList";
	}
	
	@PostMapping("/commuForm")
	public String commuForm() {
		
		return "redirect:/commuList";
	}
	
	@GetMapping("/commuMypost")
	public String commuMypost(Model model) {
		List<CategoryDTO> list3 = categoryService.listAll();
		
		model.addAttribute("list3", list3);
		return "communityMypost";
	}
}
