package test;

import mypackage.WebServiceDemoService;
import mypackage.WebServiceDemoService_Service;

/**
 * @author wangweiye
 * @date 2021-09-06 14:16
 */
public class Client {
    public static void main(String[] args) {
        WebServiceDemoService_Service webServiceDemoService_service = new WebServiceDemoService_Service();
        WebServiceDemoService webServiceDemoService = webServiceDemoService_service.getWebServiceDemoServiceImplPort();
        String result = webServiceDemoService.hello("wangdaye");
        System.out.println(result);
    }

}
