package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSONObject;

/**
 * @author ：xinze
 * @date ：Created by 2020/4/23 09:23
 * @description：
 * @modified By：
 * @version:
 */

public class Test2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        Test2 test2 = new Test2();
        test2.test(list);

    }

    void test(List<String> list){
        List<String> stringList = list.stream().map(this::maps).filter(o->o!=null).collect(Collectors.toList());
        System.out.println(JSONObject.toJSONString(stringList));
    }

    public String maps(String s){
        if(s.equals("1")){
            return s;
        }
        return null;
    }
}
