//package com.test.util;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.cisdi.errorsystem.dto.es.EsBase;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.util.StringUtils;
//import org.springframework.web.client.RestTemplate;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//@Slf4j
//public class EsUtil {
//
//    public static String url = "http://elasticsearch.test.cisdigital.cn/metricbeat*/_search";
//
//
//    public static List<EsBase> getMonitorData(Integer num,Integer size, LocalDateTime startTime,LocalDateTime endTime) {
//        String queryBody =  "{\n" +
//                "  \"query\": {\n" +
//                "    \"bool\": {\n" +
//                "      \"must\": [\n" +
//                "        {\n" +
//                "          \"range\": {\n" +
//                "            \"@timestamp\": {\n" +
//                "              \"gte\": \""+ startTime +"\",\n" +
//                "              \"lte\": \""+ endTime +"\"\n" +
//                "            }\n" +
//                "          }\n" +
//                "        }\n" +
//                "      ]\n" +
//                "    }\n" +
//                "  }, \n" +
//                "  \"sort\": [\n" +
//                "    {\n" +
//                "      \"@timestamp\": {\n" +
//                "        \"order\": \"desc\"\n" +
//                "      }\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"_source\": {\n" +
//                "    \"includes\": [\n" +
//                "      \"@timestamp\",\n" +
//                "      \"system.cpu.total.pct\",\n" +
//                "      \"system.cpu.cores\",\n" +
//                "      \"system.memory.total\",\n" +
//                "      \"system.memory.used.pct\",\n" +
//                "      \"system.socket.local\",\n" +
//                "      \"system.socket.remote\",\n" +
//                "      \"system.filesystem.used.pct\",\n" +
//                "      \"system.filesystem.total\",\n" +
//                "      \"system.network.in.bytes\",\n" +
//                "      \"system.network.out.bytes\",\n" +
//                "      \"host.hostname\",\n" +
//                "      \"host.os\"\n" +
//                "      ]\n" +
//                "  },\n" +
//                "  \"from\": "+ num +",\n" +
//                "  \"size\": "+ size +"\n" +
//                "}";
//       return restTemplateUtil(queryBody);
//    }
//
//
//
//
//    /**
//     * localIp 、  remoteIp 、Platform
//     */
//    public static List<EsBase> getIpsAndPlatform(Integer num,Integer size, LocalDateTime startTime,LocalDateTime endTime, String hostName) {
//        String queryBody =  "{\n" +
//                "  \"query\": {\n" +
//                "    \"bool\": {\n" +
//                "      \"must\": [\n" +
//                "        {\n" +
//                "          \"range\": {\n" +
//                "            \"@timestamp\": {\n" +
//                "              \"gte\": \""+startTime+"\",\n" +
//                "              \"lte\": \""+endTime+"\"\n" +
//                "            }\n" +
//                "          }\n" +
//                "        },\n" +
//
//                "        {\n" +
//                "          \"match\": {\n" +
//                "            \"host.hostname\": \""+hostName+"\"\n" +
//                "          }\n" +
//                "        }\n" +
//                "      ]\n" +
//                "    }\n" +
//                "  }, \n" +
//
//                "        {\n" +
//                "        \"exists\": {\n" +
//                "          \"field\": \"system.socket.local\"\n" +
//                "          }\n" +
//                "        },\n" +
//                "        {\n" +
//                "        \"exists\": {\n" +
//                "           \"field\": \"system.socket.remote\"\n" +
//                "        }\n" +
//                "        },\n" +
//                "        {\n" +
//                "        \"exists\": {\n" +
//                "           \"field\": \"host.os\"\n" +
//                "        }\n" +
//                "        },\n" +
//                "      ]\n" +
//                "    }\n" +
//                "  }, \n" +
//                "  \"sort\": [\n" +
//                "    {\n" +
//                "      \"@timestamp\": {\n" +
//                "        \"order\": \"desc\"\n" +
//                "      }\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"_source\": {\n" +
//                "    \"includes\": [\n" +
//                "      \"@timestamp\",\n" +
//                "      \"system.cpu.total.pct\",\n" +
//                "      \"system.cpu.cores\",\n" +
//                "      \"system.memory.total\",\n" +
//                "      \"system.memory.used.pct\",\n" +
//                "      \"system.socket.local\",\n" +
//                "      \"system.socket.remote\",\n" +
//                "      \"system.filesystem.used.pct\",\n" +
//                "      \"system.filesystem.total\",\n" +
//                "      \"system.network.in.bytes\",\n" +
//                "      \"system.network.out.bytes\",\n" +
//                "      \"host.hostname\",\n" +
//                "      \"host.os\"\n" +
//                "      ]\n" +
//                "  },\n" +
//                "  \"from\": "+num+",\n" +
//                "  \"size\": "+size+"\n" +
//                "}\n";
//        return restTemplateUtil(queryBody);
//    }
//
//
//    /**
//     * 输出流输入流
//     */
//    public static List<EsBase> getSocket(Integer num,Integer size, LocalDateTime startTime,LocalDateTime endTime, String hostName) {
//        String queryBody =  "{\n" +
//                "  \"query\": {\n" +
//                "    \"bool\": {\n" +
//                "      \"must\": [\n" +
//                "        {\n" +
//                "          \"range\": {\n" +
//                "            \"@timestamp\": {\n" +
//                "              \"gte\": \""+startTime+"\",\n" +
//                "              \"lte\": \""+endTime+"\"\n" +
//                "            }\n" +
//                "          }\n" +
//                "        },\n" +
//
//                "        {\n" +
//                "          \"match\": {\n" +
//                "            \"host.hostname\": \""+hostName+"\"\n" +
//                "          }\n" +
//                "        }\n" +
//                "      ]\n" +
//                "    }\n" +
//                "  }, \n" +
//
//                "        {\n" +
//                "        \"exists\": {\n" +
//                "          \"field\": \"system.network.in.bytes\"\n" +
//                "          }\n" +
//                "        },\n" +
//                "        {\n" +
//                "        \"exists\": {\n" +
//                "           \"field\": \"system.network.out.bytes\"\n" +
//                "        }\n" +
//                "        }\n" +
//                "      ]\n" +
//                "    }\n" +
//                "  }, \n" +
//                "  \"sort\": [\n" +
//                "    {\n" +
//                "      \"@timestamp\": {\n" +
//                "        \"order\": \"desc\"\n" +
//                "      }\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"_source\": {\n" +
//                "    \"includes\": [\n" +
//                "      \"@timestamp\",\n" +
//                "      \"system.cpu.total.pct\",\n" +
//                "      \"system.cpu.cores\",\n" +
//                "      \"system.memory.total\",\n" +
//                "      \"system.memory.used.pct\",\n" +
//                "      \"system.socket.local\",\n" +
//                "      \"system.socket.remote\",\n" +
//                "      \"system.filesystem.used.pct\",\n" +
//                "      \"system.filesystem.total\",\n" +
//                "      \"system.network.in.bytes\",\n" +
//                "      \"system.network.out.bytes\",\n" +
//                "      \"host.hostname\",\n" +
//                "      \"host.os\"\n" +
//                "      ]\n" +
//                "  },\n" +
//                "  \"from\": "+num+",\n" +
//                "  \"size\": "+size+"\n" +
//                "}\n";
//        return restTemplateUtil(queryBody);
//    }
//
//    /**
//     * cpu百分比
//     */
//    public static List<EsBase> getCpu(Integer num,Integer size, LocalDateTime startTime,LocalDateTime endTime, String hostName) {
//
//
//        String queryBody =  "{\n" +
//                "  \"query\": {\n" +
//                "    \"bool\": {\n" +
//                "      \"must\": [\n" +
//                "        {\n" +
//                "          \"range\": {\n" +
//                "            \"@timestamp\": {\n" +
//                "              \"gte\": \""+startTime+"\",\n" +
//                "              \"lte\": \""+endTime+"\"\n" +
//                "            }\n" +
//                "          }\n" +
//                "        },\n" +
//
//                "        {\n" +
//                "          \"match\": {\n" +
//                "            \"host.hostname\": \""+hostName+"\"\n" +
//                "          }\n" +
//                "        }\n" +
//                "      ]\n" +
//                "    }\n" +
//                "  }, \n" +
//
//                "        {\n" +
//                "        \"exists\": {\n" +
//                "          \"field\": \"system.cpu.total.pct\"\n" +
//                "          }\n" +
//                "        },\n" +
//                "        {\n" +
//                "        \"exists\": {\n" +
//                "           \"field\": \"system.cpu.cores\"\n" +
//                "        }\n" +
//                "        }\n" +
//                "      ]\n" +
//                "    }\n" +
//                "  }, \n" +
//                "  \"sort\": [\n" +
//                "    {\n" +
//                "      \"@timestamp\": {\n" +
//                "        \"order\": \"desc\"\n" +
//                "      }\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"_source\": {\n" +
//                "    \"includes\": [\n" +
//                "      \"@timestamp\",\n" +
//                "      \"system.cpu.total.pct\",\n" +
//                "      \"system.cpu.cores\",\n" +
//                "      \"system.memory.total\",\n" +
//                "      \"system.memory.used.pct\",\n" +
//                "      \"system.socket.local\",\n" +
//                "      \"system.socket.remote\",\n" +
//                "      \"system.filesystem.used.pct\",\n" +
//                "      \"system.filesystem.total\",\n" +
//                "      \"system.network.in.bytes\",\n" +
//                "      \"system.network.out.bytes\",\n" +
//                "      \"host.hostname\",\n" +
//                "      \"host.os\"\n" +
//                "      ]\n" +
//                "  },\n" +
//                "  \"from\": "+num+",\n" +
//                "  \"size\": "+size+"\n" +
//                "}\n";
//        return restTemplateUtil(queryBody);
//    }
//
//
//    /**
//     *内存百分比
//     */
//    public static List<EsBase> getMemory(Integer num,Integer size, LocalDateTime startTime,LocalDateTime endTime, String hostName) {
//        String queryBody =  "{\n" +
//                "  \"query\": {\n" +
//                "    \"bool\": {\n" +
//                "      \"must\": [\n" +
//                "        {\n" +
//                "          \"range\": {\n" +
//                "            \"@timestamp\": {\n" +
//                "              \"gte\": \""+startTime+"\",\n" +
//                "              \"lte\": \""+endTime+"\"\n" +
//                "            }\n" +
//                "          }\n" +
//                "        },\n" +
//
//                "        {\n" +
//                "          \"match\": {\n" +
//                "            \"host.hostname\": \""+hostName+"\"\n" +
//                "          }\n" +
//                "        }\n" +
//                "      ]\n" +
//                "    }\n" +
//                "  }, \n" +
//
//                "        {\n" +
//                "        \"exists\": {\n" +
//                "          \"field\": \"system.memory.used.pct\"\n" +
//                "          }\n" +
//                "        },\n" +
//                "        {\n" +
//                "        \"exists\": {\n" +
//                "           \"field\": \"system.memory.total\"\n" +
//                "        }\n" +
//                "        }\n" +
//                "      ]\n" +
//                "    }\n" +
//                "  }, \n" +
//                "  \"sort\": [\n" +
//                "    {\n" +
//                "      \"@timestamp\": {\n" +
//                "        \"order\": \"desc\"\n" +
//                "      }\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"_source\": {\n" +
//                "    \"includes\": [\n" +
//                "      \"@timestamp\",\n" +
//                "      \"system.cpu.total.pct\",\n" +
//                "      \"system.cpu.cores\",\n" +
//                "      \"system.memory.total\",\n" +
//                "      \"system.memory.used.pct\",\n" +
//                "      \"system.socket.local\",\n" +
//                "      \"system.socket.remote\",\n" +
//                "      \"system.filesystem.used.pct\",\n" +
//                "      \"system.filesystem.total\",\n" +
//                "      \"system.network.in.bytes\",\n" +
//                "      \"system.network.out.bytes\",\n" +
//                "      \"host.hostname\",\n" +
//                "      \"host.os\"\n" +
//                "      ]\n" +
//                "  },\n" +
//                "  \"from\": "+num+",\n" +
//                "  \"size\": "+size+"\n" +
//                "}\n";
//        return restTemplateUtil(queryBody);
//    }
//
//    /**
//     *磁盘百分比
//     */
//    public static List<EsBase> getDisk(Integer num,Integer size, LocalDateTime startTime,LocalDateTime endTime, String hostName) {
//        String queryBody =  "{\n" +
//                "  \"query\": {\n" +
//                "    \"bool\": {\n" +
//                "      \"must\": [\n" +
//                "        {\n" +
//                "          \"range\": {\n" +
//                "            \"@timestamp\": {\n" +
//                "              \"gte\": \""+startTime+"\",\n" +
//                "              \"lte\": \""+endTime+"\"\n" +
//                "            }\n" +
//                "          }\n" +
//                "        },\n" +
//
//                "        {\n" +
//                "          \"match\": {\n" +
//                "            \"host.hostname\": \""+hostName+"\"\n" +
//                "          }\n" +
//                "        }\n" +
//                "      ]\n" +
//                "    }\n" +
//                "  }, \n" +
//
//                "        {\n" +
//                "        \"exists\": {\n" +
//                "          \"field\": \"system.filesystem.used.pct\"\n" +
//                "          }\n" +
//                "        },\n" +
//                "        {\n" +
//                "        \"exists\": {\n" +
//                "           \"field\": \"system.filesystem.total\"\n" +
//                "        }\n" +
//                "        }\n" +
//                "      ]\n" +
//                "    }\n" +
//                "  }, \n" +
//                "  \"sort\": [\n" +
//                "    {\n" +
//                "      \"@timestamp\": {\n" +
//                "        \"order\": \"desc\"\n" +
//                "      }\n" +
//                "    }\n" +
//                "  ],\n" +
//                "  \"_source\": {\n" +
//                "    \"includes\": [\n" +
//                "      \"@timestamp\",\n" +
//                "      \"system.cpu.total.pct\",\n" +
//                "      \"system.cpu.cores\",\n" +
//                "      \"system.memory.total\",\n" +
//                "      \"system.memory.used.pct\",\n" +
//                "      \"system.socket.local\",\n" +
//                "      \"system.socket.remote\",\n" +
//                "      \"system.filesystem.used.pct\",\n" +
//                "      \"system.filesystem.total\",\n" +
//                "      \"system.network.in.bytes\",\n" +
//                "      \"system.network.out.bytes\",\n" +
//                "      \"host.hostname\",\n" +
//                "      \"host.os\"\n" +
//                "      ]\n" +
//                "  },\n" +
//                "  \"from\": "+num+",\n" +
//                "  \"size\": "+size+"\n" +
//                "}\n";
//        return restTemplateUtil(queryBody);
//    }
//
//
//
//
//    public static List<EsBase> restTemplateUtil(String queryBody){
//        RestTemplate restTemplate = new RestTemplate();
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
//        String body = null;
//        List<EsBase> list = new ArrayList<>();
//        try {
//            body = restTemplate.exchange(url, HttpMethod.POST, new HttpEntity<>(queryBody, headers), String.class).getBody();
//            //string --> List<EsBase>
//            list = jsonPar(body);
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//        //---------------------------------------
//        list.forEach(e -> log.info(e.toString()));
//        //---------------------------------------
//        return list;
//    }
//
//    public static List<EsBase> jsonPar(String str) {
//        List<EsBase> list = new ArrayList<>();
//        if (!StringUtils.isEmpty(str)) {
//            JSONObject json = JSONObject.parseObject(str);
//            String h1 = json.getString("hits");
//            String h2 = json.getJSONObject("hits").getString("hits");
//            if (!StringUtils.isEmpty(h1) && !StringUtils.isEmpty(h2)) {
//                list = JSON.parseArray(h2, EsBase.class);
//            }
//        }
//        return list;
//    }
//
//
//}
