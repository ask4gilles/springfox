package com.mangofactory.swagger.core;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;

public interface ControllerResourceNamingStrategy {
   public String getFirstGroupCompatibleName(RequestMappingInfo requestMappingInfo, HandlerMethod handlerMethod);
   public String getGroupName(RequestMappingInfo requestMappingInfo, HandlerMethod handlerMethod);
   public String getUriSafeRequestMappingPattern(String requestMappingPattern);

   /**
    * Returns the correct uri for a particular request mapping pattern
    * Removes any regex characters from the request mapping
    * @param requestMappingPattern
    * @return
    */
   public String getRequestPatternMappingEndpoint(String requestMappingPattern);
}
