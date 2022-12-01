public class Palindrome {
    public static void main(String args[])
    {
        String s = "sherwin";
        int len = 7;
        String reverse = "";

        for( int i=0;i<len;i++ )
        {
            reverse = reverse +s.charAt(len-i-1);
            System.out.println(reverse);
        }

        System.out.println("The String is: "+s);
        System.out.println("The reverse String is: "+reverse);

        if(s.equals(reverse))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
