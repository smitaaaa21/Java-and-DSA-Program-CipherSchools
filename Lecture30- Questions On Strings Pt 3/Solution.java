

class Solution
{
    public static boolean areRotations(String s1,String s2)
    {
        if(s1.length()!=s2.length()) 
        return false;
        int len = s1.length();
        for(int i=0;i<len;i++)
        {
            String rotatedStr = s1.substring(1) + s1.substring(0,1);
            if(s2.equals(rotatedStr)) 
            return true;
        }
        return false;
    }
}


