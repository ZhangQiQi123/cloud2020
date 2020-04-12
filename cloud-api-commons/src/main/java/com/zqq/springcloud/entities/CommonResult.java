package com.zqq.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;//响应编码
    private String msg;//响应信息
    private T data;//相应的具体内容

    public CommonResult(Integer code,String msg){
        this(code,msg,null);
    }
}
