class ReverseString344 
{
    public void reverseString(char[] s) 
    {
        int n=s.length;
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }

        String reversedString=String.valueOf(s);
    }
    public static void main(string args[])
    {
        char s[]={"h","e","l","l","o"};
        reverseString(s);
    }
}