package com.gdu.notice.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

public interface NoticeService {
	public void findAllNotices(Model model);
	public void findNoticeByNo(int noticeNo, Model model);
	public void addNotice(HttpServletRequest request, HttpServletResponse response);
	public void modifyNotice(HttpServletRequest request, HttpServletResponse response);
	public void removeNotice(HttpServletRequest request, HttpServletResponse response);
}