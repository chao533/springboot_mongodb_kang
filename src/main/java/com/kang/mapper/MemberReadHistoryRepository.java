package com.kang.mapper;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kang.model.MemberReadHistory;

/**
 * <p>Title: MemberReadHistoryRepository</p>
 * <p>Description: 会员商品浏览历史Repository<p>
 * @author ChaoKang
 * @date 2020年6月16日
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory,String> {
    /**
     * 根据会员id按时间倒序获取浏览记录
     * @param memberId 会员id
     */
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}