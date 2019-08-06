package com.ryzlz.microcredit.common;

import com.ryzlz.microcredit.common.dto.Result;
import lombok.Data;

@Data
public class ResponseData extends Result {
    private Object data;
}
