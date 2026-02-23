package com.reverse.rhight;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class RhightApplicationTests {

    @Test
    void contextLoads() {}

    @Test
    void verifyModularArchitecture() {
        // 이 테스트가 실행될 때, 모듈 간의 규칙 위반이 없는지 전체를 스캔합니다.
        ApplicationModules.of(RhightApplication.class).verify();
    }
}
