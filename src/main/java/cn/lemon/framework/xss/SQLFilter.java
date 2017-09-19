/**
 * Organization: lemon-china<br>
 * Date: 2017年9月19日上午9:31:39<br>
 * Copyright (c) 2017, lonyee@live.com All Rights Reserved.
 *
 */
package cn.lemon.framework.xss;

import com.google.common.base.Strings;

/**
 * SQL过滤
 * @date 2017年9月19日 上午9:31:39 <br>
 * @author lonyee
 */
public class SQLFilter {
	/**
     * SQL注入过滤
     * @param str  待验证的字符串
     */
    public static String sqlInject(String str){
        if(Strings.isNullOrEmpty(str)){
            return null;
        }
        //去掉'|"|;|\字符
        str = str.replace("'", "");
        str = str.replace("\"", "");
        str = str.replace(";", "");
        str = str.replace("\\", "");

        //转换成小写
        str = str.toLowerCase();

        //非法字符
        String[] keywords = {"master", "truncate", "insert", "select", "delete", "update", "declare", "alert", "drop"};

        //判断是否包含非法字符
        for(String keyword : keywords){
            if(str.indexOf(keyword) != -1){
                throw new RuntimeException("包含非法字符");
            }
        }

        return str;
    }
}
