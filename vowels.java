import java.io.*;
public class Vowels
{
  
  public static void main(String args[])throws IOException
  {
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String a;
    a=br.readLine();
  
    if(a.charAt(0)=='a'||a.charAt(0)=='A'||a.charAt(0)=='e'||a.charAt(0)=='E'||a.charAt(0)=='i'||a.charAt(0)=='I'||a.charAt(0)=='o'|a.charAt(0)=='O'||a.charAt(0)=='u'||a.charAt(0)=='U')
    {
      
      System.out.println("Vowels");
      }
      else
      System.out.println("Constant");
      }
      }
