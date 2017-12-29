package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.common.pojo.EeayUIDataGrid;
import cn.e3mall.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	private ItemService ItemService;
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EeayUIDataGrid list(Integer page,Integer rows ){
		
		EeayUIDataGrid dataGrid = ItemService.ItemList(page, rows);
		return dataGrid;
	}
}
