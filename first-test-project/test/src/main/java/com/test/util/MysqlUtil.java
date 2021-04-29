//package com.test.util;
//
//import com.cisdi.errorsystem.dto.mysql.*;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.HashMap;
//import java.util.Map;
//
//@Slf4j
//public class MysqlUtil {
//
////    public static final String usercenter = "http://paas-usercenter.test.cisdigital.cn/sysmgr/sso/login";
////    public static final String account= "aaaaaa";
////    public static final String password= "123456";
////    public static final String DOMAINNUMBER= "YXPTTD100000";
//
//    public static String storageUrl= "http://data-storage-preview.test.cisdigital.cn/api/storage/instance/list";
//    public static String urlDetail= "http://data-storage-preview.test.cisdigital.cn/api/storage/instance/detail";
//    public static String authorizationPaas = "Authorization-Paas";
//
//    /**
//     * 获取对应用户的数据库实例列表
//     * @param pageNumber
//     * @param pageSize
//     * @param instanceType
//     * @return
//     */
//    public static MysqlBaseData getData(Integer pageNumber, Integer pageSize, Integer instanceType) {
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//        String accessToken = request.getHeader(authorizationPaas);
//
//        RestTemplate restTemplate = new RestTemplate();
//        Map<String, Object> paramMap = new HashMap<>();
//        paramMap.put("pageSize",pageSize);
//        paramMap.put("pageNumber",pageNumber);
//        paramMap.put("instanceType",instanceType);
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.set(authorizationPaas, accessToken);
//        HttpEntity requestBody = new HttpEntity(headers);
//        MysqlBaseData ret = null;
//        ResponseEntity<BaseData> data = null;
//        try {
//            data = restTemplate.exchange(
//                    storageUrl + "?pageSize={pageSize}&pageNumber={pageNumber}&instanceType={instanceType}",
//                    HttpMethod.GET, requestBody, BaseData.class, paramMap);
//            ret = data.getBody().getData();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return ret;
//    }
//
//    /**
//     * 获取实例详情
//     * @param instanceId
//     * @return
//     */
//    public static MysqlData getDataByInstanceId(String instanceId) {
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//        String token = request.getHeader(authorizationPaas);
//        RestTemplate restTemplate = new RestTemplate();
//
//        Map<String, Object> paramMap = new HashMap<>();
//        paramMap.put("instanceId",instanceId);
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.set(authorizationPaas, token);
//        HttpEntity requestBody = new HttpEntity(headers);
//        MysqlData ret=null;
//        ResponseEntity<InstanceBase> data = null;
//        try {
//            data = restTemplate.exchange(
//                    urlDetail + "?instanceId={instanceId}",
//                    HttpMethod.GET, requestBody, InstanceBase.class, paramMap);
//            ret = data.getBody().getData();
//            log.info(ret.toString());
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return ret;
//    }
//
//
//
//
//
//   /* //获取token
//    public static String getToken() {
//        RestTemplate restTemplate = new RestTemplate();
//
//        Map<String, Object> paramMap = new HashMap<>();
//        paramMap.put("account",account);
//        paramMap.put("password",password);
//        paramMap.put("domainNumber",DOMAINNUMBER);
//
//        HttpHeaders headers = new HttpHeaders();
//        HttpEntity requestBody = new HttpEntity(headers);
//
//        String ret=null;
//        try {
//            ResponseEntity<BaseData> data = restTemplate.exchange(
//                    usercenter+"?account={account}&password={password}&domainNumber={domainNumber}",
//                    HttpMethod.GET, requestBody, BaseData.class, paramMap);
//            ret=data.getBody().getData().getToken();
//            log.info(ret);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return ret;
//    }*/
//
//
//
//}
