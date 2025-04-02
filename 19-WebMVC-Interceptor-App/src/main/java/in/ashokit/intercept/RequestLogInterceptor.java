package in.ashokit.intercept;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class RequestLogInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        System.out.println("preHandle() method called...");
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime); // Fixed attribute name
        return true; 
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {

        System.out.println("postHandle() method called...");

        long endTime = System.currentTimeMillis();
        Long startTime = (Long) request.getAttribute("startTime"); // Corrected attribute name
        long timeTaken = endTime - startTime;

        System.out.println("Total Time Taken in ms: " + timeTaken);
    }
}
