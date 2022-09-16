package com.simple.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simple.basic.category.CategoryService;
import com.simple.basic.command.CategoryDTO;
import com.simple.basic.command.RecodeDTO;
import com.simple.basic.command.UploadDTO;
import com.simple.basic.recode.RecodeService;

@Controller
public class MainController {
	
	@Autowired
	RecodeService recodeService;
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/main")
	public String main(Model model) {
		List<RecodeDTO> list1 = recodeService.recodeList1();
		List<UploadDTO> list2 = recodeService.recodeList2();
		List<CategoryDTO> list3 = categoryService.listAll();
		
		model.addAttribute("list1", list1);
		model.addAttribute("list2", list2);
		model.addAttribute("list3", list3);
		return "index";
	}
}
