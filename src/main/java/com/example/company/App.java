package com.example.company;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );

        Document doc = Jsoup.connect("https://google.ca/").get();
        System.out.println(doc.title());

        
    }
}
