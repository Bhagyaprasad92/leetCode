class Solution {
public:
    long long maxAlternatingSum(vector<int>& nums) {
        vector<long long> v;
        for(int x : nums) v.push_back(1LL * x * x);
        sort(v.begin(), v.end());
        int l = 0, r = v.size() - 1;
        long long ans = 0;
        bool add = true;
        while(l <= r) {
            if(add) ans += v[r--];
            else ans -= v[l++];
            add = !add;
        }
        return ans;
    }
};