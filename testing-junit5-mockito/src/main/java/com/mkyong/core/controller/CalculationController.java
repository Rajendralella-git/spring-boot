package com.mkyong.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculationController {

	@ResponseBody
	@GetMapping("/add")
	public Integer add() {
		return 1 + 2;
	}

	@ResponseBody
	@GetMapping("/sub")
	public Integer sub() {
		return 3 - 2;
	}

	@ResponseBody
	@GetMapping("/mul")
	public Integer mul() {
		return 2 * 3;
	}
}
