**哈希表**
```cpp
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) 
    {
        unordered_map<int, int> m;
        for(int i = 0; i < nums.size(); i++){
            int delta = target - nums[i];
            auto it = m.find(delta);
            if(it != m.end()){
                return {i, it->second};
            }
            else{
                m[nums[i]] = i;
            }
        }
        return {};
    }
};
```
**利用map自动排序后再用双指针**
```cpp
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) 
    {
        multimap<int, int> m;
        for(int i = 0; i < nums.size(); i++){
            m.insert({nums[i], i});
        }
        auto b = m.begin(), e = --m.end();
        while(b != e){
            if(b->first + e->first == target){
                return {b->second, e->second};
            }
            else if(b->first + e->first > target){
                e--;
            }
            else{
                b++;
            }
        }
        return {};
    }
};
```
