package ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@Controller
public class App {

    @RequestMapping("*.html")
    public String handle(HttpServletRequest request) {
        String view = request.getRequestURI().substring(1);
        view = view.substring(0, view.lastIndexOf("."));
        return view;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
