package com.test;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JobFunctionalHandler implements RequestHandler<Object, Object> {

  @Override
  public Object handleRequest(Object input, Context context) {

    String request = "" + input;
    log.debug("Input: " + request);

    return "Executed";
  }
}
