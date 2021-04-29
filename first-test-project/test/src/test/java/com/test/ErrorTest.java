package com.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.entity.VO.es.EsBase;
import com.test.entity.VO.mysql.Buckets;
import com.test.entity.VO.mysql.MysqlData;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ErrorTest {

    @Test
    public void test1()  {
        String str = "{\"took\":264,\"timed_out\":false,\"_shards\":{\"total\":14,\"successful\":14,\"skipped\":0,\"failed\":0},\"hits\":{\"total\":{\"value\":10000,\"relation\":\"gte\"},\"max_score\":null,\"hits\":[{\"_index\":\"metricbeat-7.4.2-2021.03.22\",\"_type\":\"_doc\",\"_id\":\"oDVhWXgBYKbMH0_rjhZ9\",\"_score\":null,\"_source\":{\"@timestamp\":\"2021-03-22T10:05:11.752Z\",\"mysql\":{\"status\":{\"command\":{\"select\":23760629,\"insert\":187284,\"update\":5093484,\"delete\":229685}}}},\"sort\":[1616407511752]},{\"_index\":\"metricbeat-7.4.2-2021.03.22\",\"_type\":\"_doc\",\"_id\":\"njVhWXgBYKbMH0_rZxJ3\",\"_score\":null,\"_source\":{\"@timestamp\":\"2021-03-22T10:05:01.752Z\",\"mysql\":{\"status\":{\"command\":{\"select\":23760566,\"update\":5093474,\"insert\":187284,\"delete\":229675}}}},\"sort\":[1616407501752]},{\"_index\":\"metricbeat-7.4.2-2021.03.22\",\"_type\":\"_doc\",\"_id\":\"mjVhWXgBYKbMH0_rQA5d\",\"_score\":null,\"_source\":{\"@timestamp\":\"2021-03-22T10:04:51.752Z\",\"mysql\":{\"status\":{\"command\":{\"select\":23760500,\"update\":5093457,\"insert\":187284,\"delete\":229665}}}},\"sort\":[1616407491752]},{\"_index\":\"metricbeat-7.4.2-2021.03.22\",\"_type\":\"_doc\",\"_id\":\"lzVhWXgBYKbMH0_rGQpO\",\"_score\":null,\"_source\":{\"@timestamp\":\"2021-03-22T10:04:41.752Z\",\"mysql\":{\"status\":{\"command\":{\"select\":23760403,\"insert\":187284,\"update\":5093457,\"delete\":229655}}}},\"sort\":[1616407481752]},{\"_index\":\"metricbeat-7.4.2-2021.03.22\",\"_type\":\"_doc\",\"_id\":\"kzVgWXgBYKbMH0_r8gY9\",\"_score\":null,\"_source\":{\"@timestamp\":\"2021-03-22T10:04:31.752Z\",\"mysql\":{\"status\":{\"command\":{\"select\":23760348,\"update\":5093447,\"insert\":187284,\"delete\":229645}}}},\"sort\":[1616407471752]},{\"_index\":\"metricbeat-7.4.2-2021.03.22\",\"_type\":\"_doc\",\"_id\":\"jzVgWXgBYKbMH0_rywIu\",\"_score\":null,\"_source\":{\"@timestamp\":\"2021-03-22T10:04:21.752Z\",\"mysql\":{\"status\":{\"command\":{\"select\":23760201,\"update\":5093426,\"insert\":187277,\"delete\":229635}}}},\"sort\":[1616407461752]},{\"_index\":\"metricbeat-7.4.2-2021.03.22\",\"_type\":\"_doc\",\"_id\":\"jTRgWXgBYKbMH0_rpP4d\",\"_score\":null,\"_source\":{\"@timestamp\":\"2021-03-22T10:04:11.752Z\",\"mysql\":{\"status\":{\"command\":{\"select\":23760162,\"insert\":187277,\"update\":5093426,\"delete\":229625}}}},\"sort\":[1616407451752]},{\"_index\":\"metricbeat-7.4.2-2021.03.22\",\"_type\":\"_doc\",\"_id\":\"izRgWXgBYKbMH0_rffoN\",\"_score\":null,\"_source\":{\"@timestamp\":\"2021-03-22T10:04:01.752Z\",\"mysql\":{\"status\":{\"command\":{\"select\":23760103,\"update\":5093416,\"insert\":187277,\"delete\":229615}}}},\"sort\":[1616407441752]},{\"_index\":\"metricbeat-7.4.2-2021.03.22\",\"_type\":\"_doc\",\"_id\":\"hjRgWXgBYKbMH0_rVfb9\",\"_score\":null,\"_source\":{\"@timestamp\":\"2021-03-22T10:03:51.752Z\",\"mysql\":{\"status\":{\"command\":{\"select\":23760040,\"update\":5093399,\"insert\":187277,\"delete\":229607}}}},\"sort\":[1616407431752]},{\"_index\":\"metricbeat-7.4.2-2021.03.22\",\"_type\":\"_doc\",\"_id\":\"fzRgWXgBYKbMH0_rLvLu\",\"_score\":null,\"_source\":{\"@timestamp\":\"2021-03-22T10:03:41.753Z\",\"mysql\":{\"status\":{\"command\":{\"select\":23759944,\"insert\":187277,\"update\":5093399,\"delete\":229597}}}},\"sort\":[1616407421753]}]},\"aggregations\":{\"group_by_time\":{\"buckets\":[{\"key_as_string\":\"2021-03-18 10:00:00\",\"key\":1616032800000,\"doc_count\":60,\"sum_select\":{\"value\":1.292894134E9},\"sum_delete\":{\"value\":521435.0},\"sum_insert\":{\"value\":8938122.0},\"sum_update\":{\"value\":2.83628914E8}},{\"key_as_string\":\"2021-03-18 11:00:00\",\"key\":1616036400000,\"doc_count\":286,\"sum_select\":{\"value\":6.169132454E9},\"sum_delete\":{\"value\":2507443.0},\"sum_insert\":{\"value\":4.2658558E7},\"sum_update\":{\"value\":1.352568509E9}},{\"key_as_string\":\"2021-03-18 12:00:00\",\"key\":1616040000000,\"doc_count\":360,\"sum_select\":{\"value\":7.773631548E9},\"sum_delete\":{\"value\":3176297.0},\"sum_insert\":{\"value\":5.3799398E7},\"sum_update\":{\"value\":1.703693733E9}},{\"key_as_string\":\"2021-03-18 13:00:00\",\"key\":1616043600000,\"doc_count\":360,\"sum_select\":{\"value\":7.779016955E9},\"sum_delete\":{\"value\":3180724.0},\"sum_insert\":{\"value\":5.3860895E7},\"sum_update\":{\"value\":1.704893703E9}},{\"key_as_string\":\"2021-03-18 14:00:00\",\"key\":1616047200000,\"doc_count\":360,\"sum_select\":{\"value\":7.786445085E9},\"sum_delete\":{\"value\":3189593.0},\"sum_insert\":{\"value\":5.3922044E7},\"sum_update\":{\"value\":1.706105677E9}},{\"key_as_string\":\"2021-03-18 15:00:00\",\"key\":1616050800000,\"doc_count\":360,\"sum_select\":{\"value\":7.792414111E9},\"sum_delete\":{\"value\":3198319.0},\"sum_insert\":{\"value\":5.3984947E7},\"sum_update\":{\"value\":1.707314006E9}},{\"key_as_string\":\"2021-03-18 16:00:00\",\"key\":1616054400000,\"doc_count\":271,\"sum_select\":{\"value\":5.870018011E9},\"sum_delete\":{\"value\":2422376.0},\"sum_insert\":{\"value\":4.0712306E7},\"sum_update\":{\"value\":1.286036286E9}},{\"key_as_string\":\"2021-03-18 17:00:00\",\"key\":1616058000000,\"doc_count\":245,\"sum_select\":{\"value\":5.312220444E9},\"sum_delete\":{\"value\":2197703.0},\"sum_insert\":{\"value\":3.6884275E7},\"sum_update\":{\"value\":1.163703725E9}},{\"key_as_string\":\"2021-03-18 18:00:00\",\"key\":1616061600000,\"doc_count\":360,\"sum_select\":{\"value\":7.809763972E9},\"sum_delete\":{\"value\":3234270.0},\"sum_insert\":{\"value\":5.4275482E7},\"sum_update\":{\"value\":1.710939987E9}},{\"key_as_string\":\"2021-03-18 19:00:00\",\"key\":1616065200000,\"doc_count\":360,\"sum_select\":{\"value\":7.814403572E9},\"sum_delete\":{\"value\":3238971.0},\"sum_insert\":{\"value\":5.4332385E7},\"sum_update\":{\"value\":1.712139816E9}},{\"key_as_string\":\"2021-03-18 20:00:00\",\"key\":1616068800000,\"doc_count\":360,\"sum_select\":{\"value\":7.819022109E9},\"sum_delete\":{\"value\":3243286.0},\"sum_insert\":{\"value\":5.4371319E7},\"sum_update\":{\"value\":1.713338689E9}},{\"key_as_string\":\"2021-03-18 21:00:00\",\"key\":1616072400000,\"doc_count\":360,\"sum_select\":{\"value\":7.82364024E9},\"sum_delete\":{\"value\":3247585.0},\"sum_insert\":{\"value\":5.4409803E7},\"sum_update\":{\"value\":1.714537673E9}},{\"key_as_string\":\"2021-03-18 22:00:00\",\"key\":1616076000000,\"doc_count\":360,\"sum_select\":{\"value\":7.82826026E9},\"sum_delete\":{\"value\":3251922.0},\"sum_insert\":{\"value\":5.4448969E7},\"sum_update\":{\"value\":1.715736944E9}},{\"key_as_string\":\"2021-03-18 23:00:00\",\"key\":1616079600000,\"doc_count\":360,\"sum_select\":{\"value\":7.832878485E9},\"sum_delete\":{\"value\":3256243.0},\"sum_insert\":{\"value\":5.4488176E7},\"sum_update\":{\"value\":1.71693589E9}},{\"key_as_string\":\"2021-03-19 00:00:00\",\"key\":1616083200000,\"doc_count\":360,\"sum_select\":{\"value\":7.837572056E9},\"sum_delete\":{\"value\":3260916.0},\"sum_insert\":{\"value\":5.4580918E7},\"sum_update\":{\"value\":1.718135299E9}},{\"key_as_string\":\"2021-03-19 01:00:00\",\"key\":1616086800000,\"doc_count\":360,\"sum_select\":{\"value\":7.842215269E9},\"sum_delete\":{\"value\":3265608.0},\"sum_insert\":{\"value\":5.4643018E7},\"sum_update\":{\"value\":1.719334858E9}}]}}}";
        List<Buckets> list = jsonPar(str);
        list.forEach(l -> System.out.println(">>>"+l));



    }

    public static List<Buckets> jsonPar(String str) {
        List<Buckets> list = new ArrayList<>();
        if (!StringUtils.isEmpty(str)) {
            JSONObject json = JSONObject.parseObject(str);
            String h1 = json.getString("aggregations");
            log.info(h1);
            String h2 = json.getJSONObject("aggregations").getString("group_by_time");
            log.info(h2);
            String h3 = json.getJSONObject("aggregations").getJSONObject("group_by_time").getString("buckets");
            log.info(h3);
            if (!StringUtils.isEmpty(h3)) {
                list = JSON.parseArray(h3, Buckets.class);
            }
        }
        return list;
    }


    @Test
    public void test2(){
        AtomicReference<MysqlData> ret = new AtomicReference();;
        MysqlData m = new MysqlData();
        m.setAliasName("1");
        m.setConfigs("11");

        ret.set(m);
        System.out.println(ret.get());
    }
}
