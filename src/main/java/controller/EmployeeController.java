package controller;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.EmployeeService;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();
    @GetMapping()
    public ModelAndView showFormAll(){
        ModelAndView modelAndView = new ModelAndView("home");
        List<Employee> employees = employeeService.findAll();
        modelAndView.addObject("list",employees);
        return modelAndView;
    }
    @GetMapping("create")
    public ModelAndView showFormCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("e",new Employee());
        return modelAndView;
    }
    @PostMapping("create")
    public ModelAndView create(@ModelAttribute Employee employee){
        ModelAndView modelAndView = new ModelAndView("redirect:/employees");
        employeeService.create(employee);
        return modelAndView;
    }
}
