package com.example.aws.service;

import org.springframework.stereotype.Service;

import com.example.aws.entity.PinDetail;

/**
 * PinDetailService インターフェース。
 * レコード関連のビジネスロジックを定義します。
 */
@Service
public interface PinDetailService {

    /**
     * レコードのリストを取得します。
     *
     * @return ExampleTable エンティティのリスト
     */
    PinDetail findBySbNo(String sbNo);
}