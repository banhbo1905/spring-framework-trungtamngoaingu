package com.laptrinhjavaweb.controller.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.dto.*;
import com.laptrinhjavaweb.entity.DuThiEntity;
import com.laptrinhjavaweb.entity.ThiSinhEntity;
import com.laptrinhjavaweb.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller(value = "traCuuControllerOfWeb")
public class TraCuuController {

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
	private DiemThiService diemThiService;
	
	@RequestMapping(value = "/tra-cuu", method = RequestMethod.GET)
	public ModelAndView traCuuPage() {
		ModelAndView mav = new ModelAndView("web/traCuu");
		return mav;
	}
	
	@RequestMapping(value = "/tra-cuu-ket-qua", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
	public ModelAndView ketQuaTraCuuPage(HttpServletRequest request, @RequestParam(name = "hoten") String hoten, @RequestParam(name = "sdt") String sdt) {
		ModelAndView mav = new ModelAndView("web/ketQuaTraCuu");
		boolean coKetQua = true;
		
		boolean checkNull = thiSinhService.checkNull(hoten, sdt);


//		for (BaiThiDTO item: baithiList) {
//			List<DiemThiDTO> diemthi = diemThiService.findOneByBaithi(item.getMabaithi());;
//			diemthiList.addAll(diemthi);
//		}

		if(checkNull) {
			coKetQua = false;
		} else {
			ThiSinhDTO thisinh = thiSinhService.findOneByHotenAndSdt(hoten, sdt);
			List<DuThiDTO> duthiList = duThiService.findAllByThisinh(thisinh);

			List<PhongThiDTO> phongthiList = new ArrayList<>();
			List<BaiThiDTO> baithiList = new ArrayList<>();
			List<DiemThiDTO> diemthiList = new ArrayList<>();


			for (DuThiDTO item: duthiList) {
				PhongThiDTO phongThiDTO = phongThiService.findOneByMaphongthi(item.getMaphongthi());
				KhoaThiDTO khoathi = khoaThiService.findOneByMakhoathi(phongThiDTO.getMakhoathi());
				phongThiDTO.setKhoathi(khoathi);
				phongthiList.add(phongThiDTO);

				BaiThiDTO baiThiDTO = baiThiService.findOneBySbd(item.getSbd());
				List<DiemThiDTO> diemthi = diemThiService.findAllByBaithi(baiThiDTO.getMabaithi());;
				baiThiDTO.setDiemthi(diemthi);
				baithiList.add(baiThiDTO);
			}

			request.setAttribute("thisinh", thisinh);
			request.setAttribute("phongthiList", phongthiList);
			request.setAttribute("baithiList", baithiList);
		}

		request.setAttribute("hoten", hoten);
		request.setAttribute("sdt", sdt);
		request.setAttribute("coKetQua", coKetQua);

		return mav;
	}



	@RequestMapping(value = "/tra-cuu-ket-qua", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
	public ModelAndView ketQuaTraCuuGETPage(HttpServletRequest request, @RequestParam(name = "hoten") String hoten, @RequestParam(name = "sdt") String sdt) {
		ModelAndView mav = new ModelAndView("web/ketQuaTraCuu");
		boolean coKetQua = true;

		boolean checkNull = thiSinhService.checkNull(hoten, sdt);


//		for (BaiThiDTO item: baithiList) {
//			List<DiemThiDTO> diemthi = diemThiService.findOneByBaithi(item.getMabaithi());;
//			diemthiList.addAll(diemthi);
//		}

		if(checkNull) {
			coKetQua = false;
		} else {
			ThiSinhDTO thisinh = thiSinhService.findOneByHotenAndSdt(hoten, sdt);
			List<DuThiDTO> duthiList = duThiService.findAllByThisinh(thisinh);

			List<PhongThiDTO> phongthiList = new ArrayList<>();
			List<BaiThiDTO> baithiList = new ArrayList<>();
			List<DiemThiDTO> diemthiList = new ArrayList<>();


			for (DuThiDTO item: duthiList) {
				PhongThiDTO phongThiDTO = phongThiService.findOneByMaphongthi(item.getMaphongthi());
				KhoaThiDTO khoathi = khoaThiService.findOneByMakhoathi(phongThiDTO.getMakhoathi());
				phongThiDTO.setKhoathi(khoathi);
				phongthiList.add(phongThiDTO);

				BaiThiDTO baiThiDTO = baiThiService.findOneBySbd(item.getSbd());
				List<DiemThiDTO> diemthi = diemThiService.findAllByBaithi(baiThiDTO.getMabaithi());;
				baiThiDTO.setDiemthi(diemthi);
				baithiList.add(baiThiDTO);
			}

			request.setAttribute("thisinh", thisinh);
			request.setAttribute("phongthiList", phongthiList);
			request.setAttribute("baithiList", baithiList);
		}

		request.setAttribute("hoten", hoten);
		request.setAttribute("sdt", sdt);
		request.setAttribute("coKetQua", coKetQua);

		return mav;
	}
//	
}
