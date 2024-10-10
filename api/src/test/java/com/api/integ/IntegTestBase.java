package com.api.integ;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
public abstract class IntegTestBase {
    //todo: на будущее, главный класс, от него вроде как будут наследоваться остальные тестовые классы
    //возможно, когда-то я таки начну тестироваться на тестовой базе - тогда здесь будут подгружаться также и json-таблицы
}
