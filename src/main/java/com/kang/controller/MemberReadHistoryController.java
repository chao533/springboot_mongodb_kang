package com.kang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kang.common.msg.ErrorCode;
import com.kang.common.msg.Message;
import com.kang.model.MemberReadHistory;
import com.kang.service.MemberReadHistoryService;

/**
 * <p>Title: MemberReadHistoryController</p>
 * <p>Description:会员商品浏览记录管理Controller <p>
 * @author ChaoKang
 * @date 2020年6月16日
 */
@RestController
@RequestMapping("/member/readHistory")
public class MemberReadHistoryController {
    @Autowired
    private MemberReadHistoryService memberReadHistoryService;

    /**
     * <p>Title: create</p>
     * <p>Description: 创建浏览记录</p>
     * @param @param memberReadHistory
     * @param @return
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Message<?> create(@RequestBody MemberReadHistory memberReadHistory) {
        int count = memberReadHistoryService.create(memberReadHistory);
        if (count > 0) {
            return new Message<>(ErrorCode.SUCCESS);
        } else {
        	return new Message<>(ErrorCode.ERROR);
        }
    }

    /**
     * <p>Title: delete</p>
     * <p>Description: 删除浏览记录</p>
     * @param @param ids
     * @param @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Message<?> delete(@RequestParam("ids") List<String> ids) {
        int count = memberReadHistoryService.delete(ids);
        if (count > 0) {
        	return new Message<>(ErrorCode.SUCCESS);
        } else {
        	return new Message<>(ErrorCode.ERROR);
        }
    }

    /**
     * <p>Title: list</p>
     * <p>Description: 展示浏览记录</p>
     * @param @param memberId
     * @param @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Message<List<MemberReadHistory>> list(Long memberId) {
        List<MemberReadHistory> memberReadHistoryList = memberReadHistoryService.list(memberId);
        return new Message<>(ErrorCode.SUCCESS,memberReadHistoryList);
    }
}