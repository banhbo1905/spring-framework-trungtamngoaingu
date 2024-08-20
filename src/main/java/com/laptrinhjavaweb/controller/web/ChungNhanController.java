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

@Controller(value = "ChungNhanControllerOfWeb")
public class ChungNhanController {

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

	@RequestMapping(value = "/chung-nhan", method = RequestMethod.GET)
	public ModelAndView chungNhanPage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("web/chungNhan");
		List<KhoaThiDTO> khoathiList = khoaThiService.findAll();
		request.setAttribute("khoathiList", khoathiList);
		return mav;
	}

	@RequestMapping(value = "/chung-nhan-ket-qua", method = RequestMethod.POST)
	public ModelAndView chungNhanKetQuaPage(HttpServletRequest request, @RequestParam(name = "sbd") String sbd, @RequestParam(name = "khoathi") String khoathi) {
		ModelAndView mav = new ModelAndView("web/ketQuaChungNhan");
		boolean ketqua = true;

		KhoaThiDTO khoaThi = khoaThiService.findOneByMakhoathi(khoathi);
		boolean checkNullDuThi = duThiService.checkNull(sbd);


		if(checkNullDuThi == true){
			ketqua = false;
		} else {
			DuThiDTO duThiDTO = duThiService.findOneBySbd(sbd);
			boolean checkNullPhongThi = phongThiService.checkNull(duThiDTO.getMaphongthi(), khoaThi);

			if(checkNullPhongThi){
				ketqua = false;
			} else {
				ThiSinhDTO thisinh = thiSinhService.findOneByCmnd(duThiDTO.getCmnd());
				PhongThiDTO phongThiDTO = phongThiService.findOneByMaphongthi(duThiDTO.getMaphongthi());
				String tentrinhdo = phongThiDTO.getTentrinhdo();

				BaiThiDTO baithi = baiThiService.findOneBySbd(sbd);
				List<DiemThiDTO> diemthi = diemThiService.findAllByBaithi(baithi.getMabaithi());;
				float diemnghe = diemthi.get(0).getDiem();
				float diemnoi = diemthi.get(1).getDiem();
				float diemviet = diemthi.get(2).getDiem();
				float diemdoc = diemthi.get(3).getDiem();

				double diemtb = (diemnghe + diemnoi + diemviet + diemdoc)/4;


				request.setAttribute("thisinh", thisinh);
				request.setAttribute("tentrinhdo", tentrinhdo);
				request.setAttribute("diemtb", diemtb);
				request.setAttribute("diemnghe", diemnghe);
				request.setAttribute("diemnoi", diemnoi);
				request.setAttribute("diemviet", diemviet);
				request.setAttribute("diemdoc", diemdoc);
			}
		}

		request.setAttribute("khoaThi", khoaThi);
		request.setAttribute("ketqua", ketqua);
		return mav;
	}
	

//	
}
