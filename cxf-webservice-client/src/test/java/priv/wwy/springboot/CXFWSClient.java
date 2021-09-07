package priv.wwy.springboot;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import priv.wwy.springboot.webserviceserver.service.WebServiceDemoService;

/**
 * @author wangweiye
 * @date 2021-09-07 15:46
 */
public class CXFWSClient {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(WebServiceDemoService.class);
        factory.setAddress("http://localhost:8083/webservice/webservice?wsdl");
        WebServiceDemoService webServiceDemoService = (WebServiceDemoService) factory.create();
        System.out.println(webServiceDemoService.getClass());
        String content = webServiceDemoService.hello("wangdaye");
        System.out.println(content);
    }
}
