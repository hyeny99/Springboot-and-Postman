package com.hbrs.Controller;

import com.hbrs.Data.SalesMan;
import com.hbrs.Service.SalesManService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * control layer
 * contains end points of CRUD methods
 */
@RestController  // to declare the class as a controller
@RequestMapping("api/v1/salesman")  // creating an end point (base path) => http://localhost:8080/api/v1/salesman
@AllArgsConstructor // lombok annotation: creates a constructor automatically
public class SalesManController {

    private final SalesManService salesManService;   // creating a connection to the service layer


    @GetMapping
    public List<SalesMan> fetchAllSalesMan(){
        return salesManService.getAllSalesMan();
    }
    @GetMapping(path = "{sid}")
    public SalesMan fetchSalesMan(@PathVariable("sid")int sid){
        return salesManService.getSalesManBySid(sid);
    }
    @PutMapping // ReqeustBody: to get input data
    public void updateSalesMan(@RequestBody SalesMan salesMan){
        salesManService.updateSalesMan(salesMan);
    }

    @PostMapping
    public void registerNewSalesMan(@RequestBody SalesMan salesMan){
        salesManService.addNewSalesMan(salesMan);
    }
    @DeleteMapping(path="{sid}") // set a url path variable
    public void deleteSalesMan(@PathVariable("sid") int sid){
        salesManService.deleteSaleMan(sid);
    }
}
