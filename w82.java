import java.io.*;

class F
{
   String temp="";
   
   synchronized void read() throws IOException
   {
      FileInputStream f = new FileInputStream("filetoberead.txt");
      System.out.println("Reading the file.........");
      int ch;
      if((ch=f.read())==-1)
      {
 System.out.println("Sorry, the file is empty. Nothing can be read.");
          notify();
      }
      else
      {
        temp=temp+(char)ch;
         while((ch=f.read())!=-1)
temp=temp+(char)ch;
System.out.println("File Read Successful.");
System.out.println("Redirecting to the writer thread......");
         notify();
      }
    }

    synchronized void write() throws IOException
   {
      FileOutputStream f = new FileOutputStream("filetobewritten.txt");
      System.out.println("Writing the file.........");
      System.out.println("Waiting for the file to be read....");
      try
      { wait();
      }
      catch(Exception e)
      { e.getMessage();
      }
     
      System.out.println("File Received.");
      if(temp.equals(""))
      {
System.out.println("Sorry, the file is empty. Nothing can be written.");
        System.exit(0);
      }
      else
      {
        for(int i=0;i<temp.length();i++)
f.write((char)temp.charAt(i));
        System.out.println("File Writing Successful.");
System.out.println("Please check the output file.");
        System.exit(0);    
    }
  }
}


class ReaderThread extends Thread
{
  F obj = new F();
  ReaderThread(F obj)
  {
this.obj=obj;
  }  
  public void run()
  {
      try{obj.read();}
      catch(IOException e){}
  }
}


class WriterThread extends Thread
{
  F obj = new F();
  WriterThread(F obj)
  {
this.obj=obj;
  }  
  public void run()
  {
      try{obj.write();}
      catch(IOException e){}
  }
}
 
public class w7
{
  public static void main(String args[]) throws IOException
  {
     F x = new F();
     ReaderThread a = new ReaderThread(x);
     WriterThread b = new WriterThread(x);
     b.start();
     a.start();
  }
}
