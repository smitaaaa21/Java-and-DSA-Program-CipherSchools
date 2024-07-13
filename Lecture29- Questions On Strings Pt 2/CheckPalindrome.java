
public class CheckPalindrome
{
    static boolean CheckPalindrome(String s)
    {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length() - 1;
        while(l<r)
        {
            if(s.charAt(l) != s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String s = "MADAM";
        String s2 = "CIPHER";
        String s3 = "Madam";
        System.out.println(checkPalindrome(s));
        System.out.println(checkPalindrome(s2));
        System.out.println(checkPalindrome(s3));
    }
}


