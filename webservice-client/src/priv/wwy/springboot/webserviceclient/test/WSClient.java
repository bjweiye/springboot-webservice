package priv.wwy.springboot.webserviceclient.test;

import priv.wwy.springboot.webserviceclient.WebServiceDemoService;
import priv.wwy.springboot.webserviceclient.WebServiceDemoService_Service;

/**
 * @author wangweiye
 * @date 2021-09-07 14:43
 */
public class WSClient {
    public static void main(String[] args) {
        WebServiceDemoService_Service webServiceDemoService_service = new WebServiceDemoService_Service();
        WebServiceDemoService webServiceDemoService = webServiceDemoService_service.getWebServiceDemoServiceImplPort();
        String result = webServiceDemoService.hello("wangdaye");
        System.out.println(result);
    }
}

