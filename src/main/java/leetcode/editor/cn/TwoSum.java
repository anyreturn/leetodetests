//Given an array of integers, return indices of the two numbers such that they a
//dd up to a specific target. 
//
// You may assume that each input would have exactly one solution, and you may n
//ot use the same element twice. 
//
// Example: 
//
// 
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
// 
// Related Topics 数组 哈希表


package leetcode.editor.cn;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

import com.alibaba.fastjson.JSONObject;

import org.apache.commons.lang.time.StopWatch;

/**
 * TwoSum
 */    
public class TwoSum{
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        int[] nums = {7, 113,32,2, 11, 15,12,14,66,55,78};
        int target = 47;

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int[] result = solution.twoSum2(nums,target);
        //try {
        //    Thread.sleep(1L);
        //}catch (Exception e){
        //
        //}
        stopWatch.stop();
        String resultString = MessageFormat.format("cost:{0}ms {1}", stopWatch.getTime(),JSONObject.toJSONString(result));
        System.out.println(resultString);
      }
      
/**
 * 
 */
 //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int i,j=0;
        boolean flag = false;
        for(i=0; i<nums.length;i++){
            for (j=i+1;j<nums.length;j++){
                if (nums[i] + nums[j] == target) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                break;
            }
        }
        return new int[]{i,j};
    }

    public int[] twoSum2(int[] nums, int target) {

        int i,j=0;
        boolean flag = false;

        int length = nums.length-1;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>(16);
        for(i = 0; i<= length; i++){
            map.put(nums[i],i);
        }

        Arrays.sort(nums);
        for(i=0,j=length; i<nums.length && j >= 0;){
            if (nums[i] + nums[j] == target) {
                break;
            }
            if(nums[i] + nums[j] > target){
                j--;
            }else {
                i++;
            }
        }
        i=map.get(nums[i]);
        j=map.get(nums[j]);
        return new int[]{i,j};
    }
}
//leetcode submit region end(Prohibit modification and deletion)
  
}