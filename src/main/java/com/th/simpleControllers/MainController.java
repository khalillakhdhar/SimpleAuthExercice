package com.th.simpleControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
@GetMapping("")
public String welcome()
{
return "welcome";	
}
}
