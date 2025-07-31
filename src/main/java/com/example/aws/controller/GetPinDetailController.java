package com.example.aws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.aws.entity.PinDetail;
import com.example.aws.service.PinDetailService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class GetPinDetailController {

	@Autowired
	private PinDetailService pinDetailService;

	@GetMapping("/pinDetail")
	public String getPinDetail(@RequestParam String sbNo, Model model) {
		PinDetail detail = pinDetailService.findBySbNo(sbNo);
		if (detail == null) {
			model.addAttribute("error", "ピンが存在していない！");
	        return "error"; 
		}
		model.addAttribute("detail", detail);
		return "pinDetail";
	}
	
}
