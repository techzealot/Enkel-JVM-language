package com.kubadziworski.exception;

import com.kubadziworski.domain.expression.FunctionCall;

/**
 * Created by kuba on 16.04.16.
 */
public class BadArgumentsToFunctionCallException extends RuntimeException {
    public BadArgumentsToFunctionCallException(FunctionCall functionCall) {

    }
}