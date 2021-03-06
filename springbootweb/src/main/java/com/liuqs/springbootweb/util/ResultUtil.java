package com.liuqs.springbootweb.util;

import com.liuqs.springbootweb.entity.Result;

/**
 * @ Author: liuqianshun
 * @ Description:
 * @ Date: Created in 2018-02-09
 * @ Modified:
 **/
public class ResultUtil {

    public static Result success(Object o){
        Result<Object> result = new Result<>();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(o);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
