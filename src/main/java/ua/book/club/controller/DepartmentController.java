package ua.book.club.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/department")
public class DepartmentController {

	@RequestMapping("/edit")
	public ModelAndView edit(HttpRequest request) {
		ModelAndView model = new ModelAndView();

		model.setViewName("departmentEdit");
		return model;
	}

}
