package com.classes;
public class test4 
{
    public static void main(String[] args)
    {
        byte b =2;        
        switch(b)
        {    case 23:
            case 128:
        }        
    }
    
}
//o/p = Error becuase byte data type Range -128 to 127 
     // this reasone  128 have possible lossy conversion from int to byte
     //Error