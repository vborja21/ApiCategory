package pe.cibertec.ecommerce.ApiCategory.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiCategory.entity.Category;
import pe.cibertec.ecommerce.ApiCategory.service.ServiceCategory;

@RestController
@RequestMapping("api/v1/category")

public class ControllerCategory {

@Autowired

private ServiceCategory serviceCategory;
 
    @GetMapping("findAll")
    public ResponseEntity<List<Category>> findAll(){
        
        return new ResponseEntity<>(serviceCategory.findAll(),HttpStatus.OK);
        
    }

     @GetMapping("findCategorySK/{categorySK}")
     public ResponseEntity<Category> findByCategorySK(@PathVariable String categorySK) {
         
         return new ResponseEntity<>(serviceCategory.findByCategorySK(categorySK),HttpStatus.OK);
         
     }
     
    
     @PostMapping("add")
    public ResponseEntity<Category> add(@RequestBody Category category){
        
        return new ResponseEntity<>(serviceCategory.add(category),HttpStatus.CREATED);
         
    }
    
}
