package test;

import priv.wwy.springboot.webserviceclient.WebServiceDemoService;
import priv.wwy.springboot.webserviceclient.WebServiceDemoService_Service;

public class WSClient {
    public static void main(String[] args) {
        WebServiceDemoService_Service webServiceDemoService_service = new WebServiceDemoService_Service();
        WebServiceDemoService webServiceDemoService = webServiceDemoService_service.getWebServiceDemoServiceImplPort();
        String result = webServiceDemoService.hello("wangdaye");
        System.out.println(result);
    }
}
