import java.util.ArrayList;

class Solution
{
    static int maximumSumSubarray(int k, ArrayList<Integer> Arr,int N)
    {
        int sum = 0;
        for(int i=0;i<k;i++)
        {
            sum = sum + Arr.get(i);
        }
        int max = sum;
        for(int i=0;i<N-k;i++)
        {
            sum = sum - Arr.get(i) + Arr.get(i+k);
            if(sum>max) max = sum;
        }
        return max;
    }
}