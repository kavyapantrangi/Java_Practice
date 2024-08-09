
Streams-->Sequence of data:byte or character.It is also an abstraction that java provides
  The implementaion is provided by java .io package
  Types of streams:1.Byte Stream--pdf or files
                   2.Character Stream -->
  
  Byte Stream is divided into types:Input stream,Output Stream
  Character Stream divided into 2 types:Reader and writer




  
  package basics;

import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandling {
    //System,out--->std os-console//print stream
    //System.in--->std in-->keyboard//inputstream
    //System.err-->std err->console//print stream
    public static void main(String[] args) {
        try(InputStreamReader is=new InputStreamReader(System.in))
        {
            System.out.print("Enter some letters");
            int letters=is.read();
            while(is.ready())
            {
                System.out.println((char)letters);
                letters=is.read();
            }
            is.close();
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}

//file reader:
package basics;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class FileHandling {
    //System,out--->std os-console//print stream
    //System.in--->std in-->keyboard//inputstream
    //System.err-->std err->console//print stream
    public static void main(String[] args) {
        //file reader
        try(FileReader is=new FileReader("C:\\Users\\bobby\\IdeaProjects\\Cllections\\src\\basics\\ex"))
        {
            System.out.print("Enter some letters");
            int letters=is.read();
            while(is.ready())
            {
                System.out.println((char)letters);
                letters=is.read();
            }
            is.close();
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



      ///outputstreamwriter
public class FileHandling {
    //System,out--->std os-console//print stream
    //System.in--->std in-->keyboard//inputstream;
    //System.err-->std err->console//print stream
    public static void main(String[] args) {



OutputStream os=System.out;
        System.out.println();
        try(OutputStreamWriter osw=new OutputStreamWriter(System.out))
        {
            
            osw.write("Hello wolrd");
            osw.write(97);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

//To write in the file
      FileWriter fw=new FileWriter("filename");
//if we want to write into the existing file then 
      FileWriter fw=new FileWriter("filename",append:true)
  //similarily BufferreWriter
        BufferedWriter bw=new BufferedWriter(new FileWriter("file.txt"));




