package com.example.demo6.controller;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping("user")
public class hello {

    @RequestMapping("test")
    public String dd(String typeid){
        System.out.println(typeid);

        return  "dd"+"ss:"+typeid;
    }
    @RequestMapping("list")
    public  String list() {

        String jsonString = "{" +
                "    \"resultCode\": \"0\"," +
                "    \"resultDesc\": \"\"," +
                "    \"data\": {" +
                "        \"list\": [" +
                "            {" +
                "                \"provinceCode\": \"110000\"," +
                "                \"provinceName\": \"北京\"" +
                "            }," +
                "            {" +
                "                \"provinceCode\": \"120000\"," +
                "                \"provinceName\": \"天津\"" +
                "            }" +

                "        ]}" +
                "    }";

        return jsonString;

    }
    @RequestMapping("queryInOutProvOrderByProv")
    public  String queryInOutProvOrderByProv(String provinceName,String type,String beginTime,String endTime) {
            System.out.println(provinceName);
        System.out.println(type);
        System.out.println(beginTime);
        System.out.println(endTime);


            String jsonString = " {" +
                    "    \"resultCode\": \"0\"," +
                "    \"resultDesc\": \"\"," +
                "    \"data\": {" +
                "        \"data\": {" +
                "            \"provinceName\": \"北京\"," +
                "            \"inOutAreaCountList\": [" +
                "                {" +
                "                    \"areaName\": \"江苏省\"," +
                "                    \"count\": 250," +
                "                    \"percent\": \"41.67%\"" +
                "                }," +
                "                {" +
                "                    \"areaName\": \"浙江省\"," +
                "                    \"count\": 200," +
                "                    \"percent\": \"33.33%\"" +
                "                }," +
                "                {" +
                "                    \"areaName\": \"安徽省\"," +
                "                    \"count\": 100," +
                "                    \"percent\": \"16.67%\"" +
                "                }," +
                "                {" +
                "                    \"areaName\": \"河南省\"," +
                "                    \"count\": 50," +
                "                    \"percent\": \"8.33%\"" +
                "                }" +
                "            ]}" +
                "        }" +
                "    }";

        return jsonString;

    }

    @RequestMapping("test2")
    public  String teset(HttpServletRequest req) {


        try {
            req = new BufferedRequestWrapper(req, req.getContentLength());
        } catch (IOException e) {
            e.printStackTrace();
        }

        String dd = req.getParameter("id");
        System.out.println(dd);
        String jsonString = " {" +
                "    \"resultCode\": \"0\"," +
                "    \"resultDesc\": \"\"," +
                "    \"data\": {" +
                "        \"data\": {" +
                "            \"provinceName\": \"北京\"," +
                "            \"inOutAreaCountList\": [" +
                "                {" +
                "                    \"areaName\": \"江苏省\"," +
                "                    \"count\": 250," +
                "                    \"percent\": \"41.67%\"" +
                "                }," +
                "                {" +
                "                    \"areaName\": \"浙江省\"," +
                "                    \"count\": 200," +
                "                    \"percent\": \"33.33%\"" +
                "                }," +
                "                {" +
                "                    \"areaName\": \"安徽省\"," +
                "                    \"count\": 100," +
                "                    \"percent\": \"16.67%\"" +
                "                }," +
                "                {" +
                "                    \"areaName\": \"河南省\"," +
                "                    \"count\": 50," +
                "                    \"percent\": \"8.33%\"" +
                "                }" +
                "            ]}" +
                "        }" +
                "    }";

        return jsonString;

    }


    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode root1 = mapper.createObjectNode();

        root1.put("resultCode", "0");
        root1.put("resultDesc", "");


        System.out.println(root1.toString());



        root1.put("nodekey1", 1);
        root1.put("nodekey2", 2);

        System.out.println(root1.toString());

        //Create the root node
        ObjectNode root = mapper.createObjectNode ();
        //Create a child node
        ObjectNode node1 = mapper.createObjectNode ();
        node1.put ("nodekey1", 1);
        node1.put ("nodekey2", 2);
        //Bind the child nodes
        root.put ("child", node1);
        //Array of nodes
        ArrayNode arrayNode = mapper.createArrayNode ();
        arrayNode.add (node1);
        arrayNode.add (1);
        //Bind array node
        root.put ("arraynode", arrayNode);

//        System.out.println (mapper.writeValueAsString (root));
        // 得到的输出信息
    }
}
