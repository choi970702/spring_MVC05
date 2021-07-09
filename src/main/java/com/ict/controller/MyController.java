package com.ict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ict.service.MyProcess;
import com.ict.vo.VO;


@Controller
public class MyController 
{
	@Autowired
	private MyProcess myProcess;
	
	public void setMyProcess(MyProcess myProcess) 
	{
		this.myProcess = myProcess;
	}
	
	@RequestMapping("res.do")
	public ModelAndView resCommand(VO vo)
	{
		ModelAndView mv = new ModelAndView("result");
		if (vo.getOper().equalsIgnoreCase("+")) 
		{
			vo.setRes(myProcess.getSum(vo.getA(), vo.getB()));
		}else if(vo.getOper().equalsIgnoreCase("-"))
		{
			vo.setRes(myProcess.getSub(vo.getA(), vo.getB()));
		}else if(vo.getOper().equalsIgnoreCase("*"))
		{
			vo.setRes(myProcess.getMul(vo.getA(), vo.getB()));
		}else if(vo.getOper().equalsIgnoreCase("/"))
		{
			vo.setRes(myProcess.getDiv(vo.getA(), vo.getB()));
		}
		mv.addObject("vo", vo);
		return mv;
		
	}
}
