package com.tscp.toolkit.web.controller;

import java.util.ArrayList;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tscp.toolkit.domain.balance.BalanceAudit;
import com.tscp.toolkit.manager.BalanceAuditManager;

@Controller
@RequestMapping("/toolkit/audit")
public class BalanceAuditController {
	@Autowired
	private BalanceAuditManager balanceAuditManager;
	
	@RequestMapping(method = RequestMethod.GET)
	public String showBalanceAuditForm(){
		return "/toolkit/balanceAudit";
	}
	
	@RequestMapping (value = "balanceAudit/{appName}", method = RequestMethod.GET)
	public ModelAndView processBalanceAudit(@PathVariable String appName) {
		ModelAndView modelAndView = new ModelAndView("balanceAudit/auditResult");
		balanceAuditManager.setAppName(appName);
		Set<BalanceAudit> balanceAuditSet = balanceAuditManager.getAllBalanceAuditRecords();
		modelAndView.addObject("balanceAuditList", new ArrayList(balanceAuditSet));
		return modelAndView;
	}

}
