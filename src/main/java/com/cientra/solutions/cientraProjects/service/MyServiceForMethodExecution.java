package com.cientra.solutions.cientraProjects.service;


import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class MyServiceForMethodExecution {

    public String executeMethod() throws IOException {
        String fileName = "Count.txt";

        ClassLoader classLoader = getClass().getClassLoader();
        try {
            File file = new File(classLoader.getResource(fileName).getFile());
            String res = checkExecutionCount(classLoader.getResource(fileName).getFile());
            return res;
        } catch (Exception e) {

        }
        return "Check";

    }


    private  String checkExecutionCount(String s1) throws IOException {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(new File(s1)))) {
            String s = br.readLine();
            count = Integer.parseInt(s);
            count = count +1;
            String res = "Execution Count is " + count;
            System.out.println("Excecution_Count for existing count is  ::::" +  count);
            br.close();
            incrementCount(count,s1);
            return  res;
        }


    }
    private  void incrementCount(int count, String s1) throws IOException{

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(s1)))) {
            bw.write(Integer.toString(count));
            bw.close();
        }
    }
}
