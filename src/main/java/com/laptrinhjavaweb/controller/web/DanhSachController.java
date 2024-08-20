package com.laptrinhjavaweb.controller.web;

import com.laptrinhjavaweb.dto.*;
import com.laptrinhjavaweb.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller(value = "DanhSachControllerOfWeb")
public class DanhSachController {

	@Autowired
	private ThiSinhService thiSinhService;

	@Autowired
	private DuThiService duThiService;

	@Autowired
	private PhongThiService phongThiService;

	@Autowired
	private BaiThiService baiThiService;

	@Autowired
	private KhoaThiService khoaThiService;

	@Autowired
	private TrinhDoService trinhDoService;

	@RequestMapping(value = "/danh-sach", method = RequestMethod.GET)
	public ModelAndView danhSachPage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("web/danhSach");
		List<PhongThiDTO> phongthiList = phongThiService.findAll();
		List<KhoaThiDTO> khoathiList = khoaThiService.findAll();
		request.setAttribute("phongthiList", phongthiList);
		request.setAttribute("khoathiList", khoathiList);
		return mav;
	}

	@RequestMapping(value = "/danh-sach-ket-qua", method = RequestMethod.POST)
	public ModelAndView ketQuaDanhSachPage(HttpServletRequest request, @RequestParam(name = "maphongthi") String maphongthi, @RequestParam(name = "makhoathi") String makhoathi) {
		ModelAndView mav = new ModelAndView("web/ketQuaDanhSach");

		boolean ketqua = true;
		KhoaThiDTO khoaThiDTO = khoaThiService.findOneByMakhoathi(makhoathi);
		boolean checkNull = phongThiService.checkNullPhongThiKhoaThi(maphongthi, khoaThiDTO);

		if(checkNull){
			ketqua = false;
		} else {
			PhongThiDTO phongThiDTO = phongThiService.findOneByMaphongthi(maphongthi);
			List<DuThiDTO> duThiDTOList = duThiService.findAllByPhongthi(phongThiDTO);
			List<ThiSinhDTO> thiSinhDTOList = new ArrayList<>();
			for (DuThiDTO item: duThiDTOList){
				ThiSinhDTO thiSinhDTO = thiSinhService.findOneByCmnd(item.getCmnd());
				thiSinhDTO.setDuthitheosbd(item);
				thiSinhDTOList.add(thiSinhDTO);
			}

			request.setAttribute("phongthi", phongThiDTO);
			request.setAttribute("thisinhList", thiSinhDTOList);

		}

		request.setAttribute("ketqua", ketqua);
		return mav;
	}
	


}
