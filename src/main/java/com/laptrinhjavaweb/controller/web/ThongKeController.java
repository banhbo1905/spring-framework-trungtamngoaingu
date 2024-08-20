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
import java.util.List;

@Controller(value = "ThongKeControllerOfWeb")
public class ThongKeController {

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

	@RequestMapping(value = "/thong-ke", method = RequestMethod.GET)
	public ModelAndView thongkePage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("web/thongKe");
		List<KhoaThiDTO> khoathiList = khoaThiService.findAll();
		request.setAttribute("khoathiList", khoathiList);
		return mav;
	}

	@RequestMapping(value = "/thong-ke-ket-qua", method = RequestMethod.POST)
	public ModelAndView ketQuaThongKePage(HttpServletRequest request, @RequestParam(name = "makhoathi") String makhoathi, @RequestParam(name = "trinhdo") String trinhdo) {
		ModelAndView mav = new ModelAndView("web/ketQuaThongKe");

		KhoaThiDTO khoaThiDTO = khoaThiService.findOneByMakhoathi(makhoathi);
		TrinhDoDTO trinhDoDTO = trinhDoService.findOneByTentrinhdo(trinhdo);

		List<PhongThiDTO> phongThiDTOList = phongThiService.findAllByKhoathiAndTrinhdo(khoaThiDTO, trinhDoDTO);
		int soluongthisinh = 0;
		for (PhongThiDTO item: phongThiDTOList){
			soluongthisinh += item.getSoluong();
		}
		int soluongphongthi = phongThiDTOList.size();
		request.setAttribute("khoaThi", khoaThiDTO);
		request.setAttribute("trinhdo", trinhdo);
		request.setAttribute("soluongthisinh", soluongthisinh);
		request.setAttribute("soluongphongthi", soluongphongthi);

		return mav;
	}
	

//	
}
