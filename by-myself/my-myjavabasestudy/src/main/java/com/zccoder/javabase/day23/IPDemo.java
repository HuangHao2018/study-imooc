package com.zccoder.javabase.day23;
import java.net.*;
public class IPDemo
{
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception
    {
        InetAddress i = InetAddress.getLocalHost();

        //System.out.println(i.toString());
        //System.out.println("address:"+i.getHostAddress());
        //System.out.println("name:"+i.getHostName());

        InetAddress ia = InetAddress.getByName("192.168.1.5");
        System.out.println("address:"+ia.getHostAddress());
        System.out.println("name:"+ia.getHostName());
    }
}