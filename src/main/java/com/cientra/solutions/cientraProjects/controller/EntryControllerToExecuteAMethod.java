package com.cientra.solutions.cientraProjects.controller;


import com.cientra.solutions.cientraProjects.service.MyServiceForMethodExecution;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class EntryControllerToExecuteAMethod {

    @RequestMapping(value = "/doMethod")
    public String doDisplayMethodExecutionCount(){
        MyServiceForMethodExecution n = new MyServiceForMethodExecution();
        try {
            return n.executeMethod();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //return new ResponseEntity<>("Sri:", HttpStatus.OK);
        return "Nope try still";
    }

}
