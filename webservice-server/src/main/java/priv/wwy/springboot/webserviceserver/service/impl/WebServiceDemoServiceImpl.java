package priv.wwy.springboot.webserviceserver.service.impl;

import org.springframework.stereotype.Service;
import priv.wwy.springboot.webserviceserver.service.WebServiceDemoService;

import javax.jws.WebService;

/**
 * @author wangweiye
 * @date 2021-09-07 14:31
 */
@Service
@WebService(serviceName = "WebServiceDemoService",
        targetNamespace = "http://webservice.springboot.wwy.priv",
        endpointInterface = "priv.wwy.springboot.webserviceserver.service.WebServiceDemoService")
public class WebServiceDemoServiceImpl implements WebServiceDemoService {
    @Override
    public String hello(String name) {
        return "hello "+name;
    }
}
