package com.thoughtworks.rslist.repository;

import com.thoughtworks.rslist.dto.TradeDto;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Boyu Yuan
 * @date 2020/9/20 23:31
 */
public interface TradeRepository extends CrudRepository<TradeDto, Integer> {
    TradeDto findByRank(Integer rank);
}
