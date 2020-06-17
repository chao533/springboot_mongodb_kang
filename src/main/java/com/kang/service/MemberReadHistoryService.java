package com.kang.service;


import java.util.List;

import com.kang.model.MemberReadHistory;

/**
 * <p>Title: MemberReadHistoryService</p>
 * <p>Description: 会员浏览记录管理Service<p>
 * @author ChaoKang
 * @date 2020年6月16日
 */
public interface MemberReadHistoryService {
    /**
     * <p>Title: create</p>
     * <p>Description: 生成浏览记录</p>
     * @param @param memberReadHistory
     * @param @return
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * <p>Title: delete</p>
     * <p>Description: 批量删除浏览记录</p>
     * @param @param ids
     * @param @return
     */
    int delete(List<String> ids);

    /**
     * <p>Title: list</p>
     * <p>Description: 获取用户浏览历史记录</p>
     * @param @param memberId
     * @param @return
     */
    List<MemberReadHistory> list(Long memberId);
}