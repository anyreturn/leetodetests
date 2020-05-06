 [image.png](https://pic.leetcode-cn.com/3d76610e3d8928ca180c9b4b12d363f9316b2cc436cc5b65d5512dea431fe25d-image.png)
刚学会双边思想，拿个简单的实践一下。
由于题目中数组未排序，且可能出现重复元素，所以直接用多重集合multimap实现。
C++代码：
```
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> result;
        multimap<int,int> mymap;
        for(int i=0;i<nums.size();i++)
            mymap.insert(pair<int,int>(nums[i],i) );
        multimap<int,int>::iterator it1=mymap.begin(),it2=mymap.end();
        it2--;
        while(it1!=it2){
            if((*it1).first+(*it2).first==target ){
                result.push_back((*it1).second);
                result.push_back((*it2).second);
                break;
            }
            else if((*it1).first+(*it2).first<target) it1++;
            else it2--;
        }
        return result;
    }
};

```
