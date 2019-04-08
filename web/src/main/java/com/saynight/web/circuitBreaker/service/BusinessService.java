package com.saynight.web.circuitBreaker.service;

import io.vavr.control.Try;

public interface BusinessService {
	
    String failure();

    String success();

    String ignore();

    Try<String> methodWithRecovery();
}
