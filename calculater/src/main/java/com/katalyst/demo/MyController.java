package com.katalyst.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@Autowired
	Calculator cal;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addCall(Integer num1, Integer num2) {
		ModelAndView model = new ModelAndView();
		model.addObject("answer", "addition is:" + cal.add(num1, num2));
		model.setViewName("hello.jsp");
		return model;

	}

}
