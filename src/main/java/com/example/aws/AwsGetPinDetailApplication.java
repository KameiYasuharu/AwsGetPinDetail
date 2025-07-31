package com.example.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * AwsGetPinDetailApplication クラス。
 * Spring Boot アプリケーションのエントリーポイントです。
 * このクラスはアプリケーションを起動するためのメインクラスです。
 */
@SpringBootApplication
public class AwsGetPinDetailApplication {

    /**
     * アプリケーションのエントリーポイント。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
    	
        // Spring Boot アプリケーションを起動
        SpringApplication.run(AwsGetPinDetailApplication.class, args);
    }
}