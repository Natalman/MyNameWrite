package com.Natalman;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here
        FileWriter writer = new FileWriter("name.txt");
        BufferedWriter bufWriter = new BufferedWriter(writer);

        bufWriter.write("Name: Natalman\r\n");
        bufWriter.write("Favorite color: Black\r\n");
        bufWriter.write(2545);

        bufWriter.close();
    }
}
